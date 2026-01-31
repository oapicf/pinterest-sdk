namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open System.Collections.Generic

module AdPinAnalytics =

  //#region AdPinAnalytics

  [<CLIMutable>]
  type AdPinAnalytics = {
    [<JsonProperty(PropertyName = "DATE")>]
    DATE : DateTime;
    [<JsonProperty(PropertyName = "PIN_ID")>]
    PIN_ID : string;
  }

  //#endregion
