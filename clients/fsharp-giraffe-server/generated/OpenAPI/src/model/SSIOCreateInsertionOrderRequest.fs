namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Currency

module SSIOCreateInsertionOrderRequest =

  //#region SSIOCreateInsertionOrderRequest

  //#region enums
  type OrderLineTypeEnum = BUDGETEnum of string  |  PERPETUALSEnum of string  
  //#endregion

  type SSIOCreateInsertionOrderRequest = {
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
    AcceptedTermsId : string;
    AcceptedTermsTime : int;
    BilltoBillingAddressId : string;
    BilltoBusinessAddressId : string;
    BilltoCompanyId : string;
    CurrencyInfo : Currency;
    EstimatedMonthlySpend : decimal;
    OrderLineType : OrderLineTypeEnum;
    OrderName : string;
    PmpId : string;
  }
  //#endregion
