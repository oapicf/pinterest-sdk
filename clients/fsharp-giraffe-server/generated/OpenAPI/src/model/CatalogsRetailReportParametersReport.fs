namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsReportDistributionIssueFilter
open OpenAPI.Model.CatalogsReportFeedIngestionFilter
open OpenAPI.Model.CatalogsRetailReportAllItemsFilter

module CatalogsRetailReportParametersReport =

  //#region CatalogsRetailReportParametersReport

  //#region enums
  type ReportTypeEnum = ALLITEMSEnum of string  
  //#endregion

  type CatalogsRetailReportParametersReport = {
    FeedId : string;
    ProcessingResultId : string;
    ReportType : ReportTypeEnum;
    CatalogId : string;
    ProductGroupId : string;
  }
  //#endregion
