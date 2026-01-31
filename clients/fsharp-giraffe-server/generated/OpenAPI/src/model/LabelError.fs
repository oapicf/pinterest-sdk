namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Label

module LabelError =

  //#region LabelError


  type LabelError = {
    Data : Label;
    ErrorMessages : string[];
  }
  //#endregion
