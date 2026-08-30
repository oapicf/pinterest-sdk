namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecAppType
open OpenAPI.Model.TargetingSpecListOperation

module TargetingSpecOperationAppType =

  //#region TargetingSpecOperationAppType

  //#region enums
  type FieldEnum = APPTYPEEnum of string  
  //#endregion

  type TargetingSpecOperationAppType = {
    Field : FieldEnum;
    Operation : TargetingSpecListOperation;
    Values : TargetingSpecAppType[];
  }
  //#endregion
