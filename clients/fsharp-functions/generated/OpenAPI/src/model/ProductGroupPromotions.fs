namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProductGroupPromotionResponseItem

module ProductGroupPromotions =

  //#region ProductGroupPromotions

  [<CLIMutable>]
  type ProductGroupPromotions = {
    [<JsonProperty(PropertyName = "items")>]
    Items : ProductGroupPromotionResponseItem[];
  }

  //#endregion
