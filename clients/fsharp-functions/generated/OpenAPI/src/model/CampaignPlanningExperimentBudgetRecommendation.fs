namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignPlanningBudgetRecommendationPoint

module CampaignPlanningExperimentBudgetRecommendation =

  //#region CampaignPlanningExperimentBudgetRecommendation

  [<CLIMutable>]
  type CampaignPlanningExperimentBudgetRecommendation = {
    [<JsonProperty(PropertyName = "budget_recommendation")>]
    BudgetRecommendation : int;
    [<JsonProperty(PropertyName = "lifetime_days_recommendation")>]
    LifetimeDaysRecommendation : int;
    [<JsonProperty(PropertyName = "point_estimations")>]
    PointEstimations : CampaignPlanningBudgetRecommendationPoint[];
    [<JsonProperty(PropertyName = "version_id")>]
    VersionId : string;
  }

  //#endregion
