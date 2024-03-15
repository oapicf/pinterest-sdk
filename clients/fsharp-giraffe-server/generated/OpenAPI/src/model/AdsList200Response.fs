namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdResponse
open OpenAPI.Model.string option

module AdsList200Response =

  //#region AdsList200Response


  type ads_list_200_response = {
    Items : AdResponse[];
    Bookmark : string option;
  }
  //#endregion
