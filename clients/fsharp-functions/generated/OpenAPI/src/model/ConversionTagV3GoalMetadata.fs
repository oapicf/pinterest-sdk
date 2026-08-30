namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AttributionWindows
open OpenAPI.Model.ConversionEvent
open OpenAPI.Model.bool option

module ConversionTagV3GoalMetadata =

  //#region ConversionTagV3GoalMetadata

  [<CLIMutable>]
  type ConversionTagV3GoalMetadata = {
    [<JsonProperty(PropertyName = "attribution_windows")>]
    AttributionWindows : AttributionWindows;
    [<JsonProperty(PropertyName = "conversion_event")>]
    ConversionEvent : ConversionEvent;
    [<JsonProperty(PropertyName = "conversion_tag_id")>]
    ConversionTagId : string;
    [<JsonProperty(PropertyName = "cpa_goal_value_in_micro_currency")>]
    CpaGoalValueInMicroCurrency : string;
    [<JsonProperty(PropertyName = "is_roas_optimized")>]
    IsRoasOptimized : bool option;
    [<JsonProperty(PropertyName = "reporting_event")>]
    ReportingEvent : string;
  }

  //#endregion
