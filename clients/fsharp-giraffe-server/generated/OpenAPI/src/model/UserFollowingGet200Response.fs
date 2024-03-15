namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UserSummary
open OpenAPI.Model.string option

module UserFollowingGet200Response =

  //#region UserFollowingGet200Response


  type user_following_get_200_response = {
    Items : UserSummary[];
    Bookmark : string option;
  }
  //#endregion
