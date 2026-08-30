namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdGroupDeliveryEstimates
open OpenAPI.Model.BudgetDurationType
open OpenAPI.Model.DeliveryEstimateObjectiveType

module CampaignDeliveryEstimatesCampaign =

  //#region CampaignDeliveryEstimatesCampaign

  [<CLIMutable>]
  type CampaignDeliveryEstimatesCampaign = {
    [<JsonProperty(PropertyName = "ad_groups")>]
    AdGroups : AdGroupDeliveryEstimates[];
    [<JsonProperty(PropertyName = "budget_duration_type")>]
    BudgetDurationType : BudgetDurationType;
    [<JsonProperty(PropertyName = "daily_spend_cap")>]
    DailySpendCap : int;
    [<JsonProperty(PropertyName = "end_date")>]
    EndDate : string;
    [<JsonProperty(PropertyName = "lifetime_spend_cap")>]
    LifetimeSpendCap : int;
    [<JsonProperty(PropertyName = "objective_type")>]
    ObjectiveType : DeliveryEstimateObjectiveType;
    [<JsonProperty(PropertyName = "start_date")>]
    StartDate : string;
  }

  //#endregion
