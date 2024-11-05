namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BaseInviteDataResponseInviteData
open OpenAPI.Model.BusinessAccessUserSummary

module BaseInviteDataResponse =

  //#region BaseInviteDataResponse

  [<CLIMutable>]
  type BaseInviteDataResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "invite_data")>]
    InviteData : BaseInviteDataResponseInviteData;
    [<JsonProperty(PropertyName = "is_received_invite")>]
    IsReceivedInvite : bool;
    [<JsonProperty(PropertyName = "user")>]
    User : BusinessAccessUserSummary;
  }

  //#endregion
