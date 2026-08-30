namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecListOperation

module TargetingSpecOperationLocation =

  //#region TargetingSpecOperationLocation

  //#region enums
  type FieldEnum = LOCATIONEnum of string  
  //#endregion

  type TargetingSpecOperationLocation = {
    Field : FieldEnum;
    Operation : TargetingSpecListOperation;
    Values : string[];
  }
  //#endregion
