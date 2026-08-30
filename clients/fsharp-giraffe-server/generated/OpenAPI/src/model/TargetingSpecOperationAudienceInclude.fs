namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpecListOperation

module TargetingSpecOperationAudienceInclude =

  //#region TargetingSpecOperationAudienceInclude

  //#region enums
  type FieldEnum = AUDIENCEINCLUDEEnum of string  
  //#endregion

  type TargetingSpecOperationAudienceInclude = {
    Field : FieldEnum;
    Operation : TargetingSpecListOperation;
    Values : string[];
  }
  //#endregion
