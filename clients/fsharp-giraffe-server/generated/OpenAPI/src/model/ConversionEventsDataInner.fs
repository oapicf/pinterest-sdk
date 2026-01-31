namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionEventAppInfo
open OpenAPI.Model.ConversionEventDeviceInfo
open OpenAPI.Model.ConversionEventsDataInnerCustomData
open OpenAPI.Model.ConversionEventsUserData
open OpenAPI.Model.string option

module ConversionEventsDataInner =

  //#region ConversionEventsDataInner


  type ConversionEvents_data_inner = {
    ActionSource : string;
    AppId : string option;
    AppInfo : ConversionEventAppInfo;
    AppName : string option;
    AppVersion : string option;
    CustomData : ConversionEventsDataInnerCustomData;
    DeviceBrand : string option;
    DeviceCarrier : string option;
    DeviceInfo : ConversionEventDeviceInfo;
    DeviceModel : string option;
    DeviceType : string option;
    EventId : string;
    EventName : string;
    EventSourceUrl : string option;
    EventTime : int64;
    Language : string option;
    OptOut : bool;
    OsVersion : string option;
    PartnerName : string option;
    UserData : ConversionEventsUserData;
    Wifi : bool;
  }
  //#endregion
