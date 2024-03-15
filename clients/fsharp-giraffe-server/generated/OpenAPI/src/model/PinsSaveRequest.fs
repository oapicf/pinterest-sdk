namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module PinsSaveRequest =

  //#region PinsSaveRequest


  type pins_save_request = {
    BoardId : string option;
    BoardSectionId : string option;
  }
  //#endregion
