namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TemplateResponseDateRangeDynamicDateRange =

  //#region TemplateResponseDateRangeDynamicDateRange

  [<CLIMutable>]
  type TemplateResponseDateRangeDynamicDateRange = {
    [<JsonProperty(PropertyName = "range")>]
    Range : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
