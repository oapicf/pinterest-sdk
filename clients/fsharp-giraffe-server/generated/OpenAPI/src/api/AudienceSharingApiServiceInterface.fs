namespace OpenAPI
open AudienceSharingApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module AudienceSharingApiServiceInterface =

    //#region Service interface
    type IAudienceSharingApiService =
      abstract member AdAccountsAudiencesSharedAccountsList:HttpContext -> AdAccountsAudiencesSharedAccountsListArgs->AdAccountsAudiencesSharedAccountsListResult
      abstract member BusinessAccountAudiencesSharedAccountsList:HttpContext -> BusinessAccountAudiencesSharedAccountsListArgs->BusinessAccountAudiencesSharedAccountsListResult
      abstract member SharedAudiencesForBusinessList:HttpContext -> SharedAudiencesForBusinessListArgs->SharedAudiencesForBusinessListResult
      abstract member UpdateAdAccountToAdAccountSharedAudience:HttpContext -> UpdateAdAccountToAdAccountSharedAudienceArgs->UpdateAdAccountToAdAccountSharedAudienceResult
      abstract member UpdateAdAccountToBusinessSharedAudience:HttpContext -> UpdateAdAccountToBusinessSharedAudienceArgs->UpdateAdAccountToBusinessSharedAudienceResult
      abstract member UpdateBusinessToAdAccountSharedAudience:HttpContext -> UpdateBusinessToAdAccountSharedAudienceArgs->UpdateBusinessToAdAccountSharedAudienceResult
      abstract member UpdateBusinessToBusinessSharedAudience:HttpContext -> UpdateBusinessToBusinessSharedAudienceArgs->UpdateBusinessToBusinessSharedAudienceResult
    //#endregion