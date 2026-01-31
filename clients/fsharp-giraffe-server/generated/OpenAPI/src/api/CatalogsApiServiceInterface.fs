namespace OpenAPI
open CatalogsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CatalogsApiServiceInterface =

    //#region Service interface
    type ICatalogsApiService =
      abstract member CatalogsAvailableFilterValues:HttpContext -> CatalogsAvailableFilterValuesArgs->CatalogsAvailableFilterValuesResult
      abstract member CatalogsCreate:HttpContext -> CatalogsCreateArgs->CatalogsCreateResult
      abstract member CatalogsList:HttpContext -> CatalogsListArgs->CatalogsListResult
    //#endregion