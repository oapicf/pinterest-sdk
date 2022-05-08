/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#include "OpenAPICatalogsFeedProcessingResultFields.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPICatalogsFeedProcessingResultFields::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("ingestion_details")); WriteJsonValue(Writer, IngestionDetails);
	Writer->WriteIdentifierPrefix(TEXT("status")); WriteJsonValue(Writer, Status);
	Writer->WriteIdentifierPrefix(TEXT("product_counts")); WriteJsonValue(Writer, ProductCounts);
	Writer->WriteIdentifierPrefix(TEXT("validation_details")); WriteJsonValue(Writer, ValidationDetails);
	Writer->WriteObjectEnd();
}

bool OpenAPICatalogsFeedProcessingResultFields::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("ingestion_details"), IngestionDetails);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("status"), Status);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("product_counts"), ProductCounts);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("validation_details"), ValidationDetails);

	return ParseSuccess;
}

}