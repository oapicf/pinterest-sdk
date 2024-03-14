/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#include "OpenAPIImageMetadata.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIImageMetadata::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (ItemType.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("item_type")); WriteJsonValue(Writer, ItemType.GetValue());
	}
	if (Images.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("images")); WriteJsonValue(Writer, Images.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIImageMetadata::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("item_type"), ItemType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("images"), Images);

	return ParseSuccess;
}

}