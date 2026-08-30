namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module NotificationResponse =

  //#region NotificationResponse

  [<CLIMutable>]
  type NotificationResponse = {
    [<JsonProperty(PropertyName = "error_msg")>]
    ErrorMsg : string;
    [<JsonProperty(PropertyName = "received_at")>]
    ReceivedAt : int;
    [<JsonProperty(PropertyName = "success")>]
    Success : bool;
  }

  //#endregion
