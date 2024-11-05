namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BaseInviteDataResponse
open OpenAPI.Model.DeleteInvitesResultsResponseArrayItemsInnerException

module DeleteInvitesResultsResponseArrayItemsInner =

  //#region DeleteInvitesResultsResponseArrayItemsInner


  type DeleteInvitesResultsResponseArray_items_inner = {
    Exception : DeleteInvitesResultsResponseArrayItemsInnerException;
    Invite : BaseInviteDataResponse;
  }
  //#endregion
