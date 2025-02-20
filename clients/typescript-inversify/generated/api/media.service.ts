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

import { MediaList200Response } from '../model/mediaList200Response';
import { MediaUpload } from '../model/mediaUpload';
import { MediaUploadDetails } from '../model/mediaUploadDetails';
import { MediaUploadRequest } from '../model/mediaUploadRequest';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class MediaService {
    private basePath: string = 'https://api.pinterest.com/v5';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * Register media upload
     * Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &lt;tt&gt;curl&lt;/tt&gt;, for example) to &lt;tt&gt;upload_url&lt;/tt&gt; using the &lt;tt&gt;Content-Type&lt;/tt&gt; header value. Send the media file\&#39;s contents as the request\&#39;s &lt;tt&gt;file&lt;/tt&gt; parameter and also include all of the parameters from &lt;tt&gt;upload_parameters&lt;/tt&gt;.  &lt;strong&gt;&lt;a href&#x3D;\&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins\&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     * @param mediaUploadRequest Create a media upload request
     
     */
    public mediaCreate(mediaUploadRequest: MediaUploadRequest, observe?: 'body', headers?: Headers): Observable<MediaUpload>;
    public mediaCreate(mediaUploadRequest: MediaUploadRequest, observe?: 'response', headers?: Headers): Observable<HttpResponse<MediaUpload>>;
    public mediaCreate(mediaUploadRequest: MediaUploadRequest, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (mediaUploadRequest === null || mediaUploadRequest === undefined){
            throw new Error('Required parameter mediaUploadRequest was null or undefined when calling mediaCreate.');
        }

        // authentication (pinterest_oauth2) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<MediaUpload>> = this.httpClient.post(`${this.basePath}/media`, mediaUploadRequest , headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <MediaUpload>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Get media upload details
     * Get details for a registered media upload, including its current status.  &lt;strong&gt;&lt;a href&#x3D;\&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins\&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     * @param mediaId Media identifier
     
     */
    public mediaGet(mediaId: string, observe?: 'body', headers?: Headers): Observable<MediaUploadDetails>;
    public mediaGet(mediaId: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<MediaUploadDetails>>;
    public mediaGet(mediaId: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (mediaId === null || mediaId === undefined){
            throw new Error('Required parameter mediaId was null or undefined when calling mediaGet.');
        }

        // authentication (pinterest_oauth2) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<MediaUploadDetails>> = this.httpClient.get(`${this.basePath}/media/${encodeURIComponent(String(mediaId))}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <MediaUploadDetails>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * List media uploads
     * List media uploads filtered by given parameters.  &lt;strong&gt;&lt;a href&#x3D;\&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins\&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     
     */
    public mediaList(bookmark?: string, pageSize?: number, observe?: 'body', headers?: Headers): Observable<MediaList200Response>;
    public mediaList(bookmark?: string, pageSize?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<MediaList200Response>>;
    public mediaList(bookmark?: string, pageSize?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        let queryParameters: string[] = [];
        if (bookmark !== undefined) {
            queryParameters.push('bookmark='+encodeURIComponent(String(bookmark)));
        }
        if (pageSize !== undefined) {
            queryParameters.push('pageSize='+encodeURIComponent(String(pageSize)));
        }

        // authentication (pinterest_oauth2) required
        if (this.APIConfiguration.accessToken) {
            let accessToken = typeof this.APIConfiguration.accessToken === 'function'
                ? this.APIConfiguration.accessToken()
                : this.APIConfiguration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<MediaList200Response>> = this.httpClient.get(`${this.basePath}/media?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <MediaList200Response>(httpResponse.response))
               );
        }
        return response;
    }

}
