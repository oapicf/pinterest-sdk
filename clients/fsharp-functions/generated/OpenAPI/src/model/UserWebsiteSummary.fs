namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UserWebsiteSummary =

  //#region UserWebsiteSummary

  [<CLIMutable>]
  type UserWebsiteSummary = {
    [<JsonProperty(PropertyName = "website")>]
    Website : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "verified_at")>]
    VerifiedAt : string;
  }

  //#endregion
