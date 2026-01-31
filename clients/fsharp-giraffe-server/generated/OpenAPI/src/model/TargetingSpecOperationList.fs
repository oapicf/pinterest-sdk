namespace OpenAPI.Model

open System
open System.Collections.Generic

module TargetingSpecOperationList =

  //#region TargetingSpecOperationList

  //#region enums
  type OperationEnum = SETEnum of string  |  ADDEnum of string  |  REMOVEEnum of string  
  //#endregion

  type TargetingSpecOperationList = {
    Field : string;
    Operation : OperationEnum;
    Values : string[];
  }
  //#endregion
