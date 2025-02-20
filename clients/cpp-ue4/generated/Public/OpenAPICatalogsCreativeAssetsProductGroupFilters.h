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
#include "OpenAPICatalogsCreativeAssetsProductGroupFilterKeys.h"
#include "OpenAPICatalogsCreativeAssetsProductGroupFiltersAllOf.h"
#include "OpenAPICatalogsCreativeAssetsProductGroupFiltersAnyOf.h"

namespace OpenAPI
{

/*
 * OpenAPICatalogsCreativeAssetsProductGroupFilters
 *
 * Object holding a group of filters for a creative assets product group
 */
class OPENAPI_API OpenAPICatalogsCreativeAssetsProductGroupFilters : public Model
{
public:
    virtual ~OpenAPICatalogsCreativeAssetsProductGroupFilters() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TArray<OpenAPICatalogsCreativeAssetsProductGroupFilterKeys> AnyOf;
	TArray<OpenAPICatalogsCreativeAssetsProductGroupFilterKeys> AllOf;
};

}
