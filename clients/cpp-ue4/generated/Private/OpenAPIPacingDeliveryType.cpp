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

#include "OpenAPIPacingDeliveryType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIPacingDeliveryType::Values& Value)
{
	switch (Value)
	{
	case OpenAPIPacingDeliveryType::Values::Standard:
		return TEXT("STANDARD");
	case OpenAPIPacingDeliveryType::Values::Accelerated:
		return TEXT("ACCELERATED");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIPacingDeliveryType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIPacingDeliveryType::EnumToString(const OpenAPIPacingDeliveryType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIPacingDeliveryType::Values& Value)
{
	static TMap<FString, OpenAPIPacingDeliveryType::Values> StringToEnum = { 
		{ TEXT("STANDARD"), OpenAPIPacingDeliveryType::Values::Standard },
		{ TEXT("ACCELERATED"), OpenAPIPacingDeliveryType::Values::Accelerated }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIPacingDeliveryType::EnumFromString(const FString& EnumAsString, OpenAPIPacingDeliveryType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIPacingDeliveryType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIPacingDeliveryType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIPacingDeliveryType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIPacingDeliveryType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
