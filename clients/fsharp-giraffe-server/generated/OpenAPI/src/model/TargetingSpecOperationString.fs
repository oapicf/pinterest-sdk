namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module TargetingSpecOperationString =

  //#region TargetingSpecOperationString

  //#region enums
  type OperationEnum = SETEnum of string  
  //#endregion

  type TargetingSpecOperationString = {
    Field : string;
    Operation : OperationEnum;
    Value : string option;
  }
  //#endregion
