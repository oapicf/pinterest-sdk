namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignPlanningEstimationType
open OpenAPI.Model.CampaignPlanningPointEstimate

module CampaignPlanningBudgetRecommendationPoint =

  //#region CampaignPlanningBudgetRecommendationPoint


  type CampaignPlanningBudgetRecommendationPoint = {
    EstimationType : CampaignPlanningEstimationType;
    PointEstimate : CampaignPlanningPointEstimate;
  }
  //#endregion
