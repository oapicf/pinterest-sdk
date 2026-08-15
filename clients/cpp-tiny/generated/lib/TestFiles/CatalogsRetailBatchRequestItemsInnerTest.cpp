
#include "CatalogsRetailBatchRequest_items_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_CatalogsRetailBatchRequest_items_inner_item_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_id", "hello"
    };

    CatalogsRetailBatchRequest_items_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemId().c_str());






}


void test_CatalogsRetailBatchRequest_items_inner_operation_is_assigned_from_json()
{


    bourne::json input =
    {
        "operation", "hello"
    };

    CatalogsRetailBatchRequest_items_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOperation().c_str());






}



void test_CatalogsRetailBatchRequest_items_inner_last_updated_time_is_assigned_from_json()
{






    bourne::json input =
    {
        "last_updated_time", 1
    };

    CatalogsRetailBatchRequest_items_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLastUpdatedTime());


}




void test_CatalogsRetailBatchRequest_items_inner_item_id_is_converted_to_json()
{

    bourne::json input =
    {
        "item_id", "hello"
    };

    CatalogsRetailBatchRequest_items_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_id"] == output["item_id"]);



}


void test_CatalogsRetailBatchRequest_items_inner_operation_is_converted_to_json()
{

    bourne::json input =
    {
        "operation", "hello"
    };

    CatalogsRetailBatchRequest_items_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["operation"] == output["operation"]);



}



void test_CatalogsRetailBatchRequest_items_inner_last_updated_time_is_converted_to_json()
{



    bourne::json input =
    {
        "last_updated_time", 1
    };

    CatalogsRetailBatchRequest_items_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["last_updated_time"] == output["last_updated_time"]);

}


