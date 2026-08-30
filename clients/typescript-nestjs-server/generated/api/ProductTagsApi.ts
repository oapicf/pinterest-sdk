import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { ProductTagsBulkAddRequest, ProductTagsBulkDeleteRequest, ProductTagsResponse,  } from '../models';


@Injectable()
export abstract class ProductTagsApi {

  abstract productTagsBulkAdd(pinId: string, productTagsBulkAddRequest: ProductTagsBulkAddRequest,  request: Request): ProductTagsResponse | Promise<ProductTagsResponse> | Observable<ProductTagsResponse>;


  abstract productTagsBulkDelete(pinId: string, productTagsBulkDeleteRequest: ProductTagsBulkDeleteRequest,  request: Request): void | Promise<void> | Observable<void>;


  abstract productTagsList(pinId: string,  request: Request): ProductTagsResponse | Promise<ProductTagsResponse> | Observable<ProductTagsResponse>;

} 