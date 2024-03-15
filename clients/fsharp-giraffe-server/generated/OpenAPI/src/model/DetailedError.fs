namespace OpenAPI.Model

open System
open System.Collections.Generic

module DetailedError =

  //#region DetailedError


  type DetailedError = {
    Code : int;
    Message : string;
    Details : obj;
  }
  //#endregion
