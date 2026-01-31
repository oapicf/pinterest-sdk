namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BillingInvoiceDownloadResponse =

  //#region BillingInvoiceDownloadResponse

  [<CLIMutable>]
  type BillingInvoiceDownloadResponse = {
    [<JsonProperty(PropertyName = "download_url")>]
    DownloadUrl : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
