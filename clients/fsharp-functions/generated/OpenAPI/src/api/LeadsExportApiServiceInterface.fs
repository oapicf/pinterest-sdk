namespace OpenAPI
open LeadsExportApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module LeadsExportApiServiceInterface =

    //#region Service interface
    type ILeadsExportApiService =
      abstract member LeadsExportCreate : LeadsExportCreateBodyParams -> LeadsExportCreateResult
      abstract member LeadsExportGet : unit -> LeadsExportGetResult
    //#endregion