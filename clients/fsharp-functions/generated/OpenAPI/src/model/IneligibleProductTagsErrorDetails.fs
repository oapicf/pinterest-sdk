namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.IneligibleProductTagErrorItem

module IneligibleProductTagsErrorDetails =

  //#region IneligibleProductTagsErrorDetails

  [<CLIMutable>]
  type IneligibleProductTagsErrorDetails = {
    [<JsonProperty(PropertyName = "product_tags")>]
    ProductTags : IneligibleProductTagErrorItem[];
  }

  //#endregion
