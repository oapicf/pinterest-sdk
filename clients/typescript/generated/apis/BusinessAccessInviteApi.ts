// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { AuthRespondInvitesBody } from '../models/AuthRespondInvitesBody';
import { CancelInvitesBody } from '../models/CancelInvitesBody';
import { CreateAssetAccessRequestBody } from '../models/CreateAssetAccessRequestBody';
import { CreateAssetAccessRequestResponse } from '../models/CreateAssetAccessRequestResponse';
import { CreateAssetInvitesRequest } from '../models/CreateAssetInvitesRequest';
import { CreateInvitesResultsResponseArray } from '../models/CreateInvitesResultsResponseArray';
import { CreateMembershipOrPartnershipInvitesBody } from '../models/CreateMembershipOrPartnershipInvitesBody';
import { DeleteInvitesResultsResponseArray } from '../models/DeleteInvitesResultsResponseArray';
import { GetInvites200Response } from '../models/GetInvites200Response';
import { InviteType } from '../models/InviteType';
import { RespondToInvitesResponseArray } from '../models/RespondToInvitesResponseArray';
import { UpdateInvitesResultsResponseArray } from '../models/UpdateInvitesResultsResponseArray';

/**
 * no description
 */
export class BusinessAccessInviteApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Create a request to access an existing partner\'s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
     * Create a request to access an existing partner\'s assets.
     * @param businessId Unique identifier of the requesting business.
     * @param createAssetAccessRequestBody 
     */
    public async assetAccessRequestsCreate(businessId: string, createAssetAccessRequestBody: CreateAssetAccessRequestBody, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessInviteApi", "assetAccessRequestsCreate", "businessId");
        }


        // verify required parameter 'createAssetAccessRequestBody' is not null or undefined
        if (createAssetAccessRequestBody === null || createAssetAccessRequestBody === undefined) {
            throw new RequiredError("BusinessAccessInviteApi", "assetAccessRequestsCreate", "createAssetAccessRequestBody");
        }


        // Path Params
        const localVarPath = '/businesses/{business_id}/requests/assets/access'
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
            ObjectSerializer.serialize(createAssetAccessRequestBody, "CreateAssetAccessRequestBody", ""),
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
     * Cancel membership/partnership invites and/or requests.
     * Cancel invites/requests
     * @param businessId Business id
     * @param cancelInvitesBody A list with invite ids
     */
    public async cancelInvitesOrRequests(businessId: string, cancelInvitesBody: CancelInvitesBody, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessInviteApi", "cancelInvitesOrRequests", "businessId");
        }


        // verify required parameter 'cancelInvitesBody' is not null or undefined
        if (cancelInvitesBody === null || cancelInvitesBody === undefined) {
            throw new RequiredError("BusinessAccessInviteApi", "cancelInvitesOrRequests", "cancelInvitesBody");
        }


        // Path Params
        const localVarPath = '/businesses/{business_id}/invites'
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
            ObjectSerializer.serialize(cancelInvitesBody, "CancelInvitesBody", ""),
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
     * Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner\'s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner\'s assets\" to request access to your   partner\'s assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
     * Update invite/request with an asset permission
     * @param businessId Unique identifier of the requesting business.
     * @param createAssetInvitesRequest A list of invites/requests together with the asset permissions to be assigned to the invite/request. 
     */
    public async createAssetInvites(businessId: string, createAssetInvitesRequest: CreateAssetInvitesRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessInviteApi", "createAssetInvites", "businessId");
        }


        // verify required parameter 'createAssetInvitesRequest' is not null or undefined
        if (createAssetInvitesRequest === null || createAssetInvitesRequest === undefined) {
            throw new RequiredError("BusinessAccessInviteApi", "createAssetInvites", "createAssetInvitesRequest");
        }


        // Path Params
        const localVarPath = '/businesses/{business_id}/invites/assets/access'
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
            ObjectSerializer.serialize(createAssetInvitesRequest, "CreateAssetInvitesRequest", ""),
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
     * Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
     * Create invites or requests
     * @param businessId Business id
     * @param createMembershipOrPartnershipInvitesBody An object with the properties: invite_type, partners, members, business_role
     */
    public async createMembershipOrPartnershipInvites(businessId: string, createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessInviteApi", "createMembershipOrPartnershipInvites", "businessId");
        }


        // verify required parameter 'createMembershipOrPartnershipInvitesBody' is not null or undefined
        if (createMembershipOrPartnershipInvitesBody === null || createMembershipOrPartnershipInvitesBody === undefined) {
            throw new RequiredError("BusinessAccessInviteApi", "createMembershipOrPartnershipInvites", "createMembershipOrPartnershipInvitesBody");
        }


        // Path Params
        const localVarPath = '/businesses/{business_id}/invites'
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
            ObjectSerializer.serialize(createMembershipOrPartnershipInvitesBody, "CreateMembershipOrPartnershipInvitesBody", ""),
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
     * Get the membership/partnership invites and/or requests for the authorized user.
     * Get invites/requests
     * @param businessId Unique identifier of the requesting business.
     * @param isMember A boolean field to indicate whether the invite is to create a partnership or a membership.
     * @param inviteStatus A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
     * @param inviteType Invite type to filter invites by. Only invites of the specified type will be returned.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public async getInvites(businessId: string, isMember?: boolean, inviteStatus?: Array<'PENDING' | 'EXPIRED'>, inviteType?: InviteType, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessInviteApi", "getInvites", "businessId");
        }







        // Path Params
        const localVarPath = '/businesses/{business_id}/invites'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (isMember !== undefined) {
            requestContext.setQueryParam("is_member", ObjectSerializer.serialize(isMember, "boolean", ""));
        }

        // Query Params
        if (inviteStatus !== undefined) {
            const serializedParams = ObjectSerializer.serialize(inviteStatus, "Array<'PENDING' | 'EXPIRED'>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("invite_status", serializedParam);
            }
        }

        // Query Params
        if (inviteType !== undefined) {
            const serializedParams = ObjectSerializer.serialize(inviteType, "InviteType", "");
            for (const key of Object.keys(serializedParams)) {
                requestContext.setQueryParam(key, serializedParams[key]);
            }
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
     * Accept or decline invites or requests.
     * Accept or decline an invite/request
     * @param authRespondInvitesBody 
     */
    public async respondBusinessAccessInvites(authRespondInvitesBody: AuthRespondInvitesBody, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'authRespondInvitesBody' is not null or undefined
        if (authRespondInvitesBody === null || authRespondInvitesBody === undefined) {
            throw new RequiredError("BusinessAccessInviteApi", "respondBusinessAccessInvites", "authRespondInvitesBody");
        }


        // Path Params
        const localVarPath = '/businesses/invites';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(authRespondInvitesBody, "AuthRespondInvitesBody", ""),
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

export class BusinessAccessInviteApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetAccessRequestsCreate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetAccessRequestsCreateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<CreateAssetAccessRequestResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: CreateAssetAccessRequestResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "CreateAssetAccessRequestResponse", ""
            ) as CreateAssetAccessRequestResponse;
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
            const body: CreateAssetAccessRequestResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "CreateAssetAccessRequestResponse", ""
            ) as CreateAssetAccessRequestResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to cancelInvitesOrRequests
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async cancelInvitesOrRequestsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<DeleteInvitesResultsResponseArray >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: DeleteInvitesResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeleteInvitesResultsResponseArray", ""
            ) as DeleteInvitesResultsResponseArray;
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
            const body: DeleteInvitesResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeleteInvitesResultsResponseArray", ""
            ) as DeleteInvitesResultsResponseArray;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createAssetInvites
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createAssetInvitesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UpdateInvitesResultsResponseArray >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UpdateInvitesResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UpdateInvitesResultsResponseArray", ""
            ) as UpdateInvitesResultsResponseArray;
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
            const body: UpdateInvitesResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UpdateInvitesResultsResponseArray", ""
            ) as UpdateInvitesResultsResponseArray;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createMembershipOrPartnershipInvites
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createMembershipOrPartnershipInvitesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<CreateInvitesResultsResponseArray >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: CreateInvitesResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "CreateInvitesResultsResponseArray", ""
            ) as CreateInvitesResultsResponseArray;
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
            const body: CreateInvitesResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "CreateInvitesResultsResponseArray", ""
            ) as CreateInvitesResultsResponseArray;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getInvites
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getInvitesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<GetInvites200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: GetInvites200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "GetInvites200Response", ""
            ) as GetInvites200Response;
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
            const body: GetInvites200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "GetInvites200Response", ""
            ) as GetInvites200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to respondBusinessAccessInvites
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async respondBusinessAccessInvitesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<RespondToInvitesResponseArray >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: RespondToInvitesResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RespondToInvitesResponseArray", ""
            ) as RespondToInvitesResponseArray;
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
            const body: RespondToInvitesResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RespondToInvitesResponseArray", ""
            ) as RespondToInvitesResponseArray;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
