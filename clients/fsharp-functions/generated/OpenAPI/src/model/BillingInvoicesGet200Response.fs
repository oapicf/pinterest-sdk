namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BillingInvoice
open OpenAPI.Model.string option

module BillingInvoicesGet200Response =

  //#region BillingInvoicesGet200Response

  [<CLIMutable>]
  type BillingInvoicesGet200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : BillingInvoice[];
  }

  //#endregion
