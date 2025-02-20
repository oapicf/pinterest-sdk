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
#include "OpenAPICatalogsItemsPostFilters.h"
#include "OpenAPICatalogsItemsRequestLanguage.h"
#include "OpenAPICountry.h"

namespace OpenAPI
{

/*
 * OpenAPICatalogsItemsRequest
 *
 * Request object of catalogs items
 */
class OPENAPI_API OpenAPICatalogsItemsRequest : public Model
{
public:
    virtual ~OpenAPICatalogsItemsRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	OpenAPICountry Country;
	OpenAPICatalogsItemsRequestLanguage Language;
	OpenAPICatalogsItemsPostFilters Filters;
};

}
