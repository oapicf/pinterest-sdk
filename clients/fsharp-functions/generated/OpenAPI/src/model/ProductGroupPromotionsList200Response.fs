namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProductGroupPromotionResponseItem
open OpenAPI.Model.string option

module ProductGroupPromotionsList200Response =

  //#region ProductGroupPromotionsList200Response

  [<CLIMutable>]
  type ProductGroupPromotionsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : ProductGroupPromotionResponseItem[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
