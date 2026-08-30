import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { PinterestLibPaginationOrder, TargetingTemplate, TargetingTemplateCreate, TargetingTemplateList200Response, TargetingTemplateUpdateRequestReadOrUpdate,  } from '../models';


@Injectable()
export abstract class TargetingTemplateApi {

  abstract targetingTemplateCreate(adAccountId: string, targetingTemplateCreate: TargetingTemplateCreate,  request: Request): TargetingTemplate | Promise<TargetingTemplate> | Observable<TargetingTemplate>;


  abstract targetingTemplateList(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined, includeSizing: boolean | undefined, searchQuery: string | undefined,  request: Request): TargetingTemplateList200Response | Promise<TargetingTemplateList200Response> | Observable<TargetingTemplateList200Response>;


  abstract targetingTemplateUpdate(adAccountId: string, targetingTemplateUpdateRequestReadOrUpdate: TargetingTemplateUpdateRequestReadOrUpdate,  request: Request): void | Promise<void> | Observable<void>;

} 