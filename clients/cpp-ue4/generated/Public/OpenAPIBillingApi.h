/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.14.0
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

class OPENAPI_API OpenAPIBillingApi
{
public:
	OpenAPIBillingApi();
	~OpenAPIBillingApi();

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

	class AdsCreditRedeemRequest;
	class AdsCreditRedeemResponse;
	class AdsCreditsDiscountsGetRequest;
	class AdsCreditsDiscountsGetResponse;
	class BillingProfilesGetRequest;
	class BillingProfilesGetResponse;
	class SsioAccountsGetRequest;
	class SsioAccountsGetResponse;
	class SsioInsertionOrderCreateRequest;
	class SsioInsertionOrderCreateResponse;
	class SsioInsertionOrderEditRequest;
	class SsioInsertionOrderEditResponse;
	class SsioInsertionOrdersStatusGetByAdAccountRequest;
	class SsioInsertionOrdersStatusGetByAdAccountResponse;
	class SsioInsertionOrdersStatusGetByPinOrderIdRequest;
	class SsioInsertionOrdersStatusGetByPinOrderIdResponse;
	class SsioOrderLinesGetByAdAccountRequest;
	class SsioOrderLinesGetByAdAccountResponse;
	
    DECLARE_DELEGATE_OneParam(FAdsCreditRedeemDelegate, const AdsCreditRedeemResponse&);
    DECLARE_DELEGATE_OneParam(FAdsCreditsDiscountsGetDelegate, const AdsCreditsDiscountsGetResponse&);
    DECLARE_DELEGATE_OneParam(FBillingProfilesGetDelegate, const BillingProfilesGetResponse&);
    DECLARE_DELEGATE_OneParam(FSsioAccountsGetDelegate, const SsioAccountsGetResponse&);
    DECLARE_DELEGATE_OneParam(FSsioInsertionOrderCreateDelegate, const SsioInsertionOrderCreateResponse&);
    DECLARE_DELEGATE_OneParam(FSsioInsertionOrderEditDelegate, const SsioInsertionOrderEditResponse&);
    DECLARE_DELEGATE_OneParam(FSsioInsertionOrdersStatusGetByAdAccountDelegate, const SsioInsertionOrdersStatusGetByAdAccountResponse&);
    DECLARE_DELEGATE_OneParam(FSsioInsertionOrdersStatusGetByPinOrderIdDelegate, const SsioInsertionOrdersStatusGetByPinOrderIdResponse&);
    DECLARE_DELEGATE_OneParam(FSsioOrderLinesGetByAdAccountDelegate, const SsioOrderLinesGetByAdAccountResponse&);
    
    FHttpRequestPtr AdsCreditRedeem(const AdsCreditRedeemRequest& Request, const FAdsCreditRedeemDelegate& Delegate = FAdsCreditRedeemDelegate()) const;
    FHttpRequestPtr AdsCreditsDiscountsGet(const AdsCreditsDiscountsGetRequest& Request, const FAdsCreditsDiscountsGetDelegate& Delegate = FAdsCreditsDiscountsGetDelegate()) const;
    FHttpRequestPtr BillingProfilesGet(const BillingProfilesGetRequest& Request, const FBillingProfilesGetDelegate& Delegate = FBillingProfilesGetDelegate()) const;
    FHttpRequestPtr SsioAccountsGet(const SsioAccountsGetRequest& Request, const FSsioAccountsGetDelegate& Delegate = FSsioAccountsGetDelegate()) const;
    FHttpRequestPtr SsioInsertionOrderCreate(const SsioInsertionOrderCreateRequest& Request, const FSsioInsertionOrderCreateDelegate& Delegate = FSsioInsertionOrderCreateDelegate()) const;
    FHttpRequestPtr SsioInsertionOrderEdit(const SsioInsertionOrderEditRequest& Request, const FSsioInsertionOrderEditDelegate& Delegate = FSsioInsertionOrderEditDelegate()) const;
    FHttpRequestPtr SsioInsertionOrdersStatusGetByAdAccount(const SsioInsertionOrdersStatusGetByAdAccountRequest& Request, const FSsioInsertionOrdersStatusGetByAdAccountDelegate& Delegate = FSsioInsertionOrdersStatusGetByAdAccountDelegate()) const;
    FHttpRequestPtr SsioInsertionOrdersStatusGetByPinOrderId(const SsioInsertionOrdersStatusGetByPinOrderIdRequest& Request, const FSsioInsertionOrdersStatusGetByPinOrderIdDelegate& Delegate = FSsioInsertionOrdersStatusGetByPinOrderIdDelegate()) const;
    FHttpRequestPtr SsioOrderLinesGetByAdAccount(const SsioOrderLinesGetByAdAccountRequest& Request, const FSsioOrderLinesGetByAdAccountDelegate& Delegate = FSsioOrderLinesGetByAdAccountDelegate()) const;
    
private:
    void OnAdsCreditRedeemResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdsCreditRedeemDelegate Delegate) const;
    void OnAdsCreditsDiscountsGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FAdsCreditsDiscountsGetDelegate Delegate) const;
    void OnBillingProfilesGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FBillingProfilesGetDelegate Delegate) const;
    void OnSsioAccountsGetResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FSsioAccountsGetDelegate Delegate) const;
    void OnSsioInsertionOrderCreateResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FSsioInsertionOrderCreateDelegate Delegate) const;
    void OnSsioInsertionOrderEditResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FSsioInsertionOrderEditDelegate Delegate) const;
    void OnSsioInsertionOrdersStatusGetByAdAccountResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FSsioInsertionOrdersStatusGetByAdAccountDelegate Delegate) const;
    void OnSsioInsertionOrdersStatusGetByPinOrderIdResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FSsioInsertionOrdersStatusGetByPinOrderIdDelegate Delegate) const;
    void OnSsioOrderLinesGetByAdAccountResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FSsioOrderLinesGetByAdAccountDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};

}
