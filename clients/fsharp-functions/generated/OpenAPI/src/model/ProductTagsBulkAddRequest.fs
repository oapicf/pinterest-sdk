namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProductTagItem

module ProductTagsBulkAddRequest =

  //#region ProductTagsBulkAddRequest

  [<CLIMutable>]
  type ProductTagsBulkAddRequest = {
    [<JsonProperty(PropertyName = "product_tags")>]
    ProductTags : ProductTagItem[];
  }

  //#endregion
