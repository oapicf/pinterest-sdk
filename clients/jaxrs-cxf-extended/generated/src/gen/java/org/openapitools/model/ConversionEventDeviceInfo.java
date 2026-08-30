package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FormFactor;
import org.openapitools.model.NetworkType;
import org.openapitools.model.OsFamily;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object containing information about the device where event occurred.
 */
@ApiModel(description="Object containing information about the device where event occurred.")

public class ConversionEventDeviceInfo  {
  
 /**
  * Battery charge level percentage
  */
  @ApiModelProperty(example = "78", value = "Battery charge level percentage")
  private Integer batteryLevel;

 /**
  * Device brand
  */
  @ApiModelProperty(example = "Apple, Samsung, Motorola", value = "Device brand")
  private String brand;

 /**
  * User device's mobile carrier.
  */
  @ApiModelProperty(example = "T-Mobile", value = "User device's mobile carrier.")
  private String carrier;

 /**
  * Number of CPU cores
  */
  @ApiModelProperty(example = "8", value = "Number of CPU cores")
  private Integer cpuCores;

 /**
  * External storage size in GB
  */
  @ApiModelProperty(example = "126", value = "External storage size in GB")
  private Integer externalStorageFreeSpace;

 /**
  * External storage size in GB
  */
  @ApiModelProperty(example = "512", value = "External storage size in GB")
  private Integer externalStorageSize;

 /**
  * Device form factor
  */
  @ApiModelProperty(example = "cellphone", value = "Device form factor")
  @Valid
  private FormFactor formFactor;

 /**
  * Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
  */
  @ApiModelProperty(example = "6.15", value = "Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release")
  private String kernelVersion;

 /**
  * List of user installed languages. ISO 639-1 format
  */
  @ApiModelProperty(example = "[\"en\",\"de\",\"lt\"]", value = "List of user installed languages. ISO 639-1 format")
  private List<String> languages = new ArrayList<>();

 /**
  * Device locale BCP-47 format
  */
  @ApiModelProperty(example = "en-us", value = "Device locale BCP-47 format")
  private String locale;

 /**
  * Device model name
  */
  @ApiModelProperty(value = "Device model name")
  private String model;

 /**
  * Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
  */
  @ApiModelProperty(example = "wifi", value = "Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()")
  @Valid
  private NetworkType networkType;

 /**
  * OS Family
  */
  @ApiModelProperty(example = "ios", value = "OS Family")
  @Valid
  private OsFamily osFamily;

 /**
  * Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
  */
  @ApiModelProperty(example = "10", value = "Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch")
  private String osName;

 /**
  * Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
  */
  @ApiModelProperty(example = "18.3", value = "Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin")
  private String osReleaseName;

 /**
  * Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
  */
  @ApiModelProperty(example = "18.3", value = "Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04")
  private String osVersion;

 /**
  * Screen density, PPI
  */
  @ApiModelProperty(example = "460", value = "Screen density, PPI")
  private Integer screenDensity;

 /**
  * Screen height in pixels
  */
  @ApiModelProperty(example = "2868", value = "Screen height in pixels")
  private Integer screenHeight;

 /**
  * Screen width in pixels
  */
  @ApiModelProperty(example = "1320", value = "Screen width in pixels")
  private Integer screenWidth;

 /**
  * Internal storage size in GB
  */
  @ApiModelProperty(example = "184", value = "Internal storage size in GB")
  private Integer storageFreeSpace;

 /**
  * Internal storage size in GB
  */
  @ApiModelProperty(example = "256", value = "Internal storage size in GB")
  private Integer storageSize;

 /**
  * Device timezone
  */
  @ApiModelProperty(example = "USA/New York", value = "Device timezone")
  private String timezone;

 /**
  * Timezone abbreviation
  */
  @ApiModelProperty(example = "PDT", value = "Timezone abbreviation")
  private String timezoneAbbr;

 /**
  * Device type
  */
  @ApiModelProperty(example = "iPhone, Android", value = "Device type")
  private String type;
 /**
  * Battery charge level percentage
  * minimum: 0
  * maximum: 100
  * @return batteryLevel
  */
  @JsonProperty("battery_level")
 @Min(0) @Max(100)  public Integer getBatteryLevel() {
    return batteryLevel;
  }

  /**
   * Sets the <code>batteryLevel</code> property.
   */
 public void setBatteryLevel(Integer batteryLevel) {
    this.batteryLevel = batteryLevel;
  }

  /**
   * Sets the <code>batteryLevel</code> property.
   */
  public ConversionEventDeviceInfo batteryLevel(Integer batteryLevel) {
    this.batteryLevel = batteryLevel;
    return this;
  }

 /**
  * Device brand
  * @return brand
  */
  @JsonProperty("brand")
 @Size(max=100)  public String getBrand() {
    return brand;
  }

  /**
   * Sets the <code>brand</code> property.
   */
 public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Sets the <code>brand</code> property.
   */
  public ConversionEventDeviceInfo brand(String brand) {
    this.brand = brand;
    return this;
  }

 /**
  * User device&#39;s mobile carrier.
  * @return carrier
  */
  @JsonProperty("carrier")
 @Size(max=100)  public String getCarrier() {
    return carrier;
  }

  /**
   * Sets the <code>carrier</code> property.
   */
 public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  /**
   * Sets the <code>carrier</code> property.
   */
  public ConversionEventDeviceInfo carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

 /**
  * Number of CPU cores
  * minimum: 0
  * maximum: 1152
  * @return cpuCores
  */
  @JsonProperty("cpu_cores")
 @Min(0) @Max(1152)  public Integer getCpuCores() {
    return cpuCores;
  }

  /**
   * Sets the <code>cpuCores</code> property.
   */
 public void setCpuCores(Integer cpuCores) {
    this.cpuCores = cpuCores;
  }

  /**
   * Sets the <code>cpuCores</code> property.
   */
  public ConversionEventDeviceInfo cpuCores(Integer cpuCores) {
    this.cpuCores = cpuCores;
    return this;
  }

 /**
  * External storage size in GB
  * minimum: 0
  * maximum: 1048576
  * @return externalStorageFreeSpace
  */
  @JsonProperty("external_storage_free_space")
 @Min(0) @Max(1048576)  public Integer getExternalStorageFreeSpace() {
    return externalStorageFreeSpace;
  }

  /**
   * Sets the <code>externalStorageFreeSpace</code> property.
   */
 public void setExternalStorageFreeSpace(Integer externalStorageFreeSpace) {
    this.externalStorageFreeSpace = externalStorageFreeSpace;
  }

  /**
   * Sets the <code>externalStorageFreeSpace</code> property.
   */
  public ConversionEventDeviceInfo externalStorageFreeSpace(Integer externalStorageFreeSpace) {
    this.externalStorageFreeSpace = externalStorageFreeSpace;
    return this;
  }

 /**
  * External storage size in GB
  * minimum: 0
  * maximum: 1048576
  * @return externalStorageSize
  */
  @JsonProperty("external_storage_size")
 @Min(0) @Max(1048576)  public Integer getExternalStorageSize() {
    return externalStorageSize;
  }

  /**
   * Sets the <code>externalStorageSize</code> property.
   */
 public void setExternalStorageSize(Integer externalStorageSize) {
    this.externalStorageSize = externalStorageSize;
  }

  /**
   * Sets the <code>externalStorageSize</code> property.
   */
  public ConversionEventDeviceInfo externalStorageSize(Integer externalStorageSize) {
    this.externalStorageSize = externalStorageSize;
    return this;
  }

 /**
  * Device form factor
  * @return formFactor
  */
  @JsonProperty("form_factor")
  public FormFactor getFormFactor() {
    return formFactor;
  }

  /**
   * Sets the <code>formFactor</code> property.
   */
 public void setFormFactor(FormFactor formFactor) {
    this.formFactor = formFactor;
  }

  /**
   * Sets the <code>formFactor</code> property.
   */
  public ConversionEventDeviceInfo formFactor(FormFactor formFactor) {
    this.formFactor = formFactor;
    return this;
  }

 /**
  * Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
  * @return kernelVersion
  */
  @JsonProperty("kernel_version")
 @Size(max=100)  public String getKernelVersion() {
    return kernelVersion;
  }

  /**
   * Sets the <code>kernelVersion</code> property.
   */
 public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }

  /**
   * Sets the <code>kernelVersion</code> property.
   */
  public ConversionEventDeviceInfo kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

 /**
  * List of user installed languages. ISO 639-1 format
  * @return languages
  */
  @JsonProperty("languages")
 @Size(min=0,max=100)  public List<String> getLanguages() {
    return languages;
  }

  /**
   * Sets the <code>languages</code> property.
   */
 public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  /**
   * Sets the <code>languages</code> property.
   */
  public ConversionEventDeviceInfo languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  /**
   * Adds a new item to the <code>languages</code> list.
   */
  public ConversionEventDeviceInfo addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

 /**
  * Device locale BCP-47 format
  * @return locale
  */
  @JsonProperty("locale")
 @Size(max=35)  public String getLocale() {
    return locale;
  }

  /**
   * Sets the <code>locale</code> property.
   */
 public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * Sets the <code>locale</code> property.
   */
  public ConversionEventDeviceInfo locale(String locale) {
    this.locale = locale;
    return this;
  }

 /**
  * Device model name
  * @return model
  */
  @JsonProperty("model")
 @Size(max=100)  public String getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(String model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public ConversionEventDeviceInfo model(String model) {
    this.model = model;
    return this;
  }

 /**
  * Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
  * @return networkType
  */
  @JsonProperty("network_type")
  public NetworkType getNetworkType() {
    return networkType;
  }

  /**
   * Sets the <code>networkType</code> property.
   */
 public void setNetworkType(NetworkType networkType) {
    this.networkType = networkType;
  }

  /**
   * Sets the <code>networkType</code> property.
   */
  public ConversionEventDeviceInfo networkType(NetworkType networkType) {
    this.networkType = networkType;
    return this;
  }

 /**
  * OS Family
  * @return osFamily
  */
  @JsonProperty("os_family")
  public OsFamily getOsFamily() {
    return osFamily;
  }

  /**
   * Sets the <code>osFamily</code> property.
   */
 public void setOsFamily(OsFamily osFamily) {
    this.osFamily = osFamily;
  }

  /**
   * Sets the <code>osFamily</code> property.
   */
  public ConversionEventDeviceInfo osFamily(OsFamily osFamily) {
    this.osFamily = osFamily;
    return this;
  }

 /**
  * Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
  * @return osName
  */
  @JsonProperty("os_name")
 @Size(max=100)  public String getOsName() {
    return osName;
  }

  /**
   * Sets the <code>osName</code> property.
   */
 public void setOsName(String osName) {
    this.osName = osName;
  }

  /**
   * Sets the <code>osName</code> property.
   */
  public ConversionEventDeviceInfo osName(String osName) {
    this.osName = osName;
    return this;
  }

 /**
  * Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
  * @return osReleaseName
  */
  @JsonProperty("os_release_name")
 @Size(max=100)  public String getOsReleaseName() {
    return osReleaseName;
  }

  /**
   * Sets the <code>osReleaseName</code> property.
   */
 public void setOsReleaseName(String osReleaseName) {
    this.osReleaseName = osReleaseName;
  }

  /**
   * Sets the <code>osReleaseName</code> property.
   */
  public ConversionEventDeviceInfo osReleaseName(String osReleaseName) {
    this.osReleaseName = osReleaseName;
    return this;
  }

 /**
  * Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
  * @return osVersion
  */
  @JsonProperty("os_version")
 @Size(max=100)  public String getOsVersion() {
    return osVersion;
  }

  /**
   * Sets the <code>osVersion</code> property.
   */
 public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  /**
   * Sets the <code>osVersion</code> property.
   */
  public ConversionEventDeviceInfo osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

 /**
  * Screen density, PPI
  * minimum: 0
  * maximum: 100000
  * @return screenDensity
  */
  @JsonProperty("screen_density")
 @Min(0) @Max(100000)  public Integer getScreenDensity() {
    return screenDensity;
  }

  /**
   * Sets the <code>screenDensity</code> property.
   */
 public void setScreenDensity(Integer screenDensity) {
    this.screenDensity = screenDensity;
  }

  /**
   * Sets the <code>screenDensity</code> property.
   */
  public ConversionEventDeviceInfo screenDensity(Integer screenDensity) {
    this.screenDensity = screenDensity;
    return this;
  }

 /**
  * Screen height in pixels
  * minimum: 0
  * maximum: 30720
  * @return screenHeight
  */
  @JsonProperty("screen_height")
 @Min(0) @Max(30720)  public Integer getScreenHeight() {
    return screenHeight;
  }

  /**
   * Sets the <code>screenHeight</code> property.
   */
 public void setScreenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
  }

  /**
   * Sets the <code>screenHeight</code> property.
   */
  public ConversionEventDeviceInfo screenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
    return this;
  }

 /**
  * Screen width in pixels
  * minimum: 0
  * maximum: 30720
  * @return screenWidth
  */
  @JsonProperty("screen_width")
 @Min(0) @Max(30720)  public Integer getScreenWidth() {
    return screenWidth;
  }

  /**
   * Sets the <code>screenWidth</code> property.
   */
 public void setScreenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
  }

  /**
   * Sets the <code>screenWidth</code> property.
   */
  public ConversionEventDeviceInfo screenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
    return this;
  }

 /**
  * Internal storage size in GB
  * minimum: 0
  * maximum: 1048576
  * @return storageFreeSpace
  */
  @JsonProperty("storage_free_space")
 @Min(0) @Max(1048576)  public Integer getStorageFreeSpace() {
    return storageFreeSpace;
  }

  /**
   * Sets the <code>storageFreeSpace</code> property.
   */
 public void setStorageFreeSpace(Integer storageFreeSpace) {
    this.storageFreeSpace = storageFreeSpace;
  }

  /**
   * Sets the <code>storageFreeSpace</code> property.
   */
  public ConversionEventDeviceInfo storageFreeSpace(Integer storageFreeSpace) {
    this.storageFreeSpace = storageFreeSpace;
    return this;
  }

 /**
  * Internal storage size in GB
  * minimum: 0
  * maximum: 1048576
  * @return storageSize
  */
  @JsonProperty("storage_size")
 @Min(0) @Max(1048576)  public Integer getStorageSize() {
    return storageSize;
  }

  /**
   * Sets the <code>storageSize</code> property.
   */
 public void setStorageSize(Integer storageSize) {
    this.storageSize = storageSize;
  }

  /**
   * Sets the <code>storageSize</code> property.
   */
  public ConversionEventDeviceInfo storageSize(Integer storageSize) {
    this.storageSize = storageSize;
    return this;
  }

 /**
  * Device timezone
  * @return timezone
  */
  @JsonProperty("timezone")
 @Size(max=40)  public String getTimezone() {
    return timezone;
  }

  /**
   * Sets the <code>timezone</code> property.
   */
 public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /**
   * Sets the <code>timezone</code> property.
   */
  public ConversionEventDeviceInfo timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

 /**
  * Timezone abbreviation
  * @return timezoneAbbr
  */
  @JsonProperty("timezone_abbr")
 @Size(max=5)  public String getTimezoneAbbr() {
    return timezoneAbbr;
  }

  /**
   * Sets the <code>timezoneAbbr</code> property.
   */
 public void setTimezoneAbbr(String timezoneAbbr) {
    this.timezoneAbbr = timezoneAbbr;
  }

  /**
   * Sets the <code>timezoneAbbr</code> property.
   */
  public ConversionEventDeviceInfo timezoneAbbr(String timezoneAbbr) {
    this.timezoneAbbr = timezoneAbbr;
    return this;
  }

 /**
  * Device type
  * @return type
  */
  @JsonProperty("type")
 @Size(max=100)  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public ConversionEventDeviceInfo type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEventDeviceInfo conversionEventDeviceInfo = (ConversionEventDeviceInfo) o;
    return Objects.equals(this.batteryLevel, conversionEventDeviceInfo.batteryLevel) &&
        Objects.equals(this.brand, conversionEventDeviceInfo.brand) &&
        Objects.equals(this.carrier, conversionEventDeviceInfo.carrier) &&
        Objects.equals(this.cpuCores, conversionEventDeviceInfo.cpuCores) &&
        Objects.equals(this.externalStorageFreeSpace, conversionEventDeviceInfo.externalStorageFreeSpace) &&
        Objects.equals(this.externalStorageSize, conversionEventDeviceInfo.externalStorageSize) &&
        Objects.equals(this.formFactor, conversionEventDeviceInfo.formFactor) &&
        Objects.equals(this.kernelVersion, conversionEventDeviceInfo.kernelVersion) &&
        Objects.equals(this.languages, conversionEventDeviceInfo.languages) &&
        Objects.equals(this.locale, conversionEventDeviceInfo.locale) &&
        Objects.equals(this.model, conversionEventDeviceInfo.model) &&
        Objects.equals(this.networkType, conversionEventDeviceInfo.networkType) &&
        Objects.equals(this.osFamily, conversionEventDeviceInfo.osFamily) &&
        Objects.equals(this.osName, conversionEventDeviceInfo.osName) &&
        Objects.equals(this.osReleaseName, conversionEventDeviceInfo.osReleaseName) &&
        Objects.equals(this.osVersion, conversionEventDeviceInfo.osVersion) &&
        Objects.equals(this.screenDensity, conversionEventDeviceInfo.screenDensity) &&
        Objects.equals(this.screenHeight, conversionEventDeviceInfo.screenHeight) &&
        Objects.equals(this.screenWidth, conversionEventDeviceInfo.screenWidth) &&
        Objects.equals(this.storageFreeSpace, conversionEventDeviceInfo.storageFreeSpace) &&
        Objects.equals(this.storageSize, conversionEventDeviceInfo.storageSize) &&
        Objects.equals(this.timezone, conversionEventDeviceInfo.timezone) &&
        Objects.equals(this.timezoneAbbr, conversionEventDeviceInfo.timezoneAbbr) &&
        Objects.equals(this.type, conversionEventDeviceInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batteryLevel, brand, carrier, cpuCores, externalStorageFreeSpace, externalStorageSize, formFactor, kernelVersion, languages, locale, model, networkType, osFamily, osName, osReleaseName, osVersion, screenDensity, screenHeight, screenWidth, storageFreeSpace, storageSize, timezone, timezoneAbbr, type);
  }

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

