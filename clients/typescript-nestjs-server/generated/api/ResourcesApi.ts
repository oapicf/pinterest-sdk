import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AdAccountCountriesGet200Response, BookClosed, DeliveryMetricsGet200Response, PublicTargetingType, ReportType, SingleInterestTargetingOption,  } from '../models';


@Injectable()
export abstract class ResourcesApi {

  abstract adAccountCountriesGet( request: Request): AdAccountCountriesGet200Response | Promise<AdAccountCountriesGet200Response> | Observable<AdAccountCountriesGet200Response>;


  abstract deliveryMetricsGet(reportType: ReportType | undefined,  request: Request): DeliveryMetricsGet200Response | Promise<DeliveryMetricsGet200Response> | Observable<DeliveryMetricsGet200Response>;


  abstract interestTargetingOptionsGet(interestId: string,  request: Request): SingleInterestTargetingOption | Promise<SingleInterestTargetingOption> | Observable<SingleInterestTargetingOption>;


  abstract leadFormQuestionsGet( request: Request): void | Promise<void> | Observable<void>;


  abstract metricsReadyStateGet(date: string,  request: Request): BookClosed | Promise<BookClosed> | Observable<BookClosed>;


  abstract targetingOptionsGet(targetingType: PublicTargetingType, adAccountId: string | undefined, clientId: string | undefined, oauthSignature: string | undefined, timestamp: string | undefined,  request: Request): Array<object> | Promise<Array<object>> | Observable<Array<object>>;

} 