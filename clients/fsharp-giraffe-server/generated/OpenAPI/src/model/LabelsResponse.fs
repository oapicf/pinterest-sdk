namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Label
open OpenAPI.Model.LabelError

module LabelsResponse =

  //#region LabelsResponse


  type LabelsResponse = {
    Errors : LabelError[];
    Labels : Label[];
  }
  //#endregion
