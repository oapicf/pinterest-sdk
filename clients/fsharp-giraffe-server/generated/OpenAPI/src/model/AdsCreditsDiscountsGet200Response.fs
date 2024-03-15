namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdsCreditDiscountsResponse
open OpenAPI.Model.string option

module AdsCreditsDiscountsGet200Response =

  //#region AdsCreditsDiscountsGet200Response


  type ads_credits_discounts_get_200_response = {
    Items : AdsCreditDiscountsResponse[];
    Bookmark : string option;
  }
  //#endregion
