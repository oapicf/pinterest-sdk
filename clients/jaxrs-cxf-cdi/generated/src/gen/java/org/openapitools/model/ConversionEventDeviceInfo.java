package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Object containing information about the device where event occurred.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Object containing information about the device where event occurred.")
public class ConversionEventDeviceInfo   {
  
  private Integer batteryLevel;

  private String brand;

  private String carrier;

  private Integer cpuCores;

  private Integer externalStorageFreeSpace;

  private Integer externalStorageSize;


public enum FormFactorEnum {

    @JsonProperty("desktop") DESKTOP(String.valueOf("desktop")), @JsonProperty("laptop") LAPTOP(String.valueOf("laptop")), @JsonProperty("cellphone") CELLPHONE(String.valueOf("cellphone")), @JsonProperty("tablet") TABLET(String.valueOf("tablet")), @JsonProperty("smartwatch") SMARTWATCH(String.valueOf("smartwatch")), @JsonProperty("tv") TV(String.valueOf("tv")), @JsonProperty("vr") VR(String.valueOf("vr")), @JsonProperty("console") CONSOLE(String.valueOf("console")), @JsonProperty("other") OTHER(String.valueOf("other"));


    private String value;

    FormFactorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FormFactorEnum fromValue(String value) {
        for (FormFactorEnum b : FormFactorEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private FormFactorEnum formFactor;

  private String kernelVersion;

  private List<String> languages = new ArrayList<>();

  private String locale;

  private String model;


public enum NetworkTypeEnum {

    @JsonProperty("wifi") WIFI(String.valueOf("wifi")), @JsonProperty("cellular_2g") CELLULAR_2G(String.valueOf("cellular_2g")), @JsonProperty("cellular_3g") CELLULAR_3G(String.valueOf("cellular_3g")), @JsonProperty("cellular_4g") CELLULAR_4G(String.valueOf("cellular_4g")), @JsonProperty("cellular_5g") CELLULAR_5G(String.valueOf("cellular_5g")), @JsonProperty("cellular_6g") CELLULAR_6G(String.valueOf("cellular_6g")), @JsonProperty("ethernet") ETHERNET(String.valueOf("ethernet")), @JsonProperty("unknown") UNKNOWN(String.valueOf("unknown"));


    private String value;

    NetworkTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NetworkTypeEnum fromValue(String value) {
        for (NetworkTypeEnum b : NetworkTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private NetworkTypeEnum networkType;


public enum OsFamilyEnum {

    @JsonProperty("ios") IOS(String.valueOf("ios")), @JsonProperty("android") ANDROID(String.valueOf("android")), @JsonProperty("macos") MACOS(String.valueOf("macos")), @JsonProperty("windows") WINDOWS(String.valueOf("windows")), @JsonProperty("linux") LINUX(String.valueOf("linux")), @JsonProperty("bsd") BSD(String.valueOf("bsd")), @JsonProperty("other") OTHER(String.valueOf("other"));


    private String value;

    OsFamilyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OsFamilyEnum fromValue(String value) {
        for (OsFamilyEnum b : OsFamilyEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private OsFamilyEnum osFamily;

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
   * Battery charge level percentage
   * minimum: 0
   * maximum: 100
   **/
  public ConversionEventDeviceInfo batteryLevel(Integer batteryLevel) {
    this.batteryLevel = batteryLevel;
    return this;
  }

  
  @ApiModelProperty(example = "78", value = "Battery charge level percentage")
  @JsonProperty("battery_level")
 @Min(0) @Max(100)  public Integer getBatteryLevel() {
    return batteryLevel;
  }
  public void setBatteryLevel(Integer batteryLevel) {
    this.batteryLevel = batteryLevel;
  }


  /**
   * Device brand
   **/
  public ConversionEventDeviceInfo brand(String brand) {
    this.brand = brand;
    return this;
  }

  
  @ApiModelProperty(example = "Apple, Samsung, Motorola", value = "Device brand")
  @JsonProperty("brand")
 @Size(max=100)  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }


  /**
   * User device&#39;s mobile carrier.
   **/
  public ConversionEventDeviceInfo carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

  
  @ApiModelProperty(example = "T-Mobile", value = "User device's mobile carrier.")
  @JsonProperty("carrier")
 @Size(max=100)  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }


  /**
   * Number of CPU cores
   * minimum: 0
   * maximum: 1152
   **/
  public ConversionEventDeviceInfo cpuCores(Integer cpuCores) {
    this.cpuCores = cpuCores;
    return this;
  }

  
  @ApiModelProperty(example = "8", value = "Number of CPU cores")
  @JsonProperty("cpu_cores")
 @Min(0) @Max(1152)  public Integer getCpuCores() {
    return cpuCores;
  }
  public void setCpuCores(Integer cpuCores) {
    this.cpuCores = cpuCores;
  }


  /**
   * External storage size in GB
   * minimum: 0
   * maximum: 1048576
   **/
  public ConversionEventDeviceInfo externalStorageFreeSpace(Integer externalStorageFreeSpace) {
    this.externalStorageFreeSpace = externalStorageFreeSpace;
    return this;
  }

  
  @ApiModelProperty(example = "126", value = "External storage size in GB")
  @JsonProperty("external_storage_free_space")
 @Min(0) @Max(1048576)  public Integer getExternalStorageFreeSpace() {
    return externalStorageFreeSpace;
  }
  public void setExternalStorageFreeSpace(Integer externalStorageFreeSpace) {
    this.externalStorageFreeSpace = externalStorageFreeSpace;
  }


  /**
   * External storage size in GB
   * minimum: 0
   * maximum: 1048576
   **/
  public ConversionEventDeviceInfo externalStorageSize(Integer externalStorageSize) {
    this.externalStorageSize = externalStorageSize;
    return this;
  }

  
  @ApiModelProperty(example = "512", value = "External storage size in GB")
  @JsonProperty("external_storage_size")
 @Min(0) @Max(1048576)  public Integer getExternalStorageSize() {
    return externalStorageSize;
  }
  public void setExternalStorageSize(Integer externalStorageSize) {
    this.externalStorageSize = externalStorageSize;
  }


  /**
   * Device form factor
   **/
  public ConversionEventDeviceInfo formFactor(FormFactorEnum formFactor) {
    this.formFactor = formFactor;
    return this;
  }

  
  @ApiModelProperty(example = "cellphone", value = "Device form factor")
  @JsonProperty("form_factor")
  public FormFactorEnum getFormFactor() {
    return formFactor;
  }
  public void setFormFactor(FormFactorEnum formFactor) {
    this.formFactor = formFactor;
  }


  /**
   * Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
   **/
  public ConversionEventDeviceInfo kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

  
  @ApiModelProperty(example = "6.15", value = "Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release")
  @JsonProperty("kernel_version")
 @Size(max=100)  public String getKernelVersion() {
    return kernelVersion;
  }
  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }


  /**
   * List of user installed languages. ISO 639-1 format
   **/
  public ConversionEventDeviceInfo languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  
  @ApiModelProperty(example = "[\"en\",\"de\",\"lt\"]", value = "List of user installed languages. ISO 639-1 format")
  @JsonProperty("languages")
 @Size(min=0,max=100)  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public ConversionEventDeviceInfo addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<>();
    }
    this.languages.add(languagesItem);
    return this;
  }


  /**
   * Device locale BCP-47 format
   **/
  public ConversionEventDeviceInfo locale(String locale) {
    this.locale = locale;
    return this;
  }

  
  @ApiModelProperty(example = "en-us", value = "Device locale BCP-47 format")
  @JsonProperty("locale")
 @Size(max=35)  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }


  /**
   * Device model name
   **/
  public ConversionEventDeviceInfo model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(example = "16 Pro, Galaxy S25 Ultra", value = "Device model name")
  @JsonProperty("model")
 @Size(max=100)  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }


  /**
   * Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
   **/
  public ConversionEventDeviceInfo networkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
    return this;
  }

  
  @ApiModelProperty(example = "wifi", value = "Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()")
  @JsonProperty("network_type")
  public NetworkTypeEnum getNetworkType() {
    return networkType;
  }
  public void setNetworkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
  }


  /**
   * OS Family
   **/
  public ConversionEventDeviceInfo osFamily(OsFamilyEnum osFamily) {
    this.osFamily = osFamily;
    return this;
  }

  
  @ApiModelProperty(example = "ios", value = "OS Family")
  @JsonProperty("os_family")
  public OsFamilyEnum getOsFamily() {
    return osFamily;
  }
  public void setOsFamily(OsFamilyEnum osFamily) {
    this.osFamily = osFamily;
  }


  /**
   * Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
   **/
  public ConversionEventDeviceInfo osName(String osName) {
    this.osName = osName;
    return this;
  }

  
  @ApiModelProperty(example = "10", value = "Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch")
  @JsonProperty("os_name")
 @Size(max=100)  public String getOsName() {
    return osName;
  }
  public void setOsName(String osName) {
    this.osName = osName;
  }


  /**
   * Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
   **/
  public ConversionEventDeviceInfo osReleaseName(String osReleaseName) {
    this.osReleaseName = osReleaseName;
    return this;
  }

  
  @ApiModelProperty(example = "18.3", value = "Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin")
  @JsonProperty("os_release_name")
 @Size(max=100)  public String getOsReleaseName() {
    return osReleaseName;
  }
  public void setOsReleaseName(String osReleaseName) {
    this.osReleaseName = osReleaseName;
  }


  /**
   * Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
   **/
  public ConversionEventDeviceInfo osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  
  @ApiModelProperty(example = "18.3", value = "Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04")
  @JsonProperty("os_version")
 @Size(max=100)  public String getOsVersion() {
    return osVersion;
  }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  /**
   * Screen density, PPI
   * minimum: 0
   * maximum: 100000
   **/
  public ConversionEventDeviceInfo screenDensity(Integer screenDensity) {
    this.screenDensity = screenDensity;
    return this;
  }

  
  @ApiModelProperty(example = "460", value = "Screen density, PPI")
  @JsonProperty("screen_density")
 @Min(0) @Max(100000)  public Integer getScreenDensity() {
    return screenDensity;
  }
  public void setScreenDensity(Integer screenDensity) {
    this.screenDensity = screenDensity;
  }


  /**
   * Screen height in pixels
   * minimum: 0
   * maximum: 30720
   **/
  public ConversionEventDeviceInfo screenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
    return this;
  }

  
  @ApiModelProperty(example = "2868", value = "Screen height in pixels")
  @JsonProperty("screen_height")
 @Min(0) @Max(30720)  public Integer getScreenHeight() {
    return screenHeight;
  }
  public void setScreenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
  }


  /**
   * Screen width in pixels
   * minimum: 0
   * maximum: 30720
   **/
  public ConversionEventDeviceInfo screenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
    return this;
  }

  
  @ApiModelProperty(example = "1320", value = "Screen width in pixels")
  @JsonProperty("screen_width")
 @Min(0) @Max(30720)  public Integer getScreenWidth() {
    return screenWidth;
  }
  public void setScreenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
  }


  /**
   * Internal storage size in GB
   * minimum: 0
   * maximum: 1048576
   **/
  public ConversionEventDeviceInfo storageFreeSpace(Integer storageFreeSpace) {
    this.storageFreeSpace = storageFreeSpace;
    return this;
  }

  
  @ApiModelProperty(example = "184", value = "Internal storage size in GB")
  @JsonProperty("storage_free_space")
 @Min(0) @Max(1048576)  public Integer getStorageFreeSpace() {
    return storageFreeSpace;
  }
  public void setStorageFreeSpace(Integer storageFreeSpace) {
    this.storageFreeSpace = storageFreeSpace;
  }


  /**
   * Internal storage size in GB
   * minimum: 0
   * maximum: 1048576
   **/
  public ConversionEventDeviceInfo storageSize(Integer storageSize) {
    this.storageSize = storageSize;
    return this;
  }

  
  @ApiModelProperty(example = "256", value = "Internal storage size in GB")
  @JsonProperty("storage_size")
 @Min(0) @Max(1048576)  public Integer getStorageSize() {
    return storageSize;
  }
  public void setStorageSize(Integer storageSize) {
    this.storageSize = storageSize;
  }


  /**
   * Device timezone
   **/
  public ConversionEventDeviceInfo timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  
  @ApiModelProperty(example = "USA/New York", value = "Device timezone")
  @JsonProperty("timezone")
 @Size(max=40)  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  /**
   * Timezone abbreviation
   **/
  public ConversionEventDeviceInfo timezoneAbbr(String timezoneAbbr) {
    this.timezoneAbbr = timezoneAbbr;
    return this;
  }

  
  @ApiModelProperty(example = "PDT", value = "Timezone abbreviation")
  @JsonProperty("timezone_abbr")
 @Size(max=5)  public String getTimezoneAbbr() {
    return timezoneAbbr;
  }
  public void setTimezoneAbbr(String timezoneAbbr) {
    this.timezoneAbbr = timezoneAbbr;
  }


  /**
   * Device type
   **/
  public ConversionEventDeviceInfo type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "iPhone, Android", value = "Device type")
  @JsonProperty("type")
 @Size(max=100)  public String getType() {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

