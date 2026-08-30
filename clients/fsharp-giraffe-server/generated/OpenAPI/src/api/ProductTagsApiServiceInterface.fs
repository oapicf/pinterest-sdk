namespace OpenAPI
open ProductTagsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ProductTagsApiServiceInterface =

    //#region Service interface
    type IProductTagsApiService =
      abstract member ProductTagsBulkAdd:HttpContext -> ProductTagsBulkAddArgs->ProductTagsBulkAddResult
      abstract member ProductTagsBulkDelete:HttpContext -> ProductTagsBulkDeleteArgs->ProductTagsBulkDeleteResult
      abstract member ProductTagsList:HttpContext -> ProductTagsListArgs->ProductTagsListResult
    //#endregion