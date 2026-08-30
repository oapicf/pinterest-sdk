import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { OrderLine, OrderLinesList200Response, PinterestLibPaginationOrder,  } from '../models';


@Injectable()
export abstract class OrderLinesApi {

  abstract orderLinesGet(orderLineId: string, adAccountId: string,  request: Request): OrderLine | Promise<OrderLine> | Observable<OrderLine>;


  abstract orderLinesList(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined,  request: Request): OrderLinesList200Response | Promise<OrderLinesList200Response> | Observable<OrderLinesList200Response>;

} 