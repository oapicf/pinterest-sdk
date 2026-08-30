namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.InviteBusinessRoleBinding
open OpenAPI.Model.InviteExceptionResponse

module InviteActionResultItem =

  //#region InviteActionResultItem


  type InviteActionResultItem = {
    Exception : InviteExceptionResponse;
    Invite : InviteBusinessRoleBinding;
  }
  //#endregion
