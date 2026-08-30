namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.SchedulesCreate200ResponseInnerData

module SchedulesCreate200ResponseInner =

  //#region SchedulesCreate200ResponseInner

  [<CLIMutable>]
  type SchedulesCreate200ResponseInner = {
    [<JsonProperty(PropertyName = "data")>]
    Data : SchedulesCreate200ResponseInnerData;
  }

  //#endregion
