namespace OpenAPI
open ProductGroupsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ProductGroupsApiServiceInterface =

    //#region Service interface
    type IProductGroupsApiService =
      abstract member AdAccountsCatalogsProductGroupsList:HttpContext -> AdAccountsCatalogsProductGroupsListArgs->AdAccountsCatalogsProductGroupsListResult
    //#endregion