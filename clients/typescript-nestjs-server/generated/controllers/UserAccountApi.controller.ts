import { Body, Controller, DefaultValuePipe, Delete, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { UserAccountApi } from '../api';
import { 30, Account, BoardsList200Response, FollowUser, FollowUserCreate, FollowersList200Response, LinkedBusiness, QuerymetrictypesItems, QueryvideopinmetrictypesItems, TopPinsAnalyticsResponse, TopPinsSortBy, TopVideoPinsAnalyticsResponse, TopVideoPinsSortBy, UserAccountFollowedInterests200Response, UserFollowingFeedType, UserWebsite, UserWebsiteCreate, UserWebsiteVerification, UserWebsitesGet200Response,  } from '../models';

@Controller()
export class UserAccountApiController {
  constructor(private readonly userAccountApi: UserAccountApi) {}

  @Get('/user_account/following/boards')
  boardsUserFollowsList(@Query('ad_account_id') adAccountId: string | undefined, @Query('explicit_following', new DefaultValuePipe(false)) explicitFollowing: boolean | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): BoardsList200Response | Promise<BoardsList200Response> | Observable<BoardsList200Response> {
    return this.userAccountApi.boardsUserFollowsList(adAccountId, explicitFollowing, bookmark, pageSize, request);
  }

  @Post('/user_account/following/:username')
  followUserUpdate(@Param('username') username: string, @Body() followUserCreate: FollowUserCreate, @Req() request: Request): FollowUser | Promise<FollowUser> | Observable<FollowUser> {
    return this.userAccountApi.followUserUpdate(username, followUserCreate, request);
  }

  @Get('/user_account/followers')
  followersList(@Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): FollowersList200Response | Promise<FollowersList200Response> | Observable<FollowersList200Response> {
    return this.userAccountApi.followersList(bookmark, pageSize, request);
  }

  @Get('/user_account/businesses')
  linkedBusinessAccountsGet(@Req() request: Request): Array<LinkedBusiness> | Promise<Array<LinkedBusiness>> | Observable<Array<LinkedBusiness>> {
    return this.userAccountApi.linkedBusinessAccountsGet(request);
  }

  @Delete('/user_account/websites')
  unverifyWebsiteDelete(@Query('website') website: string, @Req() request: Request): UserWebsite | Promise<UserWebsite> | Observable<UserWebsite> {
    return this.userAccountApi.unverifyWebsiteDelete(website, request);
  }

  @Get('/user_account/analytics')
  userAccountAnalytics(@Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('from_claimed_content', new DefaultValuePipe('BOTH')) fromClaimedContent: 'OTHER' | 'CLAIMED' | 'BOTH' | undefined, @Query('pin_format', new DefaultValuePipe('ALL')) pinFormat: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | undefined, @Query('app_types', new DefaultValuePipe('ALL')) appTypes: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | undefined, @Query('content_type', new DefaultValuePipe('ALL')) contentType: 'ALL' | 'PAID' | 'ORGANIC' | undefined, @Query('source', new DefaultValuePipe('ALL')) source: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS' | undefined, @Query('metric_types') metricTypes: Array<QuerymetrictypesItems> | undefined, @Query('split_field', new DefaultValuePipe('NO_SPLIT')) splitField: 'NO_SPLIT' | 'APP_TYPE' | 'OWNED_CONTENT' | 'SOURCE' | 'PIN_FORMAT' | undefined, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): { [key: string]: AnalyticsMetricsResponse; } | Promise<{ [key: string]: AnalyticsMetricsResponse; }> | Observable<{ [key: string]: AnalyticsMetricsResponse; }> {
    return this.userAccountApi.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId, request);
  }

  @Get('/user_account/analytics/top_pins')
  userAccountAnalyticsTopPins(@Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('sort_by') sortBy: TopPinsSortBy, @Query('from_claimed_content', new DefaultValuePipe('BOTH')) fromClaimedContent: 'OTHER' | 'CLAIMED' | 'BOTH' | undefined, @Query('pin_format', new DefaultValuePipe('ALL')) pinFormat: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | undefined, @Query('app_types', new DefaultValuePipe('ALL')) appTypes: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | undefined, @Query('content_type', new DefaultValuePipe('ALL')) contentType: 'ALL' | 'PAID' | 'ORGANIC' | undefined, @Query('source', new DefaultValuePipe('ALL')) source: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS' | undefined, @Query('metric_types') metricTypes: Array<QuerymetrictypesItems> | undefined, @Query('num_of_pins', new DefaultValuePipe(10)) numOfPins: number | undefined, @Query('created_in_last_n_days', new ParseIntPipe({optional: true})) createdInLastNDays: 30 | undefined, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): TopPinsAnalyticsResponse | Promise<TopPinsAnalyticsResponse> | Observable<TopPinsAnalyticsResponse> {
    return this.userAccountApi.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId, request);
  }

  @Get('/user_account/analytics/top_video_pins')
  userAccountAnalyticsTopVideoPins(@Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('sort_by') sortBy: TopVideoPinsSortBy, @Query('from_claimed_content', new DefaultValuePipe('BOTH')) fromClaimedContent: 'OTHER' | 'CLAIMED' | 'BOTH' | undefined, @Query('pin_format', new DefaultValuePipe('ALL')) pinFormat: 'ALL' | 'ORGANIC_IMAGE' | 'ORGANIC_PRODUCT' | 'ORGANIC_VIDEO' | 'ADS_STANDARD' | 'ADS_PRODUCT' | 'ADS_VIDEO' | 'ADS_IDEA' | undefined, @Query('app_types', new DefaultValuePipe('ALL')) appTypes: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | undefined, @Query('content_type', new DefaultValuePipe('ALL')) contentType: 'ALL' | 'PAID' | 'ORGANIC' | undefined, @Query('source', new DefaultValuePipe('ALL')) source: 'ALL' | 'YOUR_PINS' | 'OTHER_PINS' | undefined, @Query('metric_types') metricTypes: Array<QueryvideopinmetrictypesItems> | undefined, @Query('num_of_pins', new DefaultValuePipe(10)) numOfPins: number | undefined, @Query('created_in_last_n_days', new ParseIntPipe({optional: true})) createdInLastNDays: 30 | undefined, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): TopVideoPinsAnalyticsResponse | Promise<TopVideoPinsAnalyticsResponse> | Observable<TopVideoPinsAnalyticsResponse> {
    return this.userAccountApi.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId, request);
  }

  @Get('/users/:username/interests/follow')
  userAccountFollowedInterests(@Param('username') username: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): UserAccountFollowedInterests200Response | Promise<UserAccountFollowedInterests200Response> | Observable<UserAccountFollowedInterests200Response> {
    return this.userAccountApi.userAccountFollowedInterests(username, bookmark, pageSize, request);
  }

  @Get('/user_account')
  userAccountGet(@Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): Account | Promise<Account> | Observable<Account> {
    return this.userAccountApi.userAccountGet(adAccountId, request);
  }

  @Get('/user_account/following')
  userFollowingGet(@Query('ad_account_id') adAccountId: string | undefined, @Query('explicit_following', new DefaultValuePipe(false)) explicitFollowing: boolean | undefined, @Query('feed_type') feedType: UserFollowingFeedType | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): FollowersList200Response | Promise<FollowersList200Response> | Observable<FollowersList200Response> {
    return this.userAccountApi.userFollowingGet(adAccountId, explicitFollowing, feedType, bookmark, pageSize, request);
  }

  @Get('/user_account/websites')
  userWebsitesGet(@Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): UserWebsitesGet200Response | Promise<UserWebsitesGet200Response> | Observable<UserWebsitesGet200Response> {
    return this.userAccountApi.userWebsitesGet(bookmark, pageSize, request);
  }

  @Post('/user_account/websites')
  verifyWebsiteUpdate(@Body() userWebsiteCreate: UserWebsiteCreate, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): UserWebsite | Promise<UserWebsite> | Observable<UserWebsite> {
    return this.userAccountApi.verifyWebsiteUpdate(userWebsiteCreate, adAccountId, request);
  }

  @Get('/user_account/websites/verification')
  websiteVerificationGet(@Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): UserWebsiteVerification | Promise<UserWebsiteVerification> | Observable<UserWebsiteVerification> {
    return this.userAccountApi.websiteVerificationGet(adAccountId, request);
  }

} 