namespace OpenAPI.Model

open System
open System.Collections.Generic

module SSIOInsertionOrderUpdate =

  //#region SSIOInsertionOrderUpdate


  type SSIOInsertionOrderUpdate = {
    AdsManagerOrderLineId : string;
    AgencyLink : string;
    BillingContactEmail : string;
    BillingContactFirstname : string;
    BillingContactLastname : string;
    BudgetAmount : double;
    EndDate : string;
    MediaContactEmail : string;
    MediaContactFirstname : string;
    MediaContactLastname : string;
    OracleLineId : string;
    PoNumber : string;
    SalesforceOrderId : string;
    SalesforceOrderLineId : string;
    StartDate : string;
    UserEmail : string;
  }
  //#endregion
