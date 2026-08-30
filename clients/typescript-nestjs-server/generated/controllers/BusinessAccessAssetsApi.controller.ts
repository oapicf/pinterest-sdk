import { Body, Controller, DefaultValuePipe, Delete, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { BusinessAccessAssetsApi } from '../api';
import { AssetGroupDeletion, AssetGroupDeletionDelete, AssetGroupInput, AssetGroupInputCreate, AssetGroupModification, AssetGroupModificationReadOrUpdate, AssetPermissionType, AssetSearchBy, AssetSortBy, BusinessAssetMembersGet200Response, BusinessAssetsGet200Response, BusinessMemberAssetsGetResponse, BusinessMembersAssetAccessDeleteBody, BusinessPartnerAssetAccessGet200Response, DeleteMemberAccessResultsResponseArray, DeletePartnerAssetAccessBody, DeletePartnerAssetAccessResultsResponseArray, NonDraftEntityStatus, PermissionsWithOwner, UpdateMemberAssetAccessBody, UpdateMemberAssetsResultsResponseArray, UpdatePartnerAssetAccessBody, UpdatePartnerAssetsResultsResponseArray,  } from '../models';

@Controller()
export class BusinessAccessAssetsApiController {
  constructor(private readonly businessAccessAssetsApi: BusinessAccessAssetsApi) {}

  @Post('/businesses/:business_id/asset_groups')
  assetGroupCreate(@Param('business_id') businessId: string, @Body() assetGroupInputCreate: AssetGroupInputCreate, @Req() request: Request): AssetGroupInput | Promise<AssetGroupInput> | Observable<AssetGroupInput> {
    return this.businessAccessAssetsApi.assetGroupCreate(businessId, assetGroupInputCreate, request);
  }

  @Delete('/businesses/:business_id/asset_groups')
  assetGroupDelete(@Param('business_id') businessId: string, @Body() assetGroupDeletionDelete: AssetGroupDeletionDelete, @Req() request: Request): AssetGroupDeletion | Promise<AssetGroupDeletion> | Observable<AssetGroupDeletion> {
    return this.businessAccessAssetsApi.assetGroupDelete(businessId, assetGroupDeletionDelete, request);
  }

  @Patch('/businesses/:business_id/asset_groups')
  assetGroupUpdate(@Param('business_id') businessId: string, @Body() assetGroupModificationReadOrUpdate: AssetGroupModificationReadOrUpdate, @Req() request: Request): AssetGroupModification | Promise<AssetGroupModification> | Observable<AssetGroupModification> {
    return this.businessAccessAssetsApi.assetGroupUpdate(businessId, assetGroupModificationReadOrUpdate, request);
  }

  @Get('/businesses/:business_id/assets/:asset_id/members')
  businessAssetMembersGet(@Param('business_id') businessId: string, @Param('asset_id') assetId: string, @Query('start_index', new DefaultValuePipe(0)) startIndex: number | undefined, @Query('fetch_system_users', new DefaultValuePipe(false)) fetchSystemUsers: boolean | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): BusinessAssetMembersGet200Response | Promise<BusinessAssetMembersGet200Response> | Observable<BusinessAssetMembersGet200Response> {
    return this.businessAccessAssetsApi.businessAssetMembersGet(businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize, request);
  }

  @Get('/businesses/:business_id/assets/:asset_id/partners')
  businessAssetPartnersGet(@Param('business_id') businessId: string, @Param('asset_id') assetId: string, @Query('start_index', new DefaultValuePipe(0)) startIndex: number | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): BusinessAssetMembersGet200Response | Promise<BusinessAssetMembersGet200Response> | Observable<BusinessAssetMembersGet200Response> {
    return this.businessAccessAssetsApi.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize, request);
  }

  @Get('/businesses/:business_id/assets')
  businessAssetsGet(@Param('business_id') businessId: string, @Query('permissions') permissions: Array<PermissionsWithOwner> | undefined, @Query('child_asset_id') childAssetId: string | undefined, @Query('asset_group_id') assetGroupId: string | undefined, @Query('asset_type', new DefaultValuePipe('AD_ACCOUNT')) assetType: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'CATALOG' | 'CONSUMER' | undefined, @Query('start_index', new DefaultValuePipe(0)) startIndex: number | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): BusinessAssetsGet200Response | Promise<BusinessAssetsGet200Response> | Observable<BusinessAssetsGet200Response> {
    return this.businessAccessAssetsApi.businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize, request);
  }

  @Get('/businesses/:business_id/members/:member_id/assets')
  businessMemberAssetsGet(@Param('business_id') businessId: string, @Param('member_id') memberId: string, @Query('asset_type', new DefaultValuePipe('AD_ACCOUNT')) assetType: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'CATALOG' | 'CONSUMER' | 'CONVERSION_TAG' | undefined, @Query('start_index', new DefaultValuePipe(0)) startIndex: number | undefined, @Query('sort_by') sortBy: AssetSortBy | undefined, @Query('sort_ascending', new DefaultValuePipe(true)) sortAscending: boolean | undefined, @Query('search_by') searchBy: AssetSearchBy | undefined, @Query('search_value') searchValue: string | undefined, @Query('asset_permission_type') assetPermissionType: AssetPermissionType | undefined, @Query('ad_account_statuses') adAccountStatuses: Array<NonDraftEntityStatus> | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): BusinessMemberAssetsGetResponse | Promise<BusinessMemberAssetsGetResponse> | Observable<BusinessMemberAssetsGetResponse> {
    return this.businessAccessAssetsApi.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize, request);
  }

  @Delete('/businesses/:business_id/members/assets/access')
  businessMembersAssetAccessDelete(@Param('business_id') businessId: string, @Body() businessMembersAssetAccessDeleteBody: BusinessMembersAssetAccessDeleteBody, @Req() request: Request): DeleteMemberAccessResultsResponseArray | Promise<DeleteMemberAccessResultsResponseArray> | Observable<DeleteMemberAccessResultsResponseArray> {
    return this.businessAccessAssetsApi.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteBody, request);
  }

  @Patch('/businesses/:business_id/members/assets/access')
  businessMembersAssetAccessUpdate(@Param('business_id') businessId: string, @Body() updateMemberAssetAccessBody: UpdateMemberAssetAccessBody, @Req() request: Request): UpdateMemberAssetsResultsResponseArray | Promise<UpdateMemberAssetsResultsResponseArray> | Observable<UpdateMemberAssetsResultsResponseArray> {
    return this.businessAccessAssetsApi.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody, request);
  }

  @Get('/businesses/:business_id/partners/:partner_id/assets')
  businessPartnerAssetAccessGet(@Param('business_id') businessId: string, @Param('partner_id') partnerId: string, @Query('partner_type', new DefaultValuePipe('INTERNAL')) partnerType: 'INTERNAL' | 'EXTERNAL' | undefined, @Query('asset_type', new DefaultValuePipe('AD_ACCOUNT')) assetType: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'PINNER_LIST' | 'CONVERSION_TAG' | 'CATALOG' | 'CONSUMER' | 'CONVERSION_SEGMENT' | undefined, @Query('start_index', new DefaultValuePipe(0)) startIndex: number | undefined, @Query('sort_by') sortBy: AssetSortBy | undefined, @Query('sort_ascending', new DefaultValuePipe(true)) sortAscending: boolean | undefined, @Query('search_by') searchBy: AssetSearchBy | undefined, @Query('search_value') searchValue: string | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): BusinessPartnerAssetAccessGet200Response | Promise<BusinessPartnerAssetAccessGet200Response> | Observable<BusinessPartnerAssetAccessGet200Response> {
    return this.businessAccessAssetsApi.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize, request);
  }

  @Delete('/businesses/:business_id/partners/assets')
  deletePartnerAssetAccessHandlerImpl(@Param('business_id') businessId: string, @Body() deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody, @Req() request: Request): DeletePartnerAssetAccessResultsResponseArray | Promise<DeletePartnerAssetAccessResultsResponseArray> | Observable<DeletePartnerAssetAccessResultsResponseArray> {
    return this.businessAccessAssetsApi.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody, request);
  }

  @Patch('/businesses/:business_id/partners/assets')
  updatePartnerAssetAccessHandlerImpl(@Param('business_id') businessId: string, @Body() updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody, @Req() request: Request): UpdatePartnerAssetsResultsResponseArray | Promise<UpdatePartnerAssetsResultsResponseArray> | Observable<UpdatePartnerAssetsResultsResponseArray> {
    return this.businessAccessAssetsApi.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody, request);
  }

} 