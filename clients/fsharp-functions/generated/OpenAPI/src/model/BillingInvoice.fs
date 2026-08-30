namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BillingInvoiceDocumentType
open OpenAPI.Model.BillingInvoiceStatus
open OpenAPI.Model.Currency
open OpenAPI.Model.int option

module BillingInvoice =

  //#region BillingInvoice

  [<CLIMutable>]
  type BillingInvoice = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "ad_account_name")>]
    AdAccountName : string;
    [<JsonProperty(PropertyName = "amount_billed_micro_currency")>]
    AmountBilledMicroCurrency : int;
    [<JsonProperty(PropertyName = "amount_discount_micro_currency")>]
    AmountDiscountMicroCurrency : int option;
    [<JsonProperty(PropertyName = "amount_net_micro_currency")>]
    AmountNetMicroCurrency : int option;
    [<JsonProperty(PropertyName = "amount_tax_micro_currency")>]
    AmountTaxMicroCurrency : int option;
    [<JsonProperty(PropertyName = "bill_to_country")>]
    BillToCountry : string;
    [<JsonProperty(PropertyName = "billing_period_end_date")>]
    BillingPeriodEndDate : DateTime;
    [<JsonProperty(PropertyName = "billing_period_start_date")>]
    BillingPeriodStartDate : DateTime;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : Currency;
    [<JsonProperty(PropertyName = "document_type")>]
    DocumentType : BillingInvoiceDocumentType;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "invoice_due_date")>]
    InvoiceDueDate : DateTime;
    [<JsonProperty(PropertyName = "payment_terms")>]
    PaymentTerms : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : BillingInvoiceStatus;
  }

  //#endregion
