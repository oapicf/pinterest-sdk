/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#include "OpenAPILinkedBusiness.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPILinkedBusiness::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Username.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("username")); WriteJsonValue(Writer, Username.GetValue());
	}
	if (ImageSmallUrl.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("image_small_url")); WriteJsonValue(Writer, ImageSmallUrl.GetValue());
	}
	if (ImageMediumUrl.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("image_medium_url")); WriteJsonValue(Writer, ImageMediumUrl.GetValue());
	}
	if (ImageLargeUrl.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("image_large_url")); WriteJsonValue(Writer, ImageLargeUrl.GetValue());
	}
	if (ImageXlargeUrl.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("image_xlarge_url")); WriteJsonValue(Writer, ImageXlargeUrl.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPILinkedBusiness::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("username"), Username);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("image_small_url"), ImageSmallUrl);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("image_medium_url"), ImageMediumUrl);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("image_large_url"), ImageLargeUrl);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("image_xlarge_url"), ImageXlargeUrl);

	return ParseSuccess;
}

}