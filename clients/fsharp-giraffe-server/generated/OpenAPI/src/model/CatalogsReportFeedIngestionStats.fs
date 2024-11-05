namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsReportFeedIngestionStats =

  //#region CatalogsReportFeedIngestionStats

  //#region enums
  type ReportTypeEnum = FEEDINGESTIONISSUESEnum of string  
  //#endregion
  //#region enums
  type SeverityEnum = WARNEnum of string  |  ERROREnum of string  
  //#endregion

  type CatalogsReportFeedIngestionStats = {
    ReportType : ReportTypeEnum;
    CatalogId : string;
    Code : int;
    CodeLabel : string;
    Message : string;
    Occurrences : int;
    Severity : SeverityEnum;
  }
  //#endregion
