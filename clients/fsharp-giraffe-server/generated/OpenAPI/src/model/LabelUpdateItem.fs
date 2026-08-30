namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LabelStatus

module LabelUpdateItem =

  //#region LabelUpdateItem


  type LabelUpdateItem = {
    Id : string;
    Status : LabelStatus;
    Value : string;
  }
  //#endregion
