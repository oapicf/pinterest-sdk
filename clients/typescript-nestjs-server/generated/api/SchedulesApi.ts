import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { PinterestLibPaginationOrder, ScheduleBatchUpdate, ScheduleCreate, ScheduleStatus, ScheduleType, SchedulesCreate200ResponseInner, SchedulesList200Response,  } from '../models';


@Injectable()
export abstract class SchedulesApi {

  abstract schedulesCreate(adAccountId: string, scheduleCreate: Array<ScheduleCreate>,  request: Request): Array<SchedulesCreate200ResponseInner> | Promise<Array<SchedulesCreate200ResponseInner>> | Observable<Array<SchedulesCreate200ResponseInner>>;


  abstract schedulesList(adAccountId: string, entityIds: Array<string>, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined, scheduleStatuses: Array<ScheduleStatus> | undefined, scheduleType: ScheduleType | undefined,  request: Request): SchedulesList200Response | Promise<SchedulesList200Response> | Observable<SchedulesList200Response>;


  abstract schedulesUpdate(adAccountId: string, scheduleBatchUpdate: Array<ScheduleBatchUpdate>,  request: Request): Array<SchedulesCreate200ResponseInner> | Promise<Array<SchedulesCreate200ResponseInner>> | Observable<Array<SchedulesCreate200ResponseInner>>;

} 