namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionEventAppInfo
open OpenAPI.Model.ConversionEventDeviceInfo
open OpenAPI.Model.ConversionEventsDataItemsCustomData
open OpenAPI.Model.ConversionEventsUserDataProperties
open OpenAPI.Model.string option

module ConversionEventsDataItems =

  //#region ConversionEventsDataItems

  [<CLIMutable>]
  type ConversionEventsDataItems = {
    [<JsonProperty(PropertyName = "action_source")>]
    ActionSource : string;
    [<JsonProperty(PropertyName = "app_id")>]
    AppId : string option;
    [<JsonProperty(PropertyName = "app_info")>]
    AppInfo : ConversionEventAppInfo;
    [<JsonProperty(PropertyName = "app_name")>]
    AppName : string option;
    [<JsonProperty(PropertyName = "app_version")>]
    AppVersion : string option;
    [<JsonProperty(PropertyName = "custom_data")>]
    CustomData : ConversionEventsDataItemsCustomData;
    [<JsonProperty(PropertyName = "device_brand")>]
    DeviceBrand : string option;
    [<JsonProperty(PropertyName = "device_carrier")>]
    DeviceCarrier : string option;
    [<JsonProperty(PropertyName = "device_info")>]
    DeviceInfo : ConversionEventDeviceInfo;
    [<JsonProperty(PropertyName = "device_model")>]
    DeviceModel : string option;
    [<JsonProperty(PropertyName = "device_type")>]
    DeviceType : string option;
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "event_name")>]
    EventName : string;
    [<JsonProperty(PropertyName = "event_source_url")>]
    EventSourceUrl : string option;
    [<JsonProperty(PropertyName = "event_time")>]
    EventTime : int64;
    [<JsonProperty(PropertyName = "language")>]
    Language : string option;
    [<JsonProperty(PropertyName = "opt_out")>]
    OptOut : bool;
    [<JsonProperty(PropertyName = "os_version")>]
    OsVersion : string option;
    [<JsonProperty(PropertyName = "partner_name")>]
    PartnerName : string option;
    [<JsonProperty(PropertyName = "user_data")>]
    UserData : ConversionEventsUserDataProperties;
    [<JsonProperty(PropertyName = "wifi")>]
    Wifi : bool;
  }

  //#endregion
