import { Body, Controller, DefaultValuePipe, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ConversionEventsApi } from '../api';
import { ConversionEvents, ConversionEventsCreate,  } from '../models';

@Controller()
export class ConversionEventsApiController {
  constructor(private readonly conversionEventsApi: ConversionEventsApi) {}

  @Post('/ad_accounts/:ad_account_id/events')
  eventsCreate(@Param('ad_account_id') adAccountId: string, @Body() conversionEventsCreate: ConversionEventsCreate, @Query('test') test: boolean | undefined, @Req() request: Request): ConversionEvents | Promise<ConversionEvents> | Observable<ConversionEvents> {
    return this.conversionEventsApi.eventsCreate(adAccountId, conversionEventsCreate, test, request);
  }

} 