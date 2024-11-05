namespace OpenAPI
open LeadsExportApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module LeadsExportApiServiceInterface =

    //#region Service interface
    type ILeadsExportApiService =
      abstract member LeadsExportCreate:HttpContext -> LeadsExportCreateArgs->LeadsExportCreateResult
      abstract member LeadsExportGet:HttpContext -> LeadsExportGetArgs->LeadsExportGetResult
    //#endregion