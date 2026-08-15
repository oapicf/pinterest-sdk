
#include "DeletePartnersRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_DeletePartnersRequest_partner_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "partner_type", "hello"
    };

    DeletePartnersRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartnerType().c_str());






}




void test_DeletePartnersRequest_partner_type_is_converted_to_json()
{

    bourne::json input =
    {
        "partner_type", "hello"
    };

    DeletePartnersRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partner_type"] == output["partner_type"]);



}


