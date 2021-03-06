package ai.marax.android.sdk.core;

import android.os.Build;
import com.google.gson.annotations.SerializedName;

class MarsOSInfo {
    @SerializedName("name")
    private String name = "Android";
    @SerializedName("version")
    private String version = Build.VERSION.RELEASE;
}
