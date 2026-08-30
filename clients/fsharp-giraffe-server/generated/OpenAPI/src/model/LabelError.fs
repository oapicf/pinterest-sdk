namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LabelErrorData

module LabelError =

  //#region LabelError


  type LabelError = {
    Data : LabelErrorData;
    ErrorMessages : string[];
  }
  //#endregion
