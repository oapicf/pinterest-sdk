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
#include "OpenAPICatalogsCreativeAssetsAttributes.h"

namespace OpenAPI
{

/*
 * OpenAPICatalogsUpsertCreativeAssetsItem
 *
 * A creative assets item to be upserted.
 */
class OPENAPI_API OpenAPICatalogsUpsertCreativeAssetsItem : public Model
{
public:
    virtual ~OpenAPICatalogsUpsertCreativeAssetsItem() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The catalog creative assets id in the merchant namespace */
	FString CreativeAssetsId;
	enum class OperationEnum
	{
		Upsert,
  	};

	static FString EnumToString(const OperationEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, OperationEnum& EnumValue);
	OperationEnum Operation;
	OpenAPICatalogsCreativeAssetsAttributes Attributes;
};

}
