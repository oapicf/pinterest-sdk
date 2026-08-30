import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { ConversionEvents, ConversionEventsCreate,  } from '../models';


@Injectable()
export abstract class ConversionEventsApi {

  abstract eventsCreate(adAccountId: string, conversionEventsCreate: ConversionEventsCreate, test: boolean | undefined,  request: Request): ConversionEvents | Promise<ConversionEvents> | Observable<ConversionEvents>;

} 