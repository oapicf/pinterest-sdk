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

#include "OpenAPIConversionReportAttributionType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIConversionReportAttributionType::Values& Value)
{
	switch (Value)
	{
	case OpenAPIConversionReportAttributionType::Values::Individual:
		return TEXT("INDIVIDUAL");
	case OpenAPIConversionReportAttributionType::Values::Household:
		return TEXT("HOUSEHOLD");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIConversionReportAttributionType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIConversionReportAttributionType::EnumToString(const OpenAPIConversionReportAttributionType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIConversionReportAttributionType::Values& Value)
{
	static TMap<FString, OpenAPIConversionReportAttributionType::Values> StringToEnum = { 
		{ TEXT("INDIVIDUAL"), OpenAPIConversionReportAttributionType::Values::Individual },
		{ TEXT("HOUSEHOLD"), OpenAPIConversionReportAttributionType::Values::Household }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIConversionReportAttributionType::EnumFromString(const FString& EnumAsString, OpenAPIConversionReportAttributionType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIConversionReportAttributionType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIConversionReportAttributionType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIConversionReportAttributionType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIConversionReportAttributionType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
