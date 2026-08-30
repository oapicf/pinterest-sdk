import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { OrderLinesApi } from '../api';
import { OrderLine, OrderLinesList200Response, PinterestLibPaginationOrder,  } from '../models';

@Controller()
export class OrderLinesApiController {
  constructor(private readonly orderLinesApi: OrderLinesApi) {}

  @Get('/ad_accounts/:ad_account_id/order_lines/:order_line_id')
  orderLinesGet(@Param('order_line_id') orderLineId: string, @Param('ad_account_id') adAccountId: string, @Req() request: Request): OrderLine | Promise<OrderLine> | Observable<OrderLine> {
    return this.orderLinesApi.orderLinesGet(orderLineId, adAccountId, request);
  }

  @Get('/ad_accounts/:ad_account_id/order_lines')
  orderLinesList(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Req() request: Request): OrderLinesList200Response | Promise<OrderLinesList200Response> | Observable<OrderLinesList200Response> {
    return this.orderLinesApi.orderLinesList(adAccountId, bookmark, pageSize, order, request);
  }

} 