namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignDeliveryEstimatesDerivedMetrics
open OpenAPI.Model.CampaignPlanningCurveEstimate

module CampaignDeliveryEstimatesResponse =

  //#region CampaignDeliveryEstimatesResponse

  [<CLIMutable>]
  type CampaignDeliveryEstimatesResponse = {
    [<JsonProperty(PropertyName = "curves")>]
    Curves : CampaignPlanningCurveEstimate[];
    [<JsonProperty(PropertyName = "derived_metrics")>]
    DerivedMetrics : CampaignDeliveryEstimatesDerivedMetrics;
    [<JsonProperty(PropertyName = "max_potential_spend")>]
    MaxPotentialSpend : int;
  }

  //#endregion
