namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TargetingStrategy =

  //#region TargetingStrategy

  let CHOOSEYOUROWNEnum = "CHOOSE_YOUR_OWN"
  let FINDNEWCUSTOMERSEnum = "FIND_NEW_CUSTOMERS"
  let RECONNECTWITHUSERSEnum = "RECONNECT_WITH_USERS"
  type TargetingStrategy = string

  //#endregion
