namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module TargetingSpecOperationMinimumAge =

  //#region TargetingSpecOperationMinimumAge

  //#region enums
  type FieldEnum = MINIMUMAGEEnum of string  
  //#endregion
  //#region enums
  type OperationEnum = SETEnum of string  
  //#endregion

  type TargetingSpecOperationMinimumAge = {
    Field : FieldEnum;
    Operation : OperationEnum;
    Value : string option;
  }
  //#endregion
