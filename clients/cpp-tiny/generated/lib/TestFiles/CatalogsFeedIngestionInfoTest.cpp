
#include "CatalogsFeedIngestionInfo.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsFeedIngestionInfo_iN_STOCK_is_assigned_from_json()
{
    bourne::json input =
    {
        "iN_STOCK", 1
    };

    CatalogsFeedIngestionInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getINSTOCK());








}


void test_CatalogsFeedIngestionInfo_oUT_OF_STOCK_is_assigned_from_json()
{
    bourne::json input =
    {
        "oUT_OF_STOCK", 1
    };

    CatalogsFeedIngestionInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOUTOFSTOCK());








}


void test_CatalogsFeedIngestionInfo_pREORDER_is_assigned_from_json()
{
    bourne::json input =
    {
        "pREORDER", 1
    };

    CatalogsFeedIngestionInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPREORDER());








}



void test_CatalogsFeedIngestionInfo_iN_STOCK_is_converted_to_json()
{
    bourne::json input =
    {
        "iN_STOCK", 1
    };

    CatalogsFeedIngestionInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iN_STOCK"] == output["iN_STOCK"]);




}


void test_CatalogsFeedIngestionInfo_oUT_OF_STOCK_is_converted_to_json()
{
    bourne::json input =
    {
        "oUT_OF_STOCK", 1
    };

    CatalogsFeedIngestionInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["oUT_OF_STOCK"] == output["oUT_OF_STOCK"]);




}


void test_CatalogsFeedIngestionInfo_pREORDER_is_converted_to_json()
{
    bourne::json input =
    {
        "pREORDER", 1
    };

    CatalogsFeedIngestionInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pREORDER"] == output["pREORDER"]);




}


