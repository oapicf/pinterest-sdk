namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BudgetType
open OpenAPI.Model.PacingDeliveryType

module AdGroupCreateRequestAllOf1 =

  //#region AdGroupCreateRequestAllOf1

  [<CLIMutable>]
  type AdGroupCreateRequestAllOf1 = {
    [<JsonProperty(PropertyName = "auto_targeting_enabled")>]
    AutoTargetingEnabled : bool;
    [<JsonProperty(PropertyName = "bid_multiplier")>]
    BidMultiplier : decimal;
    [<JsonProperty(PropertyName = "budget_type")>]
    BudgetType : BudgetType;
    [<JsonProperty(PropertyName = "pacing_delivery_type")>]
    PacingDeliveryType : PacingDeliveryType;
  }

  //#endregion
