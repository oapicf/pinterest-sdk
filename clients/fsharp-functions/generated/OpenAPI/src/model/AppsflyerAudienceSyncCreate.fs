namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AppsflyerAudienceSyncCreate =

  //#region AppsflyerAudienceSyncCreate

  [<CLIMutable>]
  type AppsflyerAudienceSyncCreate = {
    [<JsonProperty(PropertyName = "container_id")>]
    ContainerId : string;
    [<JsonProperty(PropertyName = "url_adid_sha256")>]
    UrlAdidSha256 : string;
    [<JsonProperty(PropertyName = "url_email_sha256")>]
    UrlEmailSha256 : string;
  }

  //#endregion
