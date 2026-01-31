namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecGender

module TargetingSpecOperationGender =

  //#region TargetingSpecOperationGender

  //#region enums
  type FieldEnum = GENDEREnum of string  
  //#endregion
  //#region enums
  type OperationEnum = SETEnum of string  |  ADDEnum of string  |  REMOVEEnum of string  
  //#endregion

  type TargetingSpecOperationGender = {
    Field : FieldEnum;
    Operation : OperationEnum;
    Values : TargetingSpecGender[];
  }
  //#endregion
