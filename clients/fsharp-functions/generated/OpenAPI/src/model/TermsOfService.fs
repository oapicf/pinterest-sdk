namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module TermsOfService =

  //#region TermsOfService

  [<CLIMutable>]
  type TermsOfService = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "has_accepted")>]
    HasAccepted : bool;
    [<JsonProperty(PropertyName = "html")>]
    Html : string option;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
