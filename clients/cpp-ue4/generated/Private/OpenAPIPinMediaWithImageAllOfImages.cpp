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

#include "OpenAPIPinMediaWithImageAllOfImages.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIPinMediaWithImageAllOfImages::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (_150x150.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("150x150")); WriteJsonValue(Writer, _150x150.GetValue());
	}
	if (_400x300.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("400x300")); WriteJsonValue(Writer, _400x300.GetValue());
	}
	if (_600x.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("600x")); WriteJsonValue(Writer, _600x.GetValue());
	}
	if (_1200x.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("1200x")); WriteJsonValue(Writer, _1200x.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIPinMediaWithImageAllOfImages::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("150x150"), _150x150);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("400x300"), _400x300);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("600x"), _600x);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("1200x"), _1200x);

	return ParseSuccess;
}

}
