package controllers;

import apimodels.AssetGroupDeletion;
import apimodels.AssetGroupDeletionDelete;
import apimodels.AssetGroupInput;
import apimodels.AssetGroupInputCreate;
import apimodels.AssetGroupModification;
import apimodels.AssetGroupModificationReadOrUpdate;
import apimodels.AssetPermissionType;
import apimodels.AssetSearchBy;
import apimodels.AssetSortBy;
import apimodels.BusinessAssetMembersGet200Response;
import apimodels.BusinessAssetsGet200Response;
import apimodels.BusinessMemberAssetsGetResponse;
import apimodels.BusinessMembersAssetAccessDeleteBody;
import apimodels.BusinessPartnerAssetAccessGet200Response;
import apimodels.DeleteMemberAccessResultsResponseArray;
import apimodels.DeletePartnerAssetAccessBody;
import apimodels.DeletePartnerAssetAccessResultsResponseArray;
import apimodels.NonDraftEntityStatus;
import apimodels.PermissionsWithOwner;
import apimodels.PinterestLibError;
import apimodels.UpdateMemberAssetAccessBody;
import apimodels.UpdateMemberAssetsResultsResponseArray;
import apimodels.UpdatePartnerAssetAccessBody;
import apimodels.UpdatePartnerAssetsResultsResponseArray;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessAccessAssetsApiControllerImp extends BusinessAccessAssetsApiControllerImpInterface {
    @Override
    public AssetGroupInput assetGroupCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, AssetGroupInputCreate assetGroupInputCreate) throws Exception {
        //Do your magic!!!
        return new AssetGroupInput();
    }

    @Override
    public AssetGroupDeletion assetGroupDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, AssetGroupDeletionDelete assetGroupDeletionDelete) throws Exception {
        //Do your magic!!!
        return new AssetGroupDeletion();
    }

    @Override
    public AssetGroupModification assetGroupUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate) throws Exception {
        //Do your magic!!!
        return new AssetGroupModification();
    }

    @Override
    public BusinessAssetMembersGet200Response businessAssetMembersGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId,  @Min(0)Integer startIndex, Boolean fetchSystemUsers, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new BusinessAssetMembersGet200Response();
    }

    @Override
    public BusinessAssetMembersGet200Response businessAssetPartnersGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new BusinessAssetMembersGet200Response();
    }

    @Override
    public BusinessAssetsGet200Response businessAssetsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, List<PermissionsWithOwner> permissions,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String childAssetId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetGroupId, String assetType,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new BusinessAssetsGet200Response();
    }

    @Override
    public BusinessMemberAssetsGetResponse businessMemberAssetsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String memberId, String assetType,  @Min(0)Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, AssetPermissionType assetPermissionType, List<NonDraftEntityStatus> adAccountStatuses, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new BusinessMemberAssetsGetResponse();
    }

    @Override
    public DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody) throws Exception {
        //Do your magic!!!
        return new DeleteMemberAccessResultsResponseArray();
    }

    @Override
    public UpdateMemberAssetsResultsResponseArray businessMembersAssetAccessUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody) throws Exception {
        //Do your magic!!!
        return new UpdateMemberAssetsResultsResponseArray();
    }

    @Override
    public BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String partnerId, String partnerType, String assetType,  @Min(0)Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new BusinessPartnerAssetAccessGet200Response();
    }

    @Override
    public DeletePartnerAssetAccessResultsResponseArray deletePartnerAssetAccessHandlerImpl(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody) throws Exception {
        //Do your magic!!!
        return new DeletePartnerAssetAccessResultsResponseArray();
    }

    @Override
    public UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody) throws Exception {
        //Do your magic!!!
        return new UpdatePartnerAssetsResultsResponseArray();
    }

}
