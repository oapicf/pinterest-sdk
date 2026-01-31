namespace OpenAPI.Model

open System
open System.Collections.Generic

module PinterestLibStatus204 =

  //#region PinterestLibStatus204

  //#region enums
  type StatusCodeEnum = _204Enum of decimal  
  //#endregion

  type Pinterest.Lib.Status204 = {
    StatusCode : StatusCodeEnum;
  }
  //#endregion
