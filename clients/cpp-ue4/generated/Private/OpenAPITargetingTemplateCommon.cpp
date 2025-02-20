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

#include "OpenAPITargetingTemplateCommon.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPITargetingTemplateCommon::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Name.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name.GetValue());
	}
	if (AutoTargetingEnabled.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("auto_targeting_enabled")); WriteJsonValue(Writer, AutoTargetingEnabled.GetValue());
	}
	if (TargetingAttributes.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("targeting_attributes")); WriteJsonValue(Writer, TargetingAttributes.GetValue());
	}
	if (PlacementGroup.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("placement_group")); WriteJsonValue(Writer, PlacementGroup.GetValue());
	}
	if (Keywords.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("keywords")); WriteJsonValue(Writer, Keywords.GetValue());
	}
	if (TrackingUrls.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("tracking_urls")); WriteJsonValue(Writer, TrackingUrls.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPITargetingTemplateCommon::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("auto_targeting_enabled"), AutoTargetingEnabled);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("targeting_attributes"), TargetingAttributes);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("placement_group"), PlacementGroup);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("keywords"), Keywords);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("tracking_urls"), TrackingUrls);

	return ParseSuccess;
}

}
