namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BillingInvoice
open OpenAPI.Model.string option

module BillingInvoicesGet200Response =

  //#region BillingInvoicesGet200Response


  type billing_invoices_get_200_response = {
    Bookmark : string option;
    Items : BillingInvoice[];
  }
  //#endregion
