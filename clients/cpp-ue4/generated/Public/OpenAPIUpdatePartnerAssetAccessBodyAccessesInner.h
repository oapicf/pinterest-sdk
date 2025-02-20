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
#include "OpenAPIPermissions.h"

namespace OpenAPI
{

/*
 * OpenAPIUpdatePartnerAssetAccessBodyAccessesInner
 *
 * 
 */
class OPENAPI_API OpenAPIUpdatePartnerAssetAccessBodyAccessesInner : public Model
{
public:
    virtual ~OpenAPIUpdatePartnerAssetAccessBodyAccessesInner() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Unique identifier of a business partner to update asset access to. */
	FString PartnerId;
	/* Unique identifier of the business asset. */
	FString AssetId;
	/* A non-empty array of permissions to assign to the partner. */
	TArray<OpenAPIPermissions> Permissions;
};

}
