namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LabelType

module LabelCreateItem =

  //#region LabelCreateItem


  type LabelCreateItem = {
    LabelType : LabelType;
    Value : string;
  }
  //#endregion
