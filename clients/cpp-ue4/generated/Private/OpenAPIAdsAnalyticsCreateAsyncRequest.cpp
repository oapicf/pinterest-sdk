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

#include "OpenAPIAdsAnalyticsCreateAsyncRequest.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIAdsAnalyticsCreateAsyncRequest::PrimarySortEnum& Value)
{
	switch (Value)
	{
	case OpenAPIAdsAnalyticsCreateAsyncRequest::PrimarySortEnum::Id:
		return TEXT("BY_ID");
	case OpenAPIAdsAnalyticsCreateAsyncRequest::PrimarySortEnum::Date:
		return TEXT("BY_DATE");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIAdsAnalyticsCreateAsyncRequest::PrimarySortEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIAdsAnalyticsCreateAsyncRequest::EnumToString(const OpenAPIAdsAnalyticsCreateAsyncRequest::PrimarySortEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIAdsAnalyticsCreateAsyncRequest::PrimarySortEnum& Value)
{
	static TMap<FString, OpenAPIAdsAnalyticsCreateAsyncRequest::PrimarySortEnum> StringToEnum = { 
		{ TEXT("BY_ID"), OpenAPIAdsAnalyticsCreateAsyncRequest::PrimarySortEnum::Id },
		{ TEXT("BY_DATE"), OpenAPIAdsAnalyticsCreateAsyncRequest::PrimarySortEnum::Date }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIAdsAnalyticsCreateAsyncRequest::EnumFromString(const FString& EnumAsString, OpenAPIAdsAnalyticsCreateAsyncRequest::PrimarySortEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIAdsAnalyticsCreateAsyncRequest::PrimarySortEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIAdsAnalyticsCreateAsyncRequest::PrimarySortEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIAdsAnalyticsCreateAsyncRequest::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("start_date")); WriteJsonValue(Writer, StartDate);
	Writer->WriteIdentifierPrefix(TEXT("end_date")); WriteJsonValue(Writer, EndDate);
	Writer->WriteIdentifierPrefix(TEXT("granularity")); WriteJsonValue(Writer, Granularity);
	if (ClickWindowDays.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("click_window_days")); WriteJsonValue(Writer, ClickWindowDays.GetValue());
	}
	if (EngagementWindowDays.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("engagement_window_days")); WriteJsonValue(Writer, EngagementWindowDays.GetValue());
	}
	if (ViewWindowDays.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("view_window_days")); WriteJsonValue(Writer, ViewWindowDays.GetValue());
	}
	if (ConversionReportTime.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("conversion_report_time")); WriteJsonValue(Writer, ConversionReportTime.GetValue());
	}
	if (AttributionTypes.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("attribution_types")); WriteJsonValue(Writer, AttributionTypes.GetValue());
	}
	if (CampaignIds.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("campaign_ids")); WriteJsonValue(Writer, CampaignIds.GetValue());
	}
	if (CampaignStatuses.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("campaign_statuses")); WriteJsonValue(Writer, CampaignStatuses.GetValue());
	}
	if (CampaignObjectiveTypes.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("campaign_objective_types")); WriteJsonValue(Writer, CampaignObjectiveTypes.GetValue());
	}
	if (AdGroupIds.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("ad_group_ids")); WriteJsonValue(Writer, AdGroupIds.GetValue());
	}
	if (AdGroupStatuses.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("ad_group_statuses")); WriteJsonValue(Writer, AdGroupStatuses.GetValue());
	}
	if (AdIds.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("ad_ids")); WriteJsonValue(Writer, AdIds.GetValue());
	}
	if (AdStatuses.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("ad_statuses")); WriteJsonValue(Writer, AdStatuses.GetValue());
	}
	if (ProductGroupIds.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("product_group_ids")); WriteJsonValue(Writer, ProductGroupIds.GetValue());
	}
	if (ProductGroupStatuses.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("product_group_statuses")); WriteJsonValue(Writer, ProductGroupStatuses.GetValue());
	}
	if (ProductItemIds.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("product_item_ids")); WriteJsonValue(Writer, ProductItemIds.GetValue());
	}
	if (TargetingTypes.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("targeting_types")); WriteJsonValue(Writer, TargetingTypes.GetValue());
	}
	if (MetricsFilters.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("metrics_filters")); WriteJsonValue(Writer, MetricsFilters.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("columns")); WriteJsonValue(Writer, Columns);
	Writer->WriteIdentifierPrefix(TEXT("level")); WriteJsonValue(Writer, Level);
	if (ReportFormat.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("report_format")); WriteJsonValue(Writer, ReportFormat.GetValue());
	}
	if (PrimarySort.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("primary_sort")); WriteJsonValue(Writer, PrimarySort.GetValue());
	}
	if (StartHour.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("start_hour")); WriteJsonValue(Writer, StartHour.GetValue());
	}
	if (EndHour.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("end_hour")); WriteJsonValue(Writer, EndHour.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIAdsAnalyticsCreateAsyncRequest::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("start_date"), StartDate);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("end_date"), EndDate);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("granularity"), Granularity);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("click_window_days"), ClickWindowDays);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("engagement_window_days"), EngagementWindowDays);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("view_window_days"), ViewWindowDays);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("conversion_report_time"), ConversionReportTime);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("attribution_types"), AttributionTypes);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("campaign_ids"), CampaignIds);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("campaign_statuses"), CampaignStatuses);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("campaign_objective_types"), CampaignObjectiveTypes);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("ad_group_ids"), AdGroupIds);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("ad_group_statuses"), AdGroupStatuses);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("ad_ids"), AdIds);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("ad_statuses"), AdStatuses);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("product_group_ids"), ProductGroupIds);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("product_group_statuses"), ProductGroupStatuses);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("product_item_ids"), ProductItemIds);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("targeting_types"), TargetingTypes);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("metrics_filters"), MetricsFilters);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("columns"), Columns);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("level"), Level);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("report_format"), ReportFormat);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("primary_sort"), PrimarySort);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("start_hour"), StartHour);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("end_hour"), EndHour);

	return ParseSuccess;
}

}
