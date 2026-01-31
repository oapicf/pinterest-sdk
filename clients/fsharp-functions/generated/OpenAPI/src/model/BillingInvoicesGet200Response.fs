namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BillingInvoiceResponse
open OpenAPI.Model.string option

module BillingInvoicesGet200Response =

  //#region BillingInvoicesGet200Response

  [<CLIMutable>]
  type BillingInvoicesGet200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : BillingInvoiceResponse[];
  }

  //#endregion
