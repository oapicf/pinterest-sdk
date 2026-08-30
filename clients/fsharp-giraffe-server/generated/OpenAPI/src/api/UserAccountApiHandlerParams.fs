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
open System.Collections.Generic
open System

module UserAccountApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type BoardsUserFollowsListQueryParams = {
      adAccountId : string option;


      explicitFollowing : bool option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type BoardsUserFollowsListStatusCode200Response = {
      content:BoardsList200Response;
      
    }

    type BoardsUserFollowsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BoardsUserFollowsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BoardsUserFollowsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BoardsUserFollowsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BoardsUserFollowsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BoardsUserFollowsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BoardsUserFollowsListResult = BoardsUserFollowsListStatusCode200 of BoardsUserFollowsListStatusCode200Response|BoardsUserFollowsListStatusCode400 of BoardsUserFollowsListStatusCode400Response|BoardsUserFollowsListStatusCode401 of BoardsUserFollowsListStatusCode401Response|BoardsUserFollowsListStatusCode403 of BoardsUserFollowsListStatusCode403Response|BoardsUserFollowsListStatusCode404 of BoardsUserFollowsListStatusCode404Response|BoardsUserFollowsListStatusCode429 of BoardsUserFollowsListStatusCode429Response|BoardsUserFollowsListDefaultStatusCode of BoardsUserFollowsListDefaultStatusCodeResponse

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
    type FollowUserUpdateBodyParams = FollowUserCreate
    //#endregion


    type FollowUserUpdateStatusCode200Response = {
      content:FollowUser;
      
    }

    type FollowUserUpdateStatusCode201Response = {
      content:FollowUser;
      
    }

    type FollowUserUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type FollowUserUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type FollowUserUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type FollowUserUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type FollowUserUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type FollowUserUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type FollowUserUpdateResult = FollowUserUpdateStatusCode200 of FollowUserUpdateStatusCode200Response|FollowUserUpdateStatusCode201 of FollowUserUpdateStatusCode201Response|FollowUserUpdateStatusCode400 of FollowUserUpdateStatusCode400Response|FollowUserUpdateStatusCode401 of FollowUserUpdateStatusCode401Response|FollowUserUpdateStatusCode403 of FollowUserUpdateStatusCode403Response|FollowUserUpdateStatusCode404 of FollowUserUpdateStatusCode404Response|FollowUserUpdateStatusCode429 of FollowUserUpdateStatusCode429Response|FollowUserUpdateDefaultStatusCode of FollowUserUpdateDefaultStatusCodeResponse

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
      content:PinterestLibError;
      
    }

    type FollowersListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type FollowersListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type FollowersListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type FollowersListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type FollowersListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type FollowersListResult = FollowersListStatusCode200 of FollowersListStatusCode200Response|FollowersListStatusCode400 of FollowersListStatusCode400Response|FollowersListStatusCode401 of FollowersListStatusCode401Response|FollowersListStatusCode403 of FollowersListStatusCode403Response|FollowersListStatusCode404 of FollowersListStatusCode404Response|FollowersListStatusCode429 of FollowersListStatusCode429Response|FollowersListDefaultStatusCode of FollowersListDefaultStatusCodeResponse

    type FollowersListArgs = {
      queryParams:Result<FollowersListQueryParams,string>;
    }


    type LinkedBusinessAccountsGetStatusCode200Response = {
      content:LinkedBusiness[];
      
    }

    type LinkedBusinessAccountsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type LinkedBusinessAccountsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type LinkedBusinessAccountsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type LinkedBusinessAccountsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type LinkedBusinessAccountsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type LinkedBusinessAccountsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type LinkedBusinessAccountsGetResult = LinkedBusinessAccountsGetStatusCode200 of LinkedBusinessAccountsGetStatusCode200Response|LinkedBusinessAccountsGetStatusCode400 of LinkedBusinessAccountsGetStatusCode400Response|LinkedBusinessAccountsGetStatusCode401 of LinkedBusinessAccountsGetStatusCode401Response|LinkedBusinessAccountsGetStatusCode403 of LinkedBusinessAccountsGetStatusCode403Response|LinkedBusinessAccountsGetStatusCode404 of LinkedBusinessAccountsGetStatusCode404Response|LinkedBusinessAccountsGetStatusCode429 of LinkedBusinessAccountsGetStatusCode429Response|LinkedBusinessAccountsGetDefaultStatusCode of LinkedBusinessAccountsGetDefaultStatusCodeResponse


    //#region Query parameters
    [<CLIMutable>]
    type UnverifyWebsiteDeleteQueryParams = {
      website : string ;

    }
    //#endregion


    type UnverifyWebsiteDeleteStatusCode200Response = {
      content:UserWebsite;
      
    }

    type UnverifyWebsiteDeleteStatusCode204Response = {
      content:string;
      
    }

    type UnverifyWebsiteDeleteStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type UnverifyWebsiteDeleteStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type UnverifyWebsiteDeleteStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type UnverifyWebsiteDeleteStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type UnverifyWebsiteDeleteStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type UnverifyWebsiteDeleteDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type UnverifyWebsiteDeleteResult = UnverifyWebsiteDeleteStatusCode200 of UnverifyWebsiteDeleteStatusCode200Response|UnverifyWebsiteDeleteStatusCode204 of UnverifyWebsiteDeleteStatusCode204Response|UnverifyWebsiteDeleteStatusCode400 of UnverifyWebsiteDeleteStatusCode400Response|UnverifyWebsiteDeleteStatusCode401 of UnverifyWebsiteDeleteStatusCode401Response|UnverifyWebsiteDeleteStatusCode403 of UnverifyWebsiteDeleteStatusCode403Response|UnverifyWebsiteDeleteStatusCode404 of UnverifyWebsiteDeleteStatusCode404Response|UnverifyWebsiteDeleteStatusCode429 of UnverifyWebsiteDeleteStatusCode429Response|UnverifyWebsiteDeleteDefaultStatusCode of UnverifyWebsiteDeleteDefaultStatusCodeResponse

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


      metricTypes : QuerymetrictypesItems[] option;


      splitField : string option;


      adAccountId : string option;

    }
    //#endregion


    type UserAccountAnalyticsStatusCode200Response = {
      content:IDictionary<string, AnalyticsMetricsResponse>;
      
    }

    type UserAccountAnalyticsStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type UserAccountAnalyticsResult = UserAccountAnalyticsStatusCode200 of UserAccountAnalyticsStatusCode200Response|UserAccountAnalyticsStatusCode400 of UserAccountAnalyticsStatusCode400Response|UserAccountAnalyticsStatusCode401 of UserAccountAnalyticsStatusCode401Response|UserAccountAnalyticsStatusCode403 of UserAccountAnalyticsStatusCode403Response|UserAccountAnalyticsStatusCode404 of UserAccountAnalyticsStatusCode404Response|UserAccountAnalyticsStatusCode429 of UserAccountAnalyticsStatusCode429Response|UserAccountAnalyticsDefaultStatusCode of UserAccountAnalyticsDefaultStatusCodeResponse

    type UserAccountAnalyticsArgs = {
      queryParams:Result<UserAccountAnalyticsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UserAccountAnalyticsTopPinsQueryParams = {
      startDate : DateTime ;


      endDate : DateTime ;


      sortBy : TopPinsSortBy ;


      fromClaimedContent : string option;


      pinFormat : string option;


      appTypes : string option;


      contentType : string option;


      source : string option;


      metricTypes : QuerymetrictypesItems[] option;


      numOfPins : int option;


      createdInLastNDays : decimal option;


      adAccountId : string option;

    }
    //#endregion


    type UserAccountAnalyticsTopPinsStatusCode200Response = {
      content:TopPinsAnalyticsResponse;
      
    }

    type UserAccountAnalyticsTopPinsStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsTopPinsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsTopPinsStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsTopPinsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsTopPinsStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsTopPinsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type UserAccountAnalyticsTopPinsResult = UserAccountAnalyticsTopPinsStatusCode200 of UserAccountAnalyticsTopPinsStatusCode200Response|UserAccountAnalyticsTopPinsStatusCode400 of UserAccountAnalyticsTopPinsStatusCode400Response|UserAccountAnalyticsTopPinsStatusCode401 of UserAccountAnalyticsTopPinsStatusCode401Response|UserAccountAnalyticsTopPinsStatusCode403 of UserAccountAnalyticsTopPinsStatusCode403Response|UserAccountAnalyticsTopPinsStatusCode404 of UserAccountAnalyticsTopPinsStatusCode404Response|UserAccountAnalyticsTopPinsStatusCode429 of UserAccountAnalyticsTopPinsStatusCode429Response|UserAccountAnalyticsTopPinsDefaultStatusCode of UserAccountAnalyticsTopPinsDefaultStatusCodeResponse

    type UserAccountAnalyticsTopPinsArgs = {
      queryParams:Result<UserAccountAnalyticsTopPinsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UserAccountAnalyticsTopVideoPinsQueryParams = {
      startDate : DateTime ;


      endDate : DateTime ;


      sortBy : TopVideoPinsSortBy ;


      fromClaimedContent : string option;


      pinFormat : string option;


      appTypes : string option;


      contentType : string option;


      source : string option;


      metricTypes : QueryvideopinmetrictypesItems[] option;


      numOfPins : int option;


      createdInLastNDays : decimal option;


      adAccountId : string option;

    }
    //#endregion


    type UserAccountAnalyticsTopVideoPinsStatusCode200Response = {
      content:TopVideoPinsAnalyticsResponse;
      
    }

    type UserAccountAnalyticsTopVideoPinsStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsTopVideoPinsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsTopVideoPinsStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsTopVideoPinsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsTopVideoPinsStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type UserAccountAnalyticsTopVideoPinsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type UserAccountAnalyticsTopVideoPinsResult = UserAccountAnalyticsTopVideoPinsStatusCode200 of UserAccountAnalyticsTopVideoPinsStatusCode200Response|UserAccountAnalyticsTopVideoPinsStatusCode400 of UserAccountAnalyticsTopVideoPinsStatusCode400Response|UserAccountAnalyticsTopVideoPinsStatusCode401 of UserAccountAnalyticsTopVideoPinsStatusCode401Response|UserAccountAnalyticsTopVideoPinsStatusCode403 of UserAccountAnalyticsTopVideoPinsStatusCode403Response|UserAccountAnalyticsTopVideoPinsStatusCode404 of UserAccountAnalyticsTopVideoPinsStatusCode404Response|UserAccountAnalyticsTopVideoPinsStatusCode429 of UserAccountAnalyticsTopVideoPinsStatusCode429Response|UserAccountAnalyticsTopVideoPinsDefaultStatusCode of UserAccountAnalyticsTopVideoPinsDefaultStatusCodeResponse

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
      content:PinterestLibError;
      
    }

    type UserAccountFollowedInterestsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type UserAccountFollowedInterestsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type UserAccountFollowedInterestsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
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

    type UserAccountGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type UserAccountGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type UserAccountGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type UserAccountGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type UserAccountGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type UserAccountGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type UserAccountGetResult = UserAccountGetStatusCode200 of UserAccountGetStatusCode200Response|UserAccountGetStatusCode400 of UserAccountGetStatusCode400Response|UserAccountGetStatusCode401 of UserAccountGetStatusCode401Response|UserAccountGetStatusCode403 of UserAccountGetStatusCode403Response|UserAccountGetStatusCode404 of UserAccountGetStatusCode404Response|UserAccountGetStatusCode429 of UserAccountGetStatusCode429Response|UserAccountGetDefaultStatusCode of UserAccountGetDefaultStatusCodeResponse

    type UserAccountGetArgs = {
      queryParams:Result<UserAccountGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UserFollowingGetQueryParams = {
      adAccountId : string option;


      explicitFollowing : bool option;


      feedType : UserFollowingFeedType option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type UserFollowingGetStatusCode200Response = {
      content:FollowersList200Response;
      
    }

    type UserFollowingGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type UserFollowingGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type UserFollowingGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type UserFollowingGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type UserFollowingGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type UserFollowingGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type UserFollowingGetResult = UserFollowingGetStatusCode200 of UserFollowingGetStatusCode200Response|UserFollowingGetStatusCode400 of UserFollowingGetStatusCode400Response|UserFollowingGetStatusCode401 of UserFollowingGetStatusCode401Response|UserFollowingGetStatusCode403 of UserFollowingGetStatusCode403Response|UserFollowingGetStatusCode404 of UserFollowingGetStatusCode404Response|UserFollowingGetStatusCode429 of UserFollowingGetStatusCode429Response|UserFollowingGetDefaultStatusCode of UserFollowingGetDefaultStatusCodeResponse

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

    type UserWebsitesGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type UserWebsitesGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type UserWebsitesGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type UserWebsitesGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type UserWebsitesGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type UserWebsitesGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type UserWebsitesGetResult = UserWebsitesGetStatusCode200 of UserWebsitesGetStatusCode200Response|UserWebsitesGetStatusCode400 of UserWebsitesGetStatusCode400Response|UserWebsitesGetStatusCode401 of UserWebsitesGetStatusCode401Response|UserWebsitesGetStatusCode403 of UserWebsitesGetStatusCode403Response|UserWebsitesGetStatusCode404 of UserWebsitesGetStatusCode404Response|UserWebsitesGetStatusCode429 of UserWebsitesGetStatusCode429Response|UserWebsitesGetDefaultStatusCode of UserWebsitesGetDefaultStatusCodeResponse

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
    type VerifyWebsiteUpdateBodyParams = UserWebsiteCreate
    //#endregion


    type VerifyWebsiteUpdateStatusCode200Response = {
      content:UserWebsite;
      
    }

    type VerifyWebsiteUpdateStatusCode201Response = {
      content:UserWebsite;
      
    }

    type VerifyWebsiteUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type VerifyWebsiteUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type VerifyWebsiteUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type VerifyWebsiteUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type VerifyWebsiteUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type VerifyWebsiteUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type VerifyWebsiteUpdateResult = VerifyWebsiteUpdateStatusCode200 of VerifyWebsiteUpdateStatusCode200Response|VerifyWebsiteUpdateStatusCode201 of VerifyWebsiteUpdateStatusCode201Response|VerifyWebsiteUpdateStatusCode400 of VerifyWebsiteUpdateStatusCode400Response|VerifyWebsiteUpdateStatusCode401 of VerifyWebsiteUpdateStatusCode401Response|VerifyWebsiteUpdateStatusCode403 of VerifyWebsiteUpdateStatusCode403Response|VerifyWebsiteUpdateStatusCode404 of VerifyWebsiteUpdateStatusCode404Response|VerifyWebsiteUpdateStatusCode429 of VerifyWebsiteUpdateStatusCode429Response|VerifyWebsiteUpdateDefaultStatusCode of VerifyWebsiteUpdateDefaultStatusCodeResponse

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
      content:UserWebsiteVerification;
      
    }

    type WebsiteVerificationGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type WebsiteVerificationGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type WebsiteVerificationGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type WebsiteVerificationGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type WebsiteVerificationGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type WebsiteVerificationGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type WebsiteVerificationGetResult = WebsiteVerificationGetStatusCode200 of WebsiteVerificationGetStatusCode200Response|WebsiteVerificationGetStatusCode400 of WebsiteVerificationGetStatusCode400Response|WebsiteVerificationGetStatusCode401 of WebsiteVerificationGetStatusCode401Response|WebsiteVerificationGetStatusCode403 of WebsiteVerificationGetStatusCode403Response|WebsiteVerificationGetStatusCode404 of WebsiteVerificationGetStatusCode404Response|WebsiteVerificationGetStatusCode429 of WebsiteVerificationGetStatusCode429Response|WebsiteVerificationGetDefaultStatusCode of WebsiteVerificationGetDefaultStatusCodeResponse

    type WebsiteVerificationGetArgs = {
      queryParams:Result<WebsiteVerificationGetQueryParams,string>;
    }
