import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Array | object, NotificationResponse,  } from '../models';


@Injectable()
export abstract class NotificationApi {

  abstract notificationPost(arrayObject: Array | object | null,  request: Request): NotificationResponse | Promise<NotificationResponse> | Observable<NotificationResponse>;

} 