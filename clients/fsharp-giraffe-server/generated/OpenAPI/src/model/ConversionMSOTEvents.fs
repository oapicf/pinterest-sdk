namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Currency

module ConversionMSOTEvents =

  //#region ConversionMSOTEvents

  //#region enums
  type AttributionModelEnum = FirstTouchEnum of string  |  LastTouchEnum of string  |  MultiTouchEnum of string  
  //#endregion
  //#region enums
  type AttributionScopeEnum = ViewEnum of string  |  EngagementEnum of string  |  ClickEnum of string  
  //#endregion
  //#region enums
  type EventNameEnum = AddToCartEnum of string  |  CheckoutEnum of string  |  LeadEnum of string  |  SignupEnum of string  
  //#endregion

  type ConversionMSOTEvents = {
    ActionTimestamps : int64[];
    AdGroupId : string;
    AttributionModel : AttributionModelEnum;
    AttributionScope : AttributionScopeEnum;
    AttributionScore : double;
    CampaignId : string;
    Currency : Currency;
    EventId : string;
    EventName : EventNameEnum;
    EventTimestamp : int64;
    TotalEventTouchpoints : int;
    TotalEvents : int;
    Value : double;
  }
  //#endregion
