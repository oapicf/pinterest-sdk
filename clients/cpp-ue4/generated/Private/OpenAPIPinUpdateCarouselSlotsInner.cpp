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

#include "OpenAPIPinUpdateCarouselSlotsInner.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIPinUpdateCarouselSlotsInner::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Title.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("title")); WriteJsonValue(Writer, Title.GetValue());
	}
	if (Description.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("description")); WriteJsonValue(Writer, Description.GetValue());
	}
	if (Link.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("link")); WriteJsonValue(Writer, Link.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIPinUpdateCarouselSlotsInner::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("title"), Title);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("description"), Description);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("link"), Link);

	return ParseSuccess;
}

}
