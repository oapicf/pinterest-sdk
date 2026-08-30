namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelReportStatsParameters
open OpenAPI.Model.CatalogsHotelReportStatsParametersReport
open OpenAPI.Model.CatalogsRetailReportStatsParameters

module CatalogsReportStatsParameters =

  //#region CatalogsReportStatsParameters

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsReportStatsParameters = {
    CatalogType : CatalogTypeEnum;
    Report : CatalogsHotelReportStatsParametersReport;
  }
  //#endregion
