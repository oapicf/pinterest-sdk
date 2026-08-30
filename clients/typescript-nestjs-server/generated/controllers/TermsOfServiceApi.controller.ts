import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { TermsOfServiceApi } from '../api';
import { TermsOfService,  } from '../models';

@Controller()
export class TermsOfServiceApiController {
  constructor(private readonly termsOfServiceApi: TermsOfServiceApi) {}

  @Get('/ad_accounts/:ad_account_id/terms_of_service')
  termsOfServiceGet(@Param('ad_account_id') adAccountId: string, @Query('include_html', new DefaultValuePipe(false)) includeHtml: boolean | undefined, @Query('tos_type') tosType: string | undefined, @Req() request: Request): TermsOfService | Promise<TermsOfService> | Observable<TermsOfService> {
    return this.termsOfServiceApi.termsOfServiceGet(adAccountId, includeHtml, tosType, request);
  }

} 