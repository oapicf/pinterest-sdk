
#include "CatalogsRetailProductMetadata.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_CatalogsRetailProductMetadata_item_group_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_group_id", "hello"
    };

    CatalogsRetailProductMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemGroupId().c_str());






}


void test_CatalogsRetailProductMetadata_item_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_id", "hello"
    };

    CatalogsRetailProductMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemId().c_str());






}


void test_CatalogsRetailProductMetadata_price_is_assigned_from_json()
{








}


void test_CatalogsRetailProductMetadata_sale_price_is_assigned_from_json()
{








}





void test_CatalogsRetailProductMetadata_item_group_id_is_converted_to_json()
{

    bourne::json input =
    {
        "item_group_id", "hello"
    };

    CatalogsRetailProductMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_group_id"] == output["item_group_id"]);



}


void test_CatalogsRetailProductMetadata_item_id_is_converted_to_json()
{

    bourne::json input =
    {
        "item_id", "hello"
    };

    CatalogsRetailProductMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_id"] == output["item_id"]);



}


void test_CatalogsRetailProductMetadata_price_is_converted_to_json()
{




}


void test_CatalogsRetailProductMetadata_sale_price_is_converted_to_json()
{




}


