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
open System.Collections.Generic
open System

module UserAccountApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type BoardsUserFollowsListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      explicitFollowing : bool option;


      adAccountId : string option;

    }
    //#endregion


    type BoardsUserFollowsListStatusCode200Response = {
      content:BoardsUserFollowsList200Response;
      
    }

    type BoardsUserFollowsListStatusCode400Response = {
      content:Error;
      
    }

    type BoardsUserFollowsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BoardsUserFollowsListResult = BoardsUserFollowsListStatusCode200 of BoardsUserFollowsListStatusCode200Response|BoardsUserFollowsListStatusCode400 of BoardsUserFollowsListStatusCode400Response|BoardsUserFollowsListDefaultStatusCode of BoardsUserFollowsListDefaultStatusCodeResponse

    type BoardsUserFollowsListArgs = {
      queryParams:Result<BoardsUserFollowsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type FollowUserUpdatePathParams = {
      username : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type FollowUserUpdateBodyParams = FollowUserRequest
    //#endregion


    type FollowUserUpdateStatusCode200Response = {
      content:UserSummary;
      
    }

    type FollowUserUpdateStatusCode404Response = {
      content:Error;
      
    }

    type FollowUserUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FollowUserUpdateResult = FollowUserUpdateStatusCode200 of FollowUserUpdateStatusCode200Response|FollowUserUpdateStatusCode404 of FollowUserUpdateStatusCode404Response|FollowUserUpdateDefaultStatusCode of FollowUserUpdateDefaultStatusCodeResponse

    type FollowUserUpdateArgs = {
      pathParams:FollowUserUpdatePathParams;
      bodyParams:FollowUserUpdateBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type FollowersListQueryParams = {
      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type FollowersListStatusCode200Response = {
      content:FollowersList200Response;
      
    }

    type FollowersListStatusCode400Response = {
      content:Error;
      
    }

    type FollowersListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FollowersListResult = FollowersListStatusCode200 of FollowersListStatusCode200Response|FollowersListStatusCode400 of FollowersListStatusCode400Response|FollowersListDefaultStatusCode of FollowersListDefaultStatusCodeResponse

    type FollowersListArgs = {
      queryParams:Result<FollowersListQueryParams,string>;
    }


    type LinkedBusinessAccountsGetStatusCode200Response = {
      content:LinkedBusiness[];
      
    }

    type LinkedBusinessAccountsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type LinkedBusinessAccountsGetResult = LinkedBusinessAccountsGetStatusCode200 of LinkedBusinessAccountsGetStatusCode200Response|LinkedBusinessAccountsGetDefaultStatusCode of LinkedBusinessAccountsGetDefaultStatusCodeResponse


    //#region Query parameters
    [<CLIMutable>]
    type UnverifyWebsiteDeleteQueryParams = {
      website : string ;

    }
    //#endregion


    type UnverifyWebsiteDeleteStatusCode204Response = {
      content:string;
      
    }

    type UnverifyWebsiteDeleteStatusCode404Response = {
      content:Error;
      
    }

    type UnverifyWebsiteDeleteDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UnverifyWebsiteDeleteResult = UnverifyWebsiteDeleteStatusCode204 of UnverifyWebsiteDeleteStatusCode204Response|UnverifyWebsiteDeleteStatusCode404 of UnverifyWebsiteDeleteStatusCode404Response|UnverifyWebsiteDeleteDefaultStatusCode of UnverifyWebsiteDeleteDefaultStatusCodeResponse

    type UnverifyWebsiteDeleteArgs = {
      queryParams:Result<UnverifyWebsiteDeleteQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UserAccountAnalyticsQueryParams = {
      startDate : DateTime ;


      endDate : DateTime ;


      fromClaimedContent : string option;


      pinFormat : string option;


      appTypes : string option;


      contentType : string option;


      source : string option;


      metricTypes : string[] option;


      splitField : string option;


      adAccountId : string option;

    }
    //#endregion


    type UserAccountAnalyticsStatusCode200Response = {
      content:IDictionary<string, AnalyticsMetricsResponse>;
      
    }

    type UserAccountAnalyticsStatusCode400Response = {
      content:Error;
      
    }

    type UserAccountAnalyticsStatusCode403Response = {
      content:Error;
      
    }

    type UserAccountAnalyticsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UserAccountAnalyticsResult = UserAccountAnalyticsStatusCode200 of UserAccountAnalyticsStatusCode200Response|UserAccountAnalyticsStatusCode400 of UserAccountAnalyticsStatusCode400Response|UserAccountAnalyticsStatusCode403 of UserAccountAnalyticsStatusCode403Response|UserAccountAnalyticsDefaultStatusCode of UserAccountAnalyticsDefaultStatusCodeResponse

    type UserAccountAnalyticsArgs = {
      queryParams:Result<UserAccountAnalyticsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UserAccountAnalyticsTopPinsQueryParams = {
      startDate : DateTime ;


      endDate : DateTime ;


      sortBy : string ;


      fromClaimedContent : string option;


      pinFormat : string option;


      appTypes : string option;


      contentType : string option;


      source : string option;


      metricTypes : string[] option;


      numOfPins : int option;


      createdInLastNDays : int option;


      adAccountId : string option;

    }
    //#endregion


    type UserAccountAnalyticsTopPinsStatusCode200Response = {
      content:TopPinsAnalyticsResponse;
      
    }

    type UserAccountAnalyticsTopPinsStatusCode403Response = {
      content:Error;
      
    }

    type UserAccountAnalyticsTopPinsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UserAccountAnalyticsTopPinsResult = UserAccountAnalyticsTopPinsStatusCode200 of UserAccountAnalyticsTopPinsStatusCode200Response|UserAccountAnalyticsTopPinsStatusCode403 of UserAccountAnalyticsTopPinsStatusCode403Response|UserAccountAnalyticsTopPinsDefaultStatusCode of UserAccountAnalyticsTopPinsDefaultStatusCodeResponse

    type UserAccountAnalyticsTopPinsArgs = {
      queryParams:Result<UserAccountAnalyticsTopPinsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UserAccountAnalyticsTopVideoPinsQueryParams = {
      startDate : DateTime ;


      endDate : DateTime ;


      sortBy : string ;


      fromClaimedContent : string option;


      pinFormat : string option;


      appTypes : string option;


      contentType : string option;


      source : string option;


      metricTypes : string[] option;


      numOfPins : int option;


      createdInLastNDays : int option;


      adAccountId : string option;

    }
    //#endregion


    type UserAccountAnalyticsTopVideoPinsStatusCode200Response = {
      content:TopVideoPinsAnalyticsResponse;
      
    }

    type UserAccountAnalyticsTopVideoPinsStatusCode403Response = {
      content:Error;
      
    }

    type UserAccountAnalyticsTopVideoPinsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UserAccountAnalyticsTopVideoPinsResult = UserAccountAnalyticsTopVideoPinsStatusCode200 of UserAccountAnalyticsTopVideoPinsStatusCode200Response|UserAccountAnalyticsTopVideoPinsStatusCode403 of UserAccountAnalyticsTopVideoPinsStatusCode403Response|UserAccountAnalyticsTopVideoPinsDefaultStatusCode of UserAccountAnalyticsTopVideoPinsDefaultStatusCodeResponse

    type UserAccountAnalyticsTopVideoPinsArgs = {
      queryParams:Result<UserAccountAnalyticsTopVideoPinsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type UserAccountFollowedInterestsPathParams = {
      username : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type UserAccountFollowedInterestsQueryParams = {
      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type UserAccountFollowedInterestsStatusCode200Response = {
      content:UserAccountFollowedInterests200Response;
      
    }

    type UserAccountFollowedInterestsStatusCode400Response = {
      content:Error;
      
    }

    type UserAccountFollowedInterestsStatusCode401Response = {
      content:Error;
      
    }

    type UserAccountFollowedInterestsStatusCode404Response = {
      content:Error;
      
    }

    type UserAccountFollowedInterestsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UserAccountFollowedInterestsResult = UserAccountFollowedInterestsStatusCode200 of UserAccountFollowedInterestsStatusCode200Response|UserAccountFollowedInterestsStatusCode400 of UserAccountFollowedInterestsStatusCode400Response|UserAccountFollowedInterestsStatusCode401 of UserAccountFollowedInterestsStatusCode401Response|UserAccountFollowedInterestsStatusCode404 of UserAccountFollowedInterestsStatusCode404Response|UserAccountFollowedInterestsDefaultStatusCode of UserAccountFollowedInterestsDefaultStatusCodeResponse

    type UserAccountFollowedInterestsArgs = {
      pathParams:UserAccountFollowedInterestsPathParams;
      queryParams:Result<UserAccountFollowedInterestsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UserAccountGetQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type UserAccountGetStatusCode200Response = {
      content:Account;
      
    }

    type UserAccountGetStatusCode403Response = {
      content:Error;
      
    }

    type UserAccountGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UserAccountGetResult = UserAccountGetStatusCode200 of UserAccountGetStatusCode200Response|UserAccountGetStatusCode403 of UserAccountGetStatusCode403Response|UserAccountGetDefaultStatusCode of UserAccountGetDefaultStatusCodeResponse

    type UserAccountGetArgs = {
      queryParams:Result<UserAccountGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UserFollowingGetQueryParams = {
      bookmark : string option;


      pageSize : int option;


      feedType : UserFollowingFeedType option;


      explicitFollowing : bool option;


      adAccountId : string option;

    }
    //#endregion


    type UserFollowingGetStatusCode200Response = {
      content:UserFollowingGet200Response;
      
    }

    type UserFollowingGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UserFollowingGetResult = UserFollowingGetStatusCode200 of UserFollowingGetStatusCode200Response|UserFollowingGetDefaultStatusCode of UserFollowingGetDefaultStatusCodeResponse

    type UserFollowingGetArgs = {
      queryParams:Result<UserFollowingGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UserWebsitesGetQueryParams = {
      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type UserWebsitesGetStatusCode200Response = {
      content:UserWebsitesGet200Response;
      
    }

    type UserWebsitesGetStatusCode403Response = {
      content:Error;
      
    }

    type UserWebsitesGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UserWebsitesGetResult = UserWebsitesGetStatusCode200 of UserWebsitesGetStatusCode200Response|UserWebsitesGetStatusCode403 of UserWebsitesGetStatusCode403Response|UserWebsitesGetDefaultStatusCode of UserWebsitesGetDefaultStatusCodeResponse

    type UserWebsitesGetArgs = {
      queryParams:Result<UserWebsitesGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type VerifyWebsiteUpdateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type VerifyWebsiteUpdateBodyParams = UserWebsiteVerifyRequest
    //#endregion


    type VerifyWebsiteUpdateStatusCode200Response = {
      content:UserWebsiteSummary;
      
    }

    type VerifyWebsiteUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type VerifyWebsiteUpdateResult = VerifyWebsiteUpdateStatusCode200 of VerifyWebsiteUpdateStatusCode200Response|VerifyWebsiteUpdateDefaultStatusCode of VerifyWebsiteUpdateDefaultStatusCodeResponse

    type VerifyWebsiteUpdateArgs = {
      queryParams:Result<VerifyWebsiteUpdateQueryParams,string>;
      bodyParams:VerifyWebsiteUpdateBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type WebsiteVerificationGetQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type WebsiteVerificationGetStatusCode200Response = {
      content:UserWebsiteVerificationCode;
      
    }

    type WebsiteVerificationGetStatusCode403Response = {
      content:Error;
      
    }

    type WebsiteVerificationGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type WebsiteVerificationGetResult = WebsiteVerificationGetStatusCode200 of WebsiteVerificationGetStatusCode200Response|WebsiteVerificationGetStatusCode403 of WebsiteVerificationGetStatusCode403Response|WebsiteVerificationGetDefaultStatusCode of WebsiteVerificationGetDefaultStatusCodeResponse

    type WebsiteVerificationGetArgs = {
      queryParams:Result<WebsiteVerificationGetQueryParams,string>;
    }
