namespace OpenAPI
open ProductTagsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ProductTagsApiServiceInterface =

    //#region Service interface
    type IProductTagsApiService =
      abstract member ProductTagsBulkAdd : ProductTagsBulkAddBodyParams -> ProductTagsBulkAddResult
      abstract member ProductTagsBulkDelete : ProductTagsBulkDeleteBodyParams -> ProductTagsBulkDeleteResult
      abstract member ProductTagsList : unit -> ProductTagsListResult
    //#endregion