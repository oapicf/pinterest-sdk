namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module NotificationResponse =

  //#region NotificationResponse

  [<CLIMutable>]
  type NotificationResponse = {
    [<JsonProperty(PropertyName = "success")>]
    Success : bool;
    [<JsonProperty(PropertyName = "received_at")>]
    ReceivedAt : int;
    [<JsonProperty(PropertyName = "error_msg")>]
    ErrorMsg : string;
  }

  //#endregion
