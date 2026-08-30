namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignPlanningEstimationType
open OpenAPI.Model.CampaignPlanningPointEstimate

module CampaignPlanningBudgetRecommendationPoint =

  //#region CampaignPlanningBudgetRecommendationPoint

  [<CLIMutable>]
  type CampaignPlanningBudgetRecommendationPoint = {
    [<JsonProperty(PropertyName = "estimation_type")>]
    EstimationType : CampaignPlanningEstimationType;
    [<JsonProperty(PropertyName = "point_estimate")>]
    PointEstimate : CampaignPlanningPointEstimate;
  }

  //#endregion
