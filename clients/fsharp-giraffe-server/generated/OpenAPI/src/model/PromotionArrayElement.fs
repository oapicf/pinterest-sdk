namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Exception
open OpenAPI.Model.PromotionResponse

module PromotionArrayElement =

  //#region PromotionArrayElement


  type PromotionArrayElement = {
    Data : PromotionResponse;
    Exception : Exception;
  }
  //#endregion
