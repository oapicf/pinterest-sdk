
#include "CatalogsFeedProcessingResult.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsFeedProcessingResult_created_at_is_assigned_from_json()
{








}


void test_CatalogsFeedProcessingResult_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsFeedProcessingResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_CatalogsFeedProcessingResult_updated_at_is_assigned_from_json()
{








}








void test_CatalogsFeedProcessingResult_created_at_is_converted_to_json()
{




}


void test_CatalogsFeedProcessingResult_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsFeedProcessingResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_CatalogsFeedProcessingResult_updated_at_is_converted_to_json()
{




}







