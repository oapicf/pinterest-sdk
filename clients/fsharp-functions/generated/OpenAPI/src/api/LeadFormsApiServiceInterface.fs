namespace OpenAPI
open LeadFormsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module LeadFormsApiServiceInterface =

    //#region Service interface
    type ILeadFormsApiService =
      abstract member LeadFormGet : unit -> LeadFormGetResult
      abstract member LeadFormTestCreate : LeadFormTestCreateBodyParams -> LeadFormTestCreateResult
      abstract member LeadFormsList : unit -> LeadFormsListResult
    //#endregion