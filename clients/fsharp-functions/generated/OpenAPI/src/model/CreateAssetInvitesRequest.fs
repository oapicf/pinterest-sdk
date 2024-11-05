namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateAssetInvitesRequestItem

module CreateAssetInvitesRequest =

  //#region CreateAssetInvitesRequest

  [<CLIMutable>]
  type CreateAssetInvitesRequest = {
    [<JsonProperty(PropertyName = "invites")>]
    Invites : CreateAssetInvitesRequestItem[];
  }

  //#endregion
