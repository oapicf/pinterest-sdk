namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsReportDistributionIssueFilter =

  //#region CatalogsReportDistributionIssueFilter

  //#region enums
  type ReportTypeEnum = DISTRIBUTIONISSUESEnum of string  
  //#endregion

  type CatalogsReportDistributionIssueFilter = {
    CatalogId : string;
    ReportType : ReportTypeEnum;
  }
  //#endregion
