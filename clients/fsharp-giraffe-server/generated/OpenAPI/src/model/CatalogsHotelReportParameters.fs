namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelReportParametersReport

module CatalogsHotelReportParameters =

  //#region CatalogsHotelReportParameters

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelReportParameters = {
    CatalogType : CatalogTypeEnum;
    Report : CatalogsHotelReportParametersReport;
  }
  //#endregion
