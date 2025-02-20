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

#include "OpenAPILeadFormResponse.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPILeadFormResponse::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Name.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name.GetValue());
	}
	if (PrivacyPolicyLink.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("privacy_policy_link")); WriteJsonValue(Writer, PrivacyPolicyLink.GetValue());
	}
	if (HasAcceptedTerms.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("has_accepted_terms")); WriteJsonValue(Writer, HasAcceptedTerms.GetValue());
	}
	if (CompletionMessage.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("completion_message")); WriteJsonValue(Writer, CompletionMessage.GetValue());
	}
	if (Status.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("status")); WriteJsonValue(Writer, Status.GetValue());
	}
	if (DisclosureLanguage.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("disclosure_language")); WriteJsonValue(Writer, DisclosureLanguage.GetValue());
	}
	if (Questions.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("questions")); WriteJsonValue(Writer, Questions.GetValue());
	}
	if (PolicyLinks.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("policy_links")); WriteJsonValue(Writer, PolicyLinks.GetValue());
	}
	if (Id.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id.GetValue());
	}
	if (AdAccountId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("ad_account_id")); WriteJsonValue(Writer, AdAccountId.GetValue());
	}
	if (CreatedTime.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("created_time")); WriteJsonValue(Writer, CreatedTime.GetValue());
	}
	if (UpdatedTime.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("updated_time")); WriteJsonValue(Writer, UpdatedTime.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPILeadFormResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("privacy_policy_link"), PrivacyPolicyLink);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("has_accepted_terms"), HasAcceptedTerms);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("completion_message"), CompletionMessage);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("status"), Status);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("disclosure_language"), DisclosureLanguage);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("questions"), Questions);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("policy_links"), PolicyLinks);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("ad_account_id"), AdAccountId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("created_time"), CreatedTime);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("updated_time"), UpdatedTime);

	return ParseSuccess;
}

}
