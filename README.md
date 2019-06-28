Before running this application, make sure you have the internal version of OkBuck that i forked to my own repo which fix the AGP 3.4.0 problem.
You can find the repo here: https://github.com/rifqimfahmi/okbuck

How to publish it to your local maven:
1. clone the repo
2. run `./gradlew clean`
3. run `./gradlew publishToMavenLocal`

now you can go ahead and install it with okbuck

# Running apk with okbuck

![Running apk with okbuck](https://raw.githubusercontent.com/rifqimfahmi/coroutines-sample/master/screenshot/00-install-with-okbuck.png)

# Running apk with Gradle

![Running apk with gradle](https://raw.githubusercontent.com/rifqimfahmi/coroutines-sample/master/screenshot/01-install-with-gradle.png)

# Error message with okbuck
```
2019-06-28 23:55:40.406 971-971/? E/Zygote: isWhitelistProcess - Process is Whitelisted
2019-06-28 23:55:40.407 971-971/? E/Zygote: accessInfo : 1
2019-06-28 23:55:40.503 971-983/? E/oroutinessampl: Failed to send DDMS packet REAQ to debugger (-1 of 20): Broken pipe
2019-06-28 23:55:45.574 971-971/tokopedia.coroutinessample E/AndroidRuntime: FATAL EXCEPTION: main
    Process: tokopedia.coroutinessample, PID: 971
    java.lang.IllegalStateException: Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android'
        at kotlinx.coroutines.internal.MissingMainCoroutineDispatcher.missing(MainDispatchers.kt:73)
        at kotlinx.coroutines.internal.MissingMainCoroutineDispatcher.isDispatchNeeded(MainDispatchers.kt:54)
        at kotlinx.coroutines.DispatchedKt.resumeCancellable(Dispatched.kt:373)
        at kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(Cancellable.kt:25)
        at kotlinx.coroutines.CoroutineStart.invoke(CoroutineStart.kt:109)
        at kotlinx.coroutines.AbstractCoroutine.start(AbstractCoroutine.kt:160)
        at kotlinx.coroutines.BuildersKt__Builders_commonKt.launch(Builders.common.kt:54)
        at kotlinx.coroutines.BuildersKt.launch(Unknown Source:1)
        at kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(Builders.common.kt:47)
        at kotlinx.coroutines.BuildersKt.launch$default(Unknown Source:1)
        at tokopedia.coroutinessample.MainActivity2.execute(MainActivity2.kt:36)
        at tokopedia.coroutinessample.MainActivity2$onCreate$1.onClick(MainActivity2.kt:26)
        at android.view.View.performClick(View.java:7352)
        at android.widget.TextView.performClick(TextView.java:14177)
        at android.view.View.performClickInternal(View.java:7318)
        at android.view.View.access$3200(View.java:846)
        at android.view.View$PerformClick.run(View.java:27801)
        at android.os.Handler.handleCallback(Handler.java:873)
        at android.os.Handler.dispatchMessage(Handler.java:99)
        at android.os.Looper.loop(Looper.java:214)
        at android.app.ActivityThread.main(ActivityThread.java:7045)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:493)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:965)
```
