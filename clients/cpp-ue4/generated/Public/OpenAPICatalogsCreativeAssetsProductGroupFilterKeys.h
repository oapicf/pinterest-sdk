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
#include "OpenAPICatalogsProductGroupMultipleMediaTypesCriteria.h"
#include "OpenAPICatalogsProductGroupMultipleStringCriteria.h"
#include "OpenAPICatalogsProductGroupMultipleStringListCriteria.h"
#include "OpenAPICreativeAssetsIdFilter.h"
#include "OpenAPICustomLabel0Filter.h"
#include "OpenAPICustomLabel1Filter.h"
#include "OpenAPICustomLabel2Filter.h"
#include "OpenAPICustomLabel3Filter.h"
#include "OpenAPICustomLabel4Filter.h"
#include "OpenAPIGoogleProductCategory0Filter.h"
#include "OpenAPIGoogleProductCategory1Filter.h"
#include "OpenAPIGoogleProductCategory2Filter.h"
#include "OpenAPIGoogleProductCategory3Filter.h"
#include "OpenAPIGoogleProductCategory4Filter.h"
#include "OpenAPIGoogleProductCategory5Filter.h"
#include "OpenAPIGoogleProductCategory6Filter.h"
#include "OpenAPIMediaTypeFilter.h"

namespace OpenAPI
{

/*
 * OpenAPICatalogsCreativeAssetsProductGroupFilterKeys
 *
 * 
 */
class OPENAPI_API OpenAPICatalogsCreativeAssetsProductGroupFilterKeys : public Model
{
public:
    virtual ~OpenAPICatalogsCreativeAssetsProductGroupFilterKeys() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	OpenAPICatalogsProductGroupMultipleStringCriteria CreativeAssetsId;
	OpenAPICatalogsProductGroupMultipleStringCriteria CUSTOMLABEL0;
	OpenAPICatalogsProductGroupMultipleStringCriteria CUSTOMLABEL1;
	OpenAPICatalogsProductGroupMultipleStringCriteria CUSTOMLABEL2;
	OpenAPICatalogsProductGroupMultipleStringCriteria CUSTOMLABEL3;
	OpenAPICatalogsProductGroupMultipleStringCriteria CUSTOMLABEL4;
	OpenAPICatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY6;
	OpenAPICatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY5;
	OpenAPICatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY4;
	OpenAPICatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY3;
	OpenAPICatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY2;
	OpenAPICatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY1;
	OpenAPICatalogsProductGroupMultipleStringListCriteria GOOGLEPRODUCTCATEGORY0;
	OpenAPICatalogsProductGroupMultipleMediaTypesCriteria MediaType;
};

}
