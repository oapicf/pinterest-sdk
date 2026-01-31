namespace OpenAPI
open OpenAPI.Model.Catalog
open OpenAPI.Model.CatalogsAvailableFilterValues
open OpenAPI.Model.CatalogsCreateRequest
open OpenAPI.Model.CatalogsList200Response
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.Country
open OpenAPI.Model.Error
open CatalogsApiHandlerParams
open CatalogsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module CatalogsApiServiceImplementation =

    //#region Service implementation
    type CatalogsApiServiceImpl() =
      interface ICatalogsApiService with

        member this.CatalogsAvailableFilterValues ctx args =
          if true then
            let content = "Success" :> obj :?> CatalogsAvailableFilterValues // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsAvailableFilterValuesStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsAvailableFilterValuesStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsAvailableFilterValuesStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not authorized to access available filter values." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsAvailableFilterValuesStatusCode403 { content = content }
          else if true then
            let content = "Data feed not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsAvailableFilterValuesStatusCode404 { content = content }
          else if true then
            let content = "Can&#39;t access this feature without an existing catalog." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsAvailableFilterValuesStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsAvailableFilterValuesDefaultStatusCode { content = content }

        member this.CatalogsCreate ctx args =
          if true then
            let content = "Success" :> obj :?> Catalog // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateStatusCode401 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateDefaultStatusCode { content = content }

        member this.CatalogsList ctx args =
          if true then
            let content = "Success" :> obj :?> CatalogsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListStatusCode401 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListDefaultStatusCode { content = content }

      //#endregion

    let CatalogsApiService = CatalogsApiServiceImpl() :> ICatalogsApiService