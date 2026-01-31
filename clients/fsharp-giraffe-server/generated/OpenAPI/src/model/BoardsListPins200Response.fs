namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Pin
open OpenAPI.Model.string option

module BoardsListPins200Response =

  //#region BoardsListPins200Response


  type boards_list_pins_200_response = {
    Bookmark : string option;
    Items : Pin[];
  }
  //#endregion
