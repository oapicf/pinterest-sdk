namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Board
open OpenAPI.Model.string option

module SearchUserBoardsGet200Response =

  //#region SearchUserBoardsGet200Response


  type search_user_boards_get_200_response = {
    Items : Board[];
    Bookmark : string option;
  }
  //#endregion
