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

#include "OpenAPIAdAccountGetSubscriptionResponse.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIAdAccountGetSubscriptionResponse::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (LeadFormId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("lead_form_id")); WriteJsonValue(Writer, LeadFormId.GetValue());
	}
	if (WebhookUrl.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("webhook_url")); WriteJsonValue(Writer, WebhookUrl.GetValue());
	}
	if (Id.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id.GetValue());
	}
	if (UserAccountId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("user_account_id")); WriteJsonValue(Writer, UserAccountId.GetValue());
	}
	if (AdAccountId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("ad_account_id")); WriteJsonValue(Writer, AdAccountId.GetValue());
	}
	if (ApiVersion.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("api_version")); WriteJsonValue(Writer, ApiVersion.GetValue());
	}
	if (CryptographicKey.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("cryptographic_key")); WriteJsonValue(Writer, CryptographicKey.GetValue());
	}
	if (CryptographicAlgorithm.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("cryptographic_algorithm")); WriteJsonValue(Writer, CryptographicAlgorithm.GetValue());
	}
	if (CreatedTime.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("created_time")); WriteJsonValue(Writer, CreatedTime.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIAdAccountGetSubscriptionResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("lead_form_id"), LeadFormId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("webhook_url"), WebhookUrl);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("user_account_id"), UserAccountId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("ad_account_id"), AdAccountId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("api_version"), ApiVersion);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("cryptographic_key"), CryptographicKey);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("cryptographic_algorithm"), CryptographicAlgorithm);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("created_time"), CreatedTime);

	return ParseSuccess;
}

}