
#include "CatalogsFeedProductCounts.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsFeedProductCounts_ingested_is_assigned_from_json()
{
    bourne::json input =
    {
        "ingested", 1
    };

    CatalogsFeedProductCounts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIngested());








}


void test_CatalogsFeedProductCounts_original_is_assigned_from_json()
{
    bourne::json input =
    {
        "original", 1
    };

    CatalogsFeedProductCounts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOriginal());








}



void test_CatalogsFeedProductCounts_ingested_is_converted_to_json()
{
    bourne::json input =
    {
        "ingested", 1
    };

    CatalogsFeedProductCounts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ingested"] == output["ingested"]);




}


void test_CatalogsFeedProductCounts_original_is_converted_to_json()
{
    bourne::json input =
    {
        "original", 1
    };

    CatalogsFeedProductCounts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["original"] == output["original"]);




}


