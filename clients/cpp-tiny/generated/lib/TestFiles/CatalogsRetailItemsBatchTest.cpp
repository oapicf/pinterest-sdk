
#include "CatalogsRetailItemsBatch.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsRetailItemsBatch_batch_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "batch_id", "hello"
    };

    CatalogsRetailItemsBatch obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBatchId().c_str());






}



void test_CatalogsRetailItemsBatch_completed_time_is_assigned_from_json()
{








}


void test_CatalogsRetailItemsBatch_created_time_is_assigned_from_json()
{








}





void test_CatalogsRetailItemsBatch_batch_id_is_converted_to_json()
{

    bourne::json input =
    {
        "batch_id", "hello"
    };

    CatalogsRetailItemsBatch obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["batch_id"] == output["batch_id"]);



}



void test_CatalogsRetailItemsBatch_completed_time_is_converted_to_json()
{




}


void test_CatalogsRetailItemsBatch_created_time_is_converted_to_json()
{




}




