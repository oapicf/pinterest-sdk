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
#include "OpenAPIDeleteAssetGroupResponseExceptionsInner.h"

namespace OpenAPI
{

/*
 * OpenAPIDeleteAssetGroupResponse
 *
 * 
 */
class OPENAPI_API OpenAPIDeleteAssetGroupResponse : public Model
{
public:
    virtual ~OpenAPIDeleteAssetGroupResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* A list of ids of successfully deleted asset groups. */
	TOptional<TArray<FString>> DeletedAssetGroups;
	/* A list of errors associated with the asset groups. Will be returned if there is an error. */
	TOptional<TArray<OpenAPIDeleteAssetGroupResponseExceptionsInner>> Exceptions;
};

}
