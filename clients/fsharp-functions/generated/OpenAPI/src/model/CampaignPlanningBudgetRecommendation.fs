namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignPlanningBudgetRecommendationPoint
open OpenAPI.Model.CampaignPlanningExperimentBudgetRecommendation

module CampaignPlanningBudgetRecommendation =

  //#region CampaignPlanningBudgetRecommendation

  [<CLIMutable>]
  type CampaignPlanningBudgetRecommendation = {
    [<JsonProperty(PropertyName = "budget_recommendation")>]
    BudgetRecommendation : int;
    [<JsonProperty(PropertyName = "experiment_campaign_budget_recommendation")>]
    ExperimentCampaignBudgetRecommendation : CampaignPlanningExperimentBudgetRecommendation[];
    [<JsonProperty(PropertyName = "lifetime_days_recommendation")>]
    LifetimeDaysRecommendation : int;
    [<JsonProperty(PropertyName = "point_estimations")>]
    PointEstimations : CampaignPlanningBudgetRecommendationPoint[];
  }

  //#endregion
