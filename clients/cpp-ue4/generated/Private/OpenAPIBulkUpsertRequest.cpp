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

#include "OpenAPIBulkUpsertRequest.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIBulkUpsertRequest::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Create.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("create")); WriteJsonValue(Writer, Create.GetValue());
	}
	if (Update.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("update")); WriteJsonValue(Writer, Update.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIBulkUpsertRequest::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("create"), Create);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("update"), Update);

	return ParseSuccess;
}

}
