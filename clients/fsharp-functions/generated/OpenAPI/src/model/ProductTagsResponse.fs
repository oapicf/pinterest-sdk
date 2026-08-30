namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProductTagItem

module ProductTagsResponse =

  //#region ProductTagsResponse

  [<CLIMutable>]
  type ProductTagsResponse = {
    [<JsonProperty(PropertyName = "product_tags")>]
    ProductTags : ProductTagItem[];
  }

  //#endregion
