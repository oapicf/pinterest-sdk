package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

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

    enum FormFactorEnum {
    
        DESKTOP("desktop"),
        
        LAPTOP("laptop"),
        
        CELLPHONE("cellphone"),
        
        TABLET("tablet"),
        
        SMARTWATCH("smartwatch"),
        
        TV("tv"),
        
        VR("vr"),
        
        CONSOLE("console"),
        
        OTHER("other")
    
        private final String value
    
        FormFactorEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* Device form factor */
    FormFactorEnum formFactor
    /* Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release */
    String kernelVersion
    /* List of user installed languages. ISO 639-1 format */
    List<String> languages = new ArrayList<>()
    /* Device locale BCP-47 format */
    String locale
    /* Device model name */
    String model

    enum NetworkTypeEnum {
    
        WIFI("wifi"),
        
        CELLULAR_2G("cellular_2g"),
        
        CELLULAR_3G("cellular_3g"),
        
        CELLULAR_4G("cellular_4g"),
        
        CELLULAR_5G("cellular_5g"),
        
        CELLULAR_6G("cellular_6g"),
        
        ETHERNET("ethernet"),
        
        UNKNOWN("unknown")
    
        private final String value
    
        NetworkTypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() */
    NetworkTypeEnum networkType

    enum OsFamilyEnum {
    
        IOS("ios"),
        
        ANDROID("android"),
        
        MACOS("macos"),
        
        WINDOWS("windows"),
        
        LINUX("linux"),
        
        BSD("bsd"),
        
        OTHER("other")
    
        private final String value
    
        OsFamilyEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* OS Family */
    OsFamilyEnum osFamily
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
