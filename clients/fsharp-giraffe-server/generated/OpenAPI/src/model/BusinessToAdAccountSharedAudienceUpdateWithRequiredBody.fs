namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OperationType

module BusinessToAdAccountSharedAudienceUpdateWithRequiredBody =

  //#region BusinessToAdAccountSharedAudienceUpdateWithRequiredBody


  type BusinessToAdAccountSharedAudienceUpdateWithRequiredBody = {
    AudienceId : string;
    OperationType : OperationType;
    RecipientAccountIds : string[];
  }
  //#endregion
