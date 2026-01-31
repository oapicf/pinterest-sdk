namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecAgeBucket

module TargetingSpecOperationAgeBucket =

  //#region TargetingSpecOperationAgeBucket

  //#region enums
  type FieldEnum = AGEBUCKETEnum of string  
  //#endregion
  //#region enums
  type OperationEnum = SETEnum of string  
  //#endregion

  type TargetingSpecOperationAgeBucket = {
    Field : FieldEnum;
    Operation : OperationEnum;
    Values : TargetingSpecAgeBucket[];
  }
  //#endregion
