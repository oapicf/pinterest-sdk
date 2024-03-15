namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TemplateResponseDateRangeAbsoluteDateRange
open OpenAPI.Model.TemplateResponseDateRangeDynamicDateRange
open OpenAPI.Model.TemplateResponseDateRangeRelativeDateRange

module TemplateResponseDateRange =

  //#region TemplateResponseDateRange

  [<CLIMutable>]
  type TemplateResponseDateRange = {
    [<JsonProperty(PropertyName = "dynamic_date_range")>]
    DynamicDateRange : TemplateResponseDateRangeDynamicDateRange;
    [<JsonProperty(PropertyName = "relative_date_range")>]
    RelativeDateRange : TemplateResponseDateRangeRelativeDateRange;
    [<JsonProperty(PropertyName = "absolute_date_range")>]
    AbsoluteDateRange : TemplateResponseDateRangeAbsoluteDateRange;
  }

  //#endregion
