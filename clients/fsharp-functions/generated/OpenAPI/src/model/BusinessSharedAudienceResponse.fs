namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Role

module BusinessSharedAudienceResponse =

  //#region BusinessSharedAudienceResponse

  [<CLIMutable>]
  type BusinessSharedAudienceResponse = {
    [<JsonProperty(PropertyName = "audience_id")>]
    AudienceId : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : Role[];
    [<JsonProperty(PropertyName = "recipient_business_ids")>]
    RecipientBusinessIds : string[];
  }

  //#endregion
