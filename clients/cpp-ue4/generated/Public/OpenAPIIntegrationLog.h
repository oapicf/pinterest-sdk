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
#include "OpenAPIIntegrationLogClientError.h"
#include "OpenAPIIntegrationLogClientRequest.h"

namespace OpenAPI
{

/*
 * OpenAPIIntegrationLog
 *
 * Schema for log sent from an integration application.
 */
class OPENAPI_API OpenAPIIntegrationLog : public Model
{
public:
    virtual ~OpenAPIIntegrationLog() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Timestamp in milliseconds of when the log was executed at the client. */
	int32 ClientTimestamp = 0;
	enum class EventTypeEnum
	{
		App,
		Api,
  	};

	static FString EnumToString(const EventTypeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, EventTypeEnum& EnumValue);
	/* Log event type */
	EventTypeEnum EventType;
	enum class LogLevelEnum
	{
		Info,
		Warn,
		Error,
  	};

	static FString EnumToString(const LogLevelEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, LogLevelEnum& EnumValue);
	/* Log level type */
	LogLevelEnum LogLevel;
	TOptional<FString> ExternalBusinessId;
	TOptional<FString> AdvertiserId;
	TOptional<FString> MerchantId;
	TOptional<FString> TagId;
	TOptional<FString> FeedProfileId;
	/* Explanation of the event that occured. */
	TOptional<FString> Message;
	/* Version number of the integration application. */
	TOptional<FString> AppVersionNumber;
	/* Version number of the platform the integration application is running on. */
	TOptional<FString> PlatformVersionNumber;
	TOptional<OpenAPIIntegrationLogClientError> Error;
	TOptional<OpenAPIIntegrationLogClientRequest> Request;
};

}