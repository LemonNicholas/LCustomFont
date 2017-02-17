# LCustomFont
Android lib for easy set up custom font , can use for TextView, Button, CheckBox, EditText and RadioButton

# Gradle
```
dependencies {
         compile 'com.lemon.library:custom-font:1.0.0'
}
```

# attrs.xml
Define declare-styleadble , attr and enum name and value you want
```
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <declare-styleable name="font">
        <attr name="type">
            <enum name="regular" value="1" />
            <enum name="medium" value="2" />
            <enum name="bold" value="3" />
        </attr>
    </declare-styleable>
</resources>
```

# Application
Create new class extedns application then follow format like below,
```
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        HashMap<Integer, String> fontTypeMap = new HashMap<>();
        // 1st param = your attrs.xml under declare-styleable attr enum value
        // 2nd param = your attrs.xml under declare-styleable attr enum name
        fontTypeMap.put(1, "fonts/SanFranciscoText-Regular.otf");
        fontTypeMap.put(2, "fonts/SanFranciscoText-Medium.otf");
        fontTypeMap.put(3, "fonts/SanFranciscoText-Bold.otf");
        CustomFontConfiguration customFontConfiguration = new CustomFontConfiguration.Builder()
                .setResourceDeclareStyleableName(R.styleable.font) // your attrs.xml declare-styleable name
                .setResourceAttr(R.styleable.font_type) // your attrs.xml under declare-styleable attr name
                .setFontTypeMap(fontTypeMap)
                .build();
        CustomFontEngine.setConfiguration(customFontConfiguration);

    }
}
```

# AndroidManifest
Declare application on your AndroidManifest
```
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.lemon.customfont">

    <application
        android:name=".BaseApplication"
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>
```

# layout.xml
Now you can start to use it :smile:
```
<com.lemon.library.widget.CustomFontTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="CustomFontTextViewRegular"
        customfont:type="regular" />
        
<com.lemon.library.widget.CustomFontButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="CustomFontButtonRegular"
        customfont:type="regular" />
        
<com.lemon.library.widget.CustomFontEditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="@dimen/activity_vertical_margin"
        android:text="CustomFontEditTextMedium"
        customfont:type="medium" />
```

# License
```
LCustomFont library for Android
Copyright (c) 2017 LemonNicholas (http://github.com/LemonNicholas).

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

