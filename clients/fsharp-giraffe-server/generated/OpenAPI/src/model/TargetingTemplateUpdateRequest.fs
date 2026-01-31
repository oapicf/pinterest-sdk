namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingSpec

module TargetingTemplateUpdateRequest =

  //#region TargetingTemplateUpdateRequest

  //#region enums
  type OperationTypeEnum = REMOVEEnum of string  |  UPDATEEnum of string  
  //#endregion

  type TargetingTemplateUpdateRequest = {
    Id : string;
    OperationType : OperationTypeEnum;
    TargetingAttributes : TargetingSpec;
  }
  //#endregion
