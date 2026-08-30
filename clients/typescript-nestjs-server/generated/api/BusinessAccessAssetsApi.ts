import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AssetGroupDeletion, AssetGroupDeletionDelete, AssetGroupInput, AssetGroupInputCreate, AssetGroupModification, AssetGroupModificationReadOrUpdate, AssetPermissionType, AssetSearchBy, AssetSortBy, BusinessAssetMembersGet200Response, BusinessAssetsGet200Response, BusinessMemberAssetsGetResponse, BusinessMembersAssetAccessDeleteBody, BusinessPartnerAssetAccessGet200Response, DeleteMemberAccessResultsResponseArray, DeletePartnerAssetAccessBody, DeletePartnerAssetAccessResultsResponseArray, NonDraftEntityStatus, PermissionsWithOwner, UpdateMemberAssetAccessBody, UpdateMemberAssetsResultsResponseArray, UpdatePartnerAssetAccessBody, UpdatePartnerAssetsResultsResponseArray,  } from '../models';


@Injectable()
export abstract class BusinessAccessAssetsApi {

  abstract assetGroupCreate(businessId: string, assetGroupInputCreate: AssetGroupInputCreate,  request: Request): AssetGroupInput | Promise<AssetGroupInput> | Observable<AssetGroupInput>;


  abstract assetGroupDelete(businessId: string, assetGroupDeletionDelete: AssetGroupDeletionDelete,  request: Request): AssetGroupDeletion | Promise<AssetGroupDeletion> | Observable<AssetGroupDeletion>;


  abstract assetGroupUpdate(businessId: string, assetGroupModificationReadOrUpdate: AssetGroupModificationReadOrUpdate,  request: Request): AssetGroupModification | Promise<AssetGroupModification> | Observable<AssetGroupModification>;


  abstract businessAssetMembersGet(businessId: string, assetId: string, startIndex: number | undefined, fetchSystemUsers: boolean | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): BusinessAssetMembersGet200Response | Promise<BusinessAssetMembersGet200Response> | Observable<BusinessAssetMembersGet200Response>;


  abstract businessAssetPartnersGet(businessId: string, assetId: string, startIndex: number | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): BusinessAssetMembersGet200Response | Promise<BusinessAssetMembersGet200Response> | Observable<BusinessAssetMembersGet200Response>;


  abstract businessAssetsGet(businessId: string, permissions: Array<PermissionsWithOwner> | undefined, childAssetId: string | undefined, assetGroupId: string | undefined, assetType: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'CATALOG' | 'CONSUMER' | undefined, startIndex: number | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): BusinessAssetsGet200Response | Promise<BusinessAssetsGet200Response> | Observable<BusinessAssetsGet200Response>;


  abstract businessMemberAssetsGet(businessId: string, memberId: string, assetType: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'CATALOG' | 'CONSUMER' | 'CONVERSION_TAG' | undefined, startIndex: number | undefined, sortBy: AssetSortBy | undefined, sortAscending: boolean | undefined, searchBy: AssetSearchBy | undefined, searchValue: string | undefined, assetPermissionType: AssetPermissionType | undefined, adAccountStatuses: Array<NonDraftEntityStatus> | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): BusinessMemberAssetsGetResponse | Promise<BusinessMemberAssetsGetResponse> | Observable<BusinessMemberAssetsGetResponse>;


  abstract businessMembersAssetAccessDelete(businessId: string, businessMembersAssetAccessDeleteBody: BusinessMembersAssetAccessDeleteBody,  request: Request): DeleteMemberAccessResultsResponseArray | Promise<DeleteMemberAccessResultsResponseArray> | Observable<DeleteMemberAccessResultsResponseArray>;


  abstract businessMembersAssetAccessUpdate(businessId: string, updateMemberAssetAccessBody: UpdateMemberAssetAccessBody,  request: Request): UpdateMemberAssetsResultsResponseArray | Promise<UpdateMemberAssetsResultsResponseArray> | Observable<UpdateMemberAssetsResultsResponseArray>;


  abstract businessPartnerAssetAccessGet(businessId: string, partnerId: string, partnerType: 'INTERNAL' | 'EXTERNAL' | undefined, assetType: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'PINNER_LIST' | 'CONVERSION_TAG' | 'CATALOG' | 'CONSUMER' | 'CONVERSION_SEGMENT' | undefined, startIndex: number | undefined, sortBy: AssetSortBy | undefined, sortAscending: boolean | undefined, searchBy: AssetSearchBy | undefined, searchValue: string | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): BusinessPartnerAssetAccessGet200Response | Promise<BusinessPartnerAssetAccessGet200Response> | Observable<BusinessPartnerAssetAccessGet200Response>;


  abstract deletePartnerAssetAccessHandlerImpl(businessId: string, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody,  request: Request): DeletePartnerAssetAccessResultsResponseArray | Promise<DeletePartnerAssetAccessResultsResponseArray> | Observable<DeletePartnerAssetAccessResultsResponseArray>;


  abstract updatePartnerAssetAccessHandlerImpl(businessId: string, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody,  request: Request): UpdatePartnerAssetsResultsResponseArray | Promise<UpdatePartnerAssetsResultsResponseArray> | Observable<UpdatePartnerAssetsResultsResponseArray>;

} 