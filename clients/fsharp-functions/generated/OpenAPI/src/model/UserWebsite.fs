namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UserWebsite =

  //#region UserWebsite

  [<CLIMutable>]
  type UserWebsite = {
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "verified_at")>]
    VerifiedAt : string;
    [<JsonProperty(PropertyName = "website")>]
    Website : string;
  }

  //#endregion
