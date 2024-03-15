namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TemplateResponseDateRangeRelativeDateRange =

  //#region TemplateResponseDateRangeRelativeDateRange

  [<CLIMutable>]
  type TemplateResponseDateRangeRelativeDateRange = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "start_days_in_past")>]
    StartDaysInPast : decimal;
    [<JsonProperty(PropertyName = "end_days_in_past")>]
    EndDaysInPast : decimal;
  }

  //#endregion
