namespace OpenAPI.Model

open System
open System.Collections.Generic

module ItemValidationEvent =

  //#region ItemValidationEvent


  type ItemValidationEvent = {
    Attribute : string;
    Code : int;
    Message : string;
  }
  //#endregion
