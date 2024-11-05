namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateInvitesResultsResponseArrayItemsInnerInvite
open OpenAPI.Model.InviteExceptionResponse

module CreateInvitesResultsResponseArrayItemsInner =

  //#region CreateInvitesResultsResponseArrayItemsInner


  type CreateInvitesResultsResponseArray_items_inner = {
    Exception : InviteExceptionResponse;
    Invite : CreateInvitesResultsResponseArrayItemsInnerInvite;
  }
  //#endregion
