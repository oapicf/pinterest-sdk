package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.FormFactor;
import org.openapitools.model.NetworkType;
import org.openapitools.model.OsFamily;

@Canonical
class ConversionEventDeviceInfo {
    /* Battery charge level percentage */
    Integer batteryLevel
    /* Device brand */
    String brand
    /* User device's mobile carrier. */
    String carrier
    /* Number of CPU cores */
    Integer cpuCores
    /* External storage size in GB */
    Integer externalStorageFreeSpace
    /* External storage size in GB */
    Integer externalStorageSize
    /* Device form factor */
    FormFactor formFactor
    /* Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release */
    String kernelVersion
    /* List of user installed languages. ISO 639-1 format */
    List<String> languages = new ArrayList<>()
    /* Device locale BCP-47 format */
    String locale
    /* Device model name */
    String model
    /* Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() */
    NetworkType networkType
    /* OS Family */
    OsFamily osFamily
    /* Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch */
    String osName
    /* Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin */
    String osReleaseName
    /* Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 */
    String osVersion
    /* Screen density, PPI */
    Integer screenDensity
    /* Screen height in pixels */
    Integer screenHeight
    /* Screen width in pixels */
    Integer screenWidth
    /* Internal storage size in GB */
    Integer storageFreeSpace
    /* Internal storage size in GB */
    Integer storageSize
    /* Device timezone */
    String timezone
    /* Timezone abbreviation */
    String timezoneAbbr
    /* Device type */
    String type
}
