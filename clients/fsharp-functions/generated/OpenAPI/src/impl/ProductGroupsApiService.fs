namespace OpenAPI
open OpenAPI.Model.AdAccountsCatalogsProductGroupsList200Response
open OpenAPI.Model.Error
open ProductGroupsApiHandlerParams
open ProductGroupsApiServiceInterface
open System.Collections.Generic
open System

module ProductGroupsApiServiceImplementation =

    //#region Service implementation
    type ProductGroupsApiServiceImpl() =
      interface IProductGroupsApiService with

        member this.AdAccountsCatalogsProductGroupsList () =
          if true then
            let content = "Success" :> obj :?> AdAccountsCatalogsProductGroupsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCatalogsProductGroupsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCatalogsProductGroupsListStatusCode400 { content = content }
          else if true then
            let content = "Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCatalogsProductGroupsListStatusCode401 { content = content }
          else if true then
            let content = "Merchant data not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCatalogsProductGroupsListStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCatalogsProductGroupsListDefaultStatusCode { content = content }

      //#endregion

    let ProductGroupsApiService = ProductGroupsApiServiceImpl() :> IProductGroupsApiService