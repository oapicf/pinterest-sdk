namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateInvitesResultsResponseArrayItemsInnerInvite
open OpenAPI.Model.InviteExceptionResponse

module CreateInvitesResultsResponseArrayItemsInner =

  //#region CreateInvitesResultsResponseArrayItemsInner

  [<CLIMutable>]
  type CreateInvitesResultsResponseArrayItemsInner = {
    [<JsonProperty(PropertyName = "exception")>]
    Exception : InviteExceptionResponse;
    [<JsonProperty(PropertyName = "invite")>]
    Invite : CreateInvitesResultsResponseArrayItemsInnerInvite;
  }

  //#endregion
