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
/* tslint:disable:no-unused-variable member-ordering */

import { Injectable, Optional } from '@nestjs/common';
import { HttpService } from '@nestjs/axios';
import { AxiosResponse } from 'axios';
import { Observable, from, of, switchMap } from 'rxjs';
import { OauthAccessTokenResponse } from '../model/oauthAccessTokenResponse';
import { Configuration } from '../configuration';
import { COLLECTION_FORMATS } from '../variables';


@Injectable()
export class OauthService {

    protected basePath = 'https://api.pinterest.com/v5';
    public defaultHeaders: Record<string,string> = {};
    public configuration = new Configuration();

    constructor(protected httpClient: HttpService, @Optional() configuration: Configuration) {
        this.configuration = configuration || this.configuration;
        this.basePath = configuration?.basePath || this.basePath;
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        return consumes.includes(form);
    }

    /**
     * Generate OAuth access token
     * Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See &lt;a href&#x3D;\&#39;/docs/getting-started/authentication-and-scopes/\&#39;&gt;Authentication&lt;/a&gt; for more.  &lt;strong&gt;Parameter &lt;i&gt;refresh_on&lt;/i&gt; and its corresponding response type &lt;i&gt;everlasting_refresh&lt;/i&gt; are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). &lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  &lt;strong&gt;Grant type &lt;i&gt;client_credentials&lt;/i&gt; and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.&lt;/strong&gt;
     * @param grantType 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public oauthToken(grantType: string, ): Observable<AxiosResponse<OauthAccessTokenResponse>>;
    public oauthToken(grantType: string, ): Observable<any> {
        if (grantType === null || grantType === undefined) {
            throw new Error('Required parameter grantType was null or undefined when calling oauthToken.');
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // authentication (basic) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/x-www-form-urlencoded'
        ];

        const canConsumeForm = this.canConsumeForm(consumes);

        let formParams: { append(param: string, value: any): void; };
        let useForm = false;
        let convertFormParamsToString = false;
        if (useForm) {
            formParams = new FormData();
        } else {
            // formParams = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        }

        if (grantType !== undefined) {
            formParams!.append('grant_type', <any>grantType);
        }

        return accessTokenObservable.pipe(
            switchMap((accessToken) => {
                if (accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.post<OauthAccessTokenResponse>(`${this.basePath}/oauth/token`,
                    convertFormParamsToString ? formParams!.toString() : formParams!,
                    {
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
}
