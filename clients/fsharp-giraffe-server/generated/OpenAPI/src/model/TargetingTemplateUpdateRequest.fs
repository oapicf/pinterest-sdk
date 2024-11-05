namespace OpenAPI.Model

open System
open System.Collections.Generic

module TargetingTemplateUpdateRequest =

  //#region TargetingTemplateUpdateRequest

  //#region enums
  type OperationTypeEnum = REMOVEEnum of string  
  //#endregion

  type TargetingTemplateUpdateRequest = {
    OperationType : OperationTypeEnum;
    Id : string;
  }
  //#endregion
