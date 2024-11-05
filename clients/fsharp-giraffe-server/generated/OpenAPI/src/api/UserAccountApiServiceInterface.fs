namespace OpenAPI
open UserAccountApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module UserAccountApiServiceInterface =

    //#region Service interface
    type IUserAccountApiService =
      abstract member BoardsUserFollowsList:HttpContext -> BoardsUserFollowsListArgs->BoardsUserFollowsListResult
      abstract member FollowUserUpdate:HttpContext -> FollowUserUpdateArgs->FollowUserUpdateResult
      abstract member FollowersList:HttpContext -> FollowersListArgs->FollowersListResult
      abstract member LinkedBusinessAccountsGet:HttpContext ->LinkedBusinessAccountsGetResult
      abstract member UnverifyWebsiteDelete:HttpContext -> UnverifyWebsiteDeleteArgs->UnverifyWebsiteDeleteResult
      abstract member UserAccountAnalytics:HttpContext -> UserAccountAnalyticsArgs->UserAccountAnalyticsResult
      abstract member UserAccountAnalyticsTopPins:HttpContext -> UserAccountAnalyticsTopPinsArgs->UserAccountAnalyticsTopPinsResult
      abstract member UserAccountAnalyticsTopVideoPins:HttpContext -> UserAccountAnalyticsTopVideoPinsArgs->UserAccountAnalyticsTopVideoPinsResult
      abstract member UserAccountFollowedInterests:HttpContext -> UserAccountFollowedInterestsArgs->UserAccountFollowedInterestsResult
      abstract member UserAccountGet:HttpContext -> UserAccountGetArgs->UserAccountGetResult
      abstract member UserFollowingGet:HttpContext -> UserFollowingGetArgs->UserFollowingGetResult
      abstract member UserWebsitesGet:HttpContext -> UserWebsitesGetArgs->UserWebsitesGetResult
      abstract member VerifyWebsiteUpdate:HttpContext -> VerifyWebsiteUpdateArgs->VerifyWebsiteUpdateResult
      abstract member WebsiteVerificationGet:HttpContext -> WebsiteVerificationGetArgs->WebsiteVerificationGetResult
    //#endregion