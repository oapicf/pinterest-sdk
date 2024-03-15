namespace OpenAPI.Model

open System
open System.Collections.Generic

module SSIOInsertionOrderCommon =

  //#region SSIOInsertionOrderCommon


  type SSIOInsertionOrderCommon = {
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
  }
  //#endregion
