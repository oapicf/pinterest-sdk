namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecGender
open OpenAPI.Model.TargetingSpecListOperation

module TargetingSpecOperationGender =

  //#region TargetingSpecOperationGender

  //#region enums
  type FieldEnum = GENDEREnum of string  
  //#endregion

  type TargetingSpecOperationGender = {
    Field : FieldEnum;
    Operation : TargetingSpecListOperation;
    Values : TargetingSpecGender[];
  }
  //#endregion
