// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Media } from '../models/Media';
import { MediaList200Response } from '../models/MediaList200Response';
import { MediaUpload } from '../models/MediaUpload';
import { MediaUploadCreate } from '../models/MediaUploadCreate';
import { PinterestLibError } from '../models/PinterestLibError';

/**
 * no description
 */
export class MediaApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file\'s contents as the request\'s `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
     * Register media upload
     * @param mediaUploadCreate 
     */
    public async mediaCreate(mediaUploadCreate: MediaUploadCreate, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'mediaUploadCreate' is not null or undefined
        if (mediaUploadCreate === null || mediaUploadCreate === undefined) {
            throw new RequiredError("MediaApi", "mediaCreate", "mediaUploadCreate");
        }


        // Path Params
        const localVarPath = '/media';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(mediaUploadCreate, "MediaUploadCreate", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
     * Get media upload details
     * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
     */
    public async mediaGet(mediaId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'mediaId' is not null or undefined
        if (mediaId === null || mediaId === undefined) {
            throw new RequiredError("MediaApi", "mediaGet", "mediaId");
        }


        // Path Params
        const localVarPath = '/media/{media_id}'
            .replace('{' + 'media_id' + '}', encodeURIComponent(String(mediaId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
     * List media uploads
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
     */
    public async mediaList(bookmark?: string, pageSize?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/media';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

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
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class MediaApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to mediaCreate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async mediaCreateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<MediaUpload >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: MediaUpload = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "MediaUpload", ""
            ) as MediaUpload;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: MediaUpload = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "MediaUpload", ""
            ) as MediaUpload;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The request could not be understood by the server due to unexpected data.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "Authentication is required and has either failed or not been provided.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The requested resource could not be found on this server.", body, response.headers);
        }
        if (isCodeInRange("429", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The user has sent too many requests in a given amount of time and is being rate limited.", body, response.headers);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: MediaUpload = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "MediaUpload", ""
            ) as MediaUpload;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to mediaGet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async mediaGetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Media >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Media = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Media", ""
            ) as Media;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The request could not be understood by the server due to unexpected data.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "Authentication is required and has either failed or not been provided.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The requested resource could not be found on this server.", body, response.headers);
        }
        if (isCodeInRange("429", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The user has sent too many requests in a given amount of time and is being rate limited.", body, response.headers);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Media = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Media", ""
            ) as Media;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to mediaList
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async mediaListWithHttpInfo(response: ResponseContext): Promise<HttpInfo<MediaList200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: MediaList200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "MediaList200Response", ""
            ) as MediaList200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The request could not be understood by the server due to unexpected data.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "Authentication is required and has either failed or not been provided.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The requested resource could not be found on this server.", body, response.headers);
        }
        if (isCodeInRange("429", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The user has sent too many requests in a given amount of time and is being rate limited.", body, response.headers);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: MediaList200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "MediaList200Response", ""
            ) as MediaList200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
