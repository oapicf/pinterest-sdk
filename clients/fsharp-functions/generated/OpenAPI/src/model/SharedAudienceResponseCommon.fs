namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Role

module SharedAudienceResponseCommon =

  //#region SharedAudienceResponseCommon

  [<CLIMutable>]
  type SharedAudienceResponseCommon = {
    [<JsonProperty(PropertyName = "audience_id")>]
    AudienceId : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : Role[];
  }

  //#endregion
