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

#include "OpenAPIAudienceInsightsApiOperations.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace OpenAPI
{

FString OpenAPIAudienceInsightsApi::AudienceInsightsScopeAndTypeGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("ad_account_id"), FStringFormatArg(ToUrlString(AdAccountId)) } };

	FString Path = FString::Format(TEXT("/ad_accounts/{ad_account_id}/insights/audiences"), PathParams);

	return Path;
}

void OpenAPIAudienceInsightsApi::AudienceInsightsScopeAndTypeGetRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

}

void OpenAPIAudienceInsightsApi::AudienceInsightsScopeAndTypeGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Success"));
		break;
	case 0:
	default:
		SetResponseString(TEXT("Unexpected error"));
		break;
	}
}

bool OpenAPIAudienceInsightsApi::AudienceInsightsScopeAndTypeGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIAudienceInsightsApi::AudienceInsightsGetRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("ad_account_id"), FStringFormatArg(ToUrlString(AdAccountId)) } };

	FString Path = FString::Format(TEXT("/ad_accounts/{ad_account_id}/audience_insights"), PathParams);

	TArray<FString> QueryParams;
	QueryParams.Add(FString(TEXT("audience_insight_type=")) + ToUrlString(AudienceInsightType));
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void OpenAPIAudienceInsightsApi::AudienceInsightsGetRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

}

void OpenAPIAudienceInsightsApi::AudienceInsightsGetResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Success"));
		break;
	case 0:
	default:
		SetResponseString(TEXT("Unexpected error"));
		break;
	}
}

bool OpenAPIAudienceInsightsApi::AudienceInsightsGetResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

}
