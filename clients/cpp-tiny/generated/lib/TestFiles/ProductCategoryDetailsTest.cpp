
#include "ProductCategoryDetails.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_ProductCategoryDetails_has_prediction_is_assigned_from_json()
{




    bourne::json input =
    {
        "has_prediction", true
    };

    ProductCategoryDetails obj(input.dump());

    TEST_ASSERT(true == obj.isHasPrediction());




}



void test_ProductCategoryDetails_predicted_time_series_is_assigned_from_json()
{








}




void test_ProductCategoryDetails_time_series_is_assigned_from_json()
{








}




void test_ProductCategoryDetails_has_prediction_is_converted_to_json()
{


    bourne::json input =
    {
        "has_prediction", true
    };

    ProductCategoryDetails obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["has_prediction"] == output["has_prediction"]);


}



void test_ProductCategoryDetails_predicted_time_series_is_converted_to_json()
{




}




void test_ProductCategoryDetails_time_series_is_converted_to_json()
{




}


