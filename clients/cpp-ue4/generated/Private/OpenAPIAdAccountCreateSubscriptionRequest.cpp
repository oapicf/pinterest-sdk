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

#include "OpenAPIAdAccountCreateSubscriptionRequest.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIAdAccountCreateSubscriptionRequest::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("webhook_url")); WriteJsonValue(Writer, WebhookUrl);
	if (LeadFormId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("lead_form_id")); WriteJsonValue(Writer, LeadFormId.GetValue());
	}
	if (PartnerAccessToken.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("partner_access_token")); WriteJsonValue(Writer, PartnerAccessToken.GetValue());
	}
	if (PartnerRefreshToken.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("partner_refresh_token")); WriteJsonValue(Writer, PartnerRefreshToken.GetValue());
	}
	if (PartnerMetadata.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("partner_metadata")); WriteJsonValue(Writer, PartnerMetadata.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIAdAccountCreateSubscriptionRequest::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("webhook_url"), WebhookUrl);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("lead_form_id"), LeadFormId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("partner_access_token"), PartnerAccessToken);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("partner_refresh_token"), PartnerRefreshToken);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("partner_metadata"), PartnerMetadata);

	return ParseSuccess;
}

}
