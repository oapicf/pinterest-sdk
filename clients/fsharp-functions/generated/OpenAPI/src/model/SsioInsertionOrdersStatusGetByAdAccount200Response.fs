namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.SSIOInsertionOrderStatus
open OpenAPI.Model.string option

module SsioInsertionOrdersStatusGetByAdAccount200Response =

  //#region SsioInsertionOrdersStatusGetByAdAccount200Response

  [<CLIMutable>]
  type SsioInsertionOrdersStatusGetByAdAccount200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : SSIOInsertionOrderStatus[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
