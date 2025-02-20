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
#include "OpenAPIBusinessAccessUserSummary.h"

namespace OpenAPI
{

/*
 * OpenAPIUserSingleAssetBinding
 *
 * An object containing the permissions a business member/partner has on the asset.
 */
class OPENAPI_API OpenAPIUserSingleAssetBinding : public Model
{
public:
    virtual ~OpenAPIUserSingleAssetBinding() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Permission levels member or partner has on an asset. */
	TOptional<TArray<FString>> Permissions;
	TOptional<OpenAPIBusinessAccessUserSummary> User;
};

}
