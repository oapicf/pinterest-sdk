namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProductTagItem

module ProductTagsBulkDeleteRequest =

  //#region ProductTagsBulkDeleteRequest

  [<CLIMutable>]
  type ProductTagsBulkDeleteRequest = {
    [<JsonProperty(PropertyName = "product_tags")>]
    ProductTags : ProductTagItem[];
  }

  //#endregion
