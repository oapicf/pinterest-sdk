namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecListOperation

module TargetingSpecOperationAudienceExclude =

  //#region TargetingSpecOperationAudienceExclude

  //#region enums
  type FieldEnum = AUDIENCEEXCLUDEEnum of string  
  //#endregion

  type TargetingSpecOperationAudienceExclude = {
    Field : FieldEnum;
    Operation : TargetingSpecListOperation;
    Values : string[];
  }
  //#endregion
