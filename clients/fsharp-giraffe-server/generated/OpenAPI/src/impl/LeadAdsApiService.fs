namespace OpenAPI
open OpenAPI.Model.AdAccountCreateSubscriptionRequest
open OpenAPI.Model.AdAccountCreateSubscriptionResponse
open OpenAPI.Model.AdAccountGetSubscriptionResponse
open OpenAPI.Model.AdAccountsSubscriptionsGetList200Response
open OpenAPI.Model.Error
open LeadAdsApiHandlerParams
open LeadAdsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module LeadAdsApiServiceImplementation =

    //#region Service implementation
    type LeadAdsApiServiceImpl() =
      interface ILeadAdsApiService with

        member this.AdAccountsSubscriptionsDelById ctx args =
          if true then
            let content = "Subscription deleted successfully" 
            AdAccountsSubscriptionsDelByIdStatusCode204 { content = content }
          else if true then
            let content = "Invalid input parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsDelByIdStatusCode400 { content = content }
          else if true then
            let content = "You are not authorized to delete this subscription." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsDelByIdStatusCode403 { content = content }
          else if true then
            let content = "Subscription not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsDelByIdStatusCode404 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsDelByIdDefaultStatusCode { content = content }

        member this.AdAccountsSubscriptionsGetById ctx args =
          if true then
            let content = "Success" :> obj :?> AdAccountGetSubscriptionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetByIdStatusCode200 { content = content }
          else if true then
            let content = "Invalid input parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetByIdStatusCode400 { content = content }
          else if true then
            let content = "Can&#39;t access this subscription." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetByIdStatusCode403 { content = content }
          else if true then
            let content = "Subscription not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetByIdStatusCode404 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetByIdDefaultStatusCode { content = content }

        member this.AdAccountsSubscriptionsGetList ctx args =
          if true then
            let content = "Success" :> obj :?> AdAccountsSubscriptionsGetList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetListStatusCode200 { content = content }
          else if true then
            let content = "Can&#39;t access this subscription." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetListStatusCode403 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetListDefaultStatusCode { content = content }

        member this.AdAccountsSubscriptionsPost ctx args =
          if true then
            let content = "Success" :> obj :?> AdAccountCreateSubscriptionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsPostStatusCode200 { content = content }
          else if true then
            let content = "Invalid input parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsPostStatusCode400 { content = content }
          else if true then
            let content = "Can&#39;t access this subscription." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsPostStatusCode403 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsPostDefaultStatusCode { content = content }

      //#endregion

    let LeadAdsApiService = LeadAdsApiServiceImpl() :> ILeadAdsApiService