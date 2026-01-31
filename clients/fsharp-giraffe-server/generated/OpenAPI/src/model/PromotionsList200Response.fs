namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PromotionResponse
open OpenAPI.Model.string option

module PromotionsList200Response =

  //#region PromotionsList200Response


  type promotions_list_200_response = {
    Bookmark : string option;
    Items : PromotionResponse[];
  }
  //#endregion
