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


import localVarRequest from 'request';
import http from 'http';

/* tslint:disable:no-unused-locals */
import { TargetingTemplateCreate } from '../model/targetingTemplateCreate';
import { TargetingTemplateGetResponseData } from '../model/targetingTemplateGetResponseData';
import { TargetingTemplateList200Response } from '../model/targetingTemplateList200Response';
import { TargetingTemplateUpdateRequest } from '../model/targetingTemplateUpdateRequest';

import { ObjectSerializer, Authentication, VoidAuth, Interceptor } from '../model/models';
import { HttpBasicAuth, HttpBearerAuth, ApiKeyAuth, OAuth } from '../model/models';

import { HttpError, RequestFile } from './apis';

let defaultBasePath = 'https://api.pinterest.com/v5';

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================

export enum TargetingTemplateApiApiKeys {
}

export class TargetingTemplateApi {
    protected _basePath = defaultBasePath;
    protected _defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
        'pinterest_oauth2': new OAuth(),
        'conversion_token': new HttpBearerAuth(),
        'basic': new HttpBasicAuth(),
        'client_credentials': new OAuth(),
    }

    protected interceptors: Interceptor[] = [];

    constructor(basePath?: string);
    constructor(username: string, password: string, basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            this.username = basePathOrUsername;
            this.password = password
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    set defaultHeaders(defaultHeaders: any) {
        this._defaultHeaders = defaultHeaders;
    }

    get defaultHeaders() {
        return this._defaultHeaders;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
        this.authentications.default = auth;
    }

    public setApiKey(key: TargetingTemplateApiApiKeys, value: string) {
        (this.authentications as any)[TargetingTemplateApiApiKeys[key]].apiKey = value;
    }

    set accessToken(token: string) {
        this.authentications.pinterest_oauth2.accessToken = token;
    }

    set accessToken(accessToken: string | (() => string)) {
        this.authentications.conversion_token.accessToken = accessToken;
    }

    set username(username: string) {
        this.authentications.basic.username = username;
    }

    set password(password: string) {
        this.authentications.basic.password = password;
    }

    set accessToken(token: string) {
        this.authentications.client_credentials.accessToken = token;
    }

    public addInterceptor(interceptor: Interceptor) {
        this.interceptors.push(interceptor);
    }

    /**
     * <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
     * @summary Create targeting templates
     * @param adAccountId Unique identifier of an ad account.
     * @param targetingTemplateCreate targeting template creation entity
     */
    public async targetingTemplateCreate (adAccountId: string, targetingTemplateCreate: TargetingTemplateCreate, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.IncomingMessage; body: TargetingTemplateGetResponseData;  }> {
        const localVarPath = this.basePath + '/ad_accounts/{ad_account_id}/targeting_templates'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this._defaultHeaders);
        const produces = ['application/json'];
        // give precedence to 'application/json'
        if (produces.indexOf('application/json') >= 0) {
            localVarHeaderParams.Accept = 'application/json';
        } else {
            localVarHeaderParams.Accept = produces.join(',');
        }
        let localVarFormParams: any = {};

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new Error('Required parameter adAccountId was null or undefined when calling targetingTemplateCreate.');
        }

        // verify required parameter 'targetingTemplateCreate' is not null or undefined
        if (targetingTemplateCreate === null || targetingTemplateCreate === undefined) {
            throw new Error('Required parameter targetingTemplateCreate was null or undefined when calling targetingTemplateCreate.');
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(targetingTemplateCreate, "TargetingTemplateCreate")
        };

        let authenticationPromise = Promise.resolve();
        if (this.authentications.pinterest_oauth2.accessToken) {
            authenticationPromise = authenticationPromise.then(() => this.authentications.pinterest_oauth2.applyToRequest(localVarRequestOptions));
        }
        authenticationPromise = authenticationPromise.then(() => this.authentications.default.applyToRequest(localVarRequestOptions));

        let interceptorPromise = authenticationPromise;
        for (const interceptor of this.interceptors) {
            interceptorPromise = interceptorPromise.then(() => interceptor(localVarRequestOptions));
        }

        return interceptorPromise.then(() => {
            if (Object.keys(localVarFormParams).length) {
                if (localVarUseFormData) {
                    (<any>localVarRequestOptions).formData = localVarFormParams;
                } else {
                    localVarRequestOptions.form = localVarFormParams;
                }
            }
            return new Promise<{ response: http.IncomingMessage; body: TargetingTemplateGetResponseData;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            body = ObjectSerializer.deserialize(body, "TargetingTemplateGetResponseData");
                            resolve({ response: response, body: body });
                        } else {
                            reject(new HttpError(response, body, response.statusCode));
                        }
                    }
                });
            });
        });
    }
    /**
     * Get a list of the targeting templates in the specified <code>ad_account_id</code>
     * @summary List targeting templates
     * @param adAccountId Unique identifier of an ad account.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param includeSizing Include audience sizing in result or not
     * @param searchQuery Search keyword for targeting templates
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public async targetingTemplateList (adAccountId: string, order?: 'ASCENDING' | 'DESCENDING', includeSizing?: boolean, searchQuery?: string, pageSize?: number, bookmark?: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.IncomingMessage; body: TargetingTemplateList200Response;  }> {
        const localVarPath = this.basePath + '/ad_accounts/{ad_account_id}/targeting_templates'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this._defaultHeaders);
        const produces = ['application/json'];
        // give precedence to 'application/json'
        if (produces.indexOf('application/json') >= 0) {
            localVarHeaderParams.Accept = 'application/json';
        } else {
            localVarHeaderParams.Accept = produces.join(',');
        }
        let localVarFormParams: any = {};

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new Error('Required parameter adAccountId was null or undefined when calling targetingTemplateList.');
        }

        if (order !== undefined) {
            localVarQueryParameters['order'] = ObjectSerializer.serialize(order, "'ASCENDING' | 'DESCENDING'");
        }

        if (includeSizing !== undefined) {
            localVarQueryParameters['include_sizing'] = ObjectSerializer.serialize(includeSizing, "boolean");
        }

        if (searchQuery !== undefined) {
            localVarQueryParameters['search_query'] = ObjectSerializer.serialize(searchQuery, "string");
        }

        if (pageSize !== undefined) {
            localVarQueryParameters['page_size'] = ObjectSerializer.serialize(pageSize, "number");
        }

        if (bookmark !== undefined) {
            localVarQueryParameters['bookmark'] = ObjectSerializer.serialize(bookmark, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        let authenticationPromise = Promise.resolve();
        if (this.authentications.pinterest_oauth2.accessToken) {
            authenticationPromise = authenticationPromise.then(() => this.authentications.pinterest_oauth2.applyToRequest(localVarRequestOptions));
        }
        authenticationPromise = authenticationPromise.then(() => this.authentications.default.applyToRequest(localVarRequestOptions));

        let interceptorPromise = authenticationPromise;
        for (const interceptor of this.interceptors) {
            interceptorPromise = interceptorPromise.then(() => interceptor(localVarRequestOptions));
        }

        return interceptorPromise.then(() => {
            if (Object.keys(localVarFormParams).length) {
                if (localVarUseFormData) {
                    (<any>localVarRequestOptions).formData = localVarFormParams;
                } else {
                    localVarRequestOptions.form = localVarFormParams;
                }
            }
            return new Promise<{ response: http.IncomingMessage; body: TargetingTemplateList200Response;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            body = ObjectSerializer.deserialize(body, "TargetingTemplateList200Response");
                            resolve({ response: response, body: body });
                        } else {
                            reject(new HttpError(response, body, response.statusCode));
                        }
                    }
                });
            });
        });
    }
    /**
     * <p>Update the targeting template given advertiser ID and targeting template ID</p>
     * @summary Update targeting templates
     * @param adAccountId Unique identifier of an ad account.
     * @param targetingTemplateUpdateRequest Operation type and targeting template ID
     */
    public async targetingTemplateUpdate (adAccountId: string, targetingTemplateUpdateRequest: TargetingTemplateUpdateRequest, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.IncomingMessage; body?: any;  }> {
        const localVarPath = this.basePath + '/ad_accounts/{ad_account_id}/targeting_templates'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this._defaultHeaders);
        const produces = ['application/json'];
        // give precedence to 'application/json'
        if (produces.indexOf('application/json') >= 0) {
            localVarHeaderParams.Accept = 'application/json';
        } else {
            localVarHeaderParams.Accept = produces.join(',');
        }
        let localVarFormParams: any = {};

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new Error('Required parameter adAccountId was null or undefined when calling targetingTemplateUpdate.');
        }

        // verify required parameter 'targetingTemplateUpdateRequest' is not null or undefined
        if (targetingTemplateUpdateRequest === null || targetingTemplateUpdateRequest === undefined) {
            throw new Error('Required parameter targetingTemplateUpdateRequest was null or undefined when calling targetingTemplateUpdate.');
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PATCH',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(targetingTemplateUpdateRequest, "TargetingTemplateUpdateRequest")
        };

        let authenticationPromise = Promise.resolve();
        if (this.authentications.pinterest_oauth2.accessToken) {
            authenticationPromise = authenticationPromise.then(() => this.authentications.pinterest_oauth2.applyToRequest(localVarRequestOptions));
        }
        authenticationPromise = authenticationPromise.then(() => this.authentications.default.applyToRequest(localVarRequestOptions));

        let interceptorPromise = authenticationPromise;
        for (const interceptor of this.interceptors) {
            interceptorPromise = interceptorPromise.then(() => interceptor(localVarRequestOptions));
        }

        return interceptorPromise.then(() => {
            if (Object.keys(localVarFormParams).length) {
                if (localVarUseFormData) {
                    (<any>localVarRequestOptions).formData = localVarFormParams;
                } else {
                    localVarRequestOptions.form = localVarFormParams;
                }
            }
            return new Promise<{ response: http.IncomingMessage; body?: any;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            resolve({ response: response, body: body });
                        } else {
                            reject(new HttpError(response, body, response.statusCode));
                        }
                    }
                });
            });
        });
    }
}
