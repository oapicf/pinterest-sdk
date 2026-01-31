namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Currency
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module SSIOOrderLine =

  //#region SSIOOrderLine


  type SSIOOrderLine = {
    AcceptedTermsId : string option;
    AcceptedTermsTime : string option;
    AdsManagerOrderLineId : string option;
    AgencyLink : string option;
    BillToCompanyName : string option;
    BillingContactEmail : string option;
    BillingContactFirstname : string option;
    BillingContactLastname : string option;
    BudgetAmount : decimal option;
    CurrencyInfo : Currency;
    EndDate : DateTime;
    EstimatedMonthlySpend : decimal option;
    LastModifiedDateTime : string option;
    MediaContactEmail : string option;
    MediaContactFirstname : string option;
    MediaContactLastname : string option;
    OrderName : string option;
    PinOrderId : string option;
    PmpName : string option;
    PoNumber : string option;
    SalesforceOrderLineId : string option;
    StartDate : DateTime;
  }
  //#endregion
