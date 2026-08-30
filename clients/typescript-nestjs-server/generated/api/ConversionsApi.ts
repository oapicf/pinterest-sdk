import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AdvertiserDefinedEventsCreate200Response, AdvertiserDefinedEventsCreateRequest, AdvertiserDefinedEventsGet200Response,  } from '../models';


@Injectable()
export abstract class ConversionsApi {

  abstract advertiserDefinedEventsCreate(adAccountId: string, advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest,  request: Request): AdvertiserDefinedEventsCreate200Response | Promise<AdvertiserDefinedEventsCreate200Response> | Observable<AdvertiserDefinedEventsCreate200Response>;


  abstract advertiserDefinedEventsDelete(adAccountId: string, eventNames: Array<string>,  request: Request): AdvertiserDefinedEventsCreate200Response | Promise<AdvertiserDefinedEventsCreate200Response> | Observable<AdvertiserDefinedEventsCreate200Response>;


  abstract advertiserDefinedEventsGet(adAccountId: string,  request: Request): AdvertiserDefinedEventsGet200Response | Promise<AdvertiserDefinedEventsGet200Response> | Observable<AdvertiserDefinedEventsGet200Response>;


  abstract advertiserDefinedEventsUpdate(adAccountId: string, advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest,  request: Request): AdvertiserDefinedEventsCreate200Response | Promise<AdvertiserDefinedEventsCreate200Response> | Observable<AdvertiserDefinedEventsCreate200Response>;

} 