namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecListOperation

module TargetingSpecOperationGeoExclude =

  //#region TargetingSpecOperationGeoExclude

  //#region enums
  type FieldEnum = GEOEXCLUDEEnum of string  
  //#endregion

  type TargetingSpecOperationGeoExclude = {
    Field : FieldEnum;
    Operation : TargetingSpecListOperation;
    Values : string[];
  }
  //#endregion
