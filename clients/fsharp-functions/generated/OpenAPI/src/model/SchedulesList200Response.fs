namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Schedule
open OpenAPI.Model.string option

module SchedulesList200Response =

  //#region SchedulesList200Response

  [<CLIMutable>]
  type SchedulesList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : Schedule[];
  }

  //#endregion
