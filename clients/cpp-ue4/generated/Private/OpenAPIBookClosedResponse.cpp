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

#include "OpenAPIBookClosedResponse.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIBookClosedResponse::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (ConversionMetricsReady.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("conversion_metrics_ready")); WriteJsonValue(Writer, ConversionMetricsReady.GetValue());
	}
	if (NonConversionMetricsReady.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("non_conversion_metrics_ready")); WriteJsonValue(Writer, NonConversionMetricsReady.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIBookClosedResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("conversion_metrics_ready"), ConversionMetricsReady);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("non_conversion_metrics_ready"), NonConversionMetricsReady);

	return ParseSuccess;
}

}