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

#include "OpenAPIGoogleProductCategory0Filter.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIGoogleProductCategory0Filter::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("GOOGLE_PRODUCT_CATEGORY_0")); WriteJsonValue(Writer, GOOGLEPRODUCTCATEGORY0);
	Writer->WriteObjectEnd();
}

bool OpenAPIGoogleProductCategory0Filter::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("GOOGLE_PRODUCT_CATEGORY_0"), GOOGLEPRODUCTCATEGORY0);

	return ParseSuccess;
}

}