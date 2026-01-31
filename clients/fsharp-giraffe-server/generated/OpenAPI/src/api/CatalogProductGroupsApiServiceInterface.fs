namespace OpenAPI
open CatalogProductGroupsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CatalogProductGroupsApiServiceInterface =

    //#region Service interface
    type ICatalogProductGroupsApiService =
      abstract member CatalogsProductGroupPinsList:HttpContext -> CatalogsProductGroupPinsListArgs->CatalogsProductGroupPinsListResult
      abstract member CatalogsProductGroupsCreate:HttpContext -> CatalogsProductGroupsCreateArgs->CatalogsProductGroupsCreateResult
      abstract member CatalogsProductGroupsCreateMany:HttpContext -> CatalogsProductGroupsCreateManyArgs->CatalogsProductGroupsCreateManyResult
      abstract member CatalogsProductGroupsDelete:HttpContext -> CatalogsProductGroupsDeleteArgs->CatalogsProductGroupsDeleteResult
      abstract member CatalogsProductGroupsDeleteMany:HttpContext -> CatalogsProductGroupsDeleteManyArgs->CatalogsProductGroupsDeleteManyResult
      abstract member CatalogsProductGroupsGet:HttpContext -> CatalogsProductGroupsGetArgs->CatalogsProductGroupsGetResult
      abstract member CatalogsProductGroupsList:HttpContext -> CatalogsProductGroupsListArgs->CatalogsProductGroupsListResult
      abstract member CatalogsProductGroupsProductCountsGet:HttpContext -> CatalogsProductGroupsProductCountsGetArgs->CatalogsProductGroupsProductCountsGetResult
      abstract member CatalogsProductGroupsUpdate:HttpContext -> CatalogsProductGroupsUpdateArgs->CatalogsProductGroupsUpdateResult
      abstract member ProductsByProductGroupFilterList:HttpContext -> ProductsByProductGroupFilterListArgs->ProductsByProductGroupFilterListResult
    //#endregion