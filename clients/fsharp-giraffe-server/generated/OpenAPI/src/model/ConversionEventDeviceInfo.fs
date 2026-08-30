namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FormFactor
open OpenAPI.Model.NetworkType
open OpenAPI.Model.OsFamily

module ConversionEventDeviceInfo =

  //#region ConversionEventDeviceInfo


  type ConversionEventDeviceInfo = {
    BatteryLevel : int;
    Brand : string;
    Carrier : string;
    CpuCores : int;
    ExternalStorageFreeSpace : int;
    ExternalStorageSize : int;
    FormFactor : FormFactor;
    KernelVersion : string;
    Languages : string[];
    Locale : string;
    Model : string;
    NetworkType : NetworkType;
    OsFamily : OsFamily;
    OsName : string;
    OsReleaseName : string;
    OsVersion : string;
    ScreenDensity : int;
    ScreenHeight : int;
    ScreenWidth : int;
    StorageFreeSpace : int;
    StorageSize : int;
    Timezone : string;
    TimezoneAbbr : string;
    Type : string;
  }
  //#endregion
