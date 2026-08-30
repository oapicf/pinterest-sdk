namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdAccountsAudience
open OpenAPI.Model.string option

module AudiencesList200Response =

  //#region AudiencesList200Response


  type audiences_list_200_response = {
    Bookmark : string option;
    Items : AdAccountsAudience[];
  }
  //#endregion
