namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LabelStatus
open OpenAPI.Model.LabelType
open OpenAPI.Model.string option

module Label =

  //#region Label

  //#region enums
  type ParentTypeEnum = CAMPAIGNEnum of string option  
  //#endregion

  type Label = {
    Id : string;
    LabelType : LabelType;
    ParentId : string;
    ParentType : ParentTypeEnum;
    Status : LabelStatus;
    Value : string;
  }
  //#endregion
