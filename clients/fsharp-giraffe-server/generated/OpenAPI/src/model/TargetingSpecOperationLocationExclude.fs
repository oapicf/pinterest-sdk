namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecListOperation

module TargetingSpecOperationLocationExclude =

  //#region TargetingSpecOperationLocationExclude

  //#region enums
  type FieldEnum = LOCATIONEXCLUDEEnum of string  
  //#endregion

  type TargetingSpecOperationLocationExclude = {
    Field : FieldEnum;
    Operation : TargetingSpecListOperation;
    Values : string[];
  }
  //#endregion
