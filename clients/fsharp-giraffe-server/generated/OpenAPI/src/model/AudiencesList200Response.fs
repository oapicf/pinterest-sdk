namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Audience
open OpenAPI.Model.string option

module AudiencesList200Response =

  //#region AudiencesList200Response


  type audiences_list_200_response = {
    Items : Audience[];
    Bookmark : string option;
  }
  //#endregion
