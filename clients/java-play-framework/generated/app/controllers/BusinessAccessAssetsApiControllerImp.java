package controllers;

import apimodels.BusinessAssetMembersGet200Response;
import apimodels.BusinessAssetPartnersGet200Response;
import apimodels.BusinessAssetsGet200Response;
import apimodels.BusinessMemberAssetsGet200Response;
import apimodels.BusinessMembersAssetAccessDeleteRequest;
import apimodels.BusinessPartnerAssetAccessGet200Response;
import apimodels.CreateAssetGroupBody;
import apimodels.CreateAssetGroupResponse;
import apimodels.DeleteAssetGroupBody;
import apimodels.DeleteAssetGroupResponse;
import apimodels.DeleteMemberAccessResultsResponseArray;
import apimodels.DeletePartnerAssetAccessBody;
import apimodels.DeletePartnerAssetsResultsResponseArray;
import apimodels.Error;
import apimodels.PartnerType;
import apimodels.PermissionsWithOwner;
import apimodels.UpdateAssetGroupBody;
import apimodels.UpdateAssetGroupResponse;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessAccessAssetsApiControllerImp extends BusinessAccessAssetsApiControllerImpInterface {
    @Override
    public CreateAssetGroupResponse assetGroupCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CreateAssetGroupBody createAssetGroupBody) throws Exception {
        //Do your magic!!!
        return new CreateAssetGroupResponse();
    }

    @Override
    public DeleteAssetGroupResponse assetGroupDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeleteAssetGroupBody deleteAssetGroupBody) throws Exception {
        //Do your magic!!!
        return new DeleteAssetGroupResponse();
    }

    @Override
    public UpdateAssetGroupResponse assetGroupUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, UpdateAssetGroupBody updateAssetGroupBody) throws Exception {
        //Do your magic!!!
        return new UpdateAssetGroupResponse();
    }

    @Override
    public BusinessAssetMembersGet200Response businessAssetMembersGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Min(0)Integer startIndex) throws Exception {
        //Do your magic!!!
        return new BusinessAssetMembersGet200Response();
    }

    @Override
    public BusinessAssetPartnersGet200Response businessAssetPartnersGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new BusinessAssetPartnersGet200Response();
    }

    @Override
    public BusinessAssetsGet200Response businessAssetsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, List<PermissionsWithOwner> permissions,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String childAssetId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetGroupId, String assetType,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new BusinessAssetsGet200Response();
    }

    @Override
    public BusinessMemberAssetsGet200Response businessMemberAssetsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String memberId, String assetType,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new BusinessMemberAssetsGet200Response();
    }

    @Override
    public DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest) throws Exception {
        //Do your magic!!!
        return new DeleteMemberAccessResultsResponseArray();
    }

    @Override
    public UpdateMemberAssetsResultsResponseArray businessMembersAssetAccessUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody) throws Exception {
        //Do your magic!!!
        return new UpdateMemberAssetsResultsResponseArray();
    }

    @Override
    public BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String partnerId, PartnerType partnerType, String assetType,  @Min(0)Integer startIndex,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        //Do your magic!!!
        return new BusinessPartnerAssetAccessGet200Response();
    }

    @Override
    public DeletePartnerAssetsResultsResponseArray deletePartnerAssetAccessHandlerImpl(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody) throws Exception {
        //Do your magic!!!
        return new DeletePartnerAssetsResultsResponseArray();
    }

    @Override
    public UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody) throws Exception {
        //Do your magic!!!
        return new UpdatePartnerAssetsResultsResponseArray();
    }

}
