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

#include "OpenAPIQuizPinResult.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIQuizPinResult::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (OrganicPinId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("organic_pin_id")); WriteJsonValue(Writer, OrganicPinId.GetValue());
	}
	if (AndroidDeepLink.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("android_deep_link")); WriteJsonValue(Writer, AndroidDeepLink.GetValue());
	}
	if (IosDeepLink.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("ios_deep_link")); WriteJsonValue(Writer, IosDeepLink.GetValue());
	}
	if (DestinationUrl.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("destination_url")); WriteJsonValue(Writer, DestinationUrl.GetValue());
	}
	if (ResultId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("result_id")); WriteJsonValue(Writer, ResultId.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIQuizPinResult::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("organic_pin_id"), OrganicPinId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("android_deep_link"), AndroidDeepLink);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("ios_deep_link"), IosDeepLink);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("destination_url"), DestinationUrl);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("result_id"), ResultId);

	return ParseSuccess;
}

}