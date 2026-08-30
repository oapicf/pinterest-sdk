package org.openapitools.model;

import org.openapitools.model.FormFactor;
import org.openapitools.model.NetworkType;
import org.openapitools.model.OsFamily;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Object containing information about the device where event occurred.
 */
public class ConversionEventDeviceInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Battery charge level percentage
   */
  @JsonProperty("battery_level")
  private Integer batteryLevel;

  /**
   * Device brand
   */
  @JsonProperty("brand")
  private String brand;

  /**
   * User device&#39;s mobile carrier.
   */
  @JsonProperty("carrier")
  private String carrier;

  /**
   * Number of CPU cores
   */
  @JsonProperty("cpu_cores")
  private Integer cpuCores;

  /**
   * External storage size in GB
   */
  @JsonProperty("external_storage_free_space")
  private Integer externalStorageFreeSpace;

  /**
   * External storage size in GB
   */
  @JsonProperty("external_storage_size")
  private Integer externalStorageSize;

  /**
   * Device form factor
   */
  @JsonProperty("form_factor")
  private FormFactor formFactor;

  /**
   * Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
   */
  @JsonProperty("kernel_version")
  private String kernelVersion;

  /**
   * List of user installed languages. ISO 639-1 format
   */
  @JsonProperty("languages")
  private List<String> languages = new ArrayList<>();

  /**
   * Device locale BCP-47 format
   */
  @JsonProperty("locale")
  private String locale;

  /**
   * Device model name
   */
  @JsonProperty("model")
  private String model;

  /**
   * Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
   */
  @JsonProperty("network_type")
  private NetworkType networkType;

  /**
   * OS Family
   */
  @JsonProperty("os_family")
  private OsFamily osFamily;

  /**
   * Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
   */
  @JsonProperty("os_name")
  private String osName;

  /**
   * Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
   */
  @JsonProperty("os_release_name")
  private String osReleaseName;

  /**
   * Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
   */
  @JsonProperty("os_version")
  private String osVersion;

  /**
   * Screen density, PPI
   */
  @JsonProperty("screen_density")
  private Integer screenDensity;

  /**
   * Screen height in pixels
   */
  @JsonProperty("screen_height")
  private Integer screenHeight;

  /**
   * Screen width in pixels
   */
  @JsonProperty("screen_width")
  private Integer screenWidth;

  /**
   * Internal storage size in GB
   */
  @JsonProperty("storage_free_space")
  private Integer storageFreeSpace;

  /**
   * Internal storage size in GB
   */
  @JsonProperty("storage_size")
  private Integer storageSize;

  /**
   * Device timezone
   */
  @JsonProperty("timezone")
  private String timezone;

  /**
   * Timezone abbreviation
   */
  @JsonProperty("timezone_abbr")
  private String timezoneAbbr;

  /**
   * Device type
   */
  @JsonProperty("type")
  private String type;

  /**
   * Battery charge level percentage
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
   * User device&#39;s mobile carrier.
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
