namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProductGroupPromotion
open OpenAPI.Model.string option

module ProductGroupPromotionsList200Response =

  //#region ProductGroupPromotionsList200Response

  [<CLIMutable>]
  type ProductGroupPromotionsList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : ProductGroupPromotion[];
  }

  //#endregion
