import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AudienceInsightType, AudienceInsights, AudienceInsightsScopeAndTypeGet200Response,  } from '../models';


@Injectable()
export abstract class AudienceInsightsApi {

  abstract audienceInsightsGet(adAccountId: string, audienceInsightType: AudienceInsightType,  request: Request): AudienceInsights | Promise<AudienceInsights> | Observable<AudienceInsights>;


  abstract audienceInsightsScopeAndTypeGet(adAccountId: string,  request: Request): AudienceInsightsScopeAndTypeGet200Response | Promise<AudienceInsightsScopeAndTypeGet200Response> | Observable<AudienceInsightsScopeAndTypeGet200Response>;

} 