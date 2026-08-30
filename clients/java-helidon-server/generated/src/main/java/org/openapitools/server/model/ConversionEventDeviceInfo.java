package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FormFactor;
import org.openapitools.server.model.NetworkType;
import org.openapitools.server.model.OsFamily;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object containing information about the device where event occurred.
 */
public class ConversionEventDeviceInfo   {

    private Integer batteryLevel;
    private String brand;
    private String carrier;
    private Integer cpuCores;
    private Integer externalStorageFreeSpace;
    private Integer externalStorageSize;
    private FormFactor formFactor;
    private String kernelVersion;
    private List<String> languages = new ArrayList<>();
    private String locale;
    private String model;
    private NetworkType networkType;
    private OsFamily osFamily;
    private String osName;
    private String osReleaseName;
    private String osVersion;
    private Integer screenDensity;
    private Integer screenHeight;
    private Integer screenWidth;
    private Integer storageFreeSpace;
    private Integer storageSize;
    private String timezone;
    private String timezoneAbbr;
    private String type;

    /**
     * Default constructor.
     */
    public ConversionEventDeviceInfo() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionEventDeviceInfo.
     *
     * @param batteryLevel Battery charge level percentage
     * @param brand Device brand
     * @param carrier User device&#39;s mobile carrier.
     * @param cpuCores Number of CPU cores
     * @param externalStorageFreeSpace External storage size in GB
     * @param externalStorageSize External storage size in GB
     * @param formFactor Device form factor
     * @param kernelVersion Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
     * @param languages List of user installed languages. ISO 639-1 format
     * @param locale Device locale BCP-47 format
     * @param model Device model name
     * @param networkType Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
     * @param osFamily OS Family
     * @param osName Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
     * @param osReleaseName Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
     * @param osVersion Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
     * @param screenDensity Screen density, PPI
     * @param screenHeight Screen height in pixels
     * @param screenWidth Screen width in pixels
     * @param storageFreeSpace Internal storage size in GB
     * @param storageSize Internal storage size in GB
     * @param timezone Device timezone
     * @param timezoneAbbr Timezone abbreviation
     * @param type Device type
     */
    public ConversionEventDeviceInfo(
        Integer batteryLevel, 
        String brand, 
        String carrier, 
        Integer cpuCores, 
        Integer externalStorageFreeSpace, 
        Integer externalStorageSize, 
        FormFactor formFactor, 
        String kernelVersion, 
        List<String> languages, 
        String locale, 
        String model, 
        NetworkType networkType, 
        OsFamily osFamily, 
        String osName, 
        String osReleaseName, 
        String osVersion, 
        Integer screenDensity, 
        Integer screenHeight, 
        Integer screenWidth, 
        Integer storageFreeSpace, 
        Integer storageSize, 
        String timezone, 
        String timezoneAbbr, 
        String type
    ) {
        this.batteryLevel = batteryLevel;
        this.brand = brand;
        this.carrier = carrier;
        this.cpuCores = cpuCores;
        this.externalStorageFreeSpace = externalStorageFreeSpace;
        this.externalStorageSize = externalStorageSize;
        this.formFactor = formFactor;
        this.kernelVersion = kernelVersion;
        this.languages = languages;
        this.locale = locale;
        this.model = model;
        this.networkType = networkType;
        this.osFamily = osFamily;
        this.osName = osName;
        this.osReleaseName = osReleaseName;
        this.osVersion = osVersion;
        this.screenDensity = screenDensity;
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
        this.storageFreeSpace = storageFreeSpace;
        this.storageSize = storageSize;
        this.timezone = timezone;
        this.timezoneAbbr = timezoneAbbr;
        this.type = type;
    }



    /**
     * Battery charge level percentage
     * minimum: 0
     * maximum: 100
     * @return batteryLevel
     */
    public Integer getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(Integer batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    /**
     * Device brand
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * User device's mobile carrier.
     * @return carrier
     */
    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * Number of CPU cores
     * minimum: 0
     * maximum: 1152
     * @return cpuCores
     */
    public Integer getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
    }

    /**
     * External storage size in GB
     * minimum: 0
     * maximum: 1048576
     * @return externalStorageFreeSpace
     */
    public Integer getExternalStorageFreeSpace() {
        return externalStorageFreeSpace;
    }

    public void setExternalStorageFreeSpace(Integer externalStorageFreeSpace) {
        this.externalStorageFreeSpace = externalStorageFreeSpace;
    }

    /**
     * External storage size in GB
     * minimum: 0
     * maximum: 1048576
     * @return externalStorageSize
     */
    public Integer getExternalStorageSize() {
        return externalStorageSize;
    }

    public void setExternalStorageSize(Integer externalStorageSize) {
        this.externalStorageSize = externalStorageSize;
    }

    /**
     * Device form factor
     * @return formFactor
     */
    public FormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
    }

    /**
     * Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    /**
     * List of user installed languages. ISO 639-1 format
     * @return languages
     */
    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    /**
     * Device locale BCP-47 format
     * @return locale
     */
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * Device model name
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
     * @return networkType
     */
    public NetworkType getNetworkType() {
        return networkType;
    }

    public void setNetworkType(NetworkType networkType) {
        this.networkType = networkType;
    }

    /**
     * OS Family
     * @return osFamily
     */
    public OsFamily getOsFamily() {
        return osFamily;
    }

    public void setOsFamily(OsFamily osFamily) {
        this.osFamily = osFamily;
    }

    /**
     * Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    /**
     * Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
     * @return osReleaseName
     */
    public String getOsReleaseName() {
        return osReleaseName;
    }

    public void setOsReleaseName(String osReleaseName) {
        this.osReleaseName = osReleaseName;
    }

    /**
     * Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * Screen density, PPI
     * minimum: 0
     * maximum: 100000
     * @return screenDensity
     */
    public Integer getScreenDensity() {
        return screenDensity;
    }

    public void setScreenDensity(Integer screenDensity) {
        this.screenDensity = screenDensity;
    }

    /**
     * Screen height in pixels
     * minimum: 0
     * maximum: 30720
     * @return screenHeight
     */
    public Integer getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(Integer screenHeight) {
        this.screenHeight = screenHeight;
    }

    /**
     * Screen width in pixels
     * minimum: 0
     * maximum: 30720
     * @return screenWidth
     */
    public Integer getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(Integer screenWidth) {
        this.screenWidth = screenWidth;
    }

    /**
     * Internal storage size in GB
     * minimum: 0
     * maximum: 1048576
     * @return storageFreeSpace
     */
    public Integer getStorageFreeSpace() {
        return storageFreeSpace;
    }

    public void setStorageFreeSpace(Integer storageFreeSpace) {
        this.storageFreeSpace = storageFreeSpace;
    }

    /**
     * Internal storage size in GB
     * minimum: 0
     * maximum: 1048576
     * @return storageSize
     */
    public Integer getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
    }

    /**
     * Device timezone
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * Timezone abbreviation
     * @return timezoneAbbr
     */
    public String getTimezoneAbbr() {
        return timezoneAbbr;
    }

    public void setTimezoneAbbr(String timezoneAbbr) {
        this.timezoneAbbr = timezoneAbbr;
    }

    /**
     * Device type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionEventDeviceInfo {\n");
        
        sb.append("    batteryLevel: ").append(toIndentedString(batteryLevel)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
        sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
        sb.append("    externalStorageFreeSpace: ").append(toIndentedString(externalStorageFreeSpace)).append("\n");
        sb.append("    externalStorageSize: ").append(toIndentedString(externalStorageSize)).append("\n");
        sb.append("    formFactor: ").append(toIndentedString(formFactor)).append("\n");
        sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
        sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    osFamily: ").append(toIndentedString(osFamily)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    osReleaseName: ").append(toIndentedString(osReleaseName)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    screenDensity: ").append(toIndentedString(screenDensity)).append("\n");
        sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
        sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
        sb.append("    storageFreeSpace: ").append(toIndentedString(storageFreeSpace)).append("\n");
        sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    timezoneAbbr: ").append(toIndentedString(timezoneAbbr)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

