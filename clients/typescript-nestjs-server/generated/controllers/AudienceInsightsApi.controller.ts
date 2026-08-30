import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { AudienceInsightsApi } from '../api';
import { AudienceInsightType, AudienceInsights, AudienceInsightsScopeAndTypeGet200Response,  } from '../models';

@Controller()
export class AudienceInsightsApiController {
  constructor(private readonly audienceInsightsApi: AudienceInsightsApi) {}

  @Get('/ad_accounts/:ad_account_id/audience_insights')
  audienceInsightsGet(@Param('ad_account_id') adAccountId: string, @Query('audience_insight_type') audienceInsightType: AudienceInsightType, @Req() request: Request): AudienceInsights | Promise<AudienceInsights> | Observable<AudienceInsights> {
    return this.audienceInsightsApi.audienceInsightsGet(adAccountId, audienceInsightType, request);
  }

  @Get('/ad_accounts/:ad_account_id/insights/audiences')
  audienceInsightsScopeAndTypeGet(@Param('ad_account_id') adAccountId: string, @Req() request: Request): AudienceInsightsScopeAndTypeGet200Response | Promise<AudienceInsightsScopeAndTypeGet200Response> | Observable<AudienceInsightsScopeAndTypeGet200Response> {
    return this.audienceInsightsApi.audienceInsightsScopeAndTypeGet(adAccountId, request);
  }

} 