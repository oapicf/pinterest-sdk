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

#include "OpenAPICatalogsProductGroupCreateRequest.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPICatalogsProductGroupCreateRequest::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name);
	if (Description.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("description")); WriteJsonValue(Writer, Description.GetValue());
	}
	if (IsFeatured.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("is_featured")); WriteJsonValue(Writer, IsFeatured.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("filters")); WriteJsonValue(Writer, Filters);
	Writer->WriteIdentifierPrefix(TEXT("feed_id")); WriteJsonValue(Writer, FeedId);
	Writer->WriteObjectEnd();
}

bool OpenAPICatalogsProductGroupCreateRequest::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("description"), Description);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("is_featured"), IsFeatured);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("filters"), Filters);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("feed_id"), FeedId);

	return ParseSuccess;
}

}
