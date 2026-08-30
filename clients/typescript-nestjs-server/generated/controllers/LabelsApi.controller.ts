import { Body, Controller, DefaultValuePipe, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { LabelsApi } from '../api';
import { LabelCreateRequest, LabelUpdateRequest, LabeledEntities, LabeledEntitiesCreate, LabelsList200Response, LabelsResponse, QueryLabelEntityStatusesItems, QueryLabelTypesItems,  } from '../models';

@Controller()
export class LabelsApiController {
  constructor(private readonly labelsApi: LabelsApi) {}

  @Post('/ad_accounts/:ad_account_id/labels/:label_id/apply')
  labelsApply(@Param('ad_account_id') adAccountId: string, @Param('label_id') labelId: string, @Body() labeledEntitiesCreate: LabeledEntitiesCreate, @Req() request: Request): LabeledEntities | Promise<LabeledEntities> | Observable<LabeledEntities> {
    return this.labelsApi.labelsApply(adAccountId, labelId, labeledEntitiesCreate, request);
  }

  @Post('/ad_accounts/:ad_account_id/labels')
  labelsCreate(@Param('ad_account_id') adAccountId: string, @Body() labelCreateRequest: LabelCreateRequest, @Req() request: Request): LabelsResponse | Promise<LabelsResponse> | Observable<LabelsResponse> {
    return this.labelsApi.labelsCreate(adAccountId, labelCreateRequest, request);
  }

  @Get('/ad_accounts/:ad_account_id/labels')
  labelsList(@Param('ad_account_id') adAccountId: string, @Query('campaign_ids') campaignIds: Array<string> | undefined, @Query('label_ids') labelIds: Array<string> | undefined, @Query('entity_statuses') entityStatuses: Array<QueryLabelEntityStatusesItems> | undefined, @Query('label_types') labelTypes: Array<QueryLabelTypesItems> | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): LabelsList200Response | Promise<LabelsList200Response> | Observable<LabelsList200Response> {
    return this.labelsApi.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize, request);
  }

  @Post('/ad_accounts/:ad_account_id/labels/:label_id/remove')
  labelsRemove(@Param('ad_account_id') adAccountId: string, @Param('label_id') labelId: string, @Body() labeledEntitiesCreate: LabeledEntitiesCreate, @Req() request: Request): LabeledEntities | Promise<LabeledEntities> | Observable<LabeledEntities> {
    return this.labelsApi.labelsRemove(adAccountId, labelId, labeledEntitiesCreate, request);
  }

  @Patch('/ad_accounts/:ad_account_id/labels')
  labelsUpdate(@Param('ad_account_id') adAccountId: string, @Body() labelUpdateRequest: LabelUpdateRequest, @Req() request: Request): LabelsResponse | Promise<LabelsResponse> | Observable<LabelsResponse> {
    return this.labelsApi.labelsUpdate(adAccountId, labelUpdateRequest, request);
  }

} 