namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LabelStatus

module LabelUpdateRequestLabelsInner =

  //#region LabelUpdateRequestLabelsInner


  type LabelUpdateRequest_labels_inner = {
    Id : string;
    Status : LabelStatus;
    Value : string;
  }
  //#endregion
