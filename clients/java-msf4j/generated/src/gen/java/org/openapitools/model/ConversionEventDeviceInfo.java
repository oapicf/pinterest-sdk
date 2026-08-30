package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FormFactor;
import org.openapitools.model.NetworkType;
import org.openapitools.model.OsFamily;

/**
 * Object containing information about the device where event occurred.
 */
@ApiModel(description = "Object containing information about the device where event occurred.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEventDeviceInfo   {
  @JsonProperty("battery_level")
  private Integer batteryLevel;

  @JsonProperty("brand")
  private String brand;

  @JsonProperty("carrier")
  private String carrier;

  @JsonProperty("cpu_cores")
  private Integer cpuCores;

  @JsonProperty("external_storage_free_space")
  private Integer externalStorageFreeSpace;

  @JsonProperty("external_storage_size")
  private Integer externalStorageSize;

  @JsonProperty("form_factor")
  private FormFactor formFactor;

  @JsonProperty("kernel_version")
  private String kernelVersion;

  @JsonProperty("languages")
  private List<String> languages = null;

  @JsonProperty("locale")
  private String locale;

  @JsonProperty("model")
  private String model;

  @JsonProperty("network_type")
  private NetworkType networkType;

  @JsonProperty("os_family")
  private OsFamily osFamily;

  @JsonProperty("os_name")
  private String osName;

  @JsonProperty("os_release_name")
  private String osReleaseName;

  @JsonProperty("os_version")
  private String osVersion;

  @JsonProperty("screen_density")
  private Integer screenDensity;

  @JsonProperty("screen_height")
  private Integer screenHeight;

  @JsonProperty("screen_width")
  private Integer screenWidth;

  @JsonProperty("storage_free_space")
  private Integer storageFreeSpace;

  @JsonProperty("storage_size")
  private Integer storageSize;

  @JsonProperty("timezone")
  private String timezone;

  @JsonProperty("timezone_abbr")
  private String timezoneAbbr;

  @JsonProperty("type")
  private String type;

  public ConversionEventDeviceInfo batteryLevel(Integer batteryLevel) {
    this.batteryLevel = batteryLevel;
    return this;
  }

   /**
   * Battery charge level percentage
   * minimum: 0
   * maximum: 100
   * @return batteryLevel
  **/
  @ApiModelProperty(example = "78", value = "Battery charge level percentage")
  public Integer getBatteryLevel() {
    return batteryLevel;
  }

  public void setBatteryLevel(Integer batteryLevel) {
    this.batteryLevel = batteryLevel;
  }

  public ConversionEventDeviceInfo brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Device brand
   * @return brand
  **/
  @ApiModelProperty(example = "Apple, Samsung, Motorola", value = "Device brand")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public ConversionEventDeviceInfo carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * User device's mobile carrier.
   * @return carrier
  **/
  @ApiModelProperty(example = "T-Mobile", value = "User device's mobile carrier.")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public ConversionEventDeviceInfo cpuCores(Integer cpuCores) {
    this.cpuCores = cpuCores;
    return this;
  }

   /**
   * Number of CPU cores
   * minimum: 0
   * maximum: 1152
   * @return cpuCores
  **/
  @ApiModelProperty(example = "8", value = "Number of CPU cores")
  public Integer getCpuCores() {
    return cpuCores;
  }

  public void setCpuCores(Integer cpuCores) {
    this.cpuCores = cpuCores;
  }

  public ConversionEventDeviceInfo externalStorageFreeSpace(Integer externalStorageFreeSpace) {
    this.externalStorageFreeSpace = externalStorageFreeSpace;
    return this;
  }

   /**
   * External storage size in GB
   * minimum: 0
   * maximum: 1048576
   * @return externalStorageFreeSpace
  **/
  @ApiModelProperty(example = "126", value = "External storage size in GB")
  public Integer getExternalStorageFreeSpace() {
    return externalStorageFreeSpace;
  }

  public void setExternalStorageFreeSpace(Integer externalStorageFreeSpace) {
    this.externalStorageFreeSpace = externalStorageFreeSpace;
  }

  public ConversionEventDeviceInfo externalStorageSize(Integer externalStorageSize) {
    this.externalStorageSize = externalStorageSize;
    return this;
  }

   /**
   * External storage size in GB
   * minimum: 0
   * maximum: 1048576
   * @return externalStorageSize
  **/
  @ApiModelProperty(example = "512", value = "External storage size in GB")
  public Integer getExternalStorageSize() {
    return externalStorageSize;
  }

  public void setExternalStorageSize(Integer externalStorageSize) {
    this.externalStorageSize = externalStorageSize;
  }

  public ConversionEventDeviceInfo formFactor(FormFactor formFactor) {
    this.formFactor = formFactor;
    return this;
  }

   /**
   * Device form factor
   * @return formFactor
  **/
  @ApiModelProperty(example = "cellphone", value = "Device form factor")
  public FormFactor getFormFactor() {
    return formFactor;
  }

  public void setFormFactor(FormFactor formFactor) {
    this.formFactor = formFactor;
  }

  public ConversionEventDeviceInfo kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

   /**
   * Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
   * @return kernelVersion
  **/
  @ApiModelProperty(example = "6.15", value = "Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release")
  public String getKernelVersion() {
    return kernelVersion;
  }

  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }

  public ConversionEventDeviceInfo languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public ConversionEventDeviceInfo addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * List of user installed languages. ISO 639-1 format
   * @return languages
  **/
  @ApiModelProperty(example = "[\"en\",\"de\",\"lt\"]", value = "List of user installed languages. ISO 639-1 format")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public ConversionEventDeviceInfo locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Device locale BCP-47 format
   * @return locale
  **/
  @ApiModelProperty(example = "en-us", value = "Device locale BCP-47 format")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public ConversionEventDeviceInfo model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Device model name
   * @return model
  **/
  @ApiModelProperty(value = "Device model name")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public ConversionEventDeviceInfo networkType(NetworkType networkType) {
    this.networkType = networkType;
    return this;
  }

   /**
   * Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
   * @return networkType
  **/
  @ApiModelProperty(example = "wifi", value = "Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()")
  public NetworkType getNetworkType() {
    return networkType;
  }

  public void setNetworkType(NetworkType networkType) {
    this.networkType = networkType;
  }

  public ConversionEventDeviceInfo osFamily(OsFamily osFamily) {
    this.osFamily = osFamily;
    return this;
  }

   /**
   * OS Family
   * @return osFamily
  **/
  @ApiModelProperty(example = "ios", value = "OS Family")
  public OsFamily getOsFamily() {
    return osFamily;
  }

  public void setOsFamily(OsFamily osFamily) {
    this.osFamily = osFamily;
  }

  public ConversionEventDeviceInfo osName(String osName) {
    this.osName = osName;
    return this;
  }

   /**
   * Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
   * @return osName
  **/
  @ApiModelProperty(example = "10", value = "Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch")
  public String getOsName() {
    return osName;
  }

  public void setOsName(String osName) {
    this.osName = osName;
  }

  public ConversionEventDeviceInfo osReleaseName(String osReleaseName) {
    this.osReleaseName = osReleaseName;
    return this;
  }

   /**
   * Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
   * @return osReleaseName
  **/
  @ApiModelProperty(example = "18.3", value = "Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin")
  public String getOsReleaseName() {
    return osReleaseName;
  }

  public void setOsReleaseName(String osReleaseName) {
    this.osReleaseName = osReleaseName;
  }

  public ConversionEventDeviceInfo osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
   * @return osVersion
  **/
  @ApiModelProperty(example = "18.3", value = "Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04")
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public ConversionEventDeviceInfo screenDensity(Integer screenDensity) {
    this.screenDensity = screenDensity;
    return this;
  }

   /**
   * Screen density, PPI
   * minimum: 0
   * maximum: 100000
   * @return screenDensity
  **/
  @ApiModelProperty(example = "460", value = "Screen density, PPI")
  public Integer getScreenDensity() {
    return screenDensity;
  }

  public void setScreenDensity(Integer screenDensity) {
    this.screenDensity = screenDensity;
  }

  public ConversionEventDeviceInfo screenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
    return this;
  }

   /**
   * Screen height in pixels
   * minimum: 0
   * maximum: 30720
   * @return screenHeight
  **/
  @ApiModelProperty(example = "2868", value = "Screen height in pixels")
  public Integer getScreenHeight() {
    return screenHeight;
  }

  public void setScreenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
  }

  public ConversionEventDeviceInfo screenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
    return this;
  }

   /**
   * Screen width in pixels
   * minimum: 0
   * maximum: 30720
   * @return screenWidth
  **/
  @ApiModelProperty(example = "1320", value = "Screen width in pixels")
  public Integer getScreenWidth() {
    return screenWidth;
  }

  public void setScreenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
  }

  public ConversionEventDeviceInfo storageFreeSpace(Integer storageFreeSpace) {
    this.storageFreeSpace = storageFreeSpace;
    return this;
  }

   /**
   * Internal storage size in GB
   * minimum: 0
   * maximum: 1048576
   * @return storageFreeSpace
  **/
  @ApiModelProperty(example = "184", value = "Internal storage size in GB")
  public Integer getStorageFreeSpace() {
    return storageFreeSpace;
  }

  public void setStorageFreeSpace(Integer storageFreeSpace) {
    this.storageFreeSpace = storageFreeSpace;
  }

  public ConversionEventDeviceInfo storageSize(Integer storageSize) {
    this.storageSize = storageSize;
    return this;
  }

   /**
   * Internal storage size in GB
   * minimum: 0
   * maximum: 1048576
   * @return storageSize
  **/
  @ApiModelProperty(example = "256", value = "Internal storage size in GB")
  public Integer getStorageSize() {
    return storageSize;
  }

  public void setStorageSize(Integer storageSize) {
    this.storageSize = storageSize;
  }

  public ConversionEventDeviceInfo timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Device timezone
   * @return timezone
  **/
  @ApiModelProperty(example = "USA/New York", value = "Device timezone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public ConversionEventDeviceInfo timezoneAbbr(String timezoneAbbr) {
    this.timezoneAbbr = timezoneAbbr;
    return this;
  }

   /**
   * Timezone abbreviation
   * @return timezoneAbbr
  **/
  @ApiModelProperty(example = "PDT", value = "Timezone abbreviation")
  public String getTimezoneAbbr() {
    return timezoneAbbr;
  }

  public void setTimezoneAbbr(String timezoneAbbr) {
    this.timezoneAbbr = timezoneAbbr;
  }

  public ConversionEventDeviceInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Device type
   * @return type
  **/
  @ApiModelProperty(example = "iPhone, Android", value = "Device type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

