namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module TargetingSpecOperationMaximumAge =

  //#region TargetingSpecOperationMaximumAge

  //#region enums
  type FieldEnum = MAXIMUMAGEEnum of string  
  //#endregion
  //#region enums
  type OperationEnum = SETEnum of string  
  //#endregion

  type TargetingSpecOperationMaximumAge = {
    Field : FieldEnum;
    Operation : OperationEnum;
    Value : string option;
  }
  //#endregion
