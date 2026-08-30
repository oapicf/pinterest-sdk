import { Body, Controller, DefaultValuePipe, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { SchedulesApi } from '../api';
import { PinterestLibPaginationOrder, ScheduleBatchUpdate, ScheduleCreate, ScheduleStatus, ScheduleType, SchedulesCreate200ResponseInner, SchedulesList200Response,  } from '../models';

@Controller()
export class SchedulesApiController {
  constructor(private readonly schedulesApi: SchedulesApi) {}

  @Post('/ad_accounts/:ad_account_id/schedules')
  schedulesCreate(@Param('ad_account_id') adAccountId: string, @Body() scheduleCreate: Array<ScheduleCreate>, @Req() request: Request): Array<SchedulesCreate200ResponseInner> | Promise<Array<SchedulesCreate200ResponseInner>> | Observable<Array<SchedulesCreate200ResponseInner>> {
    return this.schedulesApi.schedulesCreate(adAccountId, scheduleCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/schedules')
  schedulesList(@Param('ad_account_id') adAccountId: string, @Query('entity_ids') entityIds: Array<string>, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Query('schedule_statuses') scheduleStatuses: Array<ScheduleStatus> | undefined, @Query('schedule_type') scheduleType: ScheduleType | undefined, @Req() request: Request): SchedulesList200Response | Promise<SchedulesList200Response> | Observable<SchedulesList200Response> {
    return this.schedulesApi.schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType, request);
  }

  @Patch('/ad_accounts/:ad_account_id/schedules')
  schedulesUpdate(@Param('ad_account_id') adAccountId: string, @Body() scheduleBatchUpdate: Array<ScheduleBatchUpdate>, @Req() request: Request): Array<SchedulesCreate200ResponseInner> | Promise<Array<SchedulesCreate200ResponseInner>> | Observable<Array<SchedulesCreate200ResponseInner>> {
    return this.schedulesApi.schedulesUpdate(adAccountId, scheduleBatchUpdate, request);
  }

} 