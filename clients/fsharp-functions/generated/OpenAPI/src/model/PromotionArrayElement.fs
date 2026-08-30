namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Exception
open OpenAPI.Model.Promotion

module PromotionArrayElement =

  //#region PromotionArrayElement

  [<CLIMutable>]
  type PromotionArrayElement = {
    [<JsonProperty(PropertyName = "data")>]
    Data : Promotion;
    [<JsonProperty(PropertyName = "exception")>]
    Exception : Exception;
  }

  //#endregion
