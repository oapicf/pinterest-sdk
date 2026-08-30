namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsFeedProcessingScheduleTimezone

module CatalogsFeedProcessingSchedule =

  //#region CatalogsFeedProcessingSchedule

  [<CLIMutable>]
  type CatalogsFeedProcessingSchedule = {
    [<JsonProperty(PropertyName = "time")>]
    Time : string;
    [<JsonProperty(PropertyName = "timezone")>]
    Timezone : CatalogsFeedProcessingScheduleTimezone;
  }

  //#endregion
