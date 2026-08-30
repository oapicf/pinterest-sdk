import { Body, Controller, DefaultValuePipe, Delete, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { CatalogFeedsApi } from '../api';
import { CatalogsFeed, CatalogsFeedCreateRequestSchema, CatalogsFeedIngestion, CatalogsFeedUpdateRequestSchema, CatalogsItemValidationIssue, FeedProcessingResultsList200Response, FeedsList200Response, ItemsIssuesList200Response,  } from '../models';

@Controller()
export class CatalogFeedsApiController {
  constructor(private readonly catalogFeedsApi: CatalogFeedsApi) {}

  @Get('/catalogs/feeds/:feed_id/processing_results')
  feedProcessingResultsList(@Param('feed_id') feedId: string, @Query('ad_account_id') adAccountId: string | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): FeedProcessingResultsList200Response | Promise<FeedProcessingResultsList200Response> | Observable<FeedProcessingResultsList200Response> {
    return this.catalogFeedsApi.feedProcessingResultsList(feedId, adAccountId, bookmark, pageSize, request);
  }

  @Post('/catalogs/feeds')
  feedsCreate(@Body() catalogsFeedCreateRequestSchema: CatalogsFeedCreateRequestSchema, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsFeed | Promise<CatalogsFeed> | Observable<CatalogsFeed> {
    return this.catalogFeedsApi.feedsCreate(catalogsFeedCreateRequestSchema, adAccountId, request);
  }

  @Delete('/catalogs/feeds/:feed_id')
  feedsDelete(@Param('feed_id') feedId: string, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsFeed | Promise<CatalogsFeed> | Observable<CatalogsFeed> {
    return this.catalogFeedsApi.feedsDelete(feedId, adAccountId, request);
  }

  @Get('/catalogs/feeds/:feed_id')
  feedsGet(@Param('feed_id') feedId: string, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsFeed | Promise<CatalogsFeed> | Observable<CatalogsFeed> {
    return this.catalogFeedsApi.feedsGet(feedId, adAccountId, request);
  }

  @Post('/catalogs/feeds/:feed_id/ingest')
  feedsIngest(@Param('feed_id') feedId: string, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsFeedIngestion | Promise<CatalogsFeedIngestion> | Observable<CatalogsFeedIngestion> {
    return this.catalogFeedsApi.feedsIngest(feedId, adAccountId, request);
  }

  @Get('/catalogs/feeds')
  feedsList(@Query('catalog_id') catalogId: string | undefined, @Query('ad_account_id') adAccountId: string | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): FeedsList200Response | Promise<FeedsList200Response> | Observable<FeedsList200Response> {
    return this.catalogFeedsApi.feedsList(catalogId, adAccountId, bookmark, pageSize, request);
  }

  @Patch('/catalogs/feeds/:feed_id')
  feedsUpdate(@Param('feed_id') feedId: string, @Body() catalogsFeedUpdateRequestSchema: CatalogsFeedUpdateRequestSchema, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsFeed | Promise<CatalogsFeed> | Observable<CatalogsFeed> {
    return this.catalogFeedsApi.feedsUpdate(feedId, catalogsFeedUpdateRequestSchema, adAccountId, request);
  }

  @Get('/catalogs/processing_results/:processing_result_id/item_issues')
  itemsIssuesList(@Param('processing_result_id') processingResultId: string, @Query('item_numbers') itemNumbers: Array<number> | undefined, @Query('item_validation_issue') itemValidationIssue: CatalogsItemValidationIssue | undefined, @Query('ad_account_id') adAccountId: string | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): ItemsIssuesList200Response | Promise<ItemsIssuesList200Response> | Observable<ItemsIssuesList200Response> {
    return this.catalogFeedsApi.itemsIssuesList(processingResultId, itemNumbers, itemValidationIssue, adAccountId, bookmark, pageSize, request);
  }

} 