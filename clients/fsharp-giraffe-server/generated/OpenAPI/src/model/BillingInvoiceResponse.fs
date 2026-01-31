namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Currency
open OpenAPI.Model.int option

module BillingInvoiceResponse =

  //#region BillingInvoiceResponse

  //#region enums
  type DocumentTypeEnum = INVOICEEnum of string  |  CREDITMEMOEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = OPENEnum of string  |  CLOSEDEnum of string  
  //#endregion

  type BillingInvoiceResponse = {
    AdAccountId : string;
    AdAccountName : string;
    AmountBilledMicroCurrency : int;
    AmountDiscountMicroCurrency : int option;
    AmountNetMicroCurrency : int option;
    AmountTaxMicroCurrency : int option;
    BillToCountry : string;
    BillingPeriodEndDate : DateTime;
    BillingPeriodStartDate : DateTime;
    Currency : Currency;
    DocumentType : DocumentTypeEnum;
    Id : string;
    InvoiceDueDate : DateTime;
    PaymentTerms : string;
    Status : StatusEnum;
  }
  //#endregion
