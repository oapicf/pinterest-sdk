
#include "LeadFormQuestion.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_LeadFormQuestion_custom_question_label_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_question_label", "hello"
    };

    LeadFormQuestion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomQuestionLabel().c_str());






}






void test_LeadFormQuestion_custom_question_label_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_question_label", "hello"
    };

    LeadFormQuestion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_question_label"] == output["custom_question_label"]);



}




