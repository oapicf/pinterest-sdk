namespace OpenAPI.Model

open System
open System.Collections.Generic

module ConversionEventDeviceInfo =

  //#region ConversionEventDeviceInfo

  //#region enums
  type FormFactorEnum = DesktopEnum of string  |  LaptopEnum of string  |  CellphoneEnum of string  |  TabletEnum of string  |  SmartwatchEnum of string  |  TvEnum of string  |  VrEnum of string  |  ConsoleEnum of string  |  OtherEnum of string  
  //#endregion
  //#region enums
  type NetworkTypeEnum = WifiEnum of string  |  Cellular2gEnum of string  |  Cellular3gEnum of string  |  Cellular4gEnum of string  |  Cellular5gEnum of string  |  Cellular6gEnum of string  |  EthernetEnum of string  |  UnknownEnum of string  
  //#endregion
  //#region enums
  type OsFamilyEnum = IosEnum of string  |  AndroidEnum of string  |  MacosEnum of string  |  WindowsEnum of string  |  LinuxEnum of string  |  BsdEnum of string  |  OtherEnum of string  
  //#endregion

  type ConversionEventDeviceInfo = {
    BatteryLevel : int;
    Brand : string;
    Carrier : string;
    CpuCores : int;
    ExternalStorageFreeSpace : int;
    ExternalStorageSize : int;
    FormFactor : FormFactorEnum;
    KernelVersion : string;
    Languages : string[];
    Locale : string;
    Model : string;
    NetworkType : NetworkTypeEnum;
    OsFamily : OsFamilyEnum;
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
