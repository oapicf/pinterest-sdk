namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelReportParameters
open OpenAPI.Model.CatalogsHotelReportParametersReport
open OpenAPI.Model.CatalogsRetailReportParameters
open OpenAPI.Model.CatalogsType

module CatalogsReportParameters =

  //#region CatalogsReportParameters


  type CatalogsReportParameters = {
    CatalogType : CatalogsType;
    Report : CatalogsHotelReportParametersReport;
  }
  //#endregion
