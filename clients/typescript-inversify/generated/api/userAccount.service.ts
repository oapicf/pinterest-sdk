/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
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

import { Account } from '../model/account';
import { AnalyticsMetricsResponse } from '../model/analyticsMetricsResponse';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class UserAccountService {
    private basePath: string = 'https://api.pinterest.com/v5';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * Get user account analytics
     * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
     * @param fromClaimedContent Filter on Pins that match your claimed domain.
     * @param pinFormat Pin formats to get data for, default is all.
     * @param appTypes Apps or devices to get data for, default is all.
     * @param metricTypes Metric types to get data for, default is all. 
     * @param splitField How to split the data into groups. Not including this param means data won\&#39;t be split.
     * @param adAccountId Unique identifier of an ad account.
     
     */
    public userAccountAnalytics(startDate: string, endDate: string, fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH', pinFormat?: 'ALL' | 'PRODUCT' | 'REGULAR' | 'VIDEO', appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB', metricTypes?: Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'>, splitField?: 'NO_SPLIT' | 'APP_TYPE' | 'OWNED_CONTENT' | 'PIN_FORMAT', adAccountId?: string, observe?: 'body', headers?: Headers): Observable<{ [key: string]: AnalyticsMetricsResponse; }>;
    public userAccountAnalytics(startDate: string, endDate: string, fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH', pinFormat?: 'ALL' | 'PRODUCT' | 'REGULAR' | 'VIDEO', appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB', metricTypes?: Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'>, splitField?: 'NO_SPLIT' | 'APP_TYPE' | 'OWNED_CONTENT' | 'PIN_FORMAT', adAccountId?: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<{ [key: string]: AnalyticsMetricsResponse; }>>;
    public userAccountAnalytics(startDate: string, endDate: string, fromClaimedContent?: 'OTHER' | 'CLAIMED' | 'BOTH', pinFormat?: 'ALL' | 'PRODUCT' | 'REGULAR' | 'VIDEO', appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB', metricTypes?: Array<'ENGAGEMENT' | 'ENGAGEMENT_RATE' | 'IMPRESSION' | 'OUTBOUND_CLICK' | 'OUTBOUND_CLICK_RATE' | 'PIN_CLICK' | 'PIN_CLICK_RATE' | 'SAVE' | 'SAVE_RATE'>, splitField?: 'NO_SPLIT' | 'APP_TYPE' | 'OWNED_CONTENT' | 'PIN_FORMAT', adAccountId?: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (startDate === null || startDate === undefined){
            throw new Error('Required parameter startDate was null or undefined when calling userAccountAnalytics.');
        }

        if (endDate === null || endDate === undefined){
            throw new Error('Required parameter endDate was null or undefined when calling userAccountAnalytics.');
        }

        let queryParameters: string[] = [];
        if (startDate !== undefined) {
            queryParameters.push('startDate='+encodeURIComponent(String(startDate)));
        }
        if (endDate !== undefined) {
            queryParameters.push('endDate='+encodeURIComponent(String(endDate)));
        }
        if (fromClaimedContent !== undefined) {
            queryParameters.push('fromClaimedContent='+encodeURIComponent(String(fromClaimedContent)));
        }
        if (pinFormat !== undefined) {
            queryParameters.push('pinFormat='+encodeURIComponent(String(pinFormat)));
        }
        if (appTypes !== undefined) {
            queryParameters.push('appTypes='+encodeURIComponent(String(appTypes)));
        }
        if (metricTypes) {
            queryParameters.push('metricTypes='+encodeURIComponent(metricTypes.join(COLLECTION_FORMATS['csv'])));
        }
        if (splitField !== undefined) {
            queryParameters.push('splitField='+encodeURIComponent(String(splitField)));
        }
        if (adAccountId !== undefined) {
            queryParameters.push('adAccountId='+encodeURIComponent(String(adAccountId)));
        }

        // authentication (pinterest_oauth2) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<{ [key: string]: AnalyticsMetricsResponse; }>> = this.httpClient.get(`${this.basePath}/user_account/analytics?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <{ [key: string]: AnalyticsMetricsResponse; }>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Get user account
     * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-business-access\&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     * @param adAccountId Unique identifier of an ad account.
     
     */
    public userAccountGet(adAccountId?: string, observe?: 'body', headers?: Headers): Observable<Account>;
    public userAccountGet(adAccountId?: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<Account>>;
    public userAccountGet(adAccountId?: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        let queryParameters: string[] = [];
        if (adAccountId !== undefined) {
            queryParameters.push('adAccountId='+encodeURIComponent(String(adAccountId)));
        }

        // authentication (pinterest_oauth2) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Account>> = this.httpClient.get(`${this.basePath}/user_account?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <Account>(httpResponse.response))
               );
        }
        return response;
    }

}