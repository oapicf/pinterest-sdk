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
#include "OpenAPIException.h"
#include "OpenAPIProductGroupPromotionResponseElement.h"

namespace OpenAPI
{

/*
 * OpenAPIProductGroupPromotionResponseItem
 *
 * 
 */
class OPENAPI_API OpenAPIProductGroupPromotionResponseItem : public Model
{
public:
    virtual ~OpenAPIProductGroupPromotionResponseItem() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIProductGroupPromotionResponseElement> Data;
	TOptional<TArray<OpenAPIException>> Exceptions;
};

}
