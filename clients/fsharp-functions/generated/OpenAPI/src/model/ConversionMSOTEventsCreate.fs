namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AttributionModel
open OpenAPI.Model.AttributionScope
open OpenAPI.Model.Currency
open OpenAPI.Model.MsotEventName

module ConversionMSOTEventsCreate =

  //#region ConversionMSOTEventsCreate

  [<CLIMutable>]
  type ConversionMSOTEventsCreate = {
    [<JsonProperty(PropertyName = "action_timestamps")>]
    ActionTimestamps : int64[];
    [<JsonProperty(PropertyName = "ad_group_id")>]
    AdGroupId : string;
    [<JsonProperty(PropertyName = "attribution_model")>]
    AttributionModel : AttributionModel;
    [<JsonProperty(PropertyName = "attribution_scope")>]
    AttributionScope : AttributionScope;
    [<JsonProperty(PropertyName = "attribution_score")>]
    AttributionScore : double;
    [<JsonProperty(PropertyName = "campaign_id")>]
    CampaignId : string;
    [<JsonProperty(PropertyName = "click_window")>]
    ClickWindow : string;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : Currency;
    [<JsonProperty(PropertyName = "event_id")>]
    EventId : string;
    [<JsonProperty(PropertyName = "event_name")>]
    EventName : MsotEventName;
    [<JsonProperty(PropertyName = "event_timestamp")>]
    EventTimestamp : int64;
    [<JsonProperty(PropertyName = "total_event_touchpoints")>]
    TotalEventTouchpoints : int;
    [<JsonProperty(PropertyName = "total_events")>]
    TotalEvents : int;
    [<JsonProperty(PropertyName = "total_events_fractional")>]
    TotalEventsFractional : double;
    [<JsonProperty(PropertyName = "value")>]
    Value : double;
    [<JsonProperty(PropertyName = "view_window")>]
    ViewWindow : string;
  }

  //#endregion
