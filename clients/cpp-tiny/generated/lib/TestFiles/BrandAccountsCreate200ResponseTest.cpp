
#include "Brand_accounts_create_200_response.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Brand_accounts_create_200_response_brand_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "brand_account_id", "hello"
    };

    Brand_accounts_create_200_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBrandAccountId().c_str());






}



void test_Brand_accounts_create_200_response_brand_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "brand_account_id", "hello"
    };

    Brand_accounts_create_200_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["brand_account_id"] == output["brand_account_id"]);



}


