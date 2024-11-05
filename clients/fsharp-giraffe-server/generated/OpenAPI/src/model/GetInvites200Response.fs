namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.InviteResponse
open OpenAPI.Model.string option

module GetInvites200Response =

  //#region GetInvites200Response


  type get_invites_200_response = {
    Items : InviteResponse[];
    Bookmark : string option;
  }
  //#endregion
