namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignDeliveryEstimatesDerivedMetrics
open OpenAPI.Model.CampaignPlanningAdGroupAudienceSize
open OpenAPI.Model.CampaignPlanningConversionRate
open OpenAPI.Model.CampaignPlanningCurveEstimate
open OpenAPI.Model.CampaignPlanningResponseError

module BulkCampaignDeliveryEstimatesItem =

  //#region BulkCampaignDeliveryEstimatesItem


  type BulkCampaignDeliveryEstimatesItem = {
    AdgroupAudienceSizes : CampaignPlanningAdGroupAudienceSize[];
    ConversionRate : float;
    ConversionRates : CampaignPlanningConversionRate[];
    Curves : CampaignPlanningCurveEstimate[];
    DerivedMetrics : CampaignDeliveryEstimatesDerivedMetrics;
    Errors : CampaignPlanningResponseError[];
    EstimateId : string;
    MaxPotentialSpend : int;
  }
  //#endregion
