namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PromotionArrayElement

module PromotionsResponse =

  //#region PromotionsResponse

  [<CLIMutable>]
  type PromotionsResponse = {
    [<JsonProperty(PropertyName = "promotions")>]
    Promotions : PromotionArrayElement[];
  }

  //#endregion
