namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BaseInviteDataResponse
open OpenAPI.Model.InviteExceptionResponse

module RespondToInvitesResponseArrayItemsInner =

  //#region RespondToInvitesResponseArrayItemsInner


  type RespondToInvitesResponseArray_items_inner = {
    Exception : InviteExceptionResponse;
    Invite : BaseInviteDataResponse;
  }
  //#endregion
