namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FormFactor
open OpenAPI.Model.NetworkType
open OpenAPI.Model.OsFamily

module ConversionEventDeviceInfo =

  //#region ConversionEventDeviceInfo

  [<CLIMutable>]
  type ConversionEventDeviceInfo = {
    [<JsonProperty(PropertyName = "battery_level")>]
    BatteryLevel : int;
    [<JsonProperty(PropertyName = "brand")>]
    Brand : string;
    [<JsonProperty(PropertyName = "carrier")>]
    Carrier : string;
    [<JsonProperty(PropertyName = "cpu_cores")>]
    CpuCores : int;
    [<JsonProperty(PropertyName = "external_storage_free_space")>]
    ExternalStorageFreeSpace : int;
    [<JsonProperty(PropertyName = "external_storage_size")>]
    ExternalStorageSize : int;
    [<JsonProperty(PropertyName = "form_factor")>]
    FormFactor : FormFactor;
    [<JsonProperty(PropertyName = "kernel_version")>]
    KernelVersion : string;
    [<JsonProperty(PropertyName = "languages")>]
    Languages : string[];
    [<JsonProperty(PropertyName = "locale")>]
    Locale : string;
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
    [<JsonProperty(PropertyName = "network_type")>]
    NetworkType : NetworkType;
    [<JsonProperty(PropertyName = "os_family")>]
    OsFamily : OsFamily;
    [<JsonProperty(PropertyName = "os_name")>]
    OsName : string;
    [<JsonProperty(PropertyName = "os_release_name")>]
    OsReleaseName : string;
    [<JsonProperty(PropertyName = "os_version")>]
    OsVersion : string;
    [<JsonProperty(PropertyName = "screen_density")>]
    ScreenDensity : int;
    [<JsonProperty(PropertyName = "screen_height")>]
    ScreenHeight : int;
    [<JsonProperty(PropertyName = "screen_width")>]
    ScreenWidth : int;
    [<JsonProperty(PropertyName = "storage_free_space")>]
    StorageFreeSpace : int;
    [<JsonProperty(PropertyName = "storage_size")>]
    StorageSize : int;
    [<JsonProperty(PropertyName = "timezone")>]
    Timezone : string;
    [<JsonProperty(PropertyName = "timezone_abbr")>]
    TimezoneAbbr : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
