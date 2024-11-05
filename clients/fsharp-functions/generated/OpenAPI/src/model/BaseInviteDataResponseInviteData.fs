namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BaseInviteDataResponseInviteData =

  //#region BaseInviteDataResponseInviteData

  [<CLIMutable>]
  type BaseInviteDataResponseInviteData = {
    [<JsonProperty(PropertyName = "invite_expiration")>]
    InviteExpiration : int;
    [<JsonProperty(PropertyName = "invite_status")>]
    InviteStatus : string;
    [<JsonProperty(PropertyName = "invite_type")>]
    InviteType : string;
    [<JsonProperty(PropertyName = "last_updated_time")>]
    LastUpdatedTime : int;
    [<JsonProperty(PropertyName = "sent_at")>]
    SentAt : int;
  }

  //#endregion
