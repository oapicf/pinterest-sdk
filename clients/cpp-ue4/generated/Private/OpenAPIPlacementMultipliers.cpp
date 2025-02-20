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

#include "OpenAPIPlacementMultipliers.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIPlacementMultipliers::PlacementEnum& Value)
{
	switch (Value)
	{
	case OpenAPIPlacementMultipliers::PlacementEnum::Search:
		return TEXT("SEARCH");
	case OpenAPIPlacementMultipliers::PlacementEnum::Browse:
		return TEXT("BROWSE");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIPlacementMultipliers::PlacementEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIPlacementMultipliers::EnumToString(const OpenAPIPlacementMultipliers::PlacementEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIPlacementMultipliers::PlacementEnum& Value)
{
	static TMap<FString, OpenAPIPlacementMultipliers::PlacementEnum> StringToEnum = { 
		{ TEXT("SEARCH"), OpenAPIPlacementMultipliers::PlacementEnum::Search },
		{ TEXT("BROWSE"), OpenAPIPlacementMultipliers::PlacementEnum::Browse }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIPlacementMultipliers::EnumFromString(const FString& EnumAsString, OpenAPIPlacementMultipliers::PlacementEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIPlacementMultipliers::PlacementEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIPlacementMultipliers::PlacementEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIPlacementMultipliers::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Placement.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("PLACEMENT")); WriteJsonValue(Writer, Placement.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIPlacementMultipliers::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("PLACEMENT"), Placement);

	return ParseSuccess;
}

}
