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

class OPENAPI_API OpenAPIOrderLinesApi
{
public:
	OpenAPIOrderLinesApi();
	~OpenAPIOrderLinesApi();

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

	class OrderLinesGetRequest;
	class OrderLinesGetResponse;
	class OrderLinesListRequest;
	class OrderLinesListResponse;
	
    DECLARE_DELEGATE_OneParam(FOrderLinesGetDelegate, const OrderLinesGetResponse&);
    DECLARE_DELEGATE_OneParam(FOrderLinesListDelegate, const OrderLinesListResponse&);
    
    FHttpRequestPtr OrderLinesGet(const OrderLinesGetRequest& Request, const FOrderLinesGetDelegate& Delegate = FOrderLinesGetDelegate()) const;
    FHttpRequestPtr OrderLinesList(const OrderLinesListRequest& Request, const FOrderLinesListDelegate& Delegate = FOrderLinesListDelegate()) const;
    
private:
    void OnOrderLinesGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FOrderLinesGetDelegate Delegate) const;
    void OnOrderLinesListResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FOrderLinesListDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};

}