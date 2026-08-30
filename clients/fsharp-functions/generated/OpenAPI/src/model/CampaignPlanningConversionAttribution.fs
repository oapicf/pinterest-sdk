namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignPlanningConversionAttributionWindowDays

module CampaignPlanningConversionAttribution =

  //#region CampaignPlanningConversionAttribution

  [<CLIMutable>]
  type CampaignPlanningConversionAttribution = {
    [<JsonProperty(PropertyName = "click_window_days")>]
    ClickWindowDays : CampaignPlanningConversionAttributionWindowDays;
    [<JsonProperty(PropertyName = "engagement_window_days")>]
    EngagementWindowDays : CampaignPlanningConversionAttributionWindowDays;
    [<JsonProperty(PropertyName = "view_window_days")>]
    ViewWindowDays : CampaignPlanningConversionAttributionWindowDays;
  }

  //#endregion
