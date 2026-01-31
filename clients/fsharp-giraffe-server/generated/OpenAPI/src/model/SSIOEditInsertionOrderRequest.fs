namespace OpenAPI.Model

open System
open System.Collections.Generic

module SSIOEditInsertionOrderRequest =

  //#region SSIOEditInsertionOrderRequest


  type SSIOEditInsertionOrderRequest = {
    AgencyLink : string;
    BillingContactEmail : string;
    BillingContactFirstname : string;
    BillingContactLastname : string;
    BudgetAmount : decimal;
    EndDate : string;
    MediaContactEmail : string;
    MediaContactFirstname : string;
    MediaContactLastname : string;
    PoNumber : string;
    StartDate : string;
    UserEmail : string;
    AdsManagerOrderLineId : string;
    OracleLineId : string;
    SalesforceOrderId : string;
    SalesforceOrderLineId : string;
  }
  //#endregion
