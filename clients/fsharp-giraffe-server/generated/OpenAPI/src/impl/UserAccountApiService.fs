namespace OpenAPI
open OpenAPI.Model.Account
open OpenAPI.Model.AnalyticsMetricsResponse
open OpenAPI.Model.BoardsList200Response
open OpenAPI.Model.FollowUser
open OpenAPI.Model.FollowUserCreate
open OpenAPI.Model.FollowersList200Response
open System.Collections.Generic
open OpenAPI.Model.LinkedBusiness
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.QuerymetrictypesItems
open OpenAPI.Model.QueryvideopinmetrictypesItems
open OpenAPI.Model.TopPinsAnalyticsResponse
open OpenAPI.Model.TopPinsSortBy
open OpenAPI.Model.TopVideoPinsAnalyticsResponse
open OpenAPI.Model.TopVideoPinsSortBy
open OpenAPI.Model.UserAccountFollowedInterests200Response
open OpenAPI.Model.UserFollowingFeedType
open OpenAPI.Model.UserWebsite
open OpenAPI.Model.UserWebsiteCreate
open OpenAPI.Model.UserWebsiteVerification
open OpenAPI.Model.UserWebsitesGet200Response
open UserAccountApiHandlerParams
open UserAccountApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module UserAccountApiServiceImplementation =

    //#region Service implementation
    type UserAccountApiServiceImpl() =
      interface IUserAccountApiService with

        member this.BoardsUserFollowsList ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> BoardsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUserFollowsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUserFollowsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUserFollowsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUserFollowsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUserFollowsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUserFollowsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUserFollowsListDefaultStatusCode { content = content }

        member this.FollowUserUpdate ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> FollowUser // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowUserUpdateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> FollowUser // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowUserUpdateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowUserUpdateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowUserUpdateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowUserUpdateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowUserUpdateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowUserUpdateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowUserUpdateDefaultStatusCode { content = content }

        member this.FollowersList ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> FollowersList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowersListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowersListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowersListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowersListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowersListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowersListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowersListDefaultStatusCode { content = content }

        member this.LinkedBusinessAccountsGet ctx  =
          if true then
            let content = "The request has succeeded." :> obj :?> LinkedBusiness[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LinkedBusinessAccountsGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LinkedBusinessAccountsGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LinkedBusinessAccountsGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LinkedBusinessAccountsGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LinkedBusinessAccountsGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LinkedBusinessAccountsGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LinkedBusinessAccountsGetDefaultStatusCode { content = content }

        member this.UnverifyWebsiteDelete ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> UserWebsite // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnverifyWebsiteDeleteStatusCode200 { content = content }
          else if true then
            let content = "Resource deleted successfully." 
            UnverifyWebsiteDeleteStatusCode204 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnverifyWebsiteDeleteStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnverifyWebsiteDeleteStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnverifyWebsiteDeleteStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnverifyWebsiteDeleteStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnverifyWebsiteDeleteStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnverifyWebsiteDeleteDefaultStatusCode { content = content }

        member this.UserAccountAnalytics ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> IDictionary<string, AnalyticsMetricsResponse> // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsDefaultStatusCode { content = content }

        member this.UserAccountAnalyticsTopPins ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> TopPinsAnalyticsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopPinsStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopPinsStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopPinsStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopPinsStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopPinsStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopPinsStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopPinsDefaultStatusCode { content = content }

        member this.UserAccountAnalyticsTopVideoPins ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> TopVideoPinsAnalyticsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopVideoPinsStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopVideoPinsStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopVideoPinsStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopVideoPinsStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopVideoPinsStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopVideoPinsStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopVideoPinsDefaultStatusCode { content = content }

        member this.UserAccountFollowedInterests ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> UserAccountFollowedInterests200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountFollowedInterestsStatusCode200 { content = content }
          else if true then
            let content = "The server could not understand the request due to invalid syntax." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountFollowedInterestsStatusCode400 { content = content }
          else if true then
            let content = "Access is unauthorized." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountFollowedInterestsStatusCode401 { content = content }
          else if true then
            let content = "The server cannot find the requested resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountFollowedInterestsStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountFollowedInterestsDefaultStatusCode { content = content }

        member this.UserAccountGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> Account // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountGetDefaultStatusCode { content = content }

        member this.UserFollowingGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> FollowersList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserFollowingGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserFollowingGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserFollowingGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserFollowingGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserFollowingGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserFollowingGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserFollowingGetDefaultStatusCode { content = content }

        member this.UserWebsitesGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> UserWebsitesGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserWebsitesGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserWebsitesGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserWebsitesGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserWebsitesGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserWebsitesGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserWebsitesGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserWebsitesGetDefaultStatusCode { content = content }

        member this.VerifyWebsiteUpdate ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> UserWebsite // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VerifyWebsiteUpdateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> UserWebsite // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VerifyWebsiteUpdateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VerifyWebsiteUpdateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VerifyWebsiteUpdateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VerifyWebsiteUpdateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VerifyWebsiteUpdateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VerifyWebsiteUpdateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VerifyWebsiteUpdateDefaultStatusCode { content = content }

        member this.WebsiteVerificationGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> UserWebsiteVerification // this cast is obviously wrong, and is only intended to allow generated project to compile   
            WebsiteVerificationGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            WebsiteVerificationGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            WebsiteVerificationGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            WebsiteVerificationGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            WebsiteVerificationGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            WebsiteVerificationGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            WebsiteVerificationGetDefaultStatusCode { content = content }

      //#endregion

    let UserAccountApiService = UserAccountApiServiceImpl() :> IUserAccountApiService