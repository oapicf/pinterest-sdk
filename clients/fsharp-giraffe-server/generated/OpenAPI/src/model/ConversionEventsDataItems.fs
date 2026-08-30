namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionEventAppInfo
open OpenAPI.Model.ConversionEventDeviceInfo
open OpenAPI.Model.ConversionEventsDataItemsCustomData
open OpenAPI.Model.ConversionEventsUserDataProperties
open OpenAPI.Model.string option

module ConversionEventsDataItems =

  //#region ConversionEventsDataItems


  type ConversionEventsDataItems = {
    ActionSource : string;
    AppId : string option;
    AppInfo : ConversionEventAppInfo;
    AppName : string option;
    AppVersion : string option;
    CustomData : ConversionEventsDataItemsCustomData;
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
    UserData : ConversionEventsUserDataProperties;
    Wifi : bool;
  }
  //#endregion
