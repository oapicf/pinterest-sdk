namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.WebsiteVerificationMethod

module UserWebsiteCreate =

  //#region UserWebsiteCreate

  [<CLIMutable>]
  type UserWebsiteCreate = {
    [<JsonProperty(PropertyName = "verification_method")>]
    VerificationMethod : WebsiteVerificationMethod;
    [<JsonProperty(PropertyName = "website")>]
    Website : string;
  }

  //#endregion
