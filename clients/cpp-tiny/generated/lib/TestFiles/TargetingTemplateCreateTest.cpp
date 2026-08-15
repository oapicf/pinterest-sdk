
#include "TargetingTemplateCreate.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TargetingTemplateCreate_auto_targeting_enabled_is_assigned_from_json()
{




    bourne::json input =
    {
        "auto_targeting_enabled", true
    };

    TargetingTemplateCreate obj(input.dump());

    TEST_ASSERT(true == obj.isAutoTargetingEnabled());




}



void test_TargetingTemplateCreate_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    TargetingTemplateCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}






void test_TargetingTemplateCreate_auto_targeting_enabled_is_converted_to_json()
{


    bourne::json input =
    {
        "auto_targeting_enabled", true
    };

    TargetingTemplateCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["auto_targeting_enabled"] == output["auto_targeting_enabled"]);


}



void test_TargetingTemplateCreate_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    TargetingTemplateCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}





