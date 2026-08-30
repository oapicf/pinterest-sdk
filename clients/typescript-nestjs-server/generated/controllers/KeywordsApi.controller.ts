import { Body, Controller, DefaultValuePipe, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { KeywordsApi } from '../api';
import { Keywords, KeywordsCreate, KeywordsGet200Response, KeywordsMetricsArrayResponse, KeywordsUpdate, MatchType, TrendType, TrendingKeywordsResponse, TrendsAgeBucket, TrendsGenderFilter, TrendsL1Interest, TrendsSupportedRegion,  } from '../models';

@Controller()
export class KeywordsApiController {
  constructor(private readonly keywordsApi: KeywordsApi) {}

  @Get('/ad_accounts/:ad_account_id/keywords/metrics')
  countryKeywordsMetricsGet(@Param('ad_account_id') adAccountId: string, @Query('country_code') countryCode: string, @Query('keywords') keywords: Array<string>, @Req() request: Request): KeywordsMetricsArrayResponse | Promise<KeywordsMetricsArrayResponse> | Observable<KeywordsMetricsArrayResponse> {
    return this.keywordsApi.countryKeywordsMetricsGet(adAccountId, countryCode, keywords, request);
  }

  @Post('/ad_accounts/:ad_account_id/keywords')
  keywordsCreate(@Param('ad_account_id') adAccountId: string, @Body() keywordsCreate: KeywordsCreate, @Req() request: Request): Keywords | Promise<Keywords> | Observable<Keywords> {
    return this.keywordsApi.keywordsCreate(adAccountId, keywordsCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/keywords')
  keywordsGet(@Param('ad_account_id') adAccountId: string, @Query('campaign_id') campaignId: string | undefined, @Query('ad_group_id') adGroupId: string | undefined, @Query('ad_group_ids') adGroupIds: Array<string> | undefined, @Query('match_types') matchTypes: Array<MatchType> | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): KeywordsGet200Response | Promise<KeywordsGet200Response> | Observable<KeywordsGet200Response> {
    return this.keywordsApi.keywordsGet(adAccountId, campaignId, adGroupId, adGroupIds, matchTypes, bookmark, pageSize, request);
  }

  @Patch('/ad_accounts/:ad_account_id/keywords')
  keywordsUpdate(@Param('ad_account_id') adAccountId: string, @Body() keywordsUpdate: KeywordsUpdate, @Req() request: Request): Keywords | Promise<Keywords> | Observable<Keywords> {
    return this.keywordsApi.keywordsUpdate(adAccountId, keywordsUpdate, request);
  }

  @Get('/trends/keywords/:region/top/:trend_type')
  trendingKeywordsList(@Param('region') region: TrendsSupportedRegion, @Param('trend_type') trendType: TrendType, @Query('interests') interests: Array<TrendsL1Interest> | undefined, @Query('genders') genders: Array<TrendsGenderFilter> | undefined, @Query('ages') ages: Array<TrendsAgeBucket> | undefined, @Query('include_keywords') includeKeywords: Array<string> | undefined, @Query('normalize_against_group', new DefaultValuePipe(false)) normalizeAgainstGroup: boolean | undefined, @Query('limit', new DefaultValuePipe(50)) limit: number | undefined, @Query('include_demographics', new DefaultValuePipe(false)) includeDemographics: boolean | undefined, @Req() request: Request): TrendingKeywordsResponse | Promise<TrendingKeywordsResponse> | Observable<TrendingKeywordsResponse> {
    return this.keywordsApi.trendingKeywordsList(region, trendType, interests, genders, ages, includeKeywords, normalizeAgainstGroup, limit, includeDemographics, request);
  }

} 