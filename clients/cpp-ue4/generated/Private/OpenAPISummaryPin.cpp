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

#include "OpenAPISummaryPin.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPISummaryPin::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Media.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("media")); WriteJsonValue(Writer, Media.GetValue());
	}
	if (AltText.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("alt_text")); WriteJsonValue(Writer, AltText.GetValue());
	}
	if (Link.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("link")); WriteJsonValue(Writer, Link.GetValue());
	}
	if (Title.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("title")); WriteJsonValue(Writer, Title.GetValue());
	}
	if (Description.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("description")); WriteJsonValue(Writer, Description.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPISummaryPin::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("media"), Media);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("alt_text"), AltText);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("link"), Link);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("title"), Title);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("description"), Description);

	return ParseSuccess;
}

}