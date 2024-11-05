namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BaseInviteDataResponse
open OpenAPI.Model.DeleteInvitesResultsResponseArrayItemsInnerException

module DeleteInvitesResultsResponseArrayItemsInner =

  //#region DeleteInvitesResultsResponseArrayItemsInner

  [<CLIMutable>]
  type DeleteInvitesResultsResponseArrayItemsInner = {
    [<JsonProperty(PropertyName = "exception")>]
    Exception : DeleteInvitesResultsResponseArrayItemsInnerException;
    [<JsonProperty(PropertyName = "invite")>]
    Invite : BaseInviteDataResponse;
  }

  //#endregion
