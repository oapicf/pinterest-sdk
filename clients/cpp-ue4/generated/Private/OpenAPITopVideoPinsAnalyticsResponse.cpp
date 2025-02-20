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

#include "OpenAPITopVideoPinsAnalyticsResponse.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPITopVideoPinsAnalyticsResponse::SortByEnum& Value)
{
	switch (Value)
	{
	case OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::Save:
		return TEXT("SAVE");
	case OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::Impression:
		return TEXT("IMPRESSION");
	case OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::OutboundClick:
		return TEXT("OUTBOUND_CLICK");
	case OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::VideoMrcView:
		return TEXT("VIDEO_MRC_VIEW");
	case OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::VideoAvgWatchTime:
		return TEXT("VIDEO_AVG_WATCH_TIME");
	case OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::VIDEOV50WATCHTIME:
		return TEXT("VIDEO_V50_WATCH_TIME");
	case OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::QUARTILE95PERCENTVIEW:
		return TEXT("QUARTILE_95_PERCENT_VIEW");
	case OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::VIDEO10SVIEW:
		return TEXT("VIDEO_10S_VIEW");
	case OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::VideoStart:
		return TEXT("VIDEO_START");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPITopVideoPinsAnalyticsResponse::SortByEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPITopVideoPinsAnalyticsResponse::EnumToString(const OpenAPITopVideoPinsAnalyticsResponse::SortByEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPITopVideoPinsAnalyticsResponse::SortByEnum& Value)
{
	static TMap<FString, OpenAPITopVideoPinsAnalyticsResponse::SortByEnum> StringToEnum = { 
		{ TEXT("SAVE"), OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::Save },
		{ TEXT("IMPRESSION"), OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::Impression },
		{ TEXT("OUTBOUND_CLICK"), OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::OutboundClick },
		{ TEXT("VIDEO_MRC_VIEW"), OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::VideoMrcView },
		{ TEXT("VIDEO_AVG_WATCH_TIME"), OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::VideoAvgWatchTime },
		{ TEXT("VIDEO_V50_WATCH_TIME"), OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::VIDEOV50WATCHTIME },
		{ TEXT("QUARTILE_95_PERCENT_VIEW"), OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::QUARTILE95PERCENTVIEW },
		{ TEXT("VIDEO_10S_VIEW"), OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::VIDEO10SVIEW },
		{ TEXT("VIDEO_START"), OpenAPITopVideoPinsAnalyticsResponse::SortByEnum::VideoStart }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPITopVideoPinsAnalyticsResponse::EnumFromString(const FString& EnumAsString, OpenAPITopVideoPinsAnalyticsResponse::SortByEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPITopVideoPinsAnalyticsResponse::SortByEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPITopVideoPinsAnalyticsResponse::SortByEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPITopVideoPinsAnalyticsResponse::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (DateAvailability.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("date_availability")); WriteJsonValue(Writer, DateAvailability.GetValue());
	}
	if (Pins.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("pins")); WriteJsonValue(Writer, Pins.GetValue());
	}
	if (SortBy.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("sort_by")); WriteJsonValue(Writer, SortBy.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPITopVideoPinsAnalyticsResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("date_availability"), DateAvailability);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("pins"), Pins);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("sort_by"), SortBy);

	return ParseSuccess;
}

}
