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

#include "OpenAPIMemberBusinessRole.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIMemberBusinessRole::Values& Value)
{
	switch (Value)
	{
	case OpenAPIMemberBusinessRole::Values::Employee:
		return TEXT("EMPLOYEE");
	case OpenAPIMemberBusinessRole::Values::BizAdmin:
		return TEXT("BIZ_ADMIN");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIMemberBusinessRole::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIMemberBusinessRole::EnumToString(const OpenAPIMemberBusinessRole::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIMemberBusinessRole::Values& Value)
{
	static TMap<FString, OpenAPIMemberBusinessRole::Values> StringToEnum = { 
		{ TEXT("EMPLOYEE"), OpenAPIMemberBusinessRole::Values::Employee },
		{ TEXT("BIZ_ADMIN"), OpenAPIMemberBusinessRole::Values::BizAdmin }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIMemberBusinessRole::EnumFromString(const FString& EnumAsString, OpenAPIMemberBusinessRole::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIMemberBusinessRole::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIMemberBusinessRole::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIMemberBusinessRole::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIMemberBusinessRole::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
