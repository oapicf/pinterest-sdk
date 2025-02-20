/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import type {
  DeletePartnersRequest,
  DeletePartnersResponse,
  DeletedMembersResponse,
  GetBusinessEmployers200Response,
  GetBusinessMembers200Response,
  GetBusinessPartners200Response,
  MemberBusinessRole,
  MembersToDeleteBody,
  PartnerType,
  UpdateMemberBusinessRoleBody,
  UpdateMemberResultsResponseArray,
} from '../models/index';
import {
    DeletePartnersRequestFromJSON,
    DeletePartnersRequestToJSON,
    DeletePartnersResponseFromJSON,
    DeletePartnersResponseToJSON,
    DeletedMembersResponseFromJSON,
    DeletedMembersResponseToJSON,
    GetBusinessEmployers200ResponseFromJSON,
    GetBusinessEmployers200ResponseToJSON,
    GetBusinessMembers200ResponseFromJSON,
    GetBusinessMembers200ResponseToJSON,
    GetBusinessPartners200ResponseFromJSON,
    GetBusinessPartners200ResponseToJSON,
    MemberBusinessRoleFromJSON,
    MemberBusinessRoleToJSON,
    MembersToDeleteBodyFromJSON,
    MembersToDeleteBodyToJSON,
    PartnerTypeFromJSON,
    PartnerTypeToJSON,
    UpdateMemberBusinessRoleBodyFromJSON,
    UpdateMemberBusinessRoleBodyToJSON,
    UpdateMemberResultsResponseArrayFromJSON,
    UpdateMemberResultsResponseArrayToJSON,
} from '../models/index';

export interface DeleteBusinessMembershipRequest {
    businessId: string;
    membersToDeleteBody: MembersToDeleteBody;
}

export interface DeleteBusinessPartnersRequest {
    businessId: string;
    deletePartnersRequest: DeletePartnersRequest;
}

export interface GetBusinessEmployersRequest {
    pageSize?: number;
    bookmark?: string;
}

export interface GetBusinessMembersRequest {
    businessId: string;
    assetsSummary?: boolean;
    businessRoles?: Array<MemberBusinessRole>;
    memberIds?: string;
    startIndex?: number;
    bookmark?: string;
    pageSize?: number;
}

export interface GetBusinessPartnersRequest {
    businessId: string;
    assetsSummary?: boolean;
    partnerType?: PartnerType;
    partnerIds?: string;
    startIndex?: number;
    pageSize?: number;
    bookmark?: string;
}

export interface UpdateBusinessMembershipsRequest {
    businessId: string;
    updateMemberBusinessRoleBody: Array<UpdateMemberBusinessRoleBody>;
}

/**
 * 
 */
export class BusinessAccessRelationshipsApi extends runtime.BaseAPI {

    /**
     * Terminate memberships between the specified members and your business.
     * Terminate business memberships
     */
    async deleteBusinessMembershipRaw(requestParameters: DeleteBusinessMembershipRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<DeletedMembersResponse>> {
        if (requestParameters['businessId'] == null) {
            throw new runtime.RequiredError(
                'businessId',
                'Required parameter "businessId" was null or undefined when calling deleteBusinessMembership().'
            );
        }

        if (requestParameters['membersToDeleteBody'] == null) {
            throw new runtime.RequiredError(
                'membersToDeleteBody',
                'Required parameter "membersToDeleteBody" was null or undefined when calling deleteBusinessMembership().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["biz_access:read", "biz_access:write"]);
        }

        const response = await this.request({
            path: `/businesses/{business_id}/members`.replace(`{${"business_id"}}`, encodeURIComponent(String(requestParameters['businessId']))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
            body: MembersToDeleteBodyToJSON(requestParameters['membersToDeleteBody']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => DeletedMembersResponseFromJSON(jsonValue));
    }

    /**
     * Terminate memberships between the specified members and your business.
     * Terminate business memberships
     */
    async deleteBusinessMembership(requestParameters: DeleteBusinessMembershipRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<DeletedMembersResponse> {
        const response = await this.deleteBusinessMembershipRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
     * Terminate business partnerships
     */
    async deleteBusinessPartnersRaw(requestParameters: DeleteBusinessPartnersRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<DeletePartnersResponse>> {
        if (requestParameters['businessId'] == null) {
            throw new runtime.RequiredError(
                'businessId',
                'Required parameter "businessId" was null or undefined when calling deleteBusinessPartners().'
            );
        }

        if (requestParameters['deletePartnersRequest'] == null) {
            throw new runtime.RequiredError(
                'deletePartnersRequest',
                'Required parameter "deletePartnersRequest" was null or undefined when calling deleteBusinessPartners().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["biz_access:write"]);
        }

        const response = await this.request({
            path: `/businesses/{business_id}/partners`.replace(`{${"business_id"}}`, encodeURIComponent(String(requestParameters['businessId']))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
            body: DeletePartnersRequestToJSON(requestParameters['deletePartnersRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => DeletePartnersResponseFromJSON(jsonValue));
    }

    /**
     * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
     * Terminate business partnerships
     */
    async deleteBusinessPartners(requestParameters: DeleteBusinessPartnersRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<DeletePartnersResponse> {
        const response = await this.deleteBusinessPartnersRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get all of the viewing user\'s business employers.
     * List business employers for user
     */
    async getBusinessEmployersRaw(requestParameters: GetBusinessEmployersRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetBusinessEmployers200Response>> {
        const queryParameters: any = {};

        if (requestParameters['pageSize'] != null) {
            queryParameters['page_size'] = requestParameters['pageSize'];
        }

        if (requestParameters['bookmark'] != null) {
            queryParameters['bookmark'] = requestParameters['bookmark'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["biz_access:read"]);
        }

        const response = await this.request({
            path: `/businesses/employers`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetBusinessEmployers200ResponseFromJSON(jsonValue));
    }

    /**
     * Get all of the viewing user\'s business employers.
     * List business employers for user
     */
    async getBusinessEmployers(requestParameters: GetBusinessEmployersRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetBusinessEmployers200Response> {
        const response = await this.getBusinessEmployersRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get all members of the specified business. The return response will include the member\'s business_role and assets they have access to if assets_summary=TRUE
     * Get business members
     */
    async getBusinessMembersRaw(requestParameters: GetBusinessMembersRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetBusinessMembers200Response>> {
        if (requestParameters['businessId'] == null) {
            throw new runtime.RequiredError(
                'businessId',
                'Required parameter "businessId" was null or undefined when calling getBusinessMembers().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['assetsSummary'] != null) {
            queryParameters['assets_summary'] = requestParameters['assetsSummary'];
        }

        if (requestParameters['businessRoles'] != null) {
            queryParameters['business_roles'] = requestParameters['businessRoles'];
        }

        if (requestParameters['memberIds'] != null) {
            queryParameters['member_ids'] = requestParameters['memberIds'];
        }

        if (requestParameters['startIndex'] != null) {
            queryParameters['start_index'] = requestParameters['startIndex'];
        }

        if (requestParameters['bookmark'] != null) {
            queryParameters['bookmark'] = requestParameters['bookmark'];
        }

        if (requestParameters['pageSize'] != null) {
            queryParameters['page_size'] = requestParameters['pageSize'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["biz_access:read"]);
        }

        const response = await this.request({
            path: `/businesses/{business_id}/members`.replace(`{${"business_id"}}`, encodeURIComponent(String(requestParameters['businessId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetBusinessMembers200ResponseFromJSON(jsonValue));
    }

    /**
     * Get all members of the specified business. The return response will include the member\'s business_role and assets they have access to if assets_summary=TRUE
     * Get business members
     */
    async getBusinessMembers(requestParameters: GetBusinessMembersRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetBusinessMembers200Response> {
        const response = await this.getBusinessMembersRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner\'s business assets the partner has granted you   access to.
     * Get business partners
     */
    async getBusinessPartnersRaw(requestParameters: GetBusinessPartnersRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetBusinessPartners200Response>> {
        if (requestParameters['businessId'] == null) {
            throw new runtime.RequiredError(
                'businessId',
                'Required parameter "businessId" was null or undefined when calling getBusinessPartners().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['assetsSummary'] != null) {
            queryParameters['assets_summary'] = requestParameters['assetsSummary'];
        }

        if (requestParameters['partnerType'] != null) {
            queryParameters['partner_type'] = requestParameters['partnerType'];
        }

        if (requestParameters['partnerIds'] != null) {
            queryParameters['partner_ids'] = requestParameters['partnerIds'];
        }

        if (requestParameters['startIndex'] != null) {
            queryParameters['start_index'] = requestParameters['startIndex'];
        }

        if (requestParameters['pageSize'] != null) {
            queryParameters['page_size'] = requestParameters['pageSize'];
        }

        if (requestParameters['bookmark'] != null) {
            queryParameters['bookmark'] = requestParameters['bookmark'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["biz_access:read"]);
        }

        const response = await this.request({
            path: `/businesses/{business_id}/partners`.replace(`{${"business_id"}}`, encodeURIComponent(String(requestParameters['businessId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetBusinessPartners200ResponseFromJSON(jsonValue));
    }

    /**
     * Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner\'s business assets the partner has granted you   access to.
     * Get business partners
     */
    async getBusinessPartners(requestParameters: GetBusinessPartnersRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetBusinessPartners200Response> {
        const response = await this.getBusinessPartnersRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Update a member\'s business role within the business.
     * Update member\'s business role
     */
    async updateBusinessMembershipsRaw(requestParameters: UpdateBusinessMembershipsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<UpdateMemberResultsResponseArray>> {
        if (requestParameters['businessId'] == null) {
            throw new runtime.RequiredError(
                'businessId',
                'Required parameter "businessId" was null or undefined when calling updateBusinessMemberships().'
            );
        }

        if (requestParameters['updateMemberBusinessRoleBody'] == null) {
            throw new runtime.RequiredError(
                'updateMemberBusinessRoleBody',
                'Required parameter "updateMemberBusinessRoleBody" was null or undefined when calling updateBusinessMemberships().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["biz_access:write"]);
        }

        const response = await this.request({
            path: `/businesses/{business_id}/members`.replace(`{${"business_id"}}`, encodeURIComponent(String(requestParameters['businessId']))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters['updateMemberBusinessRoleBody']!.map(UpdateMemberBusinessRoleBodyToJSON),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => UpdateMemberResultsResponseArrayFromJSON(jsonValue));
    }

    /**
     * Update a member\'s business role within the business.
     * Update member\'s business role
     */
    async updateBusinessMemberships(requestParameters: UpdateBusinessMembershipsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<UpdateMemberResultsResponseArray> {
        const response = await this.updateBusinessMembershipsRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
