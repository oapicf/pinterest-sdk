namespace OpenAPI
open OpenAPI.Model.AdAccountsSubscriptionsGetList200Response
open OpenAPI.Model.LeadSubscription
open OpenAPI.Model.LeadSubscriptionPostParamsCreate
open OpenAPI.Model.PinterestLibError
open LeadAdsApiHandlerParams
open LeadAdsApiServiceInterface
open System.Collections.Generic
open System

module LeadAdsApiServiceImplementation =

    //#region Service implementation
    type LeadAdsApiServiceImpl() =
      interface ILeadAdsApiService with

        member this.AdAccountsSubscriptionsDelById () =
          if true then
            let content = "Resource deleted successfully." 
            AdAccountsSubscriptionsDelByIdStatusCode204 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsDelByIdStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsDelByIdStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsDelByIdStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsDelByIdStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsDelByIdStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsDelByIdDefaultStatusCode { content = content }

        member this.AdAccountsSubscriptionsGetById () =
          if true then
            let content = "The request has succeeded." :> obj :?> LeadSubscription // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetByIdStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetByIdStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetByIdStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetByIdStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetByIdStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetByIdStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetByIdDefaultStatusCode { content = content }

        member this.AdAccountsSubscriptionsGetList () =
          if true then
            let content = "The request has succeeded." :> obj :?> AdAccountsSubscriptionsGetList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsGetListDefaultStatusCode { content = content }

        member this.AdAccountsSubscriptionsPost (parameters:AdAccountsSubscriptionsPostBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> LeadSubscription // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsPostStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsPostStatusCode400 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsPostStatusCode403 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsSubscriptionsPostDefaultStatusCode { content = content }

      //#endregion

    let LeadAdsApiService = LeadAdsApiServiceImpl() :> ILeadAdsApiService