namespace OpenAPI.Model

open System
open System.Collections.Generic

module SSIOEditInsertionOrderRequest =

  //#region SSIOEditInsertionOrderRequest


  type SSIOEditInsertionOrderRequest = {
    StartDate : string;
    EndDate : string;
    PoNumber : string;
    BudgetAmount : decimal;
    BillingContactFirstname : string;
    BillingContactLastname : string;
    BillingContactEmail : string;
    MediaContactFirstname : string;
    MediaContactLastname : string;
    MediaContactEmail : string;
    AgencyLink : string;
    UserEmail : string;
    OracleLineId : string;
    SalesforceOrderId : string;
    SalesforceOrderLineId : string;
    AdsManagerOrderLineId : string;
  }
  //#endregion
