import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { EventQualityScore, IngestionSourceOptions, LookbackPeriodOptions, SourcePlatformOptions,  } from '../models';


@Injectable()
export abstract class ConversionEqsApi {

  abstract conversionEqsList(lookbackPeriod: LookbackPeriodOptions, adAccountId: string, sourcePlatform: SourcePlatformOptions | undefined, ingestionSource: IngestionSourceOptions | undefined,  request: Request): Array<EventQualityScore> | Promise<Array<EventQualityScore>> | Observable<Array<EventQualityScore>>;

} 