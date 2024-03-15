namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TemplateResponseDateRangeAbsoluteDateRange
open OpenAPI.Model.TemplateResponseDateRangeDynamicDateRange
open OpenAPI.Model.TemplateResponseDateRangeRelativeDateRange

module TemplateResponseDateRange =

  //#region TemplateResponseDateRange


  type TemplateResponse_date_range = {
    DynamicDateRange : TemplateResponseDateRangeDynamicDateRange;
    RelativeDateRange : TemplateResponseDateRangeRelativeDateRange;
    AbsoluteDateRange : TemplateResponseDateRangeAbsoluteDateRange;
  }
  //#endregion
