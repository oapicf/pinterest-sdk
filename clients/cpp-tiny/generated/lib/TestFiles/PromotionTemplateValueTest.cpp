
#include "PromotionTemplateValue.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PromotionTemplateValue_amount_is_assigned_from_json()
{








}



void test_PromotionTemplateValue_custom_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_text", "hello"
    };

    PromotionTemplateValue obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomText().c_str());






}


void test_PromotionTemplateValue_percent_is_assigned_from_json()
{








}



void test_PromotionTemplateValue_amount_is_converted_to_json()
{




}



void test_PromotionTemplateValue_custom_text_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_text", "hello"
    };

    PromotionTemplateValue obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_text"] == output["custom_text"]);



}


void test_PromotionTemplateValue_percent_is_converted_to_json()
{




}


