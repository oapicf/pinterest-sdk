namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BoardSection
open OpenAPI.Model.string option

module BoardSectionsList200Response =

  //#region BoardSectionsList200Response


  type board_sections_list_200_response = {
    Items : BoardSection[];
    Bookmark : string option;
  }
  //#endregion
