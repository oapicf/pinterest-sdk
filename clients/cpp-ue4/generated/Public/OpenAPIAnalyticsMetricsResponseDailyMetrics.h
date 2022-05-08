/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

/*
 * OpenAPIAnalyticsMetricsResponseDailyMetrics
 *
 * 
 */
class OPENAPI_API OpenAPIAnalyticsMetricsResponseDailyMetrics : public Model
{
public:
    virtual ~OpenAPIAnalyticsMetricsResponseDailyMetrics() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class DataStatusEnum
	{
		Processing,
		Ready,
		Estimate,
		BeforeBusinessCreated,
		BeforeDataRetentionPeriod,
		BeforePinDataRetentionPeriod,
		BeforeMetricStartDate,
		BeforeCoreMetricStartDate,
		BeforePinFormatMetricStartDate,
		BeforeAudienceMetricStartDate,
		BeforeAudienceMonthlyMetricStartDate,
		BeforeVideoMetricStartDate,
		BeforeConversionMetricStartDate,
		PurchasersMetricSmallerThanThreshold,
		InBadTagDate,
		BeforePublishedMetricStartDate,
		BeforeAssistMetricStartDate,
		BeforePinCreated,
		BeforeAccountClaimed,
		BeforeDemographicFiltersStartDate,
		AudienceSegmentSmallerThanThreshold,
		AudienceTotalSmallerThanThreshold,
		BeforeProductGroupFilterStartDate,
  	};

	static FString EnumToString(const DataStatusEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, DataStatusEnum& EnumValue);
	/* Metrics availablity, e.g., \"READY\". */
	TOptional<DataStatusEnum> DataStatus;
	/* Metrics date (UTC): YYYY-MM-DD. */
	TOptional<FString> Date;
	/* The metric name and daily value for each requested metric */
	TOptional<TMap<FString, double>> Metrics;
};

}