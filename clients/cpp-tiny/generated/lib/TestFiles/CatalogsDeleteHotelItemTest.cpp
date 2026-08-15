
#include "CatalogsDeleteHotelItem.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsDeleteHotelItem_hotel_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "hotel_id", "hello"
    };

    CatalogsDeleteHotelItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getHotelId().c_str());






}


void test_CatalogsDeleteHotelItem_operation_is_assigned_from_json()
{


    bourne::json input =
    {
        "operation", "hello"
    };

    CatalogsDeleteHotelItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOperation().c_str());






}



void test_CatalogsDeleteHotelItem_hotel_id_is_converted_to_json()
{

    bourne::json input =
    {
        "hotel_id", "hello"
    };

    CatalogsDeleteHotelItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["hotel_id"] == output["hotel_id"]);



}


void test_CatalogsDeleteHotelItem_operation_is_converted_to_json()
{

    bourne::json input =
    {
        "operation", "hello"
    };

    CatalogsDeleteHotelItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["operation"] == output["operation"]);



}


