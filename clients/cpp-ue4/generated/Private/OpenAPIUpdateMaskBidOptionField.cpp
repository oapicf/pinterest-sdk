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

#include "OpenAPIUpdateMaskBidOptionField.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIUpdateMaskBidOptionField::Values& Value)
{
	switch (Value)
	{
	case OpenAPIUpdateMaskBidOptionField::Values::Bid:
		return TEXT("BID");
	case OpenAPIUpdateMaskBidOptionField::Values::AppTypeBidMultiplierSet:
		return TEXT("APP_TYPE_BID_MULTIPLIER_SET");
	case OpenAPIUpdateMaskBidOptionField::Values::PlacementBidMultiplierSet:
		return TEXT("PLACEMENT_BID_MULTIPLIER_SET");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIUpdateMaskBidOptionField::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIUpdateMaskBidOptionField::EnumToString(const OpenAPIUpdateMaskBidOptionField::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIUpdateMaskBidOptionField::Values& Value)
{
	static TMap<FString, OpenAPIUpdateMaskBidOptionField::Values> StringToEnum = { 
		{ TEXT("BID"), OpenAPIUpdateMaskBidOptionField::Values::Bid },
		{ TEXT("APP_TYPE_BID_MULTIPLIER_SET"), OpenAPIUpdateMaskBidOptionField::Values::AppTypeBidMultiplierSet },
		{ TEXT("PLACEMENT_BID_MULTIPLIER_SET"), OpenAPIUpdateMaskBidOptionField::Values::PlacementBidMultiplierSet }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIUpdateMaskBidOptionField::EnumFromString(const FString& EnumAsString, OpenAPIUpdateMaskBidOptionField::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIUpdateMaskBidOptionField::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIUpdateMaskBidOptionField::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIUpdateMaskBidOptionField::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIUpdateMaskBidOptionField::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
