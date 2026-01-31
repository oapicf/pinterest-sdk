namespace OpenAPI.Model

open System
open System.Collections.Generic

module TemplateResponseDateRangeDynamicDateRange =

  //#region TemplateResponseDateRangeDynamicDateRange

  //#region enums
  type RangeEnum = YEARTODATEEnum of string  |  QUARTERTODATEEnum of string  |  MONTHTODATEEnum of string  |  LASTMONTHEnum of string  |  LASTQUARTEREnum of string  
  //#endregion

  type TemplateResponse_date_range_dynamic_date_range = {
    Range : RangeEnum;
    Type : string;
  }
  //#endregion
