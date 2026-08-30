namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignPlanningConversionAttribution
open OpenAPI.Model.CampaignPlanningConversionEvent

module CampaignPlanningConversionRate =

  //#region CampaignPlanningConversionRate

  [<CLIMutable>]
  type CampaignPlanningConversionRate = {
    [<JsonProperty(PropertyName = "attribution_windows")>]
    AttributionWindows : CampaignPlanningConversionAttribution;
    [<JsonProperty(PropertyName = "conversion_event")>]
    ConversionEvent : CampaignPlanningConversionEvent;
    [<JsonProperty(PropertyName = "conversion_rate")>]
    ConversionRate : float;
  }

  //#endregion
