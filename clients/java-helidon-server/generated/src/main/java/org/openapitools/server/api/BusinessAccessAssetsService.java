package org.openapitools.server.api;

import org.openapitools.server.model.AssetGroupDeletion;
import org.openapitools.server.model.AssetGroupDeletionDelete;
import org.openapitools.server.model.AssetGroupInput;
import org.openapitools.server.model.AssetGroupInputCreate;
import org.openapitools.server.model.AssetGroupModification;
import org.openapitools.server.model.AssetGroupModificationReadOrUpdate;
import org.openapitools.server.model.AssetPermissionType;
import org.openapitools.server.model.AssetSearchBy;
import org.openapitools.server.model.AssetSortBy;
import org.openapitools.server.model.BusinessAssetMembersGet200Response;
import org.openapitools.server.model.BusinessAssetsGet200Response;
import org.openapitools.server.model.BusinessMemberAssetsGetResponse;
import org.openapitools.server.model.BusinessMembersAssetAccessDeleteBody;
import org.openapitools.server.model.BusinessPartnerAssetAccessGet200Response;
import java.util.stream.Collectors;
import org.openapitools.server.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.server.model.DeletePartnerAssetAccessBody;
import org.openapitools.server.model.DeletePartnerAssetAccessResultsResponseArray;
import java.util.HexFormat;
import java.util.List;
import org.openapitools.server.model.NonDraftEntityStatus;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PermissionsWithOwner;
import org.openapitools.server.model.PinterestLibError;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateMemberAssetAccessBody;
import org.openapitools.server.model.UpdateMemberAssetsResultsResponseArray;
import org.openapitools.server.model.UpdatePartnerAssetAccessBody;
import org.openapitools.server.model.UpdatePartnerAssetsResultsResponseArray;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'BusinessAccessAssets'",
                             version = "7.24.0")
public interface BusinessAccessAssetsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/asset_groups", this::assetGroupCreate);
        rules.delete("/asset_groups", this::assetGroupDelete);
        rules.patch("/asset_groups", this::assetGroupUpdate);
        rules.get("/assets/{asset_id}/members", this::businessAssetMembersGet);
        rules.get("/assets/{asset_id}/partners", this::businessAssetPartnersGet);
        rules.get("/assets", this::businessAssetsGet);
        rules.get("/members/{member_id}/assets", this::businessMemberAssetsGet);
        rules.delete("/members/assets/access", this::businessMembersAssetAccessDelete);
        rules.patch("/members/assets/access", this::businessMembersAssetAccessUpdate);
        rules.get("/partners/{partner_id}/assets", this::businessPartnerAssetAccessGet);
        rules.delete("/partners/assets", this::deletePartnerAssetAccessHandlerImpl);
        rules.patch("/partners/assets", this::updatePartnerAssetAccessHandlerImpl);
    }


    /**
     * POST /businesses/{business_id}/asset_groups : Create a new asset group..
     *
     * @param request the server request
     * @param response the server response
     */
    void assetGroupCreate(ServerRequest request, ServerResponse response);
    /**
     * DELETE /businesses/{business_id}/asset_groups : Delete asset groups..
     *
     * @param request the server request
     * @param response the server response
     */
    void assetGroupDelete(ServerRequest request, ServerResponse response);
    /**
     * PATCH /businesses/{business_id}/asset_groups : Update asset groups..
     *
     * @param request the server request
     * @param response the server response
     */
    void assetGroupUpdate(ServerRequest request, ServerResponse response);
    /**
     * GET /businesses/{business_id}/assets/{asset_id}/members : Get members with access to asset.
     *
     * @param request the server request
     * @param response the server response
     */
    void businessAssetMembersGet(ServerRequest request, ServerResponse response);
    /**
     * GET /businesses/{business_id}/assets/{asset_id}/partners : Get partners with access to asset.
     *
     * @param request the server request
     * @param response the server response
     */
    void businessAssetPartnersGet(ServerRequest request, ServerResponse response);
    /**
     * GET /businesses/{business_id}/assets : List business assets.
     *
     * @param request the server request
     * @param response the server response
     */
    void businessAssetsGet(ServerRequest request, ServerResponse response);
    /**
     * GET /businesses/{business_id}/members/{member_id}/assets : Get assets assigned to a member.
     *
     * @param request the server request
     * @param response the server response
     */
    void businessMemberAssetsGet(ServerRequest request, ServerResponse response);
    /**
     * DELETE /businesses/{business_id}/members/assets/access : Delete member access to asset.
     *
     * @param request the server request
     * @param response the server response
     */
    void businessMembersAssetAccessDelete(ServerRequest request, ServerResponse response);
    /**
     * PATCH /businesses/{business_id}/members/assets/access : Assign/Update member asset permissions.
     *
     * @param request the server request
     * @param response the server response
     */
    void businessMembersAssetAccessUpdate(ServerRequest request, ServerResponse response);
    /**
     * GET /businesses/{business_id}/partners/{partner_id}/assets : Get assets assigned to a partner or assets assigned by a partner.
     *
     * @param request the server request
     * @param response the server response
     */
    void businessPartnerAssetAccessGet(ServerRequest request, ServerResponse response);
    /**
     * DELETE /businesses/{business_id}/partners/assets : Delete partner access to asset.
     *
     * @param request the server request
     * @param response the server response
     */
    void deletePartnerAssetAccessHandlerImpl(ServerRequest request, ServerResponse response);
    /**
     * PATCH /businesses/{business_id}/partners/assets : Assign/Update partner asset permissions.
     *
     * @param request the server request
     * @param response the server response
     */
    void updatePartnerAssetAccessHandlerImpl(ServerRequest request, ServerResponse response);
}
