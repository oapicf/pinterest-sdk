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
 * OpenAPIDeletedMembersResponse
 *
 * An object with a list of members that were deleted.
 */
class OPENAPI_API OpenAPIDeletedMembersResponse : public Model
{
public:
    virtual ~OpenAPIDeletedMembersResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* List of members whose business membership have been terminated. */
	TOptional<TArray<FString>> DeletedMembers;
};

}
