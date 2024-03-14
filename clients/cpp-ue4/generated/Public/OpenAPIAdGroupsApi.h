/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "CoreMinimal.h"
#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

class OPENAPI_API OpenAPIAdGroupsApi
{
public:
	OpenAPIAdGroupsApi();
	~OpenAPIAdGroupsApi();

	/* Sets the URL Endpoint.
	* Note: several fallback endpoints can be configured in request retry policies, see Request::SetShouldRetry */
	void SetURL(const FString& Url);

	/* Adds global header params to all requests */
	void AddHeaderParam(const FString& Key, const FString& Value);
	void ClearHeaderParams();

	/* Sets the retry manager to the user-defined retry manager. User must manage the lifetime of the retry manager.
	* If no retry manager is specified and a request needs retries, a default retry manager will be used.
	* See also: Request::SetShouldRetry */
	void SetHttpRetryManager(FHttpRetrySystem::FManager& RetryManager);
	FHttpRetrySystem::FManager& GetHttpRetryManager();

	class AdGroupsBidFloorGetRequest;
	class AdGroupsBidFloorGetResponse;
	class AdGroupsTargetingAnalyticsGetRequest;
	class AdGroupsTargetingAnalyticsGetResponse;
	class AdGroupsAnalyticsRequest;
	class AdGroupsAnalyticsResponse;
	class AdGroupsCreateRequest;
	class AdGroupsCreateResponse;
	class AdGroupsGetRequest;
	class AdGroupsGetResponse;
	class AdGroupsListRequest;
	class AdGroupsListResponse;
	class AdGroupsUpdateRequest;
	class AdGroupsUpdateResponse;
	
    DECLARE_DELEGATE_OneParam(FAdGroupsBidFloorGetDelegate, const AdGroupsBidFloorGetResponse&);
    DECLARE_DELEGATE_OneParam(FAdGroupsTargetingAnalyticsGetDelegate, const AdGroupsTargetingAnalyticsGetResponse&);
    DECLARE_DELEGATE_OneParam(FAdGroupsAnalyticsDelegate, const AdGroupsAnalyticsResponse&);
    DECLARE_DELEGATE_OneParam(FAdGroupsCreateDelegate, const AdGroupsCreateResponse&);
    DECLARE_DELEGATE_OneParam(FAdGroupsGetDelegate, const AdGroupsGetResponse&);
    DECLARE_DELEGATE_OneParam(FAdGroupsListDelegate, const AdGroupsListResponse&);
    DECLARE_DELEGATE_OneParam(FAdGroupsUpdateDelegate, const AdGroupsUpdateResponse&);
    
    FHttpRequestPtr AdGroupsBidFloorGet(const AdGroupsBidFloorGetRequest& Request, const FAdGroupsBidFloorGetDelegate& Delegate = FAdGroupsBidFloorGetDelegate()) const;
    FHttpRequestPtr AdGroupsTargetingAnalyticsGet(const AdGroupsTargetingAnalyticsGetRequest& Request, const FAdGroupsTargetingAnalyticsGetDelegate& Delegate = FAdGroupsTargetingAnalyticsGetDelegate()) const;
    FHttpRequestPtr AdGroupsAnalytics(const AdGroupsAnalyticsRequest& Request, const FAdGroupsAnalyticsDelegate& Delegate = FAdGroupsAnalyticsDelegate()) const;
    FHttpRequestPtr AdGroupsCreate(const AdGroupsCreateRequest& Request, const FAdGroupsCreateDelegate& Delegate = FAdGroupsCreateDelegate()) const;
    FHttpRequestPtr AdGroupsGet(const AdGroupsGetRequest& Request, const FAdGroupsGetDelegate& Delegate = FAdGroupsGetDelegate()) const;
    FHttpRequestPtr AdGroupsList(const AdGroupsListRequest& Request, const FAdGroupsListDelegate& Delegate = FAdGroupsListDelegate()) const;
    FHttpRequestPtr AdGroupsUpdate(const AdGroupsUpdateRequest& Request, const FAdGroupsUpdateDelegate& Delegate = FAdGroupsUpdateDelegate()) const;
    
private:
    void OnAdGroupsBidFloorGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdGroupsBidFloorGetDelegate Delegate) const;
    void OnAdGroupsTargetingAnalyticsGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdGroupsTargetingAnalyticsGetDelegate Delegate) const;
    void OnAdGroupsAnalyticsResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdGroupsAnalyticsDelegate Delegate) const;
    void OnAdGroupsCreateResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdGroupsCreateDelegate Delegate) const;
    void OnAdGroupsGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdGroupsGetDelegate Delegate) const;
    void OnAdGroupsListResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdGroupsListDelegate Delegate) const;
    void OnAdGroupsUpdateResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdGroupsUpdateDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};

}