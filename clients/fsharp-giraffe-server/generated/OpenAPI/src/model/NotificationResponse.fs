namespace OpenAPI.Model

open System
open System.Collections.Generic

module NotificationResponse =

  //#region NotificationResponse


  type NotificationResponse = {
    Success : bool;
    ReceivedAt : int;
    ErrorMsg : string;
  }
  //#endregion
