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

#include "OpenAPIGetAudiencesOrderBy.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIGetAudiencesOrderBy::Values& Value)
{
	switch (Value)
	{
	case OpenAPIGetAudiencesOrderBy::Values::None:
		return TEXT("NONE");
	case OpenAPIGetAudiencesOrderBy::Values::Id:
		return TEXT("ID");
	case OpenAPIGetAudiencesOrderBy::Values::Size:
		return TEXT("SIZE");
	case OpenAPIGetAudiencesOrderBy::Values::CreationDate:
		return TEXT("CREATION_DATE");
	case OpenAPIGetAudiencesOrderBy::Values::UpdatedTime:
		return TEXT("UPDATED_TIME");
	case OpenAPIGetAudiencesOrderBy::Values::Name:
		return TEXT("NAME");
	case OpenAPIGetAudiencesOrderBy::Values::Status:
		return TEXT("STATUS");
	case OpenAPIGetAudiencesOrderBy::Values::Type:
		return TEXT("TYPE");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIGetAudiencesOrderBy::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIGetAudiencesOrderBy::EnumToString(const OpenAPIGetAudiencesOrderBy::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIGetAudiencesOrderBy::Values& Value)
{
	static TMap<FString, OpenAPIGetAudiencesOrderBy::Values> StringToEnum = { 
		{ TEXT("NONE"), OpenAPIGetAudiencesOrderBy::Values::None },
		{ TEXT("ID"), OpenAPIGetAudiencesOrderBy::Values::Id },
		{ TEXT("SIZE"), OpenAPIGetAudiencesOrderBy::Values::Size },
		{ TEXT("CREATION_DATE"), OpenAPIGetAudiencesOrderBy::Values::CreationDate },
		{ TEXT("UPDATED_TIME"), OpenAPIGetAudiencesOrderBy::Values::UpdatedTime },
		{ TEXT("NAME"), OpenAPIGetAudiencesOrderBy::Values::Name },
		{ TEXT("STATUS"), OpenAPIGetAudiencesOrderBy::Values::Status },
		{ TEXT("TYPE"), OpenAPIGetAudiencesOrderBy::Values::Type }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIGetAudiencesOrderBy::EnumFromString(const FString& EnumAsString, OpenAPIGetAudiencesOrderBy::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIGetAudiencesOrderBy::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIGetAudiencesOrderBy::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIGetAudiencesOrderBy::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIGetAudiencesOrderBy::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
