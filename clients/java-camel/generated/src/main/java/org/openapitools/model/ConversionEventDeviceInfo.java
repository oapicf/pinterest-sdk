package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FormFactor;
import org.openapitools.model.NetworkType;
import org.openapitools.model.OsFamily;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Object containing information about the device where event occurred.
 */

@Schema(name = "ConversionEventDeviceInfo", description = "Object containing information about the device where event occurred.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEventDeviceInfo {

  private Integer batteryLevel;

  private String brand;

  private String carrier;

  private Integer cpuCores;

  private Integer externalStorageFreeSpace;

  private Integer externalStorageSize;

  private FormFactor formFactor;

  private String kernelVersion;

  @Valid
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

  public ConversionEventDeviceInfo batteryLevel(Integer batteryLevel) {
    this.batteryLevel = batteryLevel;
    return this;
  }

  /**
   * Battery charge level percentage
   * minimum: 0
   * maximum: 100
   * @return batteryLevel
   */
  @Min(value = 0) @Max(value = 100) 
  @Schema(name = "battery_level", example = "78", description = "Battery charge level percentage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("battery_level")
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
   */
  @Size(max = 100) 
  @Schema(name = "brand", example = "Apple, Samsung, Motorola", description = "Device brand", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brand")
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
   */
  @Size(max = 100) 
  @Schema(name = "carrier", example = "T-Mobile", description = "User device's mobile carrier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carrier")
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
   */
  @Min(value = 0) @Max(value = 1152) 
  @Schema(name = "cpu_cores", example = "8", description = "Number of CPU cores", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cpu_cores")
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
   */
  @Min(value = 0) @Max(value = 1048576) 
  @Schema(name = "external_storage_free_space", example = "126", description = "External storage size in GB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external_storage_free_space")
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
   */
  @Min(value = 0) @Max(value = 1048576) 
  @Schema(name = "external_storage_size", example = "512", description = "External storage size in GB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external_storage_size")
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
   */
  @Valid 
  @Schema(name = "form_factor", example = "cellphone", description = "Device form factor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("form_factor")
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
   */
  @Size(max = 100) 
  @Schema(name = "kernel_version", example = "6.15", description = "Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kernel_version")
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
   */
  @Size(min = 0, max = 100) 
  @Schema(name = "languages", example = "[\"en\",\"de\",\"lt\"]", description = "List of user installed languages. ISO 639-1 format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("languages")
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
   */
  @Size(max = 35) 
  @Schema(name = "locale", example = "en-us", description = "Device locale BCP-47 format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale")
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
   */
  @Size(max = 100) 
  @Schema(name = "model", description = "Device model name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
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
   */
  @Valid 
  @Schema(name = "network_type", example = "wifi", description = "Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("network_type")
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
   */
  @Valid 
  @Schema(name = "os_family", example = "ios", description = "OS Family", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("os_family")
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
   */
  @Size(max = 100) 
  @Schema(name = "os_name", example = "10", description = "Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("os_name")
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
   */
  @Size(max = 100) 
  @Schema(name = "os_release_name", example = "18.3", description = "Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("os_release_name")
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
   */
  @Size(max = 100) 
  @Schema(name = "os_version", example = "18.3", description = "Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("os_version")
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
   */
  @Min(value = 0) @Max(value = 100000) 
  @Schema(name = "screen_density", example = "460", description = "Screen density, PPI", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("screen_density")
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
   */
  @Min(value = 0) @Max(value = 30720) 
  @Schema(name = "screen_height", example = "2868", description = "Screen height in pixels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("screen_height")
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
   */
  @Min(value = 0) @Max(value = 30720) 
  @Schema(name = "screen_width", example = "1320", description = "Screen width in pixels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("screen_width")
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
   */
  @Min(value = 0) @Max(value = 1048576) 
  @Schema(name = "storage_free_space", example = "184", description = "Internal storage size in GB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storage_free_space")
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
   */
  @Min(value = 0) @Max(value = 1048576) 
  @Schema(name = "storage_size", example = "256", description = "Internal storage size in GB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storage_size")
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
   */
  @Size(max = 40) 
  @Schema(name = "timezone", example = "USA/New York", description = "Device timezone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timezone")
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
   */
  @Size(max = 5) 
  @Schema(name = "timezone_abbr", example = "PDT", description = "Timezone abbreviation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timezone_abbr")
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
   */
  @Size(max = 100) 
  @Schema(name = "type", example = "iPhone, Android", description = "Device type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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

