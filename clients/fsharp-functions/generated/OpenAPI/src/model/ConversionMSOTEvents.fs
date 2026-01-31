namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Currency

module ConversionMSOTEvents =

  //#region ConversionMSOTEvents

  [<CLIMutable>]
  type ConversionMSOTEvents = {
    [<JsonProperty(PropertyName = "action_timestamps")>]
    ActionTimestamps : int64[];
    [<JsonProperty(PropertyName = "ad_group_id")>]
    AdGroupId : string;
    [<JsonProperty(PropertyName = "attribution_model")>]
    AttributionModel : string;
    [<JsonProperty(PropertyName = "attribution_scope")>]
    AttributionScope : string;
    [<JsonProperty(PropertyName = "attribution_score")>]
    AttributionScore : double;
    [<JsonProperty(PropertyName = "campaign_id")>]
    CampaignId : string;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : Currency;
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "event_name")>]
    EventName : string;
    [<JsonProperty(PropertyName = "event_timestamp")>]
    EventTimestamp : int64;
    [<JsonProperty(PropertyName = "total_event_touchpoints")>]
    TotalEventTouchpoints : int;
    [<JsonProperty(PropertyName = "total_events")>]
    TotalEvents : int;
    [<JsonProperty(PropertyName = "value")>]
    Value : double;
  }

  //#endregion
