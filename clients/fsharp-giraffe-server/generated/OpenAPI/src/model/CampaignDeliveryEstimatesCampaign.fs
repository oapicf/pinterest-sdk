namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdGroupDeliveryEstimates
open OpenAPI.Model.BudgetDurationType
open OpenAPI.Model.DeliveryEstimateObjectiveType

module CampaignDeliveryEstimatesCampaign =

  //#region CampaignDeliveryEstimatesCampaign


  type CampaignDeliveryEstimatesCampaign = {
    AdGroups : AdGroupDeliveryEstimates[];
    BudgetDurationType : BudgetDurationType;
    DailySpendCap : int;
    EndDate : string;
    LifetimeSpendCap : int;
    ObjectiveType : DeliveryEstimateObjectiveType;
    StartDate : string;
  }
  //#endregion
