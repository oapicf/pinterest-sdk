namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Board
open OpenAPI.Model.string option

module BoardsUserFollowsList200Response =

  //#region BoardsUserFollowsList200Response


  type boards_user_follows_list_200_response = {
    Items : Board[];
    Bookmark : string option;
  }
  //#endregion
