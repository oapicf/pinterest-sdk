
#include "KeywordUpdate.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_KeywordUpdate_archived_is_assigned_from_json()
{




    bourne::json input =
    {
        "archived", true
    };

    KeywordUpdate obj(input.dump());

    TEST_ASSERT(true == obj.isArchived());




}


void test_KeywordUpdate_bid_is_assigned_from_json()
{
    bourne::json input =
    {
        "bid", 1
    };

    KeywordUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBid());








}


void test_KeywordUpdate_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    KeywordUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_KeywordUpdate_archived_is_converted_to_json()
{


    bourne::json input =
    {
        "archived", true
    };

    KeywordUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["archived"] == output["archived"]);


}


void test_KeywordUpdate_bid_is_converted_to_json()
{
    bourne::json input =
    {
        "bid", 1
    };

    KeywordUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bid"] == output["bid"]);




}


void test_KeywordUpdate_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    KeywordUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


