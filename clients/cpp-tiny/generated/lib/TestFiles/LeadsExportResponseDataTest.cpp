
#include "LeadsExportResponseData.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LeadsExportResponseData_download_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "download_url", "hello"
    };

    LeadsExportResponseData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDownloadUrl().c_str());






}




void test_LeadsExportResponseData_download_url_is_converted_to_json()
{

    bourne::json input =
    {
        "download_url", "hello"
    };

    LeadsExportResponseData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["download_url"] == output["download_url"]);



}



