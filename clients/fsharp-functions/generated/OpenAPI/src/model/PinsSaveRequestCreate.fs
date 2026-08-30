namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module PinsSaveRequestCreate =

  //#region PinsSaveRequestCreate

  [<CLIMutable>]
  type PinsSaveRequestCreate = {
    [<JsonProperty(PropertyName = "board_id")>]
    BoardId : string option;
    [<JsonProperty(PropertyName = "board_section_id")>]
    BoardSectionId : string option;
  }

  //#endregion
