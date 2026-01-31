namespace OpenAPI
open CatalogItemsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CatalogItemsApiServiceInterface =

    //#region Service interface
    type ICatalogItemsApiService =
      abstract member ItemsBatchGet : unit -> ItemsBatchGetResult
      abstract member ItemsBatchPost : ItemsBatchPostBodyParams -> ItemsBatchPostResult
      abstract member ItemsPost : ItemsPostBodyParams -> ItemsPostResult
    //#endregion