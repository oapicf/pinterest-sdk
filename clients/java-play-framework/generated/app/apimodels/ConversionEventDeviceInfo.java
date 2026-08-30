package apimodels;

import apimodels.FormFactor;
import apimodels.NetworkType;
import apimodels.OsFamily;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Object containing information about the device where event occurred.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionEventDeviceInfo   {
  @JsonProperty("battery_level")
  @Min(0)
@Max(100)

  private Integer batteryLevel;

  @JsonProperty("brand")
  @Size(max=100)

  private String brand;

  @JsonProperty("carrier")
  @Size(max=100)

  private String carrier;

  @JsonProperty("cpu_cores")
  @Min(0)
@Max(1152)

  private Integer cpuCores;

  @JsonProperty("external_storage_free_space")
  @Min(0)
@Max(1048576)

  private Integer externalStorageFreeSpace;

  @JsonProperty("external_storage_size")
  @Min(0)
@Max(1048576)

  private Integer externalStorageSize;

  @JsonProperty("form_factor")
  @Valid

  private FormFactor formFactor;

  @JsonProperty("kernel_version")
  @Size(max=100)

  private String kernelVersion;

  @JsonProperty("languages")
  @Size(min=0,max=100)

  private List<String> languages = null;

  @JsonProperty("locale")
  @Size(max=35)

  private String locale;

  @JsonProperty("model")
  @Size(max=100)

  private String model;

  @JsonProperty("network_type")
  @Valid

  private NetworkType networkType;

  @JsonProperty("os_family")
  @Valid

  private OsFamily osFamily;

  @JsonProperty("os_name")
  @Size(max=100)

  private String osName;

  @JsonProperty("os_release_name")
  @Size(max=100)

  private String osReleaseName;

  @JsonProperty("os_version")
  @Size(max=100)

  private String osVersion;

  @JsonProperty("screen_density")
  @Min(0)
@Max(100000)

  private Integer screenDensity;

  @JsonProperty("screen_height")
  @Min(0)
@Max(30720)

  private Integer screenHeight;

  @JsonProperty("screen_width")
  @Min(0)
@Max(30720)

  private Integer screenWidth;

  @JsonProperty("storage_free_space")
  @Min(0)
@Max(1048576)

  private Integer storageFreeSpace;

  @JsonProperty("storage_size")
  @Min(0)
@Max(1048576)

  private Integer storageSize;

  @JsonProperty("timezone")
  @Size(max=40)

  private String timezone;

  @JsonProperty("timezone_abbr")
  @Size(max=5)

  private String timezoneAbbr;

  @JsonProperty("type")
  @Size(max=100)

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
    return Objects.equals(batteryLevel, conversionEventDeviceInfo.batteryLevel) &&
        Objects.equals(brand, conversionEventDeviceInfo.brand) &&
        Objects.equals(carrier, conversionEventDeviceInfo.carrier) &&
        Objects.equals(cpuCores, conversionEventDeviceInfo.cpuCores) &&
        Objects.equals(externalStorageFreeSpace, conversionEventDeviceInfo.externalStorageFreeSpace) &&
        Objects.equals(externalStorageSize, conversionEventDeviceInfo.externalStorageSize) &&
        Objects.equals(formFactor, conversionEventDeviceInfo.formFactor) &&
        Objects.equals(kernelVersion, conversionEventDeviceInfo.kernelVersion) &&
        Objects.equals(languages, conversionEventDeviceInfo.languages) &&
        Objects.equals(locale, conversionEventDeviceInfo.locale) &&
        Objects.equals(model, conversionEventDeviceInfo.model) &&
        Objects.equals(networkType, conversionEventDeviceInfo.networkType) &&
        Objects.equals(osFamily, conversionEventDeviceInfo.osFamily) &&
        Objects.equals(osName, conversionEventDeviceInfo.osName) &&
        Objects.equals(osReleaseName, conversionEventDeviceInfo.osReleaseName) &&
        Objects.equals(osVersion, conversionEventDeviceInfo.osVersion) &&
        Objects.equals(screenDensity, conversionEventDeviceInfo.screenDensity) &&
        Objects.equals(screenHeight, conversionEventDeviceInfo.screenHeight) &&
        Objects.equals(screenWidth, conversionEventDeviceInfo.screenWidth) &&
        Objects.equals(storageFreeSpace, conversionEventDeviceInfo.storageFreeSpace) &&
        Objects.equals(storageSize, conversionEventDeviceInfo.storageSize) &&
        Objects.equals(timezone, conversionEventDeviceInfo.timezone) &&
        Objects.equals(timezoneAbbr, conversionEventDeviceInfo.timezoneAbbr) &&
        Objects.equals(type, conversionEventDeviceInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batteryLevel, brand, carrier, cpuCores, externalStorageFreeSpace, externalStorageSize, formFactor, kernelVersion, languages, locale, model, networkType, osFamily, osName, osReleaseName, osVersion, screenDensity, screenHeight, screenWidth, storageFreeSpace, storageSize, timezone, timezoneAbbr, type);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

