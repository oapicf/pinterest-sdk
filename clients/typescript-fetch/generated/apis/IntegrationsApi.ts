/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import type {
  DetailedError,
  IntegrationLogsRequest,
  IntegrationLogsSuccessResponse,
  IntegrationMetadata,
  IntegrationRecord,
  IntegrationRequest,
  IntegrationRequestPatch,
  IntegrationsGetList200Response,
} from '../models/index';
import {
    DetailedErrorFromJSON,
    DetailedErrorToJSON,
    IntegrationLogsRequestFromJSON,
    IntegrationLogsRequestToJSON,
    IntegrationLogsSuccessResponseFromJSON,
    IntegrationLogsSuccessResponseToJSON,
    IntegrationMetadataFromJSON,
    IntegrationMetadataToJSON,
    IntegrationRecordFromJSON,
    IntegrationRecordToJSON,
    IntegrationRequestFromJSON,
    IntegrationRequestToJSON,
    IntegrationRequestPatchFromJSON,
    IntegrationRequestPatchToJSON,
    IntegrationsGetList200ResponseFromJSON,
    IntegrationsGetList200ResponseToJSON,
} from '../models/index';

export interface IntegrationsCommerceDelRequest {
    externalBusinessId: string;
}

export interface IntegrationsCommerceGetRequest {
    externalBusinessId: string;
}

export interface IntegrationsCommercePatchRequest {
    externalBusinessId: string;
    integrationRequestPatch?: IntegrationRequestPatch;
}

export interface IntegrationsCommercePostRequest {
    integrationRequest?: IntegrationRequest;
}

export interface IntegrationsGetByIdRequest {
    id: string;
}

export interface IntegrationsGetListRequest {
    bookmark?: string;
    pageSize?: number;
}

export interface IntegrationsLogsPostRequest {
    integrationLogsRequest: IntegrationLogsRequest;
}

/**
 * 
 */
export class IntegrationsApi extends runtime.BaseAPI {

    /**
     * Delete commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Delete commerce integration
     */
    async integrationsCommerceDelRaw(requestParameters: IntegrationsCommerceDelRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters['externalBusinessId'] == null) {
            throw new runtime.RequiredError(
                'externalBusinessId',
                'Required parameter "externalBusinessId" was null or undefined when calling integrationsCommerceDel().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["ads:write"]);
        }

        const response = await this.request({
            path: `/integrations/commerce/{external_business_id}`.replace(`{${"external_business_id"}}`, encodeURIComponent(String(requestParameters['externalBusinessId']))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Delete commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Delete commerce integration
     */
    async integrationsCommerceDel(requestParameters: IntegrationsCommerceDelRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.integrationsCommerceDelRaw(requestParameters, initOverrides);
    }

    /**
     * Get commerce integration metadata associated with the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get commerce integration
     */
    async integrationsCommerceGetRaw(requestParameters: IntegrationsCommerceGetRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<IntegrationMetadata>> {
        if (requestParameters['externalBusinessId'] == null) {
            throw new runtime.RequiredError(
                'externalBusinessId',
                'Required parameter "externalBusinessId" was null or undefined when calling integrationsCommerceGet().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["ads:read"]);
        }

        const response = await this.request({
            path: `/integrations/commerce/{external_business_id}`.replace(`{${"external_business_id"}}`, encodeURIComponent(String(requestParameters['externalBusinessId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => IntegrationMetadataFromJSON(jsonValue));
    }

    /**
     * Get commerce integration metadata associated with the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get commerce integration
     */
    async integrationsCommerceGet(requestParameters: IntegrationsCommerceGetRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<IntegrationMetadata> {
        const response = await this.integrationsCommerceGetRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Update commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Update commerce integration
     */
    async integrationsCommercePatchRaw(requestParameters: IntegrationsCommercePatchRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<IntegrationMetadata>> {
        if (requestParameters['externalBusinessId'] == null) {
            throw new runtime.RequiredError(
                'externalBusinessId',
                'Required parameter "externalBusinessId" was null or undefined when calling integrationsCommercePatch().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["ads:write"]);
        }

        const response = await this.request({
            path: `/integrations/commerce/{external_business_id}`.replace(`{${"external_business_id"}}`, encodeURIComponent(String(requestParameters['externalBusinessId']))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: IntegrationRequestPatchToJSON(requestParameters['integrationRequestPatch']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => IntegrationMetadataFromJSON(jsonValue));
    }

    /**
     * Update commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Update commerce integration
     */
    async integrationsCommercePatch(requestParameters: IntegrationsCommercePatchRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<IntegrationMetadata> {
        const response = await this.integrationsCommercePatchRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Create commerce integration
     */
    async integrationsCommercePostRaw(requestParameters: IntegrationsCommercePostRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<IntegrationMetadata>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["ads:write"]);
        }

        const response = await this.request({
            path: `/integrations/commerce`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: IntegrationRequestToJSON(requestParameters['integrationRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => IntegrationMetadataFromJSON(jsonValue));
    }

    /**
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Create commerce integration
     */
    async integrationsCommercePost(requestParameters: IntegrationsCommercePostRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<IntegrationMetadata> {
        const response = await this.integrationsCommercePostRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get integration metadata by ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata
     */
    async integrationsGetByIdRaw(requestParameters: IntegrationsGetByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<IntegrationRecord>> {
        if (requestParameters['id'] == null) {
            throw new runtime.RequiredError(
                'id',
                'Required parameter "id" was null or undefined when calling integrationsGetById().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["ads:read"]);
        }

        const response = await this.request({
            path: `/integrations/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters['id']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => IntegrationRecordFromJSON(jsonValue));
    }

    /**
     * Get integration metadata by ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata
     */
    async integrationsGetById(requestParameters: IntegrationsGetByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<IntegrationRecord> {
        const response = await this.integrationsGetByIdRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get integration metadata list. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata list
     */
    async integrationsGetListRaw(requestParameters: IntegrationsGetListRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<IntegrationsGetList200Response>> {
        const queryParameters: any = {};

        if (requestParameters['bookmark'] != null) {
            queryParameters['bookmark'] = requestParameters['bookmark'];
        }

        if (requestParameters['pageSize'] != null) {
            queryParameters['page_size'] = requestParameters['pageSize'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["ads:read"]);
        }

        const response = await this.request({
            path: `/integrations`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => IntegrationsGetList200ResponseFromJSON(jsonValue));
    }

    /**
     * Get integration metadata list. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get integration metadata list
     */
    async integrationsGetList(requestParameters: IntegrationsGetListRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<IntegrationsGetList200Response> {
        const response = await this.integrationsGetListRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * This endpoint receives batched logs from integration applications on partner platforms. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Receives batched logs from integration applications.
     */
    async integrationsLogsPostRaw(requestParameters: IntegrationsLogsPostRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<IntegrationLogsSuccessResponse>> {
        if (requestParameters['integrationLogsRequest'] == null) {
            throw new runtime.RequiredError(
                'integrationLogsRequest',
                'Required parameter "integrationLogsRequest" was null or undefined when calling integrationsLogsPost().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["ads:write"]);
        }

        const response = await this.request({
            path: `/integrations/logs`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: IntegrationLogsRequestToJSON(requestParameters['integrationLogsRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => IntegrationLogsSuccessResponseFromJSON(jsonValue));
    }

    /**
     * This endpoint receives batched logs from integration applications on partner platforms. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Receives batched logs from integration applications.
     */
    async integrationsLogsPost(requestParameters: IntegrationsLogsPostRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<IntegrationLogsSuccessResponse> {
        const response = await this.integrationsLogsPostRaw(requestParameters, initOverrides);
        return await response.value();
    }

}