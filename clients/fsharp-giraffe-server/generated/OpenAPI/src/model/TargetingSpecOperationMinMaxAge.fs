namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module TargetingSpecOperationMinMaxAge =

  //#region TargetingSpecOperationMinMaxAge

  //#region enums
  type FieldEnum = MINIMUMAGEEnum of string  |  MAXIMUMAGEEnum of string  
  //#endregion
  //#region enums
  type OperationEnum = SETEnum of string  
  //#endregion

  type TargetingSpecOperationMinMaxAge = {
    Field : FieldEnum;
    Operation : OperationEnum;
    Value : string option;
  }
  //#endregion
