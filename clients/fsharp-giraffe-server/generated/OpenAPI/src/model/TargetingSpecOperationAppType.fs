namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecAppType

module TargetingSpecOperationAppType =

  //#region TargetingSpecOperationAppType

  //#region enums
  type FieldEnum = APPTYPEEnum of string  
  //#endregion
  //#region enums
  type OperationEnum = SETEnum of string  |  ADDEnum of string  |  REMOVEEnum of string  
  //#endregion

  type TargetingSpecOperationAppType = {
    Field : FieldEnum;
    Operation : OperationEnum;
    Values : TargetingSpecAppType[];
  }
  //#endregion
