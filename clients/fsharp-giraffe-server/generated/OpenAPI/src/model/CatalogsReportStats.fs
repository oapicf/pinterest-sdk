namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsReportDistributionStats
open OpenAPI.Model.CatalogsReportFeedIngestionStats

module CatalogsReportStats =

  //#region CatalogsReportStats

  //#region enums
  type ReportTypeEnum = DISTRIBUTIONISSUESEnum of string  
  //#endregion
  //#region enums
  type SeverityEnum = WARNEnum of string  |  ERROREnum of string  
  //#endregion

  type CatalogsReportStats = {
    CatalogId : string;
    Code : int;
    CodeLabel : string;
    Message : string;
    Occurrences : int;
    ReportType : ReportTypeEnum;
    Severity : SeverityEnum;
    IneligibleForAds : bool;
    IneligibleForOrganic : bool;
  }
  //#endregion
