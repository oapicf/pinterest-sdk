namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Interest
open OpenAPI.Model.string option

module UserAccountFollowedInterests200Response =

  //#region UserAccountFollowedInterests200Response


  type user_account_followed_interests_200_response = {
    Items : Interest[];
    Bookmark : string option;
  }
  //#endregion
