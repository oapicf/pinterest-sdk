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

#include "OpenAPIMediaUploadAllOf.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIMediaUploadAllOf::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (MediaId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("media_id")); WriteJsonValue(Writer, MediaId.GetValue());
	}
	if (MediaType.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("media_type")); WriteJsonValue(Writer, MediaType.GetValue());
	}
	if (UploadUrl.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("upload_url")); WriteJsonValue(Writer, UploadUrl.GetValue());
	}
	if (UploadParameters.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("upload_parameters")); WriteJsonValue(Writer, UploadParameters.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIMediaUploadAllOf::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("media_id"), MediaId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("media_type"), MediaType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("upload_url"), UploadUrl);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("upload_parameters"), UploadParameters);

	return ParseSuccess;
}

}