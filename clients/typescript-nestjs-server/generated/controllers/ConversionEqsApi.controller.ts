import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ConversionEqsApi } from '../api';
import { EventQualityScore, IngestionSourceOptions, LookbackPeriodOptions, SourcePlatformOptions,  } from '../models';

@Controller()
export class ConversionEqsApiController {
  constructor(private readonly conversionEqsApi: ConversionEqsApi) {}

  @Get('/ad_accounts/:ad_account_id/conversion_eqs')
  conversionEqsList(@Query('lookback_period') lookbackPeriod: LookbackPeriodOptions, @Param('ad_account_id') adAccountId: string, @Query('source_platform') sourcePlatform: SourcePlatformOptions | undefined, @Query('ingestion_source') ingestionSource: IngestionSourceOptions | undefined, @Req() request: Request): Array<EventQualityScore> | Promise<Array<EventQualityScore>> | Observable<Array<EventQualityScore>> {
    return this.conversionEqsApi.conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource, request);
  }

} 