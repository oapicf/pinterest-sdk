namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Exception
open OpenAPI.Model.Promotion

module PromotionArrayElement =

  //#region PromotionArrayElement


  type PromotionArrayElement = {
    Data : Promotion;
    Exception : Exception;
  }
  //#endregion
