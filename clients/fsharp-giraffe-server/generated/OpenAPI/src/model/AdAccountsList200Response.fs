namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdAccount
open OpenAPI.Model.string option

module AdAccountsList200Response =

  //#region AdAccountsList200Response


  type ad_accounts_list_200_response = {
    Items : AdAccount[];
    Bookmark : string option;
  }
  //#endregion
