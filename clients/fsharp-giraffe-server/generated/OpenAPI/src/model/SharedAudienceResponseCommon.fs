namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Role

module SharedAudienceResponseCommon =

  //#region SharedAudienceResponseCommon


  type SharedAudienceResponseCommon = {
    AudienceId : string;
    Permissions : Role[];
  }
  //#endregion
