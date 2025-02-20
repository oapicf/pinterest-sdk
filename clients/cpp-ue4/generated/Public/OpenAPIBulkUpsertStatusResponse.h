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
#include "OpenAPIBulkUpsertStatus.h"

namespace OpenAPI
{

/*
 * OpenAPIBulkUpsertStatusResponse
 *
 * ID of the bulk request.
 */
class OPENAPI_API OpenAPIBulkUpsertStatusResponse : public Model
{
public:
    virtual ~OpenAPIBulkUpsertStatusResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIBulkUpsertStatus> Status;
	TOptional<FString> ResultUrl;
};

}
