namespace OpenAPI
open OpenAPI.Model.Account
open OpenAPI.Model.AnalyticsMetricsResponse
open OpenAPI.Model.BoardsUserFollowsList200Response
open OpenAPI.Model.Error
open OpenAPI.Model.FollowUserRequest
open OpenAPI.Model.FollowersList200Response
open System.Collections.Generic
open OpenAPI.Model.LinkedBusiness
open OpenAPI.Model.TopPinsAnalyticsResponse
open OpenAPI.Model.TopVideoPinsAnalyticsResponse
open OpenAPI.Model.UserAccountFollowedInterests200Response
open OpenAPI.Model.UserFollowingFeedType
open OpenAPI.Model.UserFollowingGet200Response
open OpenAPI.Model.UserSummary
open OpenAPI.Model.UserWebsiteSummary
open OpenAPI.Model.UserWebsiteVerificationCode
open OpenAPI.Model.UserWebsiteVerifyRequest
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
            let content = "Success" :> obj :?> BoardsUserFollowsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUserFollowsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid user id" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUserFollowsListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUserFollowsListDefaultStatusCode { content = content }

        member this.FollowUserUpdate ctx args =
          if true then
            let content = "Success" :> obj :?> UserSummary // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowUserUpdateStatusCode200 { content = content }
          else if true then
            let content = "User not found" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowUserUpdateStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowUserUpdateDefaultStatusCode { content = content }

        member this.FollowersList ctx args =
          if true then
            let content = "Success" :> obj :?> FollowersList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowersListStatusCode200 { content = content }
          else if true then
            let content = "Invalid user id" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowersListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FollowersListDefaultStatusCode { content = content }

        member this.LinkedBusinessAccountsGet ctx  =
          if true then
            let content = "Success" :> obj :?> LinkedBusiness[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LinkedBusinessAccountsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LinkedBusinessAccountsGetDefaultStatusCode { content = content }

        member this.UnverifyWebsiteDelete ctx args =
          if true then
            let content = "Successfully unverified website" 
            UnverifyWebsiteDeleteStatusCode204 { content = content }
          else if true then
            let content = "Website not in user list." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnverifyWebsiteDeleteStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnverifyWebsiteDeleteDefaultStatusCode { content = content }

        member this.UserAccountAnalytics ctx args =
          if true then
            let content = "Success" :> obj :?> IDictionary<string, AnalyticsMetricsResponse> // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Invalid user accounts analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsStatusCode400 { content = content }
          else if true then
            let content = "Not authorized to access the user account analytics." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsDefaultStatusCode { content = content }

        member this.UserAccountAnalyticsTopPins ctx args =
          if true then
            let content = "Success" :> obj :?> TopPinsAnalyticsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopPinsStatusCode200 { content = content }
          else if true then
            let content = "Not authorized to access the user account analytics." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopPinsStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopPinsDefaultStatusCode { content = content }

        member this.UserAccountAnalyticsTopVideoPins ctx args =
          if true then
            let content = "Success" :> obj :?> TopVideoPinsAnalyticsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopVideoPinsStatusCode200 { content = content }
          else if true then
            let content = "Not authorized to access the user account analytics." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopVideoPinsStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsTopVideoPinsDefaultStatusCode { content = content }

        member this.UserAccountFollowedInterests ctx args =
          if true then
            let content = "Success" :> obj :?> UserAccountFollowedInterests200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountFollowedInterestsStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountFollowedInterestsStatusCode400 { content = content }
          else if true then
            let content = "Authorization failed" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountFollowedInterestsStatusCode401 { content = content }
          else if true then
            let content = "User not found" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountFollowedInterestsStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountFollowedInterestsDefaultStatusCode { content = content }

        member this.UserAccountGet ctx args =
          if true then
            let content = "response" :> obj :?> Account // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountGetStatusCode200 { content = content }
          else if true then
            let content = "Not authorized to access the user account." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountGetStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountGetDefaultStatusCode { content = content }

        member this.UserFollowingGet ctx args =
          if true then
            let content = "response" :> obj :?> UserFollowingGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserFollowingGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserFollowingGetDefaultStatusCode { content = content }

        member this.UserWebsitesGet ctx args =
          if true then
            let content = "Success" :> obj :?> UserWebsitesGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserWebsitesGetStatusCode200 { content = content }
          else if true then
            let content = "Not authorized to access the user website list." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserWebsitesGetStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserWebsitesGetDefaultStatusCode { content = content }

        member this.VerifyWebsiteUpdate ctx args =
          if true then
            let content = "Success" :> obj :?> UserWebsiteSummary // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VerifyWebsiteUpdateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            VerifyWebsiteUpdateDefaultStatusCode { content = content }

        member this.WebsiteVerificationGet ctx  =
          if true then
            let content = "Success" :> obj :?> UserWebsiteVerificationCode // this cast is obviously wrong, and is only intended to allow generated project to compile   
            WebsiteVerificationGetStatusCode200 { content = content }
          else if true then
            let content = "Not authorized to access the user verification code for website claiming." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            WebsiteVerificationGetStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            WebsiteVerificationGetDefaultStatusCode { content = content }

      //#endregion

    let UserAccountApiService = UserAccountApiServiceImpl() :> IUserAccountApiService