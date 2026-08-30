namespace OpenAPI.Model

open System
open System.Collections.Generic

module NotificationResponse =

  //#region NotificationResponse


  type NotificationResponse = {
    ErrorMsg : string;
    ReceivedAt : int;
    Success : bool;
  }
  //#endregion
