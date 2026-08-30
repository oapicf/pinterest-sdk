import { Body, Controller, DefaultValuePipe, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { NotificationApi } from '../api';
import { Array | object, NotificationResponse,  } from '../models';

@Controller()
export class NotificationApiController {
  constructor(private readonly notificationApi: NotificationApi) {}

  @Post('/notifications')
  notificationPost(@Body() arrayObject: Array | object | null, @Req() request: Request): NotificationResponse | Promise<NotificationResponse> | Observable<NotificationResponse> {
    return this.notificationApi.notificationPost(arrayObject, request);
  }

} 