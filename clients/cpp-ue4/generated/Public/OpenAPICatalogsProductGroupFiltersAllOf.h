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
#include "OpenAPICatalogsProductGroupFilterKeys.h"

namespace OpenAPI
{

/*
 * OpenAPICatalogsProductGroupFiltersAllOf
 *
 * 
 */
class OPENAPI_API OpenAPICatalogsProductGroupFiltersAllOf : public Model
{
public:
    virtual ~OpenAPICatalogsProductGroupFiltersAllOf() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TArray<OpenAPICatalogsProductGroupFilterKeys> AllOf;
};

}
