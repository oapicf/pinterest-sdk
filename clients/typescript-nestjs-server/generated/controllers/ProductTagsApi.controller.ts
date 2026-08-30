import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ProductTagsApi } from '../api';
import { ProductTagsBulkAddRequest, ProductTagsBulkDeleteRequest, ProductTagsResponse,  } from '../models';

@Controller()
export class ProductTagsApiController {
  constructor(private readonly productTagsApi: ProductTagsApi) {}

  @Post('/pins/:pin_id/product_tags')
  productTagsBulkAdd(@Param('pin_id') pinId: string, @Body() productTagsBulkAddRequest: ProductTagsBulkAddRequest, @Req() request: Request): ProductTagsResponse | Promise<ProductTagsResponse> | Observable<ProductTagsResponse> {
    return this.productTagsApi.productTagsBulkAdd(pinId, productTagsBulkAddRequest, request);
  }

  @Post('/pins/:pin_id/product_tags/bulk-delete')
  productTagsBulkDelete(@Param('pin_id') pinId: string, @Body() productTagsBulkDeleteRequest: ProductTagsBulkDeleteRequest, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.productTagsApi.productTagsBulkDelete(pinId, productTagsBulkDeleteRequest, request);
  }

  @Get('/pins/:pin_id/product_tags')
  productTagsList(@Param('pin_id') pinId: string, @Req() request: Request): ProductTagsResponse | Promise<ProductTagsResponse> | Observable<ProductTagsResponse> {
    return this.productTagsApi.productTagsList(pinId, request);
  }

} 