/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.12.0
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

class OPENAPI_API OpenAPIConversionTagsApi
{
public:
	OpenAPIConversionTagsApi();
	~OpenAPIConversionTagsApi();

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

	class ConversionTagsCreateRequest;
	class ConversionTagsCreateResponse;
	class ConversionTagsGetRequest;
	class ConversionTagsGetResponse;
	class ConversionTagsListRequest;
	class ConversionTagsListResponse;
	class OcpmEligibleConversionTagsGetRequest;
	class OcpmEligibleConversionTagsGetResponse;
	class PageVisitConversionTagsGetRequest;
	class PageVisitConversionTagsGetResponse;
	
    DECLARE_DELEGATE_OneParam(FConversionTagsCreateDelegate, const ConversionTagsCreateResponse&);
    DECLARE_DELEGATE_OneParam(FConversionTagsGetDelegate, const ConversionTagsGetResponse&);
    DECLARE_DELEGATE_OneParam(FConversionTagsListDelegate, const ConversionTagsListResponse&);
    DECLARE_DELEGATE_OneParam(FOcpmEligibleConversionTagsGetDelegate, const OcpmEligibleConversionTagsGetResponse&);
    DECLARE_DELEGATE_OneParam(FPageVisitConversionTagsGetDelegate, const PageVisitConversionTagsGetResponse&);
    
    FHttpRequestPtr ConversionTagsCreate(const ConversionTagsCreateRequest& Request, const FConversionTagsCreateDelegate& Delegate = FConversionTagsCreateDelegate()) const;
    FHttpRequestPtr ConversionTagsGet(const ConversionTagsGetRequest& Request, const FConversionTagsGetDelegate& Delegate = FConversionTagsGetDelegate()) const;
    FHttpRequestPtr ConversionTagsList(const ConversionTagsListRequest& Request, const FConversionTagsListDelegate& Delegate = FConversionTagsListDelegate()) const;
    FHttpRequestPtr OcpmEligibleConversionTagsGet(const OcpmEligibleConversionTagsGetRequest& Request, const FOcpmEligibleConversionTagsGetDelegate& Delegate = FOcpmEligibleConversionTagsGetDelegate()) const;
    FHttpRequestPtr PageVisitConversionTagsGet(const PageVisitConversionTagsGetRequest& Request, const FPageVisitConversionTagsGetDelegate& Delegate = FPageVisitConversionTagsGetDelegate()) const;
    
private:
    void OnConversionTagsCreateResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FConversionTagsCreateDelegate Delegate) const;
    void OnConversionTagsGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FConversionTagsGetDelegate Delegate) const;
    void OnConversionTagsListResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FConversionTagsListDelegate Delegate) const;
    void OnOcpmEligibleConversionTagsGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FOcpmEligibleConversionTagsGetDelegate Delegate) const;
    void OnPageVisitConversionTagsGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FPageVisitConversionTagsGetDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};

}