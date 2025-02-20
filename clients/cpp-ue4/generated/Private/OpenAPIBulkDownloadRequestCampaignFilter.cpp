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

#include "OpenAPIBulkDownloadRequestCampaignFilter.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIBulkDownloadRequestCampaignFilter::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (StartTime.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("start_time")); WriteJsonValue(Writer, StartTime.GetValue());
	}
	if (EndTime.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("end_time")); WriteJsonValue(Writer, EndTime.GetValue());
	}
	if (Name.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name.GetValue());
	}
	if (CampaignStatus.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("campaign_status")); WriteJsonValue(Writer, CampaignStatus.GetValue());
	}
	if (ObjectiveType.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("objective_type")); WriteJsonValue(Writer, ObjectiveType.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIBulkDownloadRequestCampaignFilter::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("start_time"), StartTime);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("end_time"), EndTime);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("campaign_status"), CampaignStatus);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("objective_type"), ObjectiveType);

	return ParseSuccess;
}

}
