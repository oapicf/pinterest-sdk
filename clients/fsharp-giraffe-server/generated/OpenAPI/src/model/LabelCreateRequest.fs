namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LabelCreateRequestLabelsInner

module LabelCreateRequest =

  //#region LabelCreateRequest


  type LabelCreateRequest = {
    Labels : LabelCreateRequestLabelsInner[];
    ParentId : string;
  }
  //#endregion
