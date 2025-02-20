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

namespace OpenAPI
{

/*
 * OpenAPIDeleteAssetGroupResponseExceptionsInner
 *
 * 
 */
class OPENAPI_API OpenAPIDeleteAssetGroupResponseExceptionsInner : public Model
{
public:
    virtual ~OpenAPIDeleteAssetGroupResponseExceptionsInner() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Error code associated with the error deleting asset group. */
	TOptional<int32> Code;
	/* Error message associated with the error deleting asset group. */
	TOptional<FString> Message;
	/* Asset group id of the exception. */
	TOptional<FString> AssetGroupId;
};

}
