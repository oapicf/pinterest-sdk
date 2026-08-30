namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.NullableLabelStatus
open OpenAPI.Model.NullableLabelType

module Label =

  //#region Label


  type Label = {
    Id : string;
    LabelType : NullableLabelType;
    Status : NullableLabelStatus;
    Value : string;
  }
  //#endregion
