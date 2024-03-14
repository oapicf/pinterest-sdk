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

#include "OpenAPIConversionApiResponse.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIConversionApiResponse::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("num_events_received")); WriteJsonValue(Writer, NumEventsReceived);
	Writer->WriteIdentifierPrefix(TEXT("num_events_processed")); WriteJsonValue(Writer, NumEventsProcessed);
	Writer->WriteIdentifierPrefix(TEXT("events")); WriteJsonValue(Writer, Events);
	Writer->WriteObjectEnd();
}

bool OpenAPIConversionApiResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("num_events_received"), NumEventsReceived);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("num_events_processed"), NumEventsProcessed);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("events"), Events);

	return ParseSuccess;
}

}