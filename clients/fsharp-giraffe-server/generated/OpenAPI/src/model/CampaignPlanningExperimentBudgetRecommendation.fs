namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignPlanningBudgetRecommendationPoint

module CampaignPlanningExperimentBudgetRecommendation =

  //#region CampaignPlanningExperimentBudgetRecommendation


  type CampaignPlanningExperimentBudgetRecommendation = {
    BudgetRecommendation : int;
    LifetimeDaysRecommendation : int;
    PointEstimations : CampaignPlanningBudgetRecommendationPoint[];
    VersionId : string;
  }
  //#endregion
