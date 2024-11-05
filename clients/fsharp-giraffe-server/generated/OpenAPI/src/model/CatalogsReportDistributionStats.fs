namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsReportDistributionStats =

  //#region CatalogsReportDistributionStats

  //#region enums
  type ReportTypeEnum = DISTRIBUTIONISSUESEnum of string  
  //#endregion

  type CatalogsReportDistributionStats = {
    ReportType : ReportTypeEnum;
    CatalogId : string;
    Code : int;
    CodeLabel : string;
    Message : string;
    Occurrences : int;
    IneligibleForAds : bool;
    IneligibleForOrganic : bool;
  }
  //#endregion
