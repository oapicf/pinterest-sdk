namespace OpenAPI.Model

open System
open System.Collections.Generic

module ErrorDetail =

  //#region ErrorDetail


  type ErrorDetail = {
    Count : int;
    ErrorCode : int;
    Message : string;
  }
  //#endregion
