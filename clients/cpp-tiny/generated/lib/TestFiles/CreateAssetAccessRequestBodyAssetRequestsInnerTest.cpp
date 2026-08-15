
#include "CreateAssetAccessRequestBody_asset_requests_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_CreateAssetAccessRequestBody_asset_requests_inner_partner_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "partner_id", "hello"
    };

    CreateAssetAccessRequestBody_asset_requests_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartnerId().c_str());






}




void test_CreateAssetAccessRequestBody_asset_requests_inner_partner_id_is_converted_to_json()
{

    bourne::json input =
    {
        "partner_id", "hello"
    };

    CreateAssetAccessRequestBody_asset_requests_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partner_id"] == output["partner_id"]);



}


