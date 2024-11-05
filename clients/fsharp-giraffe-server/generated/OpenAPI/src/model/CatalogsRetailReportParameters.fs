namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelReportParametersReport

module CatalogsRetailReportParameters =

  //#region CatalogsRetailReportParameters

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailReportParameters = {
    CatalogType : CatalogTypeEnum;
    Report : CatalogsHotelReportParametersReport;
  }
  //#endregion
