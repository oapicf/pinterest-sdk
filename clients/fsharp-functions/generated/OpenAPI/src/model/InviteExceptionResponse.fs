namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module InviteExceptionResponse =

  //#region InviteExceptionResponse

  [<CLIMutable>]
  type InviteExceptionResponse = {
    [<JsonProperty(PropertyName = "invite_or_request_id")>]
    InviteOrRequestId : string option;
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "users_or_partner_ids")>]
    UsersOrPartnerIds : string[];
  }

  //#endregion
