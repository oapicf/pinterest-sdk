namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BaseInviteDataResponse
open OpenAPI.Model.InviteExceptionResponse

module RespondToInviteResultItem =

  //#region RespondToInviteResultItem


  type RespondToInviteResultItem = {
    Exception : InviteExceptionResponse;
    Invite : BaseInviteDataResponse;
  }
  //#endregion
