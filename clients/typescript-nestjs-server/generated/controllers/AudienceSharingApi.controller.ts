import { Body, Controller, DefaultValuePipe, Get, Patch, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { AudienceSharingApi } from '../api';
import { AdAccountToAdAccountSharedAudience, AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody, AdAccountToBusinessSharedAudience, AdAccountToBusinessSharedAudienceUpdateWithRequiredBody, AdAccountsAudiencesSharedAccountsList200Response, AudienceAccountType, BusinessToAdAccountSharedAudience, BusinessToAdAccountSharedAudienceUpdateWithRequiredBody, BusinessToBusinessSharedAudience, BusinessToBusinessSharedAudienceUpdateWithRequiredBody, Order, SharedAudiencesForBusinessList200Response,  } from '../models';

@Controller()
export class AudienceSharingApiController {
  constructor(private readonly audienceSharingApi: AudienceSharingApi) {}

  @Get('/ad_accounts/:ad_account_id/audiences/shared/accounts')
  adAccountsAudiencesSharedAccountsList(@Query('audience_id') audienceId: string, @Query('account_type') accountType: AudienceAccountType, @Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): AdAccountsAudiencesSharedAccountsList200Response | Promise<AdAccountsAudiencesSharedAccountsList200Response> | Observable<AdAccountsAudiencesSharedAccountsList200Response> {
    return this.audienceSharingApi.adAccountsAudiencesSharedAccountsList(audienceId, accountType, adAccountId, bookmark, pageSize, request);
  }

  @Get('/businesses/:business_id/audiences/shared/accounts')
  businessAccountAudiencesSharedAccountsList(@Param('business_id') businessId: string, @Query('audience_id') audienceId: string, @Query('account_type') accountType: AudienceAccountType, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): AdAccountsAudiencesSharedAccountsList200Response | Promise<AdAccountsAudiencesSharedAccountsList200Response> | Observable<AdAccountsAudiencesSharedAccountsList200Response> {
    return this.audienceSharingApi.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, bookmark, pageSize, request);
  }

  @Get('/businesses/:business_id/audiences')
  sharedAudiencesForBusinessList(@Param('business_id') businessId: string, @Query('order') order: Order | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): SharedAudiencesForBusinessList200Response | Promise<SharedAudiencesForBusinessList200Response> | Observable<SharedAudiencesForBusinessList200Response> {
    return this.audienceSharingApi.sharedAudiencesForBusinessList(businessId, order, bookmark, pageSize, request);
  }

  @Patch('/ad_accounts/:ad_account_id/audiences/ad_accounts/shared')
  updateAdAccountToAdAccountSharedAudience(@Param('ad_account_id') adAccountId: string, @Body() adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody, @Req() request: Request): AdAccountToAdAccountSharedAudience | Promise<AdAccountToAdAccountSharedAudience> | Observable<AdAccountToAdAccountSharedAudience> {
    return this.audienceSharingApi.updateAdAccountToAdAccountSharedAudience(adAccountId, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody, request);
  }

  @Patch('/ad_accounts/:ad_account_id/audiences/businesses/shared')
  updateAdAccountToBusinessSharedAudience(@Param('ad_account_id') adAccountId: string, @Body() adAccountToBusinessSharedAudienceUpdateWithRequiredBody: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody, @Req() request: Request): AdAccountToBusinessSharedAudience | Promise<AdAccountToBusinessSharedAudience> | Observable<AdAccountToBusinessSharedAudience> {
    return this.audienceSharingApi.updateAdAccountToBusinessSharedAudience(adAccountId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody, request);
  }

  @Patch('/businesses/:business_id/audiences/ad_accounts/shared')
  updateBusinessToAdAccountSharedAudience(@Param('business_id') businessId: string, @Body() businessToAdAccountSharedAudienceUpdateWithRequiredBody: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody, @Req() request: Request): BusinessToAdAccountSharedAudience | Promise<BusinessToAdAccountSharedAudience> | Observable<BusinessToAdAccountSharedAudience> {
    return this.audienceSharingApi.updateBusinessToAdAccountSharedAudience(businessId, businessToAdAccountSharedAudienceUpdateWithRequiredBody, request);
  }

  @Patch('/businesses/:business_id/audiences/businesses/shared')
  updateBusinessToBusinessSharedAudience(@Param('business_id') businessId: string, @Body() businessToBusinessSharedAudienceUpdateWithRequiredBody: BusinessToBusinessSharedAudienceUpdateWithRequiredBody, @Req() request: Request): BusinessToBusinessSharedAudience | Promise<BusinessToBusinessSharedAudience> | Observable<BusinessToBusinessSharedAudience> {
    return this.audienceSharingApi.updateBusinessToBusinessSharedAudience(businessId, businessToBusinessSharedAudienceUpdateWithRequiredBody, request);
  }

} 