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

#include "OpenAPICampaignsAnalyticsResponseInner.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPICampaignsAnalyticsResponseInner::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("CAMPAIGN_ID")); WriteJsonValue(Writer, CampaignId);
	if (Date.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("DATE")); WriteJsonValue(Writer, Date.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPICampaignsAnalyticsResponseInner::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("CAMPAIGN_ID"), CampaignId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("DATE"), Date);

	return ParseSuccess;
}

}
