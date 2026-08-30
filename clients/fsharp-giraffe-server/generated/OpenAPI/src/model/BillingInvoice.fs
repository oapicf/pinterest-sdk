namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BillingInvoiceDocumentType
open OpenAPI.Model.BillingInvoiceStatus
open OpenAPI.Model.Currency
open OpenAPI.Model.int option

module BillingInvoice =

  //#region BillingInvoice


  type BillingInvoice = {
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
    DocumentType : BillingInvoiceDocumentType;
    Id : string;
    InvoiceDueDate : DateTime;
    PaymentTerms : string;
    Status : BillingInvoiceStatus;
  }
  //#endregion
