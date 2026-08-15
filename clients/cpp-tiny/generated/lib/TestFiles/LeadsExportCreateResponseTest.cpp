
#include "LeadsExportCreateResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LeadsExportCreateResponse_leads_export_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "leads_export_id", "hello"
    };

    LeadsExportCreateResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLeadsExportId().c_str());






}



void test_LeadsExportCreateResponse_leads_export_id_is_converted_to_json()
{

    bourne::json input =
    {
        "leads_export_id", "hello"
    };

    LeadsExportCreateResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["leads_export_id"] == output["leads_export_id"]);



}


