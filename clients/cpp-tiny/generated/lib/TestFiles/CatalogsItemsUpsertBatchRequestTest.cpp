
#include "CatalogsItemsUpsertBatchRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_CatalogsItemsUpsertBatchRequest_language_is_assigned_from_json()
{


    bourne::json input =
    {
        "language", "hello"
    };

    CatalogsItemsUpsertBatchRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLanguage().c_str());






}






void test_CatalogsItemsUpsertBatchRequest_language_is_converted_to_json()
{

    bourne::json input =
    {
        "language", "hello"
    };

    CatalogsItemsUpsertBatchRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["language"] == output["language"]);



}



