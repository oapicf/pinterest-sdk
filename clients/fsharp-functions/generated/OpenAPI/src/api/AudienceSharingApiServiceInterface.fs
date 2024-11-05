namespace OpenAPI
open AudienceSharingApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module AudienceSharingApiServiceInterface =

    //#region Service interface
    type IAudienceSharingApiService =
      abstract member AdAccountsAudiencesSharedAccountsList : unit -> AdAccountsAudiencesSharedAccountsListResult
      abstract member BusinessAccountAudiencesSharedAccountsList : unit -> BusinessAccountAudiencesSharedAccountsListResult
      abstract member SharedAudiencesForBusinessList : unit -> SharedAudiencesForBusinessListResult
      abstract member UpdateAdAccountToAdAccountSharedAudience : UpdateAdAccountToAdAccountSharedAudienceBodyParams -> UpdateAdAccountToAdAccountSharedAudienceResult
      abstract member UpdateAdAccountToBusinessSharedAudience : UpdateAdAccountToBusinessSharedAudienceBodyParams -> UpdateAdAccountToBusinessSharedAudienceResult
      abstract member UpdateBusinessToAdAccountSharedAudience : UpdateBusinessToAdAccountSharedAudienceBodyParams -> UpdateBusinessToAdAccountSharedAudienceResult
      abstract member UpdateBusinessToBusinessSharedAudience : UpdateBusinessToBusinessSharedAudienceBodyParams -> UpdateBusinessToBusinessSharedAudienceResult
    //#endregion