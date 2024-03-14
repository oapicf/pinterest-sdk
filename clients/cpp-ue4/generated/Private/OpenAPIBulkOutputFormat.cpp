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

#include "OpenAPIBulkOutputFormat.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIBulkOutputFormat::Values& Value)
{
	switch (Value)
	{
	case OpenAPIBulkOutputFormat::Values::Csv:
		return TEXT("CSV");
	case OpenAPIBulkOutputFormat::Values::Json:
		return TEXT("JSON");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIBulkOutputFormat::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIBulkOutputFormat::EnumToString(const OpenAPIBulkOutputFormat::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIBulkOutputFormat::Values& Value)
{
	static TMap<FString, OpenAPIBulkOutputFormat::Values> StringToEnum = { 
		{ TEXT("CSV"), OpenAPIBulkOutputFormat::Values::Csv },
		{ TEXT("JSON"), OpenAPIBulkOutputFormat::Values::Json }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIBulkOutputFormat::EnumFromString(const FString& EnumAsString, OpenAPIBulkOutputFormat::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIBulkOutputFormat::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIBulkOutputFormat::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIBulkOutputFormat::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIBulkOutputFormat::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}