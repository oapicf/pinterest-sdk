namespace OpenAPI
open CatalogProductGroupsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CatalogProductGroupsApiServiceInterface =

    //#region Service interface
    type ICatalogProductGroupsApiService =
      abstract member CatalogsProductGroupPinsList : unit -> CatalogsProductGroupPinsListResult
      abstract member CatalogsProductGroupsCreate : CatalogsProductGroupsCreateBodyParams -> CatalogsProductGroupsCreateResult
      abstract member CatalogsProductGroupsCreateMany : CatalogsProductGroupsCreateManyBodyParams -> CatalogsProductGroupsCreateManyResult
      abstract member CatalogsProductGroupsDelete : unit -> CatalogsProductGroupsDeleteResult
      abstract member CatalogsProductGroupsDeleteMany : unit -> CatalogsProductGroupsDeleteManyResult
      abstract member CatalogsProductGroupsGet : unit -> CatalogsProductGroupsGetResult
      abstract member CatalogsProductGroupsList : unit -> CatalogsProductGroupsListResult
      abstract member CatalogsProductGroupsProductCountsGet : unit -> CatalogsProductGroupsProductCountsGetResult
      abstract member CatalogsProductGroupsUpdate : CatalogsProductGroupsUpdateBodyParams -> CatalogsProductGroupsUpdateResult
      abstract member ProductsByProductGroupFilterList : ProductsByProductGroupFilterListBodyParams -> ProductsByProductGroupFilterListResult
    //#endregion