namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProductGroupPromotionResponseItem

module ProductGroupPromotionResponse =

  //#region ProductGroupPromotionResponse

  [<CLIMutable>]
  type ProductGroupPromotionResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : ProductGroupPromotionResponseItem[];
  }

  //#endregion
