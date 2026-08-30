namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OperationType

module AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody =

  //#region AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody


  type AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody = {
    AudienceId : string;
    OperationType : OperationType;
    RecipientAccountIds : string[];
  }
  //#endregion
