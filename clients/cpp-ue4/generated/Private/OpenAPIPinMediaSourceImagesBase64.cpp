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

#include "OpenAPIPinMediaSourceImagesBase64.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIPinMediaSourceImagesBase64::SourceTypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIPinMediaSourceImagesBase64::SourceTypeEnum::MultipleImageBase64:
		return TEXT("multiple_image_base64");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIPinMediaSourceImagesBase64::SourceTypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIPinMediaSourceImagesBase64::EnumToString(const OpenAPIPinMediaSourceImagesBase64::SourceTypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIPinMediaSourceImagesBase64::SourceTypeEnum& Value)
{
	static TMap<FString, OpenAPIPinMediaSourceImagesBase64::SourceTypeEnum> StringToEnum = { 
		{ TEXT("multiple_image_base64"), OpenAPIPinMediaSourceImagesBase64::SourceTypeEnum::MultipleImageBase64 }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIPinMediaSourceImagesBase64::EnumFromString(const FString& EnumAsString, OpenAPIPinMediaSourceImagesBase64::SourceTypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIPinMediaSourceImagesBase64::SourceTypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIPinMediaSourceImagesBase64::SourceTypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIPinMediaSourceImagesBase64::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (SourceType.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("source_type")); WriteJsonValue(Writer, SourceType.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("items")); WriteJsonValue(Writer, Items);
	if (Index.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("index")); WriteJsonValue(Writer, Index.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIPinMediaSourceImagesBase64::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("source_type"), SourceType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("items"), Items);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("index"), Index);

	return ParseSuccess;
}

}