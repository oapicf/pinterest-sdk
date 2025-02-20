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

#include "OpenAPISingleInterestTargetingOptionResponse.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPISingleInterestTargetingOptionResponse::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Id.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id.GetValue());
	}
	if (Name.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name.GetValue());
	}
	if (ChildInterests.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("child_interests")); WriteJsonValue(Writer, ChildInterests.GetValue());
	}
	if (Level.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("level")); WriteJsonValue(Writer, Level.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPISingleInterestTargetingOptionResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("child_interests"), ChildInterests);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("level"), Level);

	return ParseSuccess;
}

}
