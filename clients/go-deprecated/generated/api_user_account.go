/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.3.0
 * Contact: pinterest-api@pinterest.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	_context "context"
	_ioutil "io/ioutil"
	_nethttp "net/http"
	_neturl "net/url"
	_bytes "bytes"
	"github.com/antihax/optional"
)

// Linger please
var (
	_ _context.Context
)

// UserAccountApiService UserAccountApi service
type UserAccountApiService service

// UserAccountAnalyticsOpts Optional parameters for the method 'UserAccountAnalytics'
type UserAccountAnalyticsOpts struct {
    FromClaimedContent optional.String
    PinFormat optional.String
    AppTypes optional.String
    MetricTypes optional.Interface
    SplitField optional.String
    AdAccountId optional.String
}

/*
 * UserAccountAnalytics Get user account analytics
 *
 * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
 *
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
 * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
 * @param optional nil or *UserAccountAnalyticsOpts - Optional Parameters:
 * @param "FromClaimedContent" (optional.String) -  Filter on Pins that match your claimed domain.
 * @param "PinFormat" (optional.String) -  Pin formats to get data for, default is all.
 * @param "AppTypes" (optional.String) -  Apps or devices to get data for, default is all.
 * @param "MetricTypes" (optional.Interface of []string) -  Metric types to get data for, default is all. 
 * @param "SplitField" (optional.String) -  How to split the data into groups. Not including this param means data won't be split.
 * @param "AdAccountId" (optional.String) -  Unique identifier of an ad account.
 * @return map[string]AnalyticsMetricsResponse
 */
func (a *UserAccountApiService) UserAccountAnalytics(ctx _context.Context, startDate string, endDate string, localVarOptionals *UserAccountAnalyticsOpts) (map[string]AnalyticsMetricsResponse, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  map[string]AnalyticsMetricsResponse
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/user_account/analytics"
	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	localVarQueryParams.Add("start_date", parameterToString(startDate, ""))
	localVarQueryParams.Add("end_date", parameterToString(endDate, ""))
	if localVarOptionals != nil && localVarOptionals.FromClaimedContent.IsSet() {
		localVarQueryParams.Add("from_claimed_content", parameterToString(localVarOptionals.FromClaimedContent.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PinFormat.IsSet() {
		localVarQueryParams.Add("pin_format", parameterToString(localVarOptionals.PinFormat.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AppTypes.IsSet() {
		localVarQueryParams.Add("app_types", parameterToString(localVarOptionals.AppTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MetricTypes.IsSet() {
		localVarQueryParams.Add("metric_types", parameterToString(localVarOptionals.MetricTypes.Value(), "csv"))
	}
	if localVarOptionals != nil && localVarOptionals.SplitField.IsSet() {
		localVarQueryParams.Add("split_field", parameterToString(localVarOptionals.SplitField.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AdAccountId.IsSet() {
		localVarQueryParams.Add("ad_account_id", parameterToString(localVarOptionals.AdAccountId.Value(), ""))
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
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(r)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = _ioutil.NopCloser(_bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
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
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

// UserAccountGetOpts Optional parameters for the method 'UserAccountGet'
type UserAccountGetOpts struct {
    AdAccountId optional.String
}

/*
 * UserAccountGet Get user account
 *
 * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-business-access&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
 *
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *UserAccountGetOpts - Optional Parameters:
 * @param "AdAccountId" (optional.String) -  Unique identifier of an ad account.
 * @return Account
 */
func (a *UserAccountApiService) UserAccountGet(ctx _context.Context, localVarOptionals *UserAccountGetOpts) (Account, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  Account
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/user_account"
	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	if localVarOptionals != nil && localVarOptionals.AdAccountId.IsSet() {
		localVarQueryParams.Add("ad_account_id", parameterToString(localVarOptionals.AdAccountId.Value(), ""))
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
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(r)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = _ioutil.NopCloser(_bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
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
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
			var v Error
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}