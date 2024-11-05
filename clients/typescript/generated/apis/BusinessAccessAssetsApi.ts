// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { BusinessAssetMembersGet200Response } from '../models/BusinessAssetMembersGet200Response';
import { BusinessAssetPartnersGet200Response } from '../models/BusinessAssetPartnersGet200Response';
import { BusinessAssetsGet200Response } from '../models/BusinessAssetsGet200Response';
import { BusinessMemberAssetsGet200Response } from '../models/BusinessMemberAssetsGet200Response';
import { BusinessMembersAssetAccessDeleteRequest } from '../models/BusinessMembersAssetAccessDeleteRequest';
import { BusinessPartnerAssetAccessGet200Response } from '../models/BusinessPartnerAssetAccessGet200Response';
import { CreateAssetGroupBody } from '../models/CreateAssetGroupBody';
import { CreateAssetGroupResponse } from '../models/CreateAssetGroupResponse';
import { DeleteAssetGroupBody } from '../models/DeleteAssetGroupBody';
import { DeleteAssetGroupResponse } from '../models/DeleteAssetGroupResponse';
import { DeleteMemberAccessResultsResponseArray } from '../models/DeleteMemberAccessResultsResponseArray';
import { DeletePartnerAssetAccessBody } from '../models/DeletePartnerAssetAccessBody';
import { DeletePartnerAssetsResultsResponseArray } from '../models/DeletePartnerAssetsResultsResponseArray';
import { PartnerType } from '../models/PartnerType';
import { PermissionsWithOwner } from '../models/PermissionsWithOwner';
import { UpdateAssetGroupBody } from '../models/UpdateAssetGroupBody';
import { UpdateAssetGroupResponse } from '../models/UpdateAssetGroupResponse';
import { UpdateMemberAssetAccessBody } from '../models/UpdateMemberAssetAccessBody';
import { UpdateMemberAssetsResultsResponseArray } from '../models/UpdateMemberAssetsResultsResponseArray';
import { UpdatePartnerAssetAccessBody } from '../models/UpdatePartnerAssetAccessBody';
import { UpdatePartnerAssetsResultsResponseArray } from '../models/UpdatePartnerAssetsResultsResponseArray';

/**
 * no description
 */
export class BusinessAccessAssetsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.
     * Create a new asset group.
     * @param businessId Unique identifier of the requesting business.
     * @param createAssetGroupBody 
     */
    public async assetGroupCreate(businessId: string, createAssetGroupBody: CreateAssetGroupBody, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "assetGroupCreate", "businessId");
        }


        // verify required parameter 'createAssetGroupBody' is not null or undefined
        if (createAssetGroupBody === null || createAssetGroupBody === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "assetGroupCreate", "createAssetGroupBody");
        }


        // Path Params
        const localVarPath = '/businesses/{business_id}/asset_groups'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(createAssetGroupBody, "CreateAssetGroupBody", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Delete a batch of asset groups.
     * Delete asset groups.
     * @param businessId Unique identifier of the requesting business.
     * @param deleteAssetGroupBody 
     */
    public async assetGroupDelete(businessId: string, deleteAssetGroupBody: DeleteAssetGroupBody, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "assetGroupDelete", "businessId");
        }


        // verify required parameter 'deleteAssetGroupBody' is not null or undefined
        if (deleteAssetGroupBody === null || deleteAssetGroupBody === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "assetGroupDelete", "deleteAssetGroupBody");
        }


        // Path Params
        const localVarPath = '/businesses/{business_id}/asset_groups'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(deleteAssetGroupBody, "DeleteAssetGroupBody", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Update a batch of asset groups with the specified parameters.
     * Update asset groups.
     * @param businessId Unique identifier of the requesting business.
     * @param updateAssetGroupBody 
     */
    public async assetGroupUpdate(businessId: string, updateAssetGroupBody: UpdateAssetGroupBody, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "assetGroupUpdate", "businessId");
        }


        // verify required parameter 'updateAssetGroupBody' is not null or undefined
        if (updateAssetGroupBody === null || updateAssetGroupBody === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "assetGroupUpdate", "updateAssetGroupBody");
        }


        // Path Params
        const localVarPath = '/businesses/{business_id}/asset_groups'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateAssetGroupBody, "UpdateAssetGroupBody", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Get all the members the requesting business has granted access to on the given asset.
     * Get members with access to asset
     * @param businessId Unique identifier of the requesting business.
     * @param assetId Unique identifier of a business asset.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
     */
    public async businessAssetMembersGet(businessId: string, assetId: string, bookmark?: string, pageSize?: number, startIndex?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "businessAssetMembersGet", "businessId");
        }


        // verify required parameter 'assetId' is not null or undefined
        if (assetId === null || assetId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "businessAssetMembersGet", "assetId");
        }





        // Path Params
        const localVarPath = '/businesses/{business_id}/assets/{asset_id}/members'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)))
            .replace('{' + 'asset_id' + '}', encodeURIComponent(String(assetId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (bookmark !== undefined) {
            requestContext.setQueryParam("bookmark", ObjectSerializer.serialize(bookmark, "string", ""));
        }

        // Query Params
        if (pageSize !== undefined) {
            requestContext.setQueryParam("page_size", ObjectSerializer.serialize(pageSize, "number", ""));
        }

        // Query Params
        if (startIndex !== undefined) {
            requestContext.setQueryParam("start_index", ObjectSerializer.serialize(startIndex, "number", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
     * Get partners with access to asset
     * @param businessId Unique identifier of the requesting business.
     * @param assetId Unique identifier of a business asset.
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public async businessAssetPartnersGet(businessId: string, assetId: string, startIndex?: number, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "businessAssetPartnersGet", "businessId");
        }


        // verify required parameter 'assetId' is not null or undefined
        if (assetId === null || assetId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "businessAssetPartnersGet", "assetId");
        }





        // Path Params
        const localVarPath = '/businesses/{business_id}/assets/{asset_id}/partners'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)))
            .replace('{' + 'asset_id' + '}', encodeURIComponent(String(assetId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startIndex !== undefined) {
            requestContext.setQueryParam("start_index", ObjectSerializer.serialize(startIndex, "number", ""));
        }

        // Query Params
        if (bookmark !== undefined) {
            requestContext.setQueryParam("bookmark", ObjectSerializer.serialize(bookmark, "string", ""));
        }

        // Query Params
        if (pageSize !== undefined) {
            requestContext.setQueryParam("page_size", ObjectSerializer.serialize(pageSize, "number", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
     * List business assets
     * @param businessId Unique identifier of the requesting business.
     * @param permissions A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
     * @param childAssetId A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
     * @param assetGroupId An asset group unique identifier. Used to fetch assets contained within the specified asset group.
     * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public async businessAssetsGet(businessId: string, permissions?: Array<PermissionsWithOwner>, childAssetId?: string, assetGroupId?: string, assetType?: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP', startIndex?: number, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "businessAssetsGet", "businessId");
        }









        // Path Params
        const localVarPath = '/businesses/{business_id}/assets'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (permissions !== undefined) {
            const serializedParams = ObjectSerializer.serialize(permissions, "Array<PermissionsWithOwner>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("permissions", serializedParam);
            }
        }

        // Query Params
        if (childAssetId !== undefined) {
            requestContext.setQueryParam("child_asset_id", ObjectSerializer.serialize(childAssetId, "string", ""));
        }

        // Query Params
        if (assetGroupId !== undefined) {
            requestContext.setQueryParam("asset_group_id", ObjectSerializer.serialize(assetGroupId, "string", ""));
        }

        // Query Params
        if (assetType !== undefined) {
            requestContext.setQueryParam("asset_type", ObjectSerializer.serialize(assetType, "'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP'", ""));
        }

        // Query Params
        if (startIndex !== undefined) {
            requestContext.setQueryParam("start_index", ObjectSerializer.serialize(startIndex, "number", ""));
        }

        // Query Params
        if (bookmark !== undefined) {
            requestContext.setQueryParam("bookmark", ObjectSerializer.serialize(bookmark, "string", ""));
        }

        // Query Params
        if (pageSize !== undefined) {
            requestContext.setQueryParam("page_size", ObjectSerializer.serialize(pageSize, "number", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
     * Get assets assigned to a member
     * @param businessId Unique identifier of the requesting business.
     * @param memberId The member id to fetch assets for.
     * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public async businessMemberAssetsGet(businessId: string, memberId: string, assetType?: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP', startIndex?: number, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "businessMemberAssetsGet", "businessId");
        }


        // verify required parameter 'memberId' is not null or undefined
        if (memberId === null || memberId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "businessMemberAssetsGet", "memberId");
        }






        // Path Params
        const localVarPath = '/businesses/{business_id}/members/{member_id}/assets'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)))
            .replace('{' + 'member_id' + '}', encodeURIComponent(String(memberId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (assetType !== undefined) {
            requestContext.setQueryParam("asset_type", ObjectSerializer.serialize(assetType, "'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP'", ""));
        }

        // Query Params
        if (startIndex !== undefined) {
            requestContext.setQueryParam("start_index", ObjectSerializer.serialize(startIndex, "number", ""));
        }

        // Query Params
        if (bookmark !== undefined) {
            requestContext.setQueryParam("bookmark", ObjectSerializer.serialize(bookmark, "string", ""));
        }

        // Query Params
        if (pageSize !== undefined) {
            requestContext.setQueryParam("page_size", ObjectSerializer.serialize(pageSize, "number", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Terminate multiple members\' access to an asset.
     * Delete member access to asset
     * @param businessId Unique identifier of the requesting business.
     * @param businessMembersAssetAccessDeleteRequest List member assset permissions to delete.
     */
    public async businessMembersAssetAccessDelete(businessId: string, businessMembersAssetAccessDeleteRequest: BusinessMembersAssetAccessDeleteRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "businessMembersAssetAccessDelete", "businessId");
        }


        // verify required parameter 'businessMembersAssetAccessDeleteRequest' is not null or undefined
        if (businessMembersAssetAccessDeleteRequest === null || businessMembersAssetAccessDeleteRequest === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "businessMembersAssetAccessDelete", "businessMembersAssetAccessDeleteRequest");
        }


        // Path Params
        const localVarPath = '/businesses/{business_id}/members/assets/access'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(businessMembersAssetAccessDeleteRequest, "BusinessMembersAssetAccessDeleteRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Grant multiple members access to assets and/or update multiple member\'s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
     * Assign/Update member asset permissions
     * @param businessId Unique identifier of the requesting business.
     * @param updateMemberAssetAccessBody List of member asset permissions to create or update.
     */
    public async businessMembersAssetAccessUpdate(businessId: string, updateMemberAssetAccessBody: UpdateMemberAssetAccessBody, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "businessMembersAssetAccessUpdate", "businessId");
        }


        // verify required parameter 'updateMemberAssetAccessBody' is not null or undefined
        if (updateMemberAssetAccessBody === null || updateMemberAssetAccessBody === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "businessMembersAssetAccessUpdate", "updateMemberAssetAccessBody");
        }


        // Path Params
        const localVarPath = '/businesses/{business_id}/members/assets/access'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateMemberAssetAccessBody, "UpdateMemberAssetAccessBody", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner\'s business assets that the partner has granted you access to.
     * Get assets assigned to a partner or assets assigned by a partner
     * @param businessId Unique identifier of the requesting business.
     * @param partnerId The partner id to be bound to the Business
     * @param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner\&#39;s business asset.
     * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public async businessPartnerAssetAccessGet(businessId: string, partnerId: string, partnerType?: PartnerType, assetType?: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP', startIndex?: number, pageSize?: number, bookmark?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "businessPartnerAssetAccessGet", "businessId");
        }


        // verify required parameter 'partnerId' is not null or undefined
        if (partnerId === null || partnerId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "businessPartnerAssetAccessGet", "partnerId");
        }







        // Path Params
        const localVarPath = '/businesses/{business_id}/partners/{partner_id}/assets'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)))
            .replace('{' + 'partner_id' + '}', encodeURIComponent(String(partnerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (partnerType !== undefined) {
            const serializedParams = ObjectSerializer.serialize(partnerType, "PartnerType", "");
            for (const key of Object.keys(serializedParams)) {
                requestContext.setQueryParam(key, serializedParams[key]);
            }
        }

        // Query Params
        if (assetType !== undefined) {
            requestContext.setQueryParam("asset_type", ObjectSerializer.serialize(assetType, "'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP'", ""));
        }

        // Query Params
        if (startIndex !== undefined) {
            requestContext.setQueryParam("start_index", ObjectSerializer.serialize(startIndex, "number", ""));
        }

        // Query Params
        if (pageSize !== undefined) {
            requestContext.setQueryParam("page_size", ObjectSerializer.serialize(pageSize, "number", ""));
        }

        // Query Params
        if (bookmark !== undefined) {
            requestContext.setQueryParam("bookmark", ObjectSerializer.serialize(bookmark, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Terminate multiple partners\' access to an asset. If - partner_type=INTERNAL: You will terminate a partner\'s asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner\'s business assets.
     * Delete partner access to asset
     * @param businessId Unique identifier of the requesting business.
     * @param deletePartnerAssetAccessBody 
     */
    public async deletePartnerAssetAccessHandlerImpl(businessId: string, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "deletePartnerAssetAccessHandlerImpl", "businessId");
        }


        // verify required parameter 'deletePartnerAssetAccessBody' is not null or undefined
        if (deletePartnerAssetAccessBody === null || deletePartnerAssetAccessBody === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "deletePartnerAssetAccessHandlerImpl", "deletePartnerAssetAccessBody");
        }


        // Path Params
        const localVarPath = '/businesses/{business_id}/partners/assets'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(deletePartnerAssetAccessBody, "DeletePartnerAssetAccessBody", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Grant multiple partners access to assets and/or update multiple partner\'s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
     * Assign/Update partner asset permissions
     * @param businessId Unique identifier of the requesting business.
     * @param updatePartnerAssetAccessBody A list of assets and permissions to assign to your partners.
     */
    public async updatePartnerAssetAccessHandlerImpl(businessId: string, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "updatePartnerAssetAccessHandlerImpl", "businessId");
        }


        // verify required parameter 'updatePartnerAssetAccessBody' is not null or undefined
        if (updatePartnerAssetAccessBody === null || updatePartnerAssetAccessBody === undefined) {
            throw new RequiredError("BusinessAccessAssetsApi", "updatePartnerAssetAccessHandlerImpl", "updatePartnerAssetAccessBody");
        }


        // Path Params
        const localVarPath = '/businesses/{business_id}/partners/assets'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updatePartnerAssetAccessBody, "UpdatePartnerAssetAccessBody", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class BusinessAccessAssetsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetGroupCreate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetGroupCreateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<CreateAssetGroupResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: CreateAssetGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "CreateAssetGroupResponse", ""
            ) as CreateAssetGroupResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Invalid parameters.", body, response.headers);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: CreateAssetGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "CreateAssetGroupResponse", ""
            ) as CreateAssetGroupResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetGroupDelete
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetGroupDeleteWithHttpInfo(response: ResponseContext): Promise<HttpInfo<DeleteAssetGroupResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: DeleteAssetGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeleteAssetGroupResponse", ""
            ) as DeleteAssetGroupResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Invalid parameters.", body, response.headers);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: DeleteAssetGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeleteAssetGroupResponse", ""
            ) as DeleteAssetGroupResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetGroupUpdate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetGroupUpdateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UpdateAssetGroupResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UpdateAssetGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UpdateAssetGroupResponse", ""
            ) as UpdateAssetGroupResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Invalid parameters.", body, response.headers);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: UpdateAssetGroupResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UpdateAssetGroupResponse", ""
            ) as UpdateAssetGroupResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to businessAssetMembersGet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async businessAssetMembersGetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<BusinessAssetMembersGet200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: BusinessAssetMembersGet200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BusinessAssetMembersGet200Response", ""
            ) as BusinessAssetMembersGet200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: BusinessAssetMembersGet200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BusinessAssetMembersGet200Response", ""
            ) as BusinessAssetMembersGet200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to businessAssetPartnersGet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async businessAssetPartnersGetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<BusinessAssetPartnersGet200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: BusinessAssetPartnersGet200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BusinessAssetPartnersGet200Response", ""
            ) as BusinessAssetPartnersGet200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: BusinessAssetPartnersGet200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BusinessAssetPartnersGet200Response", ""
            ) as BusinessAssetPartnersGet200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to businessAssetsGet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async businessAssetsGetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<BusinessAssetsGet200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: BusinessAssetsGet200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BusinessAssetsGet200Response", ""
            ) as BusinessAssetsGet200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: BusinessAssetsGet200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BusinessAssetsGet200Response", ""
            ) as BusinessAssetsGet200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to businessMemberAssetsGet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async businessMemberAssetsGetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<BusinessMemberAssetsGet200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: BusinessMemberAssetsGet200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BusinessMemberAssetsGet200Response", ""
            ) as BusinessMemberAssetsGet200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: BusinessMemberAssetsGet200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BusinessMemberAssetsGet200Response", ""
            ) as BusinessMemberAssetsGet200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to businessMembersAssetAccessDelete
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async businessMembersAssetAccessDeleteWithHttpInfo(response: ResponseContext): Promise<HttpInfo<DeleteMemberAccessResultsResponseArray >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: DeleteMemberAccessResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeleteMemberAccessResultsResponseArray", ""
            ) as DeleteMemberAccessResultsResponseArray;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: DeleteMemberAccessResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeleteMemberAccessResultsResponseArray", ""
            ) as DeleteMemberAccessResultsResponseArray;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to businessMembersAssetAccessUpdate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async businessMembersAssetAccessUpdateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UpdateMemberAssetsResultsResponseArray >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UpdateMemberAssetsResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UpdateMemberAssetsResultsResponseArray", ""
            ) as UpdateMemberAssetsResultsResponseArray;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: UpdateMemberAssetsResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UpdateMemberAssetsResultsResponseArray", ""
            ) as UpdateMemberAssetsResultsResponseArray;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to businessPartnerAssetAccessGet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async businessPartnerAssetAccessGetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<BusinessPartnerAssetAccessGet200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: BusinessPartnerAssetAccessGet200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BusinessPartnerAssetAccessGet200Response", ""
            ) as BusinessPartnerAssetAccessGet200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: BusinessPartnerAssetAccessGet200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BusinessPartnerAssetAccessGet200Response", ""
            ) as BusinessPartnerAssetAccessGet200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deletePartnerAssetAccessHandlerImpl
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deletePartnerAssetAccessHandlerImplWithHttpInfo(response: ResponseContext): Promise<HttpInfo<DeletePartnerAssetsResultsResponseArray >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: DeletePartnerAssetsResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeletePartnerAssetsResultsResponseArray", ""
            ) as DeletePartnerAssetsResultsResponseArray;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: DeletePartnerAssetsResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeletePartnerAssetsResultsResponseArray", ""
            ) as DeletePartnerAssetsResultsResponseArray;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updatePartnerAssetAccessHandlerImpl
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updatePartnerAssetAccessHandlerImplWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UpdatePartnerAssetsResultsResponseArray >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UpdatePartnerAssetsResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UpdatePartnerAssetsResultsResponseArray", ""
            ) as UpdatePartnerAssetsResultsResponseArray;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: UpdatePartnerAssetsResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UpdatePartnerAssetsResultsResponseArray", ""
            ) as UpdatePartnerAssetsResultsResponseArray;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
