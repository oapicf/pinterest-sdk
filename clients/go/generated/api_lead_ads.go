/*
Pinterest REST API

Pinterest's REST API

API version: 5.14.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"bytes"
	"context"
	"io"
	"net/http"
	"net/url"
	"strings"
)


// LeadAdsAPIService LeadAdsAPI service
type LeadAdsAPIService service

type ApiAdAccountsSubscriptionsDelByIdRequest struct {
	ctx context.Context
	ApiService *LeadAdsAPIService
	adAccountId string
	subscriptionId string
}

func (r ApiAdAccountsSubscriptionsDelByIdRequest) Execute() (*http.Response, error) {
	return r.ApiService.AdAccountsSubscriptionsDelByIdExecute(r)
}

/*
AdAccountsSubscriptionsDelById Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param adAccountId Unique identifier of an ad account.
 @param subscriptionId Unique identifier of a subscription.
 @return ApiAdAccountsSubscriptionsDelByIdRequest
*/
func (a *LeadAdsAPIService) AdAccountsSubscriptionsDelById(ctx context.Context, adAccountId string, subscriptionId string) ApiAdAccountsSubscriptionsDelByIdRequest {
	return ApiAdAccountsSubscriptionsDelByIdRequest{
		ApiService: a,
		ctx: ctx,
		adAccountId: adAccountId,
		subscriptionId: subscriptionId,
	}
}

// Execute executes the request
func (a *LeadAdsAPIService) AdAccountsSubscriptionsDelByIdExecute(r ApiAdAccountsSubscriptionsDelByIdRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodDelete
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "LeadAdsAPIService.AdAccountsSubscriptionsDelById")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}"
	localVarPath = strings.Replace(localVarPath, "{"+"ad_account_id"+"}", url.PathEscape(parameterValueToString(r.adAccountId, "adAccountId")), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"subscription_id"+"}", url.PathEscape(parameterValueToString(r.subscriptionId, "subscriptionId")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if strlen(r.adAccountId) > 18 {
		return nil, reportError("adAccountId must have less than 18 elements")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
			return localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 403 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
			return localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
			return localVarHTTPResponse, newErr
		}
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}

type ApiAdAccountsSubscriptionsGetByIdRequest struct {
	ctx context.Context
	ApiService *LeadAdsAPIService
	adAccountId string
	subscriptionId string
}

func (r ApiAdAccountsSubscriptionsGetByIdRequest) Execute() (*AdAccountGetSubscriptionResponse, *http.Response, error) {
	return r.ApiService.AdAccountsSubscriptionsGetByIdExecute(r)
}

/*
AdAccountsSubscriptionsGetById Get lead ads subscription

Get a specific lead ads subscription record.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param adAccountId Unique identifier of an ad account.
 @param subscriptionId Unique identifier of a subscription.
 @return ApiAdAccountsSubscriptionsGetByIdRequest
*/
func (a *LeadAdsAPIService) AdAccountsSubscriptionsGetById(ctx context.Context, adAccountId string, subscriptionId string) ApiAdAccountsSubscriptionsGetByIdRequest {
	return ApiAdAccountsSubscriptionsGetByIdRequest{
		ApiService: a,
		ctx: ctx,
		adAccountId: adAccountId,
		subscriptionId: subscriptionId,
	}
}

// Execute executes the request
//  @return AdAccountGetSubscriptionResponse
func (a *LeadAdsAPIService) AdAccountsSubscriptionsGetByIdExecute(r ApiAdAccountsSubscriptionsGetByIdRequest) (*AdAccountGetSubscriptionResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *AdAccountGetSubscriptionResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "LeadAdsAPIService.AdAccountsSubscriptionsGetById")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}"
	localVarPath = strings.Replace(localVarPath, "{"+"ad_account_id"+"}", url.PathEscape(parameterValueToString(r.adAccountId, "adAccountId")), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"subscription_id"+"}", url.PathEscape(parameterValueToString(r.subscriptionId, "subscriptionId")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if strlen(r.adAccountId) > 18 {
		return localVarReturnValue, nil, reportError("adAccountId must have less than 18 elements")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 403 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiAdAccountsSubscriptionsGetListRequest struct {
	ctx context.Context
	ApiService *LeadAdsAPIService
	adAccountId string
	pageSize *int32
	bookmark *string
}

// Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
func (r ApiAdAccountsSubscriptionsGetListRequest) PageSize(pageSize int32) ApiAdAccountsSubscriptionsGetListRequest {
	r.pageSize = &pageSize
	return r
}

// Cursor used to fetch the next page of items
func (r ApiAdAccountsSubscriptionsGetListRequest) Bookmark(bookmark string) ApiAdAccountsSubscriptionsGetListRequest {
	r.bookmark = &bookmark
	return r
}

func (r ApiAdAccountsSubscriptionsGetListRequest) Execute() (*AdAccountsSubscriptionsGetList200Response, *http.Response, error) {
	return r.ApiService.AdAccountsSubscriptionsGetListExecute(r)
}

/*
AdAccountsSubscriptionsGetList Get lead ads subscriptions

Get the advertiser's list of lead ads subscriptions.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param adAccountId Unique identifier of an ad account.
 @return ApiAdAccountsSubscriptionsGetListRequest
*/
func (a *LeadAdsAPIService) AdAccountsSubscriptionsGetList(ctx context.Context, adAccountId string) ApiAdAccountsSubscriptionsGetListRequest {
	return ApiAdAccountsSubscriptionsGetListRequest{
		ApiService: a,
		ctx: ctx,
		adAccountId: adAccountId,
	}
}

// Execute executes the request
//  @return AdAccountsSubscriptionsGetList200Response
func (a *LeadAdsAPIService) AdAccountsSubscriptionsGetListExecute(r ApiAdAccountsSubscriptionsGetListRequest) (*AdAccountsSubscriptionsGetList200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *AdAccountsSubscriptionsGetList200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "LeadAdsAPIService.AdAccountsSubscriptionsGetList")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/ad_accounts/{ad_account_id}/leads/subscriptions"
	localVarPath = strings.Replace(localVarPath, "{"+"ad_account_id"+"}", url.PathEscape(parameterValueToString(r.adAccountId, "adAccountId")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if strlen(r.adAccountId) > 18 {
		return localVarReturnValue, nil, reportError("adAccountId must have less than 18 elements")
	}

	if r.pageSize != nil {
		parameterAddToHeaderOrQuery(localVarQueryParams, "page_size", r.pageSize, "form", "")
	} else {
		var defaultValue int32 = 25
		r.pageSize = &defaultValue
	}
	if r.bookmark != nil {
		parameterAddToHeaderOrQuery(localVarQueryParams, "bookmark", r.bookmark, "form", "")
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 403 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiAdAccountsSubscriptionsPostRequest struct {
	ctx context.Context
	ApiService *LeadAdsAPIService
	adAccountId string
	adAccountCreateSubscriptionRequest *AdAccountCreateSubscriptionRequest
}

// Subscription to create.
func (r ApiAdAccountsSubscriptionsPostRequest) AdAccountCreateSubscriptionRequest(adAccountCreateSubscriptionRequest AdAccountCreateSubscriptionRequest) ApiAdAccountsSubscriptionsPostRequest {
	r.adAccountCreateSubscriptionRequest = &adAccountCreateSubscriptionRequest
	return r
}

func (r ApiAdAccountsSubscriptionsPostRequest) Execute() (*AdAccountCreateSubscriptionResponse, *http.Response, error) {
	return r.ApiService.AdAccountsSubscriptionsPostExecute(r)
}

/*
AdAccountsSubscriptionsPost Create lead ads subscription

Create a lead ads webhook subscription.
Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.
- Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.
- For data security, egress lead data is encrypted with AES-256-GCM.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param adAccountId Unique identifier of an ad account.
 @return ApiAdAccountsSubscriptionsPostRequest
*/
func (a *LeadAdsAPIService) AdAccountsSubscriptionsPost(ctx context.Context, adAccountId string) ApiAdAccountsSubscriptionsPostRequest {
	return ApiAdAccountsSubscriptionsPostRequest{
		ApiService: a,
		ctx: ctx,
		adAccountId: adAccountId,
	}
}

// Execute executes the request
//  @return AdAccountCreateSubscriptionResponse
func (a *LeadAdsAPIService) AdAccountsSubscriptionsPostExecute(r ApiAdAccountsSubscriptionsPostRequest) (*AdAccountCreateSubscriptionResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *AdAccountCreateSubscriptionResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "LeadAdsAPIService.AdAccountsSubscriptionsPost")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/ad_accounts/{ad_account_id}/leads/subscriptions"
	localVarPath = strings.Replace(localVarPath, "{"+"ad_account_id"+"}", url.PathEscape(parameterValueToString(r.adAccountId, "adAccountId")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if strlen(r.adAccountId) > 18 {
		return localVarReturnValue, nil, reportError("adAccountId must have less than 18 elements")
	}
	if r.adAccountCreateSubscriptionRequest == nil {
		return localVarReturnValue, nil, reportError("adAccountCreateSubscriptionRequest is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.adAccountCreateSubscriptionRequest
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 403 {
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
