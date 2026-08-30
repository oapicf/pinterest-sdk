import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { LabelCreateRequest, LabelUpdateRequest, LabeledEntities, LabeledEntitiesCreate, LabelsList200Response, LabelsResponse, QueryLabelEntityStatusesItems, QueryLabelTypesItems,  } from '../models';


@Injectable()
export abstract class LabelsApi {

  abstract labelsApply(adAccountId: string, labelId: string, labeledEntitiesCreate: LabeledEntitiesCreate,  request: Request): LabeledEntities | Promise<LabeledEntities> | Observable<LabeledEntities>;


  abstract labelsCreate(adAccountId: string, labelCreateRequest: LabelCreateRequest,  request: Request): LabelsResponse | Promise<LabelsResponse> | Observable<LabelsResponse>;


  abstract labelsList(adAccountId: string, campaignIds: Array<string> | undefined, labelIds: Array<string> | undefined, entityStatuses: Array<QueryLabelEntityStatusesItems> | undefined, labelTypes: Array<QueryLabelTypesItems> | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): LabelsList200Response | Promise<LabelsList200Response> | Observable<LabelsList200Response>;


  abstract labelsRemove(adAccountId: string, labelId: string, labeledEntitiesCreate: LabeledEntitiesCreate,  request: Request): LabeledEntities | Promise<LabeledEntities> | Observable<LabeledEntities>;


  abstract labelsUpdate(adAccountId: string, labelUpdateRequest: LabelUpdateRequest,  request: Request): LabelsResponse | Promise<LabelsResponse> | Observable<LabelsResponse>;

} 