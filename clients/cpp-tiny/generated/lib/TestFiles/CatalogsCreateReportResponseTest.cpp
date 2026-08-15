
#include "CatalogsCreateReportResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsCreateReportResponse_token_is_assigned_from_json()
{


    bourne::json input =
    {
        "token", "hello"
    };

    CatalogsCreateReportResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getToken().c_str());






}



void test_CatalogsCreateReportResponse_token_is_converted_to_json()
{

    bourne::json input =
    {
        "token", "hello"
    };

    CatalogsCreateReportResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["token"] == output["token"]);



}


