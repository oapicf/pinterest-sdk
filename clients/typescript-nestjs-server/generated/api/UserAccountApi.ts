import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { 30, Account, BoardsList200Response, FollowUser, FollowUserCreate, FollowersList200Response, LinkedBusiness, QuerymetrictypesItems, QueryvideopinmetrictypesItems, TopPinsAnalyticsResponse, TopPinsSortBy, TopVideoPinsAnalyticsResponse, TopVideoPinsSortBy, UserAccountFollowedInterests200Response, UserFollowingFeedType, UserWebsite, UserWebsiteCreate, UserWebsiteVerification, UserWebsitesGet200Response,  } from '../models';


@Injectable()
export abstract class UserAccountApi {

  abstract boardsUserFollowsList(adAccountId: string | undefined, explicitFollowing: boolean | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): BoardsList200Response | Promise<BoardsList200Response> | Observable<BoardsList200Response>;


  abstract followUserUpdate(username: string, followUserCreate: FollowUserCreate,  request: Request): FollowUser | Promise<FollowUser> | Observable<FollowUser>;


  abstract followersList(bookmark: string | undefined, pageSize: number | undefined,  request: Request): FollowersList200Response | Promise<FollowersList200Response> | Observable<FollowersList200Response>;


  abstract linkedBusinessAccountsGet( request: Request): Array<LinkedBusiness> | Promise<Array<LinkedBusiness>> | Observable<Array<LinkedBusiness>>;


  abstract unverifyWebsiteDelete(website: string,  request: Request): UserWebsite | Promise<UserWebsite> | Observable<UserWebsite>;


  abstract userAccountAnalytics(startDate: string, endDate: string, fromClaimedContent: 'OTHER' | 'CLAIMED' | 'BOTH' | undefined, pinFormat: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | undefined, appTypes: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | undefined, contentType: 'ALL' | 'PAID' | 'ORGANIC' | undefined, source: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS' | undefined, metricTypes: Array<QuerymetrictypesItems> | undefined, splitField: 'NO_SPLIT' | 'APP_TYPE' | 'OWNED_CONTENT' | 'SOURCE' | 'PIN_FORMAT' | undefined, adAccountId: string | undefined,  request: Request): { [key: string]: AnalyticsMetricsResponse; } | Promise<{ [key: string]: AnalyticsMetricsResponse; }> | Observable<{ [key: string]: AnalyticsMetricsResponse; }>;


  abstract userAccountAnalyticsTopPins(startDate: string, endDate: string, sortBy: TopPinsSortBy, fromClaimedContent: 'OTHER' | 'CLAIMED' | 'BOTH' | undefined, pinFormat: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | undefined, appTypes: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | undefined, contentType: 'ALL' | 'PAID' | 'ORGANIC' | undefined, source: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS' | undefined, metricTypes: Array<QuerymetrictypesItems> | undefined, numOfPins: number | undefined, createdInLastNDays: 30 | undefined, adAccountId: string | undefined,  request: Request): TopPinsAnalyticsResponse | Promise<TopPinsAnalyticsResponse> | Observable<TopPinsAnalyticsResponse>;


  abstract userAccountAnalyticsTopVideoPins(startDate: string, endDate: string, sortBy: TopVideoPinsSortBy, fromClaimedContent: 'OTHER' | 'CLAIMED' | 'BOTH' | undefined, pinFormat: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | undefined, appTypes: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | undefined, contentType: 'ALL' | 'PAID' | 'ORGANIC' | undefined, source: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS' | undefined, metricTypes: Array<QueryvideopinmetrictypesItems> | undefined, numOfPins: number | undefined, createdInLastNDays: 30 | undefined, adAccountId: string | undefined,  request: Request): TopVideoPinsAnalyticsResponse | Promise<TopVideoPinsAnalyticsResponse> | Observable<TopVideoPinsAnalyticsResponse>;


  abstract userAccountFollowedInterests(username: string, bookmark: string | undefined, pageSize: number | undefined,  request: Request): UserAccountFollowedInterests200Response | Promise<UserAccountFollowedInterests200Response> | Observable<UserAccountFollowedInterests200Response>;


  abstract userAccountGet(adAccountId: string | undefined,  request: Request): Account | Promise<Account> | Observable<Account>;


  abstract userFollowingGet(adAccountId: string | undefined, explicitFollowing: boolean | undefined, feedType: UserFollowingFeedType | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): FollowersList200Response | Promise<FollowersList200Response> | Observable<FollowersList200Response>;


  abstract userWebsitesGet(bookmark: string | undefined, pageSize: number | undefined,  request: Request): UserWebsitesGet200Response | Promise<UserWebsitesGet200Response> | Observable<UserWebsitesGet200Response>;


  abstract verifyWebsiteUpdate(userWebsiteCreate: UserWebsiteCreate, adAccountId: string | undefined,  request: Request): UserWebsite | Promise<UserWebsite> | Observable<UserWebsite>;


  abstract websiteVerificationGet(adAccountId: string | undefined,  request: Request): UserWebsiteVerification | Promise<UserWebsiteVerification> | Observable<UserWebsiteVerification>;

} 