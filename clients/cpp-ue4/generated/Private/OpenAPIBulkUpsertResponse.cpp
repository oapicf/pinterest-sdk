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

#include "OpenAPIBulkUpsertResponse.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIBulkUpsertResponse::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (RequestId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("request_id")); WriteJsonValue(Writer, RequestId.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIBulkUpsertResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("request_id"), RequestId);

	return ParseSuccess;
}

}