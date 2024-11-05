namespace OpenAPI
open LeadFormsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module LeadFormsApiServiceInterface =

    //#region Service interface
    type ILeadFormsApiService =
      abstract member LeadFormGet : unit -> LeadFormGetResult
      abstract member LeadFormTestCreate : LeadFormTestCreateBodyParams -> LeadFormTestCreateResult
      abstract member LeadFormsCreate : LeadFormsCreateBodyParams -> LeadFormsCreateResult
      abstract member LeadFormsList : unit -> LeadFormsListResult
      abstract member LeadFormsUpdate : LeadFormsUpdateBodyParams -> LeadFormsUpdateResult
    //#endregion