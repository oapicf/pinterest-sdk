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

#include "OpenAPIAudienceInsightType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIAudienceInsightType::Values& Value)
{
	switch (Value)
	{
	case OpenAPIAudienceInsightType::Values::YourTotalAudience:
		return TEXT("YOUR_TOTAL_AUDIENCE");
	case OpenAPIAudienceInsightType::Values::YourEngagedAudience:
		return TEXT("YOUR_ENGAGED_AUDIENCE");
	case OpenAPIAudienceInsightType::Values::PinterestTotalAudience:
		return TEXT("PINTEREST_TOTAL_AUDIENCE");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIAudienceInsightType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIAudienceInsightType::EnumToString(const OpenAPIAudienceInsightType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIAudienceInsightType::Values& Value)
{
	static TMap<FString, OpenAPIAudienceInsightType::Values> StringToEnum = { 
		{ TEXT("YOUR_TOTAL_AUDIENCE"), OpenAPIAudienceInsightType::Values::YourTotalAudience },
		{ TEXT("YOUR_ENGAGED_AUDIENCE"), OpenAPIAudienceInsightType::Values::YourEngagedAudience },
		{ TEXT("PINTEREST_TOTAL_AUDIENCE"), OpenAPIAudienceInsightType::Values::PinterestTotalAudience }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIAudienceInsightType::EnumFromString(const FString& EnumAsString, OpenAPIAudienceInsightType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIAudienceInsightType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIAudienceInsightType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIAudienceInsightType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIAudienceInsightType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}