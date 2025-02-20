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
#include "OpenAPIActionType.h"
#include "OpenAPICountry.h"
#include "OpenAPICreativeType.h"
#include "OpenAPICurrency.h"
#include "OpenAPIObjectiveType.h"
#include "OpenAPIOptimizationGoalMetadata.h"

namespace OpenAPI
{

/*
 * OpenAPIBidFloorSpec
 *
 * 
 */
class OPENAPI_API OpenAPIBidFloorSpec : public Model
{
public:
    virtual ~OpenAPIBidFloorSpec() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<TArray<OpenAPICountry>> Countries;
	OpenAPICurrency Currency;
	TOptional<OpenAPIObjectiveType> ObjectiveType;
	OpenAPIActionType BillableEvent;
	TOptional<OpenAPIOptimizationGoalMetadata> OptimizationGoalMetadata;
	TOptional<OpenAPICreativeType> CreativeType;
};

}
