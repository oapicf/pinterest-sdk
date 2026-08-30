namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BudgetType
open OpenAPI.Model.PacingDeliveryType

module AdGroupCreateRequestAllOf1 =

  //#region AdGroupCreateRequestAllOf1


  type AdGroupCreateRequestAllOf1 = {
    AutoTargetingEnabled : bool;
    BidMultiplier : decimal;
    BudgetType : BudgetType;
    PacingDeliveryType : PacingDeliveryType;
  }
  //#endregion
