namespace OpenAPI.Model

open System
open System.Collections.Generic

module SSIOInsertionOrderCommon =

  //#region SSIOInsertionOrderCommon


  type SSIOInsertionOrderCommon = {
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
  }
  //#endregion
