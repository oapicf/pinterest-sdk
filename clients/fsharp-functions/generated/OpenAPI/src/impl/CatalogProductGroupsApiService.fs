namespace OpenAPI
open OpenAPI.Model.CatalogsListProductsByFilterRequest
open OpenAPI.Model.CatalogsProductGroupPinsList200Response
open OpenAPI.Model.CatalogsProductGroupProductCountsVertical
open OpenAPI.Model.CatalogsProductGroupsList200Response
open OpenAPI.Model.CatalogsProductGroupsUpdateRequest
open OpenAPI.Model.CatalogsVerticalProductGroup
open OpenAPI.Model.Error
open OpenAPI.Model.MultipleProductGroupsInner
open CatalogProductGroupsApiHandlerParams
open CatalogProductGroupsApiServiceInterface
open System.Collections.Generic
open System

module CatalogProductGroupsApiServiceImplementation =

    //#region Service implementation
    type CatalogProductGroupsApiServiceImpl() =
      interface ICatalogProductGroupsApiService with

        member this.CatalogsProductGroupPinsList () =
          if true then
            let content = "Success" :> obj :?> CatalogsProductGroupPinsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListStatusCode401 { content = content }
          else if true then
            let content = "Catalogs product group not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListStatusCode404 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsCreate (parameters:CatalogsProductGroupsCreateBodyParams) =
          if true then
            let content = "Success" :> obj :?> CatalogsVerticalProductGroup // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode201 { content = content }
          else if true then
            let content = "Invalid body." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for catalog product group mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode403 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t create this catalogs product group with this value." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsCreateMany (parameters:CatalogsProductGroupsCreateManyBodyParams) =
          if true then
            let content = "Success" :> obj :?> string[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode201 { content = content }
          else if true then
            let content = "Invalid body." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for catalog product group mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode403 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t create this catalogs product group with this value." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsDelete () =
          if true then
            let content = "Catalogs Product Group deleted successfully." 
            CatalogsProductGroupsDeleteStatusCode204 { content = content }
          else if true then
            let content = "Invalid catalogs product group id parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for catalog product group mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode403 { content = content }
          else if true then
            let content = "Catalogs product group not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode404 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t delete this catalogs product group." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsDeleteMany () =
          if true then
            let content = "Catalogs Product Groups deleted successfully." 
            CatalogsProductGroupsDeleteManyStatusCode204 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for catalog product group mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyStatusCode403 { content = content }
          else if true then
            let content = "Catalogs product group not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyStatusCode404 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t delete this catalogs product group." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsGet () =
          if true then
            let content = "Success" :> obj :?> CatalogsVerticalProductGroup // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode200 { content = content }
          else if true then
            let content = "Invalid catalogs product group id parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for catalog product group mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode403 { content = content }
          else if true then
            let content = "Catalogs product group not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode404 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t get a catalogs product group without an existing catalog." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsList () =
          if true then
            let content = "Success" :> obj :?> CatalogsProductGroupsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid feed parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for catalog product group mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode403 { content = content }
          else if true then
            let content = "Data feed not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode404 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t create this catalogs product group with this value." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsProductCountsGet () =
          if true then
            let content = "Success" :> obj :?> CatalogsProductGroupProductCountsVertical // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetStatusCode200 { content = content }
          else if true then
            let content = "Product Group Not Found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetStatusCode404 { content = content }
          else if true then
            let content = "Can&#39;t access this feature without an existing catalog." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsUpdate (parameters:CatalogsProductGroupsUpdateBodyParams) =
          if true then
            let content = "Success" :> obj :?> CatalogsVerticalProductGroup // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for catalog product group mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode403 { content = content }
          else if true then
            let content = "Catalogs product group not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode404 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t update this catalogs product group to this value." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateDefaultStatusCode { content = content }

        member this.ProductsByProductGroupFilterList (parameters:ProductsByProductGroupFilterListBodyParams) =
          if true then
            let content = "Success" :> obj :?> CatalogsProductGroupPinsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListStatusCode200 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListStatusCode401 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t get products." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListDefaultStatusCode { content = content }

      //#endregion

    let CatalogProductGroupsApiService = CatalogProductGroupsApiServiceImpl() :> ICatalogProductGroupsApiService