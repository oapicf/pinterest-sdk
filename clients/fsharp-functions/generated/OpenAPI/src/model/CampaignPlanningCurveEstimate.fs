namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignPlanningEstimationType
open OpenAPI.Model.CampaignPlanningPointEstimate

module CampaignPlanningCurveEstimate =

  //#region CampaignPlanningCurveEstimate

  [<CLIMutable>]
  type CampaignPlanningCurveEstimate = {
    [<JsonProperty(PropertyName = "estimation_type")>]
    EstimationType : CampaignPlanningEstimationType;
    [<JsonProperty(PropertyName = "points")>]
    Points : CampaignPlanningPointEstimate[];
  }

  //#endregion
