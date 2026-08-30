namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OperationType

module AdAccountToBusinessSharedAudienceUpdateWithRequiredBody =

  //#region AdAccountToBusinessSharedAudienceUpdateWithRequiredBody


  type AdAccountToBusinessSharedAudienceUpdateWithRequiredBody = {
    AudienceId : string;
    OperationType : OperationType;
    RecipientBusinessIds : string[];
  }
  //#endregion
