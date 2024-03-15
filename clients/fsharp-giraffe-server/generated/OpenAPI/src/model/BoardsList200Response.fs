namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Board
open OpenAPI.Model.string option

module BoardsList200Response =

  //#region BoardsList200Response


  type boards_list_200_response = {
    Items : Board[];
    Bookmark : string option;
  }
  //#endregion
