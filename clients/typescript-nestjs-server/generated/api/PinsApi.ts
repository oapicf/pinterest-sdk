import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CreativeType, MultiPinsAnalyticsMetricTypesItem, Pin, PinCreate, PinFilter, PinType, PinUpdate, PinsList200Response, PinsSaveRequestCreate, QuerypinanalyticsmetrictypesItems,  } from '../models';


@Injectable()
export abstract class PinsApi {

  abstract multiPinsAnalytics(pinIds: Array<string>, startDate: string, endDate: string, metricTypes: Array<MultiPinsAnalyticsMetricTypesItem>, appTypes: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | undefined, adAccountId: string | undefined,  request: Request): { [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; } | Promise<{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }> | Observable<{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }>;


  abstract pinsAnalytics(pinId: string, startDate: string, endDate: string, metricTypes: Array<QuerypinanalyticsmetrictypesItems>, appTypes: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | undefined, splitField: 'NO_SPLIT' | 'APP_TYPE' | undefined, adAccountId: string | undefined,  request: Request): { [key: string]: PinAnalyticsMetricsResponse; } | Promise<{ [key: string]: PinAnalyticsMetricsResponse; }> | Observable<{ [key: string]: PinAnalyticsMetricsResponse; }>;


  abstract pinsCreate(pinCreate: PinCreate, adAccountId: string | undefined,  request: Request): Pin | Promise<Pin> | Observable<Pin>;


  abstract pinsDelete(pinId: string, adAccountId: string | undefined,  request: Request): Pin | Promise<Pin> | Observable<Pin>;


  abstract pinsGet(pinId: string, adAccountId: string | undefined, pinMetrics: boolean | undefined,  request: Request): Pin | Promise<Pin> | Observable<Pin>;


  abstract pinsList(pinFilter: PinFilter | undefined, pinMetrics: boolean | undefined, includeProtectedPins: boolean | undefined, pinType: PinType | undefined, creativeTypes: Array<CreativeType> | undefined, adAccountId: string | undefined, domain: string | undefined, domains: Array<string> | undefined, includeProductTagObj: boolean | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): PinsList200Response | Promise<PinsList200Response> | Observable<PinsList200Response>;


  abstract pinsSave(pinId: string, pinsSaveRequestCreate: PinsSaveRequestCreate, adAccountId: string | undefined,  request: Request): Pin | Promise<Pin> | Observable<Pin>;


  abstract pinsUpdate(pinId: string, pinUpdate: PinUpdate, adAccountId: string | undefined,  request: Request): Pin | Promise<Pin> | Observable<Pin>;

} 