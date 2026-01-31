namespace OpenAPI
open CatalogsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CatalogsApiServiceInterface =

    //#region Service interface
    type ICatalogsApiService =
      abstract member CatalogsAvailableFilterValues : unit -> CatalogsAvailableFilterValuesResult
      abstract member CatalogsCreate : CatalogsCreateBodyParams -> CatalogsCreateResult
      abstract member CatalogsList : unit -> CatalogsListResult
    //#endregion