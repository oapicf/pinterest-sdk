namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Ad
open OpenAPI.Model.string option

module AdsList200Response =

  //#region AdsList200Response


  type ads_list_200_response = {
    Bookmark : string option;
    Items : Ad[];
  }
  //#endregion
