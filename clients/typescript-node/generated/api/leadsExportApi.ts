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
import { LeadsExportCreateRequest } from '../model/leadsExportCreateRequest';
import { LeadsExportCreateResponse } from '../model/leadsExportCreateResponse';
import { LeadsExportResponseData } from '../model/leadsExportResponseData';

import { ObjectSerializer, Authentication, VoidAuth, Interceptor } from '../model/models';
import { HttpBasicAuth, HttpBearerAuth, ApiKeyAuth, OAuth } from '../model/models';

import { HttpError, RequestFile } from './apis';

let defaultBasePath = 'https://api.pinterest.com/v5';

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================

export enum LeadsExportApiApiKeys {
}

export class LeadsExportApi {
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

    public setApiKey(key: LeadsExportApiApiKeys, value: string) {
        (this.authentications as any)[LeadsExportApiApiKeys[key]].apiKey = value;
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
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * @summary Create a request to export leads collected from a lead ad
     * @param adAccountId Unique identifier of an ad account.
     * @param leadsExportCreateRequest 
     */
    public async leadsExportCreate (adAccountId: string, leadsExportCreateRequest: LeadsExportCreateRequest, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.IncomingMessage; body: LeadsExportCreateResponse;  }> {
        const localVarPath = this.basePath + '/ad_accounts/{ad_account_id}/leads_export'
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
            throw new Error('Required parameter adAccountId was null or undefined when calling leadsExportCreate.');
        }

        // verify required parameter 'leadsExportCreateRequest' is not null or undefined
        if (leadsExportCreateRequest === null || leadsExportCreateRequest === undefined) {
            throw new Error('Required parameter leadsExportCreateRequest was null or undefined when calling leadsExportCreate.');
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
            body: ObjectSerializer.serialize(leadsExportCreateRequest, "LeadsExportCreateRequest")
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
            return new Promise<{ response: http.IncomingMessage; body: LeadsExportCreateResponse;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            body = ObjectSerializer.deserialize(body, "LeadsExportCreateResponse");
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
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * @summary Get the lead export from the lead export create call
     * @param adAccountId Unique identifier of an ad account.
     * @param leadsExportId lead_export_id token returned from the create a lead export endpoint
     */
    public async leadsExportGet (adAccountId: string, leadsExportId: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.IncomingMessage; body: LeadsExportResponseData;  }> {
        const localVarPath = this.basePath + '/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)))
            .replace('{' + 'leads_export_id' + '}', encodeURIComponent(String(leadsExportId)));
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
            throw new Error('Required parameter adAccountId was null or undefined when calling leadsExportGet.');
        }

        // verify required parameter 'leadsExportId' is not null or undefined
        if (leadsExportId === null || leadsExportId === undefined) {
            throw new Error('Required parameter leadsExportId was null or undefined when calling leadsExportGet.');
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
            return new Promise<{ response: http.IncomingMessage; body: LeadsExportResponseData;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            body = ObjectSerializer.deserialize(body, "LeadsExportResponseData");
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
