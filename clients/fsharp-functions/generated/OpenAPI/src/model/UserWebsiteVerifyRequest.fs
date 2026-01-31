namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UserWebsiteVerifyRequest =

  //#region UserWebsiteVerifyRequest

  [<CLIMutable>]
  type UserWebsiteVerifyRequest = {
    [<JsonProperty(PropertyName = "verification_method")>]
    VerificationMethod : string;
    [<JsonProperty(PropertyName = "website")>]
    Website : string;
  }

  //#endregion
