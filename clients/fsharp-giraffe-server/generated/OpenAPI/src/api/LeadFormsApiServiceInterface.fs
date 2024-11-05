namespace OpenAPI
open LeadFormsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module LeadFormsApiServiceInterface =

    //#region Service interface
    type ILeadFormsApiService =
      abstract member LeadFormGet:HttpContext -> LeadFormGetArgs->LeadFormGetResult
      abstract member LeadFormTestCreate:HttpContext -> LeadFormTestCreateArgs->LeadFormTestCreateResult
      abstract member LeadFormsCreate:HttpContext -> LeadFormsCreateArgs->LeadFormsCreateResult
      abstract member LeadFormsList:HttpContext -> LeadFormsListArgs->LeadFormsListResult
      abstract member LeadFormsUpdate:HttpContext -> LeadFormsUpdateArgs->LeadFormsUpdateResult
    //#endregion