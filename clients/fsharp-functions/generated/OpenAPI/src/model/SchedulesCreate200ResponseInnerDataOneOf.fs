namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinterestLibError

module SchedulesCreate200ResponseInnerDataOneOf =

  //#region SchedulesCreate200ResponseInnerDataOneOf

  [<CLIMutable>]
  type SchedulesCreate200ResponseInnerDataOneOf = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "schedule_id")>]
    ScheduleId : string;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : PinterestLibError;
  }

  //#endregion
