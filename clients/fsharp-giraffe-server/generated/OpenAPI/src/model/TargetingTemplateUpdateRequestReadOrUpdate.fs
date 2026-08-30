namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceUpdateOperationType
open OpenAPI.Model.TargetingSpecOptimal

module TargetingTemplateUpdateRequestReadOrUpdate =

  //#region TargetingTemplateUpdateRequestReadOrUpdate


  type TargetingTemplateUpdateRequestReadOrUpdate = {
    Id : string;
    OperationType : AudienceUpdateOperationType;
    TargetingAttributes : TargetingSpecOptimal;
  }
  //#endregion
