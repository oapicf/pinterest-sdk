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

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIMMMReportingColumn.h"
#include "OpenAPIMMMReportingTargetingType.h"
#include "OpenAPITargetingAdvertiserCountry.h"

namespace OpenAPI
{

/*
 * OpenAPICreateMMMReportRequest
 *
 * 
 */
class OPENAPI_API OpenAPICreateMMMReportRequest : public Model
{
public:
    virtual ~OpenAPICreateMMMReportRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Name of the Marketing Mix Modeling (MMM) report */
	FString ReportName;
	/* Metric report start date (UTC). Format: YYYY-MM-DD */
	FString StartDate;
	/* Metric report end date (UTC). Format: YYYY-MM-DD */
	FString EndDate;
	enum class GranularityEnum
	{
		Day,
		Week,
  	};

	static FString EnumToString(const GranularityEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, GranularityEnum& EnumValue);
	/* DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly. */
	GranularityEnum Granularity;
	enum class LevelEnum
	{
		CampaignTargeting,
		AdGroupTargeting,
  	};

	static FString EnumToString(const LevelEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, LevelEnum& EnumValue);
	/* Level of the report */
	LevelEnum Level;
	/* List of targeting types */
	TArray<OpenAPIMMMReportingTargetingType> TargetingTypes;
	/* Metric and entity columns */
	TArray<OpenAPIMMMReportingColumn> Columns;
	/* A List of countries for filtering */
	TOptional<TArray<OpenAPITargetingAdvertiserCountry>> Countries;
};

}