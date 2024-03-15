namespace OpenAPI
open ProductGroupsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ProductGroupsApiServiceInterface =

    //#region Service interface
    type IProductGroupsApiService =
      abstract member AdAccountsCatalogsProductGroupsList : unit -> AdAccountsCatalogsProductGroupsListResult
    //#endregion