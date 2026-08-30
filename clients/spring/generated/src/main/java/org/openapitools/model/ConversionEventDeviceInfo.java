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
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEventDeviceInfo {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer batteryLevel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String brand;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String carrier;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer cpuCores;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer externalStorageFreeSpace;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer externalStorageSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable FormFactor formFactor;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String kernelVersion;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> languages = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String locale;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String model;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable NetworkType networkType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable OsFamily osFamily;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String osName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String osReleaseName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String osVersion;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer screenDensity;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer screenHeight;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer screenWidth;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer storageFreeSpace;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer storageSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String timezone;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String timezoneAbbr;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String type;

  public ConversionEventDeviceInfo batteryLevel(@Nullable Integer batteryLevel) {
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
  public @Nullable Integer getBatteryLevel() {
    return batteryLevel;
  }

  @JsonProperty("battery_level")
  public void setBatteryLevel(@Nullable Integer batteryLevel) {
    this.batteryLevel = batteryLevel;
  }

  public ConversionEventDeviceInfo brand(@Nullable String brand) {
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
  public @Nullable String getBrand() {
    return brand;
  }

  @JsonProperty("brand")
  public void setBrand(@Nullable String brand) {
    this.brand = brand;
  }

  public ConversionEventDeviceInfo carrier(@Nullable String carrier) {
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
  public @Nullable String getCarrier() {
    return carrier;
  }

  @JsonProperty("carrier")
  public void setCarrier(@Nullable String carrier) {
    this.carrier = carrier;
  }

  public ConversionEventDeviceInfo cpuCores(@Nullable Integer cpuCores) {
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
  public @Nullable Integer getCpuCores() {
    return cpuCores;
  }

  @JsonProperty("cpu_cores")
  public void setCpuCores(@Nullable Integer cpuCores) {
    this.cpuCores = cpuCores;
  }

  public ConversionEventDeviceInfo externalStorageFreeSpace(@Nullable Integer externalStorageFreeSpace) {
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
  public @Nullable Integer getExternalStorageFreeSpace() {
    return externalStorageFreeSpace;
  }

  @JsonProperty("external_storage_free_space")
  public void setExternalStorageFreeSpace(@Nullable Integer externalStorageFreeSpace) {
    this.externalStorageFreeSpace = externalStorageFreeSpace;
  }

  public ConversionEventDeviceInfo externalStorageSize(@Nullable Integer externalStorageSize) {
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
  public @Nullable Integer getExternalStorageSize() {
    return externalStorageSize;
  }

  @JsonProperty("external_storage_size")
  public void setExternalStorageSize(@Nullable Integer externalStorageSize) {
    this.externalStorageSize = externalStorageSize;
  }

  public ConversionEventDeviceInfo formFactor(@Nullable FormFactor formFactor) {
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
  public @Nullable FormFactor getFormFactor() {
    return formFactor;
  }

  @JsonProperty("form_factor")
  public void setFormFactor(@Nullable FormFactor formFactor) {
    this.formFactor = formFactor;
  }

  public ConversionEventDeviceInfo kernelVersion(@Nullable String kernelVersion) {
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
  public @Nullable String getKernelVersion() {
    return kernelVersion;
  }

  @JsonProperty("kernel_version")
  public void setKernelVersion(@Nullable String kernelVersion) {
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

  @JsonProperty("languages")
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public ConversionEventDeviceInfo locale(@Nullable String locale) {
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
  public @Nullable String getLocale() {
    return locale;
  }

  @JsonProperty("locale")
  public void setLocale(@Nullable String locale) {
    this.locale = locale;
  }

  public ConversionEventDeviceInfo model(@Nullable String model) {
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
  public @Nullable String getModel() {
    return model;
  }

  @JsonProperty("model")
  public void setModel(@Nullable String model) {
    this.model = model;
  }

  public ConversionEventDeviceInfo networkType(@Nullable NetworkType networkType) {
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
  public @Nullable NetworkType getNetworkType() {
    return networkType;
  }

  @JsonProperty("network_type")
  public void setNetworkType(@Nullable NetworkType networkType) {
    this.networkType = networkType;
  }

  public ConversionEventDeviceInfo osFamily(@Nullable OsFamily osFamily) {
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
  public @Nullable OsFamily getOsFamily() {
    return osFamily;
  }

  @JsonProperty("os_family")
  public void setOsFamily(@Nullable OsFamily osFamily) {
    this.osFamily = osFamily;
  }

  public ConversionEventDeviceInfo osName(@Nullable String osName) {
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
  public @Nullable String getOsName() {
    return osName;
  }

  @JsonProperty("os_name")
  public void setOsName(@Nullable String osName) {
    this.osName = osName;
  }

  public ConversionEventDeviceInfo osReleaseName(@Nullable String osReleaseName) {
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
  public @Nullable String getOsReleaseName() {
    return osReleaseName;
  }

  @JsonProperty("os_release_name")
  public void setOsReleaseName(@Nullable String osReleaseName) {
    this.osReleaseName = osReleaseName;
  }

  public ConversionEventDeviceInfo osVersion(@Nullable String osVersion) {
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
  public @Nullable String getOsVersion() {
    return osVersion;
  }

  @JsonProperty("os_version")
  public void setOsVersion(@Nullable String osVersion) {
    this.osVersion = osVersion;
  }

  public ConversionEventDeviceInfo screenDensity(@Nullable Integer screenDensity) {
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
  public @Nullable Integer getScreenDensity() {
    return screenDensity;
  }

  @JsonProperty("screen_density")
  public void setScreenDensity(@Nullable Integer screenDensity) {
    this.screenDensity = screenDensity;
  }

  public ConversionEventDeviceInfo screenHeight(@Nullable Integer screenHeight) {
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
  public @Nullable Integer getScreenHeight() {
    return screenHeight;
  }

  @JsonProperty("screen_height")
  public void setScreenHeight(@Nullable Integer screenHeight) {
    this.screenHeight = screenHeight;
  }

  public ConversionEventDeviceInfo screenWidth(@Nullable Integer screenWidth) {
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
  public @Nullable Integer getScreenWidth() {
    return screenWidth;
  }

  @JsonProperty("screen_width")
  public void setScreenWidth(@Nullable Integer screenWidth) {
    this.screenWidth = screenWidth;
  }

  public ConversionEventDeviceInfo storageFreeSpace(@Nullable Integer storageFreeSpace) {
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
  public @Nullable Integer getStorageFreeSpace() {
    return storageFreeSpace;
  }

  @JsonProperty("storage_free_space")
  public void setStorageFreeSpace(@Nullable Integer storageFreeSpace) {
    this.storageFreeSpace = storageFreeSpace;
  }

  public ConversionEventDeviceInfo storageSize(@Nullable Integer storageSize) {
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
  public @Nullable Integer getStorageSize() {
    return storageSize;
  }

  @JsonProperty("storage_size")
  public void setStorageSize(@Nullable Integer storageSize) {
    this.storageSize = storageSize;
  }

  public ConversionEventDeviceInfo timezone(@Nullable String timezone) {
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
  public @Nullable String getTimezone() {
    return timezone;
  }

  @JsonProperty("timezone")
  public void setTimezone(@Nullable String timezone) {
    this.timezone = timezone;
  }

  public ConversionEventDeviceInfo timezoneAbbr(@Nullable String timezoneAbbr) {
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
  public @Nullable String getTimezoneAbbr() {
    return timezoneAbbr;
  }

  @JsonProperty("timezone_abbr")
  public void setTimezoneAbbr(@Nullable String timezoneAbbr) {
    this.timezoneAbbr = timezoneAbbr;
  }

  public ConversionEventDeviceInfo type(@Nullable String type) {
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
  public @Nullable String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable String type) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

