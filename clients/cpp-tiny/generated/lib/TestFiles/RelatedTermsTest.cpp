
#include "RelatedTerms.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RelatedTerms_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    RelatedTerms obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_RelatedTerms_related_term_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "related_term_count", 1
    };

    RelatedTerms obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRelatedTermCount());








}




void test_RelatedTerms_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    RelatedTerms obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_RelatedTerms_related_term_count_is_converted_to_json()
{
    bourne::json input =
    {
        "related_term_count", 1
    };

    RelatedTerms obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["related_term_count"] == output["related_term_count"]);




}



