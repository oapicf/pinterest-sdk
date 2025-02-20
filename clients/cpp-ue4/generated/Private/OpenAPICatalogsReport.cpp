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

#include "OpenAPICatalogsReport.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPICatalogsReport::ReportStatusEnum& Value)
{
	switch (Value)
	{
	case OpenAPICatalogsReport::ReportStatusEnum::Finished:
		return TEXT("FINISHED");
	case OpenAPICatalogsReport::ReportStatusEnum::InProgress:
		return TEXT("IN_PROGRESS");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPICatalogsReport::ReportStatusEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPICatalogsReport::EnumToString(const OpenAPICatalogsReport::ReportStatusEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPICatalogsReport::ReportStatusEnum& Value)
{
	static TMap<FString, OpenAPICatalogsReport::ReportStatusEnum> StringToEnum = { 
		{ TEXT("FINISHED"), OpenAPICatalogsReport::ReportStatusEnum::Finished },
		{ TEXT("IN_PROGRESS"), OpenAPICatalogsReport::ReportStatusEnum::InProgress }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPICatalogsReport::EnumFromString(const FString& EnumAsString, OpenAPICatalogsReport::ReportStatusEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPICatalogsReport::ReportStatusEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPICatalogsReport::ReportStatusEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPICatalogsReport::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (ReportStatus.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("report_status")); WriteJsonValue(Writer, ReportStatus.GetValue());
	}
	if (Url.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("url")); WriteJsonValue(Writer, Url.GetValue());
	}
	if (Size.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("size")); WriteJsonValue(Writer, Size.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPICatalogsReport::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("report_status"), ReportStatus);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("url"), Url);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("size"), Size);

	return ParseSuccess;
}

}
