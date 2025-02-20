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

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIBulkReportingJobStatus.h"

namespace OpenAPI
{

/*
 * OpenAPICreateMMMReportResponseData
 *
 * 
 */
class OPENAPI_API OpenAPICreateMMMReportResponseData : public Model
{
public:
    virtual ~OpenAPICreateMMMReportResponseData() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIBulkReportingJobStatus> ReportStatus;
	TOptional<FString> Token;
	TOptional<FString> Message;
	TOptional<FString> Status;
};

}
