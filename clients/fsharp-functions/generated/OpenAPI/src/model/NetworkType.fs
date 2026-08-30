namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module NetworkType =

  //#region NetworkType

  let WifiEnum = "wifi"
  let Cellular2gEnum = "cellular_2g"
  let Cellular3gEnum = "cellular_3g"
  let Cellular4gEnum = "cellular_4g"
  let Cellular5gEnum = "cellular_5g"
  let Cellular6gEnum = "cellular_6g"
  let EthernetEnum = "ethernet"
  let UnknownEnum = "unknown"
  type NetworkType = string

  //#endregion
