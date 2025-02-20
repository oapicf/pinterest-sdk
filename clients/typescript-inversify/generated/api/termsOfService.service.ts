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

import { Observable } from 'rxjs/Observable';

import { map } from 'rxjs/operators';
import IHttpClient from '../IHttpClient';
import { inject, injectable } from 'inversify';
import { IAPIConfiguration } from '../IAPIConfiguration';
import { Headers } from '../Headers';
import HttpResponse from '../HttpResponse';

import { TermsOfService } from '../model/termsOfService';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class TermsOfServiceService {
    private basePath: string = 'https://api.pinterest.com/v5';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * Get terms of service
     * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
     * @param adAccountId Unique identifier of an ad account.
     * @param includeHtml Return HTML in TOS text.
     * @param tosType Request type.
     
     */
    public termsOfServiceGet(adAccountId: string, includeHtml?: boolean, tosType?: string, observe?: 'body', headers?: Headers): Observable<TermsOfService>;
    public termsOfServiceGet(adAccountId: string, includeHtml?: boolean, tosType?: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<TermsOfService>>;
    public termsOfServiceGet(adAccountId: string, includeHtml?: boolean, tosType?: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (adAccountId === null || adAccountId === undefined){
            throw new Error('Required parameter adAccountId was null or undefined when calling termsOfServiceGet.');
        }

        let queryParameters: string[] = [];
        if (includeHtml !== undefined) {
            queryParameters.push('includeHtml='+encodeURIComponent(String(includeHtml)));
        }
        if (tosType !== undefined) {
            queryParameters.push('tosType='+encodeURIComponent(String(tosType)));
        }

        // authentication (pinterest_oauth2) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<TermsOfService>> = this.httpClient.get(`${this.basePath}/ad_accounts/${encodeURIComponent(String(adAccountId))}/terms_of_service?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <TermsOfService>(httpResponse.response))
               );
        }
        return response;
    }

}
