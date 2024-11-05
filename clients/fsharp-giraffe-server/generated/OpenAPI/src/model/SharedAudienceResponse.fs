namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Role

module SharedAudienceResponse =

  //#region SharedAudienceResponse


  type SharedAudienceResponse = {
    AudienceId : string;
    Permissions : Role[];
    RecipientAccountIds : string[];
  }
  //#endregion
