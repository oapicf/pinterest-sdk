namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignDeliveryEstimatesDerivedMetrics
open OpenAPI.Model.CampaignPlanningAdGroupAudienceSize
open OpenAPI.Model.CampaignPlanningConversionRate
open OpenAPI.Model.CampaignPlanningCurveEstimate
open OpenAPI.Model.CampaignPlanningResponseError

module BulkCampaignDeliveryEstimatesItem =

  //#region BulkCampaignDeliveryEstimatesItem

  [<CLIMutable>]
  type BulkCampaignDeliveryEstimatesItem = {
    [<JsonProperty(PropertyName = "adgroup_audience_sizes")>]
    AdgroupAudienceSizes : CampaignPlanningAdGroupAudienceSize[];
    [<JsonProperty(PropertyName = "conversion_rate")>]
    ConversionRate : float;
    [<JsonProperty(PropertyName = "conversion_rates")>]
    ConversionRates : CampaignPlanningConversionRate[];
    [<JsonProperty(PropertyName = "curves")>]
    Curves : CampaignPlanningCurveEstimate[];
    [<JsonProperty(PropertyName = "derived_metrics")>]
    DerivedMetrics : CampaignDeliveryEstimatesDerivedMetrics;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : CampaignPlanningResponseError[];
    [<JsonProperty(PropertyName = "estimate_id")>]
    EstimateId : string;
    [<JsonProperty(PropertyName = "max_potential_spend")>]
    MaxPotentialSpend : int;
  }

  //#endregion
