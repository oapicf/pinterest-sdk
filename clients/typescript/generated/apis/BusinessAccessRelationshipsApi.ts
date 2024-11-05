// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { DeletePartnersRequest } from '../models/DeletePartnersRequest';
import { DeletePartnersResponse } from '../models/DeletePartnersResponse';
import { DeletedMembersResponse } from '../models/DeletedMembersResponse';
import { GetBusinessEmployers200Response } from '../models/GetBusinessEmployers200Response';
import { GetBusinessMembers200Response } from '../models/GetBusinessMembers200Response';
import { GetBusinessPartners200Response } from '../models/GetBusinessPartners200Response';
import { MemberBusinessRole } from '../models/MemberBusinessRole';
import { MembersToDeleteBody } from '../models/MembersToDeleteBody';
import { PartnerType } from '../models/PartnerType';
import { UpdateMemberBusinessRoleBody } from '../models/UpdateMemberBusinessRoleBody';
import { UpdateMemberResultsResponseArray } from '../models/UpdateMemberResultsResponseArray';

/**
 * no description
 */
export class BusinessAccessRelationshipsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Terminate memberships between the specified members and your business.
     * Terminate business memberships
     * @param businessId Business id
     * @param membersToDeleteBody List of members with role to delete.
     */
    public async deleteBusinessMembership(businessId: string, membersToDeleteBody: MembersToDeleteBody, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessRelationshipsApi", "deleteBusinessMembership", "businessId");
        }


        // verify required parameter 'membersToDeleteBody' is not null or undefined
        if (membersToDeleteBody === null || membersToDeleteBody === undefined) {
            throw new RequiredError("BusinessAccessRelationshipsApi", "deleteBusinessMembership", "membersToDeleteBody");
        }


        // Path Params
        const localVarPath = '/businesses/{business_id}/members'
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
            ObjectSerializer.serialize(membersToDeleteBody, "MembersToDeleteBody", ""),
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
     * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
     * Terminate business partnerships
     * @param businessId Unique identifier of the requesting business.
     * @param deletePartnersRequest An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete. 
     */
    public async deleteBusinessPartners(businessId: string, deletePartnersRequest: DeletePartnersRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessRelationshipsApi", "deleteBusinessPartners", "businessId");
        }


        // verify required parameter 'deletePartnersRequest' is not null or undefined
        if (deletePartnersRequest === null || deletePartnersRequest === undefined) {
            throw new RequiredError("BusinessAccessRelationshipsApi", "deleteBusinessPartners", "deletePartnersRequest");
        }


        // Path Params
        const localVarPath = '/businesses/{business_id}/partners'
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
            ObjectSerializer.serialize(deletePartnersRequest, "DeletePartnersRequest", ""),
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
     * Get all of the viewing user\'s business employers.
     * List business employers for user
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public async getBusinessEmployers(pageSize?: number, bookmark?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/businesses/employers';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

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
     * Get all members of the specified business. The return response will include the member\'s business_role and assets they have access to if assets_summary=TRUE
     * Get business members
     * @param businessId Unique identifier of the requesting business.
     * @param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
     * @param businessRoles A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
     * @param memberIds A list of business members ids separated by comma.
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     */
    public async getBusinessMembers(businessId: string, assetsSummary?: boolean, businessRoles?: Array<MemberBusinessRole>, memberIds?: string, startIndex?: number, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessRelationshipsApi", "getBusinessMembers", "businessId");
        }








        // Path Params
        const localVarPath = '/businesses/{business_id}/members'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (assetsSummary !== undefined) {
            requestContext.setQueryParam("assets_summary", ObjectSerializer.serialize(assetsSummary, "boolean", ""));
        }

        // Query Params
        if (businessRoles !== undefined) {
            const serializedParams = ObjectSerializer.serialize(businessRoles, "Array<MemberBusinessRole>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("business_roles", serializedParam);
            }
        }

        // Query Params
        if (memberIds !== undefined) {
            requestContext.setQueryParam("member_ids", ObjectSerializer.serialize(memberIds, "string", ""));
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
     * Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner\'s business assets the partner has granted you   access to.
     * Get business partners
     * @param businessId Unique identifier of the requesting business.
     * @param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
     * @param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner\&#39;s business asset.
     * @param partnerIds A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public async getBusinessPartners(businessId: string, assetsSummary?: boolean, partnerType?: PartnerType, partnerIds?: string, startIndex?: number, pageSize?: number, bookmark?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessRelationshipsApi", "getBusinessPartners", "businessId");
        }








        // Path Params
        const localVarPath = '/businesses/{business_id}/partners'
            .replace('{' + 'business_id' + '}', encodeURIComponent(String(businessId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (assetsSummary !== undefined) {
            requestContext.setQueryParam("assets_summary", ObjectSerializer.serialize(assetsSummary, "boolean", ""));
        }

        // Query Params
        if (partnerType !== undefined) {
            const serializedParams = ObjectSerializer.serialize(partnerType, "PartnerType", "");
            for (const key of Object.keys(serializedParams)) {
                requestContext.setQueryParam(key, serializedParams[key]);
            }
        }

        // Query Params
        if (partnerIds !== undefined) {
            requestContext.setQueryParam("partner_ids", ObjectSerializer.serialize(partnerIds, "string", ""));
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
     * Update a member\'s business role within the business.
     * Update member\'s business role
     * @param businessId Business id
     * @param updateMemberBusinessRoleBody List of objects with the member id and the business_role.
     */
    public async updateBusinessMemberships(businessId: string, updateMemberBusinessRoleBody: Array<UpdateMemberBusinessRoleBody>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'businessId' is not null or undefined
        if (businessId === null || businessId === undefined) {
            throw new RequiredError("BusinessAccessRelationshipsApi", "updateBusinessMemberships", "businessId");
        }


        // verify required parameter 'updateMemberBusinessRoleBody' is not null or undefined
        if (updateMemberBusinessRoleBody === null || updateMemberBusinessRoleBody === undefined) {
            throw new RequiredError("BusinessAccessRelationshipsApi", "updateBusinessMemberships", "updateMemberBusinessRoleBody");
        }


        // Path Params
        const localVarPath = '/businesses/{business_id}/members'
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
            ObjectSerializer.serialize(updateMemberBusinessRoleBody, "Array<UpdateMemberBusinessRoleBody>", ""),
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

export class BusinessAccessRelationshipsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteBusinessMembership
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteBusinessMembershipWithHttpInfo(response: ResponseContext): Promise<HttpInfo<DeletedMembersResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: DeletedMembersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeletedMembersResponse", ""
            ) as DeletedMembersResponse;
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
            const body: DeletedMembersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeletedMembersResponse", ""
            ) as DeletedMembersResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteBusinessPartners
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteBusinessPartnersWithHttpInfo(response: ResponseContext): Promise<HttpInfo<DeletePartnersResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: DeletePartnersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeletePartnersResponse", ""
            ) as DeletePartnersResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "A supplied partner id doesn\&#39;t exist", body, response.headers);
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
            const body: DeletePartnersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeletePartnersResponse", ""
            ) as DeletePartnersResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getBusinessEmployers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getBusinessEmployersWithHttpInfo(response: ResponseContext): Promise<HttpInfo<GetBusinessEmployers200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: GetBusinessEmployers200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "GetBusinessEmployers200Response", ""
            ) as GetBusinessEmployers200Response;
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
            const body: GetBusinessEmployers200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "GetBusinessEmployers200Response", ""
            ) as GetBusinessEmployers200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getBusinessMembers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getBusinessMembersWithHttpInfo(response: ResponseContext): Promise<HttpInfo<GetBusinessMembers200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: GetBusinessMembers200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "GetBusinessMembers200Response", ""
            ) as GetBusinessMembers200Response;
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
            const body: GetBusinessMembers200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "GetBusinessMembers200Response", ""
            ) as GetBusinessMembers200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getBusinessPartners
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getBusinessPartnersWithHttpInfo(response: ResponseContext): Promise<HttpInfo<GetBusinessPartners200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: GetBusinessPartners200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "GetBusinessPartners200Response", ""
            ) as GetBusinessPartners200Response;
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
            const body: GetBusinessPartners200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "GetBusinessPartners200Response", ""
            ) as GetBusinessPartners200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateBusinessMemberships
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateBusinessMembershipsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UpdateMemberResultsResponseArray >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UpdateMemberResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UpdateMemberResultsResponseArray", ""
            ) as UpdateMemberResultsResponseArray;
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
            const body: UpdateMemberResultsResponseArray = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UpdateMemberResultsResponseArray", ""
            ) as UpdateMemberResultsResponseArray;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
