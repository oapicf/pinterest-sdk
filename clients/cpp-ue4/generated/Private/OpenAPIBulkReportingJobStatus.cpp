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

#include "OpenAPIBulkReportingJobStatus.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIBulkReportingJobStatus::Values& Value)
{
	switch (Value)
	{
	case OpenAPIBulkReportingJobStatus::Values::DoesNotExist:
		return TEXT("DOES_NOT_EXIST");
	case OpenAPIBulkReportingJobStatus::Values::Finished:
		return TEXT("FINISHED");
	case OpenAPIBulkReportingJobStatus::Values::InProgress:
		return TEXT("IN_PROGRESS");
	case OpenAPIBulkReportingJobStatus::Values::Expired:
		return TEXT("EXPIRED");
	case OpenAPIBulkReportingJobStatus::Values::Failed:
		return TEXT("FAILED");
	case OpenAPIBulkReportingJobStatus::Values::Cancelled:
		return TEXT("CANCELLED");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIBulkReportingJobStatus::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIBulkReportingJobStatus::EnumToString(const OpenAPIBulkReportingJobStatus::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIBulkReportingJobStatus::Values& Value)
{
	static TMap<FString, OpenAPIBulkReportingJobStatus::Values> StringToEnum = { 
		{ TEXT("DOES_NOT_EXIST"), OpenAPIBulkReportingJobStatus::Values::DoesNotExist },
		{ TEXT("FINISHED"), OpenAPIBulkReportingJobStatus::Values::Finished },
		{ TEXT("IN_PROGRESS"), OpenAPIBulkReportingJobStatus::Values::InProgress },
		{ TEXT("EXPIRED"), OpenAPIBulkReportingJobStatus::Values::Expired },
		{ TEXT("FAILED"), OpenAPIBulkReportingJobStatus::Values::Failed },
		{ TEXT("CANCELLED"), OpenAPIBulkReportingJobStatus::Values::Cancelled }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIBulkReportingJobStatus::EnumFromString(const FString& EnumAsString, OpenAPIBulkReportingJobStatus::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIBulkReportingJobStatus::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIBulkReportingJobStatus::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIBulkReportingJobStatus::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIBulkReportingJobStatus::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
