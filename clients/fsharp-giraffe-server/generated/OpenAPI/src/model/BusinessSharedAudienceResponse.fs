namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Role

module BusinessSharedAudienceResponse =

  //#region BusinessSharedAudienceResponse


  type BusinessSharedAudienceResponse = {
    AudienceId : string;
    Permissions : Role[];
    RecipientBusinessIds : string[];
  }
  //#endregion
