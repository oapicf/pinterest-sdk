namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecListOperation

module TargetingSpecOperationInterest =

  //#region TargetingSpecOperationInterest

  //#region enums
  type FieldEnum = INTERESTEnum of string  
  //#endregion

  type TargetingSpecOperationInterest = {
    Field : FieldEnum;
    Operation : TargetingSpecListOperation;
    Values : string[];
  }
  //#endregion
