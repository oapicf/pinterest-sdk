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

#include "OpenAPILeadFormQuestionFieldType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPILeadFormQuestionFieldType::Values& Value)
{
	switch (Value)
	{
	case OpenAPILeadFormQuestionFieldType::Values::TextField:
		return TEXT("TEXT_FIELD");
	case OpenAPILeadFormQuestionFieldType::Values::TextArea:
		return TEXT("TEXT_AREA");
	case OpenAPILeadFormQuestionFieldType::Values::RadioList:
		return TEXT("RADIO_LIST");
	case OpenAPILeadFormQuestionFieldType::Values::Checkbox:
		return TEXT("CHECKBOX");
	case OpenAPILeadFormQuestionFieldType::Values::Null:
		return TEXT("null");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPILeadFormQuestionFieldType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPILeadFormQuestionFieldType::EnumToString(const OpenAPILeadFormQuestionFieldType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPILeadFormQuestionFieldType::Values& Value)
{
	static TMap<FString, OpenAPILeadFormQuestionFieldType::Values> StringToEnum = { 
		{ TEXT("TEXT_FIELD"), OpenAPILeadFormQuestionFieldType::Values::TextField },
		{ TEXT("TEXT_AREA"), OpenAPILeadFormQuestionFieldType::Values::TextArea },
		{ TEXT("RADIO_LIST"), OpenAPILeadFormQuestionFieldType::Values::RadioList },
		{ TEXT("CHECKBOX"), OpenAPILeadFormQuestionFieldType::Values::Checkbox },
		{ TEXT("null"), OpenAPILeadFormQuestionFieldType::Values::Null }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPILeadFormQuestionFieldType::EnumFromString(const FString& EnumAsString, OpenAPILeadFormQuestionFieldType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPILeadFormQuestionFieldType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPILeadFormQuestionFieldType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPILeadFormQuestionFieldType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPILeadFormQuestionFieldType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}