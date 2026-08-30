import { Body, Controller, DefaultValuePipe, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { AudiencesApi } from '../api';
import { AdAccountsAudience, AdAccountsAudienceCreate, AdAccountsAudienceUpdate, AudienceOwnershipType, AudiencesList200Response, PinterestLibPaginationOrder,  } from '../models';

@Controller()
export class AudiencesApiController {
  constructor(private readonly audiencesApi: AudiencesApi) {}

  @Post('/ad_accounts/:ad_account_id/audiences')
  audiencesCreate(@Param('ad_account_id') adAccountId: string, @Body() adAccountsAudienceCreate: AdAccountsAudienceCreate, @Req() request: Request): AdAccountsAudience | Promise<AdAccountsAudience> | Observable<AdAccountsAudience> {
    return this.audiencesApi.audiencesCreate(adAccountId, adAccountsAudienceCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/audiences/:audience_id')
  audiencesGet(@Param('audience_id') audienceId: string, @Param('ad_account_id') adAccountId: string, @Req() request: Request): AdAccountsAudience | Promise<AdAccountsAudience> | Observable<AdAccountsAudience> {
    return this.audiencesApi.audiencesGet(audienceId, adAccountId, request);
  }

  @Get('/ad_accounts/:ad_account_id/audiences')
  audiencesList(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Query('ownership_type') ownershipType: AudienceOwnershipType | undefined, @Query('exclude_nca', new DefaultValuePipe(false)) excludeNca: boolean | undefined, @Req() request: Request): AudiencesList200Response | Promise<AudiencesList200Response> | Observable<AudiencesList200Response> {
    return this.audiencesApi.audiencesList(adAccountId, bookmark, pageSize, order, ownershipType, excludeNca, request);
  }

  @Patch('/ad_accounts/:ad_account_id/audiences/:audience_id')
  audiencesUpdate(@Param('audience_id') audienceId: string, @Param('ad_account_id') adAccountId: string, @Body() adAccountsAudienceUpdate: AdAccountsAudienceUpdate, @Req() request: Request): AdAccountsAudience | Promise<AdAccountsAudience> | Observable<AdAccountsAudience> {
    return this.audiencesApi.audiencesUpdate(audienceId, adAccountId, adAccountsAudienceUpdate, request);
  }

} 