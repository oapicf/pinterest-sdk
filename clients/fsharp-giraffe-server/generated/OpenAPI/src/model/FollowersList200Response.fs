namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FollowUser
open OpenAPI.Model.string option

module FollowersList200Response =

  //#region FollowersList200Response


  type followers_list_200_response = {
    Bookmark : string option;
    Items : FollowUser[];
  }
  //#endregion
