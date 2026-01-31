package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Object containing information about the device where event occurred.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionEventDeviceInfo   {
  
  private Integer batteryLevel;
  private String brand;
  private String carrier;
  private Integer cpuCores;
  private Integer externalStorageFreeSpace;
  private Integer externalStorageSize;


  public enum FormFactorEnum {
    DESKTOP("desktop"),
    LAPTOP("laptop"),
    CELLPHONE("cellphone"),
    TABLET("tablet"),
    SMARTWATCH("smartwatch"),
    TV("tv"),
    VR("vr"),
    CONSOLE("console"),
    OTHER("other");

    private String value;

    FormFactorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private FormFactorEnum formFactor;
  private String kernelVersion;
  private List<String> languages = new ArrayList<>();
  private String locale;
  private String model;


  public enum NetworkTypeEnum {
    WIFI("wifi"),
    CELLULAR_2G("cellular_2g"),
    CELLULAR_3G("cellular_3g"),
    CELLULAR_4G("cellular_4g"),
    CELLULAR_5G("cellular_5g"),
    CELLULAR_6G("cellular_6g"),
    ETHERNET("ethernet"),
    UNKNOWN("unknown");

    private String value;

    NetworkTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private NetworkTypeEnum networkType;


  public enum OsFamilyEnum {
    IOS("ios"),
    ANDROID("android"),
    MACOS("macos"),
    WINDOWS("windows"),
    LINUX("linux"),
    BSD("bsd"),
    OTHER("other");

    private String value;

    OsFamilyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
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

  public ConversionEventDeviceInfo () {

  }

  public ConversionEventDeviceInfo (Integer batteryLevel, String brand, String carrier, Integer cpuCores, Integer externalStorageFreeSpace, Integer externalStorageSize, FormFactorEnum formFactor, String kernelVersion, List<String> languages, String locale, String model, NetworkTypeEnum networkType, OsFamilyEnum osFamily, String osName, String osReleaseName, String osVersion, Integer screenDensity, Integer screenHeight, Integer screenWidth, Integer storageFreeSpace, Integer storageSize, String timezone, String timezoneAbbr, String type) {
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

    
  @JsonProperty("battery_level")
  public Integer getBatteryLevel() {
    return batteryLevel;
  }
  public void setBatteryLevel(Integer batteryLevel) {
    this.batteryLevel = batteryLevel;
  }

    
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

    
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

    
  @JsonProperty("cpu_cores")
  public Integer getCpuCores() {
    return cpuCores;
  }
  public void setCpuCores(Integer cpuCores) {
    this.cpuCores = cpuCores;
  }

    
  @JsonProperty("external_storage_free_space")
  public Integer getExternalStorageFreeSpace() {
    return externalStorageFreeSpace;
  }
  public void setExternalStorageFreeSpace(Integer externalStorageFreeSpace) {
    this.externalStorageFreeSpace = externalStorageFreeSpace;
  }

    
  @JsonProperty("external_storage_size")
  public Integer getExternalStorageSize() {
    return externalStorageSize;
  }
  public void setExternalStorageSize(Integer externalStorageSize) {
    this.externalStorageSize = externalStorageSize;
  }

    
  @JsonProperty("form_factor")
  public FormFactorEnum getFormFactor() {
    return formFactor;
  }
  public void setFormFactor(FormFactorEnum formFactor) {
    this.formFactor = formFactor;
  }

    
  @JsonProperty("kernel_version")
  public String getKernelVersion() {
    return kernelVersion;
  }
  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }

    
  @JsonProperty("languages")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

    
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

    
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

    
  @JsonProperty("network_type")
  public NetworkTypeEnum getNetworkType() {
    return networkType;
  }
  public void setNetworkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
  }

    
  @JsonProperty("os_family")
  public OsFamilyEnum getOsFamily() {
    return osFamily;
  }
  public void setOsFamily(OsFamilyEnum osFamily) {
    this.osFamily = osFamily;
  }

    
  @JsonProperty("os_name")
  public String getOsName() {
    return osName;
  }
  public void setOsName(String osName) {
    this.osName = osName;
  }

    
  @JsonProperty("os_release_name")
  public String getOsReleaseName() {
    return osReleaseName;
  }
  public void setOsReleaseName(String osReleaseName) {
    this.osReleaseName = osReleaseName;
  }

    
  @JsonProperty("os_version")
  public String getOsVersion() {
    return osVersion;
  }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

    
  @JsonProperty("screen_density")
  public Integer getScreenDensity() {
    return screenDensity;
  }
  public void setScreenDensity(Integer screenDensity) {
    this.screenDensity = screenDensity;
  }

    
  @JsonProperty("screen_height")
  public Integer getScreenHeight() {
    return screenHeight;
  }
  public void setScreenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
  }

    
  @JsonProperty("screen_width")
  public Integer getScreenWidth() {
    return screenWidth;
  }
  public void setScreenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
  }

    
  @JsonProperty("storage_free_space")
  public Integer getStorageFreeSpace() {
    return storageFreeSpace;
  }
  public void setStorageFreeSpace(Integer storageFreeSpace) {
    this.storageFreeSpace = storageFreeSpace;
  }

    
  @JsonProperty("storage_size")
  public Integer getStorageSize() {
    return storageSize;
  }
  public void setStorageSize(Integer storageSize) {
    this.storageSize = storageSize;
  }

    
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

    
  @JsonProperty("timezone_abbr")
  public String getTimezoneAbbr() {
    return timezoneAbbr;
  }
  public void setTimezoneAbbr(String timezoneAbbr) {
    this.timezoneAbbr = timezoneAbbr;
  }

    
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
