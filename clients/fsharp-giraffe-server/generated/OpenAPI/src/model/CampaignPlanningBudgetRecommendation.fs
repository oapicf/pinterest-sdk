namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignPlanningBudgetRecommendationPoint
open OpenAPI.Model.CampaignPlanningExperimentBudgetRecommendation

module CampaignPlanningBudgetRecommendation =

  //#region CampaignPlanningBudgetRecommendation


  type CampaignPlanningBudgetRecommendation = {
    BudgetRecommendation : int;
    ExperimentCampaignBudgetRecommendation : CampaignPlanningExperimentBudgetRecommendation[];
    LifetimeDaysRecommendation : int;
    PointEstimations : CampaignPlanningBudgetRecommendationPoint[];
  }
  //#endregion
