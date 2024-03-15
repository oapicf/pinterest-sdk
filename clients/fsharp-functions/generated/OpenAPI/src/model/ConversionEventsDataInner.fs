namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionEventsDataInnerCustomData
open OpenAPI.Model.ConversionEventsUserData
open OpenAPI.Model.string option

module ConversionEventsDataInner =

  //#region ConversionEventsDataInner

  [<CLIMutable>]
  type ConversionEventsDataInner = {
    [<JsonProperty(PropertyName = "event_name")>]
    EventName : string;
    [<JsonProperty(PropertyName = "action_source")>]
    ActionSource : string;
    [<JsonProperty(PropertyName = "event_time")>]
    EventTime : int64;
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "event_source_url")>]
    EventSourceUrl : string option;
    [<JsonProperty(PropertyName = "opt_out")>]
    OptOut : bool;
    [<JsonProperty(PropertyName = "partner_name")>]
    PartnerName : string option;
    [<JsonProperty(PropertyName = "user_data")>]
    UserData : ConversionEventsUserData;
    [<JsonProperty(PropertyName = "custom_data")>]
    CustomData : ConversionEventsDataInnerCustomData;
    [<JsonProperty(PropertyName = "app_id")>]
    AppId : string option;
    [<JsonProperty(PropertyName = "app_name")>]
    AppName : string option;
    [<JsonProperty(PropertyName = "app_version")>]
    AppVersion : string option;
    [<JsonProperty(PropertyName = "device_brand")>]
    DeviceBrand : string option;
    [<JsonProperty(PropertyName = "device_carrier")>]
    DeviceCarrier : string option;
    [<JsonProperty(PropertyName = "device_model")>]
    DeviceModel : string option;
    [<JsonProperty(PropertyName = "device_type")>]
    DeviceType : string option;
    [<JsonProperty(PropertyName = "os_version")>]
    OsVersion : string option;
    [<JsonProperty(PropertyName = "wifi")>]
    Wifi : bool;
    [<JsonProperty(PropertyName = "language")>]
    Language : string option;
  }

  //#endregion
