namespace OpenAPI
open CatalogItemsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CatalogItemsApiServiceInterface =

    //#region Service interface
    type ICatalogItemsApiService =
      abstract member ItemsBatchGet:HttpContext -> ItemsBatchGetArgs->ItemsBatchGetResult
      abstract member ItemsBatchPost:HttpContext -> ItemsBatchPostArgs->ItemsBatchPostResult
      abstract member ItemsPost:HttpContext -> ItemsPostArgs->ItemsPostResult
    //#endregion