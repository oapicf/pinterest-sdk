namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelReportStatsParametersReport

module CatalogsHotelReportStatsParameters =

  //#region CatalogsHotelReportStatsParameters

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelReportStatsParameters = {
    CatalogType : CatalogTypeEnum;
    Report : CatalogsHotelReportStatsParametersReport;
  }
  //#endregion
