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

#include "OpenAPICatalogsCreativeAssetsProduct.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPICatalogsCreativeAssetsProduct::CatalogTypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPICatalogsCreativeAssetsProduct::CatalogTypeEnum::CreativeAssets:
		return TEXT("CREATIVE_ASSETS");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPICatalogsCreativeAssetsProduct::CatalogTypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPICatalogsCreativeAssetsProduct::EnumToString(const OpenAPICatalogsCreativeAssetsProduct::CatalogTypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPICatalogsCreativeAssetsProduct::CatalogTypeEnum& Value)
{
	static TMap<FString, OpenAPICatalogsCreativeAssetsProduct::CatalogTypeEnum> StringToEnum = { 
		{ TEXT("CREATIVE_ASSETS"), OpenAPICatalogsCreativeAssetsProduct::CatalogTypeEnum::CreativeAssets }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPICatalogsCreativeAssetsProduct::EnumFromString(const FString& EnumAsString, OpenAPICatalogsCreativeAssetsProduct::CatalogTypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPICatalogsCreativeAssetsProduct::CatalogTypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPICatalogsCreativeAssetsProduct::CatalogTypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPICatalogsCreativeAssetsProduct::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("catalog_type")); WriteJsonValue(Writer, CatalogType);
	Writer->WriteIdentifierPrefix(TEXT("metadata")); WriteJsonValue(Writer, Metadata);
	if (Pin.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("pin")); WriteJsonValue(Writer, Pin.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPICatalogsCreativeAssetsProduct::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("catalog_type"), CatalogType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("metadata"), Metadata);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("pin"), Pin);

	return ParseSuccess;
}

}
