namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OperationType

module BusinessToBusinessSharedAudienceUpdateWithRequiredBody =

  //#region BusinessToBusinessSharedAudienceUpdateWithRequiredBody


  type BusinessToBusinessSharedAudienceUpdateWithRequiredBody = {
    AudienceId : string;
    OperationType : OperationType;
    RecipientBusinessIds : string[];
  }
  //#endregion
