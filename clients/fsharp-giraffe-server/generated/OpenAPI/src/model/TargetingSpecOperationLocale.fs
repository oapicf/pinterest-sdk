namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecListOperation

module TargetingSpecOperationLocale =

  //#region TargetingSpecOperationLocale

  //#region enums
  type FieldEnum = LOCALEEnum of string  
  //#endregion

  type TargetingSpecOperationLocale = {
    Field : FieldEnum;
    Operation : TargetingSpecListOperation;
    Values : string[];
  }
  //#endregion
