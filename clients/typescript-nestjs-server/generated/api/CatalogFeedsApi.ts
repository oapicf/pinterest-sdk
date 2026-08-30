import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CatalogsFeed, CatalogsFeedCreateRequestSchema, CatalogsFeedIngestion, CatalogsFeedUpdateRequestSchema, CatalogsItemValidationIssue, FeedProcessingResultsList200Response, FeedsList200Response, ItemsIssuesList200Response,  } from '../models';


@Injectable()
export abstract class CatalogFeedsApi {

  abstract feedProcessingResultsList(feedId: string, adAccountId: string | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): FeedProcessingResultsList200Response | Promise<FeedProcessingResultsList200Response> | Observable<FeedProcessingResultsList200Response>;


  abstract feedsCreate(catalogsFeedCreateRequestSchema: CatalogsFeedCreateRequestSchema, adAccountId: string | undefined,  request: Request): CatalogsFeed | Promise<CatalogsFeed> | Observable<CatalogsFeed>;


  abstract feedsDelete(feedId: string, adAccountId: string | undefined,  request: Request): CatalogsFeed | Promise<CatalogsFeed> | Observable<CatalogsFeed>;


  abstract feedsGet(feedId: string, adAccountId: string | undefined,  request: Request): CatalogsFeed | Promise<CatalogsFeed> | Observable<CatalogsFeed>;


  abstract feedsIngest(feedId: string, adAccountId: string | undefined,  request: Request): CatalogsFeedIngestion | Promise<CatalogsFeedIngestion> | Observable<CatalogsFeedIngestion>;


  abstract feedsList(catalogId: string | undefined, adAccountId: string | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): FeedsList200Response | Promise<FeedsList200Response> | Observable<FeedsList200Response>;


  abstract feedsUpdate(feedId: string, catalogsFeedUpdateRequestSchema: CatalogsFeedUpdateRequestSchema, adAccountId: string | undefined,  request: Request): CatalogsFeed | Promise<CatalogsFeed> | Observable<CatalogsFeed>;


  abstract itemsIssuesList(processingResultId: string, itemNumbers: Array<number> | undefined, itemValidationIssue: CatalogsItemValidationIssue | undefined, adAccountId: string | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): ItemsIssuesList200Response | Promise<ItemsIssuesList200Response> | Observable<ItemsIssuesList200Response>;

} 