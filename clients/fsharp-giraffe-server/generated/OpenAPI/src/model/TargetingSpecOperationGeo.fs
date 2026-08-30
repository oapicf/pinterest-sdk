namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecListOperation

module TargetingSpecOperationGeo =

  //#region TargetingSpecOperationGeo

  //#region enums
  type FieldEnum = GEOEnum of string  
  //#endregion

  type TargetingSpecOperationGeo = {
    Field : FieldEnum;
    Operation : TargetingSpecListOperation;
    Values : string[];
  }
  //#endregion
