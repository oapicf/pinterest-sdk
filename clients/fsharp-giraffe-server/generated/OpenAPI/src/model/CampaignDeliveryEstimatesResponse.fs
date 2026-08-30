namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignDeliveryEstimatesDerivedMetrics
open OpenAPI.Model.CampaignPlanningCurveEstimate

module CampaignDeliveryEstimatesResponse =

  //#region CampaignDeliveryEstimatesResponse


  type CampaignDeliveryEstimatesResponse = {
    Curves : CampaignPlanningCurveEstimate[];
    DerivedMetrics : CampaignDeliveryEstimatesDerivedMetrics;
    MaxPotentialSpend : int;
  }
  //#endregion
