namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.InviteBusinessRoleBinding
open OpenAPI.Model.InviteExceptionResponse

module InviteActionResultItem =

  //#region InviteActionResultItem

  [<CLIMutable>]
  type InviteActionResultItem = {
    [<JsonProperty(PropertyName = "exception")>]
    Exception : InviteExceptionResponse;
    [<JsonProperty(PropertyName = "invite")>]
    Invite : InviteBusinessRoleBinding;
  }

  //#endregion
