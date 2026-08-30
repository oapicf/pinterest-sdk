import { Body, Controller, DefaultValuePipe, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { MsotEventsApi } from '../api';
import { ConversionMSOTEventsCreate,  } from '../models';

@Controller()
export class MsotEventsApiController {
  constructor(private readonly msotEventsApi: MsotEventsApi) {}

  @Post('/ad_accounts/:ad_account_id/msot/events')
  msotEventsCreate(@Param('ad_account_id') adAccountId: string, @Body() conversionMSOTEventsCreate: ConversionMSOTEventsCreate, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.msotEventsApi.msotEventsCreate(adAccountId, conversionMSOTEventsCreate, request);
  }

} 