namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsReportDistributionIssueFilter
open OpenAPI.Model.CatalogsReportFeedIngestionFilter

module CatalogsRetailReportStatsParametersReport =

  //#region CatalogsRetailReportStatsParametersReport

  //#region enums
  type ReportTypeEnum = DISTRIBUTIONISSUESEnum of string  
  //#endregion

  type CatalogsRetailReportStatsParametersReport = {
    FeedId : string;
    ProcessingResultId : string;
    ReportType : ReportTypeEnum;
    CatalogId : string;
  }
  //#endregion
