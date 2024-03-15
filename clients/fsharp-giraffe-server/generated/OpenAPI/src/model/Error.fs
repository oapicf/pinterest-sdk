namespace OpenAPI.Model

open System
open System.Collections.Generic

module Error =

  //#region Error


  type Error = {
    Code : int;
    Message : string;
  }
  //#endregion
