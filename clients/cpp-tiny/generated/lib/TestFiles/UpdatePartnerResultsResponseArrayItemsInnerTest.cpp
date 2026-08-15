
#include "UpdatePartnerResultsResponseArray_items_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_UpdatePartnerResultsResponseArray_items_inner_member_or_partner_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "member_or_partner_id", "hello"
    };

    UpdatePartnerResultsResponseArray_items_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMemberOrPartnerId().c_str());






}




void test_UpdatePartnerResultsResponseArray_items_inner_member_or_partner_id_is_converted_to_json()
{

    bourne::json input =
    {
        "member_or_partner_id", "hello"
    };

    UpdatePartnerResultsResponseArray_items_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["member_or_partner_id"] == output["member_or_partner_id"]);



}


