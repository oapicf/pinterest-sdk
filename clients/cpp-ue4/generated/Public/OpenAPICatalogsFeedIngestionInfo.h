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
 * OpenAPICatalogsFeedIngestionInfo
 *
 * 
 */
class OPENAPI_API OpenAPICatalogsFeedIngestionInfo : public Model
{
public:
    virtual ~OpenAPICatalogsFeedIngestionInfo() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The number of ingested products that are in stock. */
	TOptional<int32> InStock;
	/* The number of ingested products that are in out of stock. */
	TOptional<int32> OutOfStock;
	/* The number of ingested products that are in preorder. */
	TOptional<int32> Preorder;
};

}
