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

#include "OpenAPICatalogsProductGroupMultipleStringCriteria.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPICatalogsProductGroupMultipleStringCriteria::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("values")); WriteJsonValue(Writer, Values);
	if (Negated.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("negated")); WriteJsonValue(Writer, Negated.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPICatalogsProductGroupMultipleStringCriteria::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("values"), Values);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("negated"), Negated);

	return ParseSuccess;
}

}
