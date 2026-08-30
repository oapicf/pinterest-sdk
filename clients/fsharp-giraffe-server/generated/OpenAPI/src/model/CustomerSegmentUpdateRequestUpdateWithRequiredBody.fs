namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceUpdateOperationType

module CustomerSegmentUpdateRequestUpdateWithRequiredBody =

  //#region CustomerSegmentUpdateRequestUpdateWithRequiredBody


  type CustomerSegmentUpdateRequestUpdateWithRequiredBody = {
    AudienceIds : string[];
    Id : string;
    OperationType : AudienceUpdateOperationType;
  }
  //#endregion
