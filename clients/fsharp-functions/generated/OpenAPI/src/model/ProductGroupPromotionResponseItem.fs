namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Exception
open OpenAPI.Model.ProductGroupPromotionResponseElement

module ProductGroupPromotionResponseItem =

  //#region ProductGroupPromotionResponseItem

  [<CLIMutable>]
  type ProductGroupPromotionResponseItem = {
    [<JsonProperty(PropertyName = "data")>]
    Data : ProductGroupPromotionResponseElement;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : Exception[];
  }

  //#endregion
