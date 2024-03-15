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
    AcceptedTermsTime : int;
    PmpId : string;
    OrderName : string;
    OrderLineType : OrderLineTypeEnum;
    AcceptedTermsId : string;
    BilltoCompanyId : string;
    BilltoBusinessAddressId : string;
    BilltoBillingAddressId : string;
    EstimatedMonthlySpend : decimal;
    CurrencyInfo : Currency;
  }
  //#endregion
