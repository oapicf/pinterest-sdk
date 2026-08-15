
#include "QuizPinData.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"






void test_QuizPinData_tie_breaker_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "tie_breaker_type", "hello"
    };

    QuizPinData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTieBreakerType().c_str());






}






void test_QuizPinData_tie_breaker_type_is_converted_to_json()
{

    bourne::json input =
    {
        "tie_breaker_type", "hello"
    };

    QuizPinData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["tie_breaker_type"] == output["tie_breaker_type"]);



}


