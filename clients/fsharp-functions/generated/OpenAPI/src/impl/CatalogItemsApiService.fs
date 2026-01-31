namespace OpenAPI
open OpenAPI.Model.CatalogsItems
open OpenAPI.Model.CatalogsItemsBatch
open OpenAPI.Model.CatalogsItemsRequest
open OpenAPI.Model.Error
open OpenAPI.Model.ItemsBatchPostRequest
open CatalogItemsApiHandlerParams
open CatalogItemsApiServiceInterface
open System.Collections.Generic
open System

module CatalogItemsApiServiceImplementation =

    //#region Service implementation
    type CatalogItemsApiServiceImpl() =
      interface ICatalogItemsApiService with

        member this.ItemsBatchGet () =
          if true then
            let content = "Response containing the requested catalogs items batch" :> obj :?> CatalogsItemsBatch // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchGetStatusCode200 { content = content }
          else if true then
            let content = "Not authenticated to access catalogs items batch" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchGetStatusCode401 { content = content }
          else if true then
            let content = "Not authorized to access catalogs items batch" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchGetStatusCode403 { content = content }
          else if true then
            let content = "Catalogs items batch not found" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchGetStatusCode404 { content = content }
          else if true then
            let content = "Method Not Allowed." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchGetStatusCode405 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchGetDefaultStatusCode { content = content }

        member this.ItemsBatchPost (parameters:ItemsBatchPostBodyParams) =
          if true then
            let content = "Response containing the requested catalogs items batch" :> obj :?> CatalogsItemsBatch // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchPostStatusCode200 { content = content }
          else if true then
            let content = "Invalid request parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchPostStatusCode400 { content = content }
          else if true then
            let content = "Not authenticated to post catalogs items" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchPostStatusCode401 { content = content }
          else if true then
            let content = "Not authorized to post catalogs items" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchPostStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchPostDefaultStatusCode { content = content }

        member this.ItemsPost (parameters:ItemsPostBodyParams) =
          if true then
            let content = "Response containing the requested catalogs items" :> obj :?> CatalogsItems // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsPostStatusCode200 { content = content }
          else if true then
            let content = "Invalid request" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsPostStatusCode400 { content = content }
          else if true then
            let content = "Not authorized to access catalogs items" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsPostStatusCode401 { content = content }
          else if true then
            let content = "Not authorized to access catalogs items" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsPostStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsPostDefaultStatusCode { content = content }

      //#endregion

    let CatalogItemsApiService = CatalogItemsApiServiceImpl() :> ICatalogItemsApiService