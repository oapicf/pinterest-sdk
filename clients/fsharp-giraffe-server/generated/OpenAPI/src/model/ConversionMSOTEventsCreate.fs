namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AttributionModel
open OpenAPI.Model.AttributionScope
open OpenAPI.Model.Currency
open OpenAPI.Model.MsotEventName

module ConversionMSOTEventsCreate =

  //#region ConversionMSOTEventsCreate


  type ConversionMSOTEventsCreate = {
    ActionTimestamps : int64[];
    AdGroupId : string;
    AttributionModel : AttributionModel;
    AttributionScope : AttributionScope;
    AttributionScore : double;
    CampaignId : string;
    ClickWindow : string;
    Currency : Currency;
    EventId : string;
    EventName : MsotEventName;
    EventTimestamp : int64;
    TotalEventTouchpoints : int;
    TotalEvents : int;
    TotalEventsFractional : double;
    Value : double;
    ViewWindow : string;
  }
  //#endregion
