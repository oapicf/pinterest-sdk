namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module CatalogsFeedProcessingSchedule =

  //#region CatalogsFeedProcessingSchedule

  [<CLIMutable>]
  type CatalogsFeedProcessingSchedule = {
    [<JsonProperty(PropertyName = "time")>]
    Time : string;
    [<JsonProperty(PropertyName = "timezone")>]
    Timezone : string option;
  }

  //#endregion
