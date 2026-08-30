namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Currency
open OpenAPI.Model.SSIOOrderLineType

module SSIOInsertionOrderCreate =

  //#region SSIOInsertionOrderCreate


  type SSIOInsertionOrderCreate = {
    AcceptedTermsId : string;
    AcceptedTermsTime : int;
    AgencyLink : string;
    BillingContactEmail : string;
    BillingContactFirstname : string;
    BillingContactLastname : string;
    BilltoBillingAddressId : string;
    BilltoBusinessAddressId : string;
    BilltoCompanyId : string;
    BudgetAmount : double;
    CurrencyInfo : Currency;
    EndDate : string;
    EstimatedMonthlySpend : double;
    MediaContactEmail : string;
    MediaContactFirstname : string;
    MediaContactLastname : string;
    OrderLineType : SSIOOrderLineType;
    OrderName : string;
    PmpId : string;
    PoNumber : string;
    StartDate : string;
    UserEmail : string;
  }
  //#endregion
