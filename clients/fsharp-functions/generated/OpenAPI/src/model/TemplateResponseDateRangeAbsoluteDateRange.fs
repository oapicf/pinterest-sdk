namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TemplateResponseDateRangeAbsoluteDateRange =

  //#region TemplateResponseDateRangeAbsoluteDateRange

  [<CLIMutable>]
  type TemplateResponseDateRangeAbsoluteDateRange = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "start_date")>]
    StartDate : decimal;
    [<JsonProperty(PropertyName = "end_date")>]
    EndDate : decimal;
  }

  //#endregion
