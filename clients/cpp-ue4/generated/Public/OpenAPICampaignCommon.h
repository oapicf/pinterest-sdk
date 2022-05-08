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
#include "OpenAPIEntityStatus.h"
#include "OpenAPITrackingUrls.h"

namespace OpenAPI
{

/*
 * OpenAPICampaignCommon
 *
 * Campaign Data
 */
class OPENAPI_API OpenAPICampaignCommon : public Model
{
public:
    virtual ~OpenAPICampaignCommon() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Campaign's Advertiser ID. */
	FString AdAccountId;
	/* Campaign name. */
	TOptional<FString> Name;
	TOptional<OpenAPIEntityStatus> Status;
	/* Campaign total spending cap. */
	TOptional<int32> LifetimeSpendCap;
	/* Campaign daily spending cap. */
	TOptional<int32> DailySpendCap;
	/* Order line ID that appears on the invoice. */
	TOptional<FString> OrderLineId;
	TOptional<OpenAPITrackingUrls> TrackingUrls;
	/* Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
	TOptional<int32> StartTime;
	/* Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
	TOptional<int32> EndTime;
};

}