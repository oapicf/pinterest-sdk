namespace OpenAPI.Model

open System
open System.Collections.Generic

module Exception =

  //#region Exception


  type Exception = {
    Code : int;
    Message : string;
  }
  //#endregion
