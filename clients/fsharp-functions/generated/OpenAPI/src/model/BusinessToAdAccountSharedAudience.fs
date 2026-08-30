namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Role

module BusinessToAdAccountSharedAudience =

  //#region BusinessToAdAccountSharedAudience

  [<CLIMutable>]
  type BusinessToAdAccountSharedAudience = {
    [<JsonProperty(PropertyName = "audience_id")>]
    AudienceId : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : Role[];
    [<JsonProperty(PropertyName = "recipient_account_ids")>]
    RecipientAccountIds : string[];
  }

  //#endregion
