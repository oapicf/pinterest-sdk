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

#include "OpenAPIPinMediaSource.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIPinMediaSource::SourceTypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIPinMediaSource::SourceTypeEnum::PinUrl:
		return TEXT("pin_url");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIPinMediaSource::SourceTypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIPinMediaSource::EnumToString(const OpenAPIPinMediaSource::SourceTypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIPinMediaSource::SourceTypeEnum& Value)
{
	static TMap<FString, OpenAPIPinMediaSource::SourceTypeEnum> StringToEnum = { 
		{ TEXT("pin_url"), OpenAPIPinMediaSource::SourceTypeEnum::PinUrl }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIPinMediaSource::EnumFromString(const FString& EnumAsString, OpenAPIPinMediaSource::SourceTypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIPinMediaSource::SourceTypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIPinMediaSource::SourceTypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

inline FString ToString(const OpenAPIPinMediaSource::ContentTypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIPinMediaSource::ContentTypeEnum::Jpeg:
		return TEXT("image/jpeg");
	case OpenAPIPinMediaSource::ContentTypeEnum::Png:
		return TEXT("image/png");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIPinMediaSource::ContentTypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIPinMediaSource::EnumToString(const OpenAPIPinMediaSource::ContentTypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIPinMediaSource::ContentTypeEnum& Value)
{
	static TMap<FString, OpenAPIPinMediaSource::ContentTypeEnum> StringToEnum = { 
		{ TEXT("image/jpeg"), OpenAPIPinMediaSource::ContentTypeEnum::Jpeg },
		{ TEXT("image/png"), OpenAPIPinMediaSource::ContentTypeEnum::Png }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIPinMediaSource::EnumFromString(const FString& EnumAsString, OpenAPIPinMediaSource::ContentTypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIPinMediaSource::ContentTypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIPinMediaSource::ContentTypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

inline FString ToString(const OpenAPIPinMediaSource::CoverImageContentTypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIPinMediaSource::CoverImageContentTypeEnum::Jpeg:
		return TEXT("image/jpeg");
	case OpenAPIPinMediaSource::CoverImageContentTypeEnum::Png:
		return TEXT("image/png");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIPinMediaSource::CoverImageContentTypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIPinMediaSource::EnumToString(const OpenAPIPinMediaSource::CoverImageContentTypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIPinMediaSource::CoverImageContentTypeEnum& Value)
{
	static TMap<FString, OpenAPIPinMediaSource::CoverImageContentTypeEnum> StringToEnum = { 
		{ TEXT("image/jpeg"), OpenAPIPinMediaSource::CoverImageContentTypeEnum::Jpeg },
		{ TEXT("image/png"), OpenAPIPinMediaSource::CoverImageContentTypeEnum::Png }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIPinMediaSource::EnumFromString(const FString& EnumAsString, OpenAPIPinMediaSource::CoverImageContentTypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIPinMediaSource::CoverImageContentTypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIPinMediaSource::CoverImageContentTypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIPinMediaSource::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("source_type")); WriteJsonValue(Writer, SourceType);
	Writer->WriteIdentifierPrefix(TEXT("content_type")); WriteJsonValue(Writer, ContentType);
	Writer->WriteIdentifierPrefix(TEXT("data")); WriteJsonValue(Writer, Data);
	if (IsStandard.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("is_standard")); WriteJsonValue(Writer, IsStandard.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("url")); WriteJsonValue(Writer, Url);
	if (CoverImageUrl.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("cover_image_url")); WriteJsonValue(Writer, CoverImageUrl.GetValue());
	}
	if (CoverImageContentType.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("cover_image_content_type")); WriteJsonValue(Writer, CoverImageContentType.GetValue());
	}
	if (CoverImageData.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("cover_image_data")); WriteJsonValue(Writer, CoverImageData.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("media_id")); WriteJsonValue(Writer, MediaId);
	Writer->WriteIdentifierPrefix(TEXT("items")); WriteJsonValue(Writer, Items);
	if (Index.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("index")); WriteJsonValue(Writer, Index.GetValue());
	}
	if (IsAffiliateLink.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("is_affiliate_link")); WriteJsonValue(Writer, IsAffiliateLink.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIPinMediaSource::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("source_type"), SourceType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("content_type"), ContentType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("data"), Data);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("is_standard"), IsStandard);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("url"), Url);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("cover_image_url"), CoverImageUrl);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("cover_image_content_type"), CoverImageContentType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("cover_image_data"), CoverImageData);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("media_id"), MediaId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("items"), Items);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("index"), Index);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("is_affiliate_link"), IsAffiliateLink);

	return ParseSuccess;
}

}
