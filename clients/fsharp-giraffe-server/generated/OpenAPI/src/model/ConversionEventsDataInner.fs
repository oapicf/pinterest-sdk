namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionEventsDataInnerCustomData
open OpenAPI.Model.ConversionEventsUserData
open OpenAPI.Model.string option

module ConversionEventsDataInner =

  //#region ConversionEventsDataInner


  type ConversionEvents_data_inner = {
    EventName : string;
    ActionSource : string;
    EventTime : int64;
    EventId : string;
    EventSourceUrl : string option;
    OptOut : bool;
    PartnerName : string option;
    UserData : ConversionEventsUserData;
    CustomData : ConversionEventsDataInnerCustomData;
    AppId : string option;
    AppName : string option;
    AppVersion : string option;
    DeviceBrand : string option;
    DeviceCarrier : string option;
    DeviceModel : string option;
    DeviceType : string option;
    OsVersion : string option;
    Wifi : bool;
    Language : string option;
  }
  //#endregion
