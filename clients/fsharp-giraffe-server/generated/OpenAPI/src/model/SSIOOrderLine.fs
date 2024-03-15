namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Currency
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module SSIOOrderLine =

  //#region SSIOOrderLine


  type SSIOOrderLine = {
    SalesforceOrderLineId : string option;
    AdsManagerOrderLineId : string option;
    PinOrderId : string option;
    LastModifiedDateTime : string option;
    StartDate : DateTime;
    EndDate : DateTime;
    BillToCompanyName : string option;
    BillingContactFirstname : string option;
    BillingContactLastname : string option;
    BillingContactEmail : string option;
    MediaContactEmail : string option;
    MediaContactFirstname : string option;
    MediaContactLastname : string option;
    CurrencyInfo : Currency;
    AgencyLink : string option;
    PoNumber : string option;
    OrderName : string option;
    PmpName : string option;
    AcceptedTermsId : string option;
    AcceptedTermsTime : string option;
    BudgetAmount : decimal option;
    EstimatedMonthlySpend : decimal option;
  }
  //#endregion
