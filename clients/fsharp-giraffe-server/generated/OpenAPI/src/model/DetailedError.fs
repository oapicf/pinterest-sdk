namespace OpenAPI.Model

open System
open System.Collections.Generic

module DetailedError =

  //#region DetailedError


  type DetailedError = {
    Code : int;
    Details : obj;
    Message : string;
  }
  //#endregion
