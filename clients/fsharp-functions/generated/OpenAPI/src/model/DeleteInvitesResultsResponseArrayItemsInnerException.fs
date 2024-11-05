namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteInvitesResultsResponseArrayItemsInnerException =

  //#region DeleteInvitesResultsResponseArrayItemsInnerException

  [<CLIMutable>]
  type DeleteInvitesResultsResponseArrayItemsInnerException = {
    [<JsonProperty(PropertyName = "invite_id")>]
    InviteId : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
