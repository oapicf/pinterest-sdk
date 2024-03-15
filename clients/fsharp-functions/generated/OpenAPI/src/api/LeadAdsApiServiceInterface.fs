namespace OpenAPI
open LeadAdsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module LeadAdsApiServiceInterface =

    //#region Service interface
    type ILeadAdsApiService =
      abstract member AdAccountsSubscriptionsDelById : unit -> AdAccountsSubscriptionsDelByIdResult
      abstract member AdAccountsSubscriptionsGetById : unit -> AdAccountsSubscriptionsGetByIdResult
      abstract member AdAccountsSubscriptionsGetList : unit -> AdAccountsSubscriptionsGetListResult
      abstract member AdAccountsSubscriptionsPost : AdAccountsSubscriptionsPostBodyParams -> AdAccountsSubscriptionsPostResult
    //#endregion