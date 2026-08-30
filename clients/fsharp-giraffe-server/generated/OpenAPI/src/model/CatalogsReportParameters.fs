namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelReportParameters
open OpenAPI.Model.CatalogsHotelReportParametersReport
open OpenAPI.Model.CatalogsRetailReportParameters

module CatalogsReportParameters =

  //#region CatalogsReportParameters

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsReportParameters = {
    CatalogType : CatalogTypeEnum;
    Report : CatalogsHotelReportParametersReport;
  }
  //#endregion
