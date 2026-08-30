namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignPlanningEstimationType
open OpenAPI.Model.CampaignPlanningPointEstimate

module CampaignPlanningCurveEstimate =

  //#region CampaignPlanningCurveEstimate


  type CampaignPlanningCurveEstimate = {
    EstimationType : CampaignPlanningEstimationType;
    Points : CampaignPlanningPointEstimate[];
  }
  //#endregion
