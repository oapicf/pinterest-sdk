namespace OpenAPI
open UserAccountApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module UserAccountApiServiceInterface =

    //#region Service interface
    type IUserAccountApiService =
      abstract member BoardsUserFollowsList : unit -> BoardsUserFollowsListResult
      abstract member FollowUserUpdate : FollowUserUpdateBodyParams -> FollowUserUpdateResult
      abstract member FollowersList : unit -> FollowersListResult
      abstract member LinkedBusinessAccountsGet : unit -> LinkedBusinessAccountsGetResult
      abstract member UnverifyWebsiteDelete : unit -> UnverifyWebsiteDeleteResult
      abstract member UserAccountAnalytics : unit -> UserAccountAnalyticsResult
      abstract member UserAccountAnalyticsTopPins : unit -> UserAccountAnalyticsTopPinsResult
      abstract member UserAccountAnalyticsTopVideoPins : unit -> UserAccountAnalyticsTopVideoPinsResult
      abstract member UserAccountFollowedInterests : unit -> UserAccountFollowedInterestsResult
      abstract member UserAccountGet : unit -> UserAccountGetResult
      abstract member UserFollowingGet : unit -> UserFollowingGetResult
      abstract member UserWebsitesGet : unit -> UserWebsitesGetResult
      abstract member VerifyWebsiteUpdate : VerifyWebsiteUpdateBodyParams -> VerifyWebsiteUpdateResult
      abstract member WebsiteVerificationGet : unit -> WebsiteVerificationGetResult
    //#endregion