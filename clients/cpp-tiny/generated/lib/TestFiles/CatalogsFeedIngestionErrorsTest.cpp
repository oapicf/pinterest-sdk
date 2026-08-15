
#include "CatalogsFeedIngestionErrors.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsFeedIngestionErrors_aCCOUNT_FLAGGED_is_assigned_from_json()
{
    bourne::json input =
    {
        "aCCOUNT_FLAGGED", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getACCOUNTFLAGGED());








}


void test_CatalogsFeedIngestionErrors_fETCH_GOOGLE_SHEET_NOT_SHARED_is_assigned_from_json()
{
    bourne::json input =
    {
        "fETCH_GOOGLE_SHEET_NOT_SHARED", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFETCHGOOGLESHEETNOTSHARED());








}


void test_CatalogsFeedIngestionErrors_iMAGE_FILE_NOT_ACCESSIBLE_is_assigned_from_json()
{
    bourne::json input =
    {
        "iMAGE_FILE_NOT_ACCESSIBLE", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIMAGEFILENOTACCESSIBLE());








}


void test_CatalogsFeedIngestionErrors_iMAGE_FILE_NOT_FOUND_is_assigned_from_json()
{
    bourne::json input =
    {
        "iMAGE_FILE_NOT_FOUND", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIMAGEFILENOTFOUND());








}


void test_CatalogsFeedIngestionErrors_iMAGE_INVALID_FILE_is_assigned_from_json()
{
    bourne::json input =
    {
        "iMAGE_INVALID_FILE", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIMAGEINVALIDFILE());








}


void test_CatalogsFeedIngestionErrors_iMAGE_LEVEL_INTERNAL_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "iMAGE_LEVEL_INTERNAL_ERROR", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIMAGELEVELINTERNALERROR());








}


void test_CatalogsFeedIngestionErrors_iMAGE_MALFORMED_URL_is_assigned_from_json()
{
    bourne::json input =
    {
        "iMAGE_MALFORMED_URL", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIMAGEMALFORMEDURL());








}


void test_CatalogsFeedIngestionErrors_lARGE_PRODUCT_COUNT_DECREASE_is_assigned_from_json()
{
    bourne::json input =
    {
        "lARGE_PRODUCT_COUNT_DECREASE", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLARGEPRODUCTCOUNTDECREASE());








}


void test_CatalogsFeedIngestionErrors_lINE_LEVEL_INTERNAL_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "lINE_LEVEL_INTERNAL_ERROR", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLINELEVELINTERNALERROR());








}



void test_CatalogsFeedIngestionErrors_aCCOUNT_FLAGGED_is_converted_to_json()
{
    bourne::json input =
    {
        "aCCOUNT_FLAGGED", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aCCOUNT_FLAGGED"] == output["aCCOUNT_FLAGGED"]);




}


void test_CatalogsFeedIngestionErrors_fETCH_GOOGLE_SHEET_NOT_SHARED_is_converted_to_json()
{
    bourne::json input =
    {
        "fETCH_GOOGLE_SHEET_NOT_SHARED", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fETCH_GOOGLE_SHEET_NOT_SHARED"] == output["fETCH_GOOGLE_SHEET_NOT_SHARED"]);




}


void test_CatalogsFeedIngestionErrors_iMAGE_FILE_NOT_ACCESSIBLE_is_converted_to_json()
{
    bourne::json input =
    {
        "iMAGE_FILE_NOT_ACCESSIBLE", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iMAGE_FILE_NOT_ACCESSIBLE"] == output["iMAGE_FILE_NOT_ACCESSIBLE"]);




}


void test_CatalogsFeedIngestionErrors_iMAGE_FILE_NOT_FOUND_is_converted_to_json()
{
    bourne::json input =
    {
        "iMAGE_FILE_NOT_FOUND", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iMAGE_FILE_NOT_FOUND"] == output["iMAGE_FILE_NOT_FOUND"]);




}


void test_CatalogsFeedIngestionErrors_iMAGE_INVALID_FILE_is_converted_to_json()
{
    bourne::json input =
    {
        "iMAGE_INVALID_FILE", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iMAGE_INVALID_FILE"] == output["iMAGE_INVALID_FILE"]);




}


void test_CatalogsFeedIngestionErrors_iMAGE_LEVEL_INTERNAL_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "iMAGE_LEVEL_INTERNAL_ERROR", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iMAGE_LEVEL_INTERNAL_ERROR"] == output["iMAGE_LEVEL_INTERNAL_ERROR"]);




}


void test_CatalogsFeedIngestionErrors_iMAGE_MALFORMED_URL_is_converted_to_json()
{
    bourne::json input =
    {
        "iMAGE_MALFORMED_URL", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iMAGE_MALFORMED_URL"] == output["iMAGE_MALFORMED_URL"]);




}


void test_CatalogsFeedIngestionErrors_lARGE_PRODUCT_COUNT_DECREASE_is_converted_to_json()
{
    bourne::json input =
    {
        "lARGE_PRODUCT_COUNT_DECREASE", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lARGE_PRODUCT_COUNT_DECREASE"] == output["lARGE_PRODUCT_COUNT_DECREASE"]);




}


void test_CatalogsFeedIngestionErrors_lINE_LEVEL_INTERNAL_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "lINE_LEVEL_INTERNAL_ERROR", 1
    };

    CatalogsFeedIngestionErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lINE_LEVEL_INTERNAL_ERROR"] == output["lINE_LEVEL_INTERNAL_ERROR"]);




}


