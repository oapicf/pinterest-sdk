namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.InviteBusinessRoleBinding
open OpenAPI.Model.InviteExceptionResponse

module UpdateInvitesResultsResponseArrayItemsInner =

  //#region UpdateInvitesResultsResponseArrayItemsInner


  type UpdateInvitesResultsResponseArray_items_inner = {
    Exception : InviteExceptionResponse;
    Invite : InviteBusinessRoleBinding;
  }
  //#endregion
