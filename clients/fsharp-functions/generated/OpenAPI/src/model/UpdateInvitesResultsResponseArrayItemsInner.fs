namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.InviteBusinessRoleBinding
open OpenAPI.Model.InviteExceptionResponse

module UpdateInvitesResultsResponseArrayItemsInner =

  //#region UpdateInvitesResultsResponseArrayItemsInner

  [<CLIMutable>]
  type UpdateInvitesResultsResponseArrayItemsInner = {
    [<JsonProperty(PropertyName = "exception")>]
    Exception : InviteExceptionResponse;
    [<JsonProperty(PropertyName = "invite")>]
    Invite : InviteBusinessRoleBinding;
  }

  //#endregion
