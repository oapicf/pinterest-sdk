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

#include "OpenAPICatalogsHotelBatchRequest.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPICatalogsHotelBatchRequest::CatalogTypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPICatalogsHotelBatchRequest::CatalogTypeEnum::Hotel:
		return TEXT("HOTEL");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPICatalogsHotelBatchRequest::CatalogTypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPICatalogsHotelBatchRequest::EnumToString(const OpenAPICatalogsHotelBatchRequest::CatalogTypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPICatalogsHotelBatchRequest::CatalogTypeEnum& Value)
{
	static TMap<FString, OpenAPICatalogsHotelBatchRequest::CatalogTypeEnum> StringToEnum = { 
		{ TEXT("HOTEL"), OpenAPICatalogsHotelBatchRequest::CatalogTypeEnum::Hotel }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPICatalogsHotelBatchRequest::EnumFromString(const FString& EnumAsString, OpenAPICatalogsHotelBatchRequest::CatalogTypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPICatalogsHotelBatchRequest::CatalogTypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPICatalogsHotelBatchRequest::CatalogTypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPICatalogsHotelBatchRequest::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("catalog_type")); WriteJsonValue(Writer, CatalogType);
	Writer->WriteIdentifierPrefix(TEXT("country")); WriteJsonValue(Writer, Country);
	Writer->WriteIdentifierPrefix(TEXT("language")); WriteJsonValue(Writer, Language);
	Writer->WriteIdentifierPrefix(TEXT("items")); WriteJsonValue(Writer, Items);
	if (CatalogId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("catalog_id")); WriteJsonValue(Writer, CatalogId.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPICatalogsHotelBatchRequest::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("catalog_type"), CatalogType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("country"), Country);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("language"), Language);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("items"), Items);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("catalog_id"), CatalogId);

	return ParseSuccess;
}

}
