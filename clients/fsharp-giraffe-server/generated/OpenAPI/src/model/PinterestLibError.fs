namespace OpenAPI.Model

open System
open System.Collections.Generic

module PinterestLibError =

  //#region PinterestLibError


  type Pinterest.Lib.Error = {
    Code : int;
    Message : string;
  }
  //#endregion
