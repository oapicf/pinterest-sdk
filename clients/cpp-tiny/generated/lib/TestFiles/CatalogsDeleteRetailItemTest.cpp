
#include "CatalogsDeleteRetailItem.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsDeleteRetailItem_item_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_id", "hello"
    };

    CatalogsDeleteRetailItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemId().c_str());






}


void test_CatalogsDeleteRetailItem_last_updated_time_is_assigned_from_json()
{






    bourne::json input =
    {
        "last_updated_time", 1
    };

    CatalogsDeleteRetailItem obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLastUpdatedTime());


}


void test_CatalogsDeleteRetailItem_operation_is_assigned_from_json()
{


    bourne::json input =
    {
        "operation", "hello"
    };

    CatalogsDeleteRetailItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOperation().c_str());






}



void test_CatalogsDeleteRetailItem_item_id_is_converted_to_json()
{

    bourne::json input =
    {
        "item_id", "hello"
    };

    CatalogsDeleteRetailItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_id"] == output["item_id"]);



}


void test_CatalogsDeleteRetailItem_last_updated_time_is_converted_to_json()
{



    bourne::json input =
    {
        "last_updated_time", 1
    };

    CatalogsDeleteRetailItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["last_updated_time"] == output["last_updated_time"]);

}


void test_CatalogsDeleteRetailItem_operation_is_converted_to_json()
{

    bourne::json input =
    {
        "operation", "hello"
    };

    CatalogsDeleteRetailItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["operation"] == output["operation"]);



}


