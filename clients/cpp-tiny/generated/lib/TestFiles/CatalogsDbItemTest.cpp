
#include "CatalogsDbItem.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsDbItem_created_at_is_assigned_from_json()
{








}


void test_CatalogsDbItem_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsDbItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_CatalogsDbItem_updated_at_is_assigned_from_json()
{








}



void test_CatalogsDbItem_created_at_is_converted_to_json()
{




}


void test_CatalogsDbItem_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsDbItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_CatalogsDbItem_updated_at_is_converted_to_json()
{




}


