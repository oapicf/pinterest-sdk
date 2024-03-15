namespace OpenAPI
open LeadAdsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module LeadAdsApiServiceInterface =

    //#region Service interface
    type ILeadAdsApiService =
      abstract member AdAccountsSubscriptionsDelById:HttpContext -> AdAccountsSubscriptionsDelByIdArgs->AdAccountsSubscriptionsDelByIdResult
      abstract member AdAccountsSubscriptionsGetById:HttpContext -> AdAccountsSubscriptionsGetByIdArgs->AdAccountsSubscriptionsGetByIdResult
      abstract member AdAccountsSubscriptionsGetList:HttpContext -> AdAccountsSubscriptionsGetListArgs->AdAccountsSubscriptionsGetListResult
      abstract member AdAccountsSubscriptionsPost:HttpContext -> AdAccountsSubscriptionsPostArgs->AdAccountsSubscriptionsPostResult
    //#endregion