package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.BusinessAssetMembersGet200Response;
import org.openapitools.server.api.model.BusinessAssetPartnersGet200Response;
import org.openapitools.server.api.model.BusinessAssetsGet200Response;
import org.openapitools.server.api.model.BusinessMemberAssetsGet200Response;
import org.openapitools.server.api.model.BusinessMembersAssetAccessDeleteRequest;
import org.openapitools.server.api.model.BusinessPartnerAssetAccessGet200Response;
import org.openapitools.server.api.model.CreateAssetGroupBody;
import org.openapitools.server.api.model.CreateAssetGroupResponse;
import org.openapitools.server.api.model.DeleteAssetGroupBody;
import org.openapitools.server.api.model.DeleteAssetGroupResponse;
import org.openapitools.server.api.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.server.api.model.DeletePartnerAssetAccessBody;
import org.openapitools.server.api.model.DeletePartnerAssetsResultsResponseArray;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PartnerType;
import org.openapitools.server.api.model.PermissionsWithOwner;
import org.openapitools.server.api.model.UpdateAssetGroupBody;
import org.openapitools.server.api.model.UpdateAssetGroupResponse;
import org.openapitools.server.api.model.UpdateMemberAssetAccessBody;
import org.openapitools.server.api.model.UpdateMemberAssetsResultsResponseArray;
import org.openapitools.server.api.model.UpdatePartnerAssetAccessBody;
import org.openapitools.server.api.model.UpdatePartnerAssetsResultsResponseArray;

public final class BusinessAccessAssetsApiException extends MainApiException {
    public BusinessAccessAssetsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final BusinessAccessAssetsApiException BusinessAccessAssets_assetGroupCreate_200_Exception = new BusinessAccessAssetsApiException(200, "Success");
    public static final BusinessAccessAssetsApiException BusinessAccessAssets_assetGroupCreate_400_Exception = new BusinessAccessAssetsApiException(400, "Invalid parameters.");
    public static final BusinessAccessAssetsApiException BusinessAccessAssets_assetGroupDelete_200_Exception = new BusinessAccessAssetsApiException(200, "Success");
    public static final BusinessAccessAssetsApiException BusinessAccessAssets_assetGroupDelete_400_Exception = new BusinessAccessAssetsApiException(400, "Invalid parameters.");
    public static final BusinessAccessAssetsApiException BusinessAccessAssets_assetGroupUpdate_200_Exception = new BusinessAccessAssetsApiException(200, "Success");
    public static final BusinessAccessAssetsApiException BusinessAccessAssets_assetGroupUpdate_400_Exception = new BusinessAccessAssetsApiException(400, "Invalid parameters.");
    public static final BusinessAccessAssetsApiException BusinessAccessAssets_businessAssetMembersGet_200_Exception = new BusinessAccessAssetsApiException(200, "Sucess");
    public static final BusinessAccessAssetsApiException BusinessAccessAssets_businessAssetPartnersGet_200_Exception = new BusinessAccessAssetsApiException(200, "Sucess");
    public static final BusinessAccessAssetsApiException BusinessAccessAssets_businessAssetsGet_200_Exception = new BusinessAccessAssetsApiException(200, "Success");
    public static final BusinessAccessAssetsApiException BusinessAccessAssets_businessMemberAssetsGet_200_Exception = new BusinessAccessAssetsApiException(200, "Success");
    public static final BusinessAccessAssetsApiException BusinessAccessAssets_businessMembersAssetAccessDelete_200_Exception = new BusinessAccessAssetsApiException(200, "response");
    public static final BusinessAccessAssetsApiException BusinessAccessAssets_businessMembersAssetAccessUpdate_200_Exception = new BusinessAccessAssetsApiException(200, "response");
    public static final BusinessAccessAssetsApiException BusinessAccessAssets_businessPartnerAssetAccessGet_200_Exception = new BusinessAccessAssetsApiException(200, "Success");
    public static final BusinessAccessAssetsApiException BusinessAccessAssets_deletePartnerAssetAccessHandlerImpl_200_Exception = new BusinessAccessAssetsApiException(200, "Success");
    public static final BusinessAccessAssetsApiException BusinessAccessAssets_updatePartnerAssetAccessHandlerImpl_200_Exception = new BusinessAccessAssetsApiException(200, "Success");
    

}