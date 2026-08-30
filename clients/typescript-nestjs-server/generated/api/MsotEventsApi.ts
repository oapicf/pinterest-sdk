import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { ConversionMSOTEventsCreate,  } from '../models';


@Injectable()
export abstract class MsotEventsApi {

  abstract msotEventsCreate(adAccountId: string, conversionMSOTEventsCreate: ConversionMSOTEventsCreate,  request: Request): void | Promise<void> | Observable<void>;

} 