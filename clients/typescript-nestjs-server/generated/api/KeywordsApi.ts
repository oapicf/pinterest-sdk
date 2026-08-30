import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Keywords, KeywordsCreate, KeywordsGet200Response, KeywordsMetricsArrayResponse, KeywordsUpdate, MatchType, TrendType, TrendingKeywordsResponse, TrendsAgeBucket, TrendsGenderFilter, TrendsL1Interest, TrendsSupportedRegion,  } from '../models';


@Injectable()
export abstract class KeywordsApi {

  abstract countryKeywordsMetricsGet(adAccountId: string, countryCode: string, keywords: Array<string>,  request: Request): KeywordsMetricsArrayResponse | Promise<KeywordsMetricsArrayResponse> | Observable<KeywordsMetricsArrayResponse>;


  abstract keywordsCreate(adAccountId: string, keywordsCreate: KeywordsCreate,  request: Request): Keywords | Promise<Keywords> | Observable<Keywords>;


  abstract keywordsGet(adAccountId: string, campaignId: string | undefined, adGroupId: string | undefined, adGroupIds: Array<string> | undefined, matchTypes: Array<MatchType> | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): KeywordsGet200Response | Promise<KeywordsGet200Response> | Observable<KeywordsGet200Response>;


  abstract keywordsUpdate(adAccountId: string, keywordsUpdate: KeywordsUpdate,  request: Request): Keywords | Promise<Keywords> | Observable<Keywords>;


  abstract trendingKeywordsList(region: TrendsSupportedRegion, trendType: TrendType, interests: Array<TrendsL1Interest> | undefined, genders: Array<TrendsGenderFilter> | undefined, ages: Array<TrendsAgeBucket> | undefined, includeKeywords: Array<string> | undefined, normalizeAgainstGroup: boolean | undefined, limit: number | undefined, includeDemographics: boolean | undefined,  request: Request): TrendingKeywordsResponse | Promise<TrendingKeywordsResponse> | Observable<TrendingKeywordsResponse>;

} 