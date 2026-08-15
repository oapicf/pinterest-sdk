
#include "CatalogsFeedValidationErrors.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsFeedValidationErrors_aDULT_INVALID_is_assigned_from_json()
{
    bourne::json input =
    {
        "aDULT_INVALID", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADULTINVALID());








}


void test_CatalogsFeedValidationErrors_aDWORDS_FORMAT_INVALID_is_assigned_from_json()
{
    bourne::json input =
    {
        "aDWORDS_FORMAT_INVALID", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADWORDSFORMATINVALID());








}


void test_CatalogsFeedValidationErrors_aVAILABILITY_INVALID_is_assigned_from_json()
{
    bourne::json input =
    {
        "aVAILABILITY_INVALID", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAVAILABILITYINVALID());








}


void test_CatalogsFeedValidationErrors_bLOCKLISTED_IMAGE_SIGNATURE_is_assigned_from_json()
{
    bourne::json input =
    {
        "bLOCKLISTED_IMAGE_SIGNATURE", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBLOCKLISTEDIMAGESIGNATURE());








}


void test_CatalogsFeedValidationErrors_dELIMITER_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "dELIMITER_ERROR", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDELIMITERERROR());








}


void test_CatalogsFeedValidationErrors_dESCRIPTION_MISSING_is_assigned_from_json()
{
    bourne::json input =
    {
        "dESCRIPTION_MISSING", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDESCRIPTIONMISSING());








}


void test_CatalogsFeedValidationErrors_dUPLICATE_PRODUCTS_is_assigned_from_json()
{
    bourne::json input =
    {
        "dUPLICATE_PRODUCTS", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDUPLICATEPRODUCTS());








}


void test_CatalogsFeedValidationErrors_eNCODING_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "eNCODING_ERROR", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getENCODINGERROR());








}


void test_CatalogsFeedValidationErrors_fEED_LENGTH_TOO_LONG_is_assigned_from_json()
{
    bourne::json input =
    {
        "fEED_LENGTH_TOO_LONG", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFEEDLENGTHTOOLONG());








}


void test_CatalogsFeedValidationErrors_fEED_TOO_SMALL_is_assigned_from_json()
{
    bourne::json input =
    {
        "fEED_TOO_SMALL", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFEEDTOOSMALL());








}


void test_CatalogsFeedValidationErrors_fETCH_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "fETCH_ERROR", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFETCHERROR());








}


void test_CatalogsFeedValidationErrors_fETCH_INACTIVE_FEED_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "fETCH_INACTIVE_FEED_ERROR", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFETCHINACTIVEFEEDERROR());








}


void test_CatalogsFeedValidationErrors_iMAGE_LINK_INVALID_is_assigned_from_json()
{
    bourne::json input =
    {
        "iMAGE_LINK_INVALID", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIMAGELINKINVALID());








}


void test_CatalogsFeedValidationErrors_iMAGE_LINK_LENGTH_TOO_LONG_is_assigned_from_json()
{
    bourne::json input =
    {
        "iMAGE_LINK_LENGTH_TOO_LONG", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIMAGELINKLENGTHTOOLONG());








}


void test_CatalogsFeedValidationErrors_iMAGE_LINK_MISSING_is_assigned_from_json()
{
    bourne::json input =
    {
        "iMAGE_LINK_MISSING", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIMAGELINKMISSING());








}


void test_CatalogsFeedValidationErrors_iNTERNAL_SERVICE_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "iNTERNAL_SERVICE_ERROR", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getINTERNALSERVICEERROR());








}


void test_CatalogsFeedValidationErrors_iNVALID_DOMAIN_is_assigned_from_json()
{
    bourne::json input =
    {
        "iNVALID_DOMAIN", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getINVALIDDOMAIN());








}


void test_CatalogsFeedValidationErrors_iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE_is_assigned_from_json()
{
    bourne::json input =
    {
        "iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getITEMMAINIMAGEDOWNLOADFAILURE());








}


void test_CatalogsFeedValidationErrors_iTEMID_MISSING_is_assigned_from_json()
{
    bourne::json input =
    {
        "iTEMID_MISSING", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getITEMIDMISSING());








}


void test_CatalogsFeedValidationErrors_lINK_FORMAT_INVALID_is_assigned_from_json()
{
    bourne::json input =
    {
        "lINK_FORMAT_INVALID", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLINKFORMATINVALID());








}


void test_CatalogsFeedValidationErrors_lINK_LENGTH_TOO_LONG_is_assigned_from_json()
{
    bourne::json input =
    {
        "lINK_LENGTH_TOO_LONG", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLINKLENGTHTOOLONG());








}


void test_CatalogsFeedValidationErrors_lIST_PRICE_INVALID_is_assigned_from_json()
{
    bourne::json input =
    {
        "lIST_PRICE_INVALID", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLISTPRICEINVALID());








}


void test_CatalogsFeedValidationErrors_mALFORMED_XML_is_assigned_from_json()
{
    bourne::json input =
    {
        "mALFORMED_XML", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMALFORMEDXML());








}


void test_CatalogsFeedValidationErrors_mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED_is_assigned_from_json()
{
    bourne::json input =
    {
        "mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMAXITEMSPERITEMGROUPEXCEEDED());








}


void test_CatalogsFeedValidationErrors_nO_VERIFIED_DOMAIN_is_assigned_from_json()
{
    bourne::json input =
    {
        "nO_VERIFIED_DOMAIN", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getNOVERIFIEDDOMAIN());








}


void test_CatalogsFeedValidationErrors_pARSE_LINE_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "pARSE_LINE_ERROR", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPARSELINEERROR());








}


void test_CatalogsFeedValidationErrors_pINJOIN_CONTENT_UNSAFE_is_assigned_from_json()
{
    bourne::json input =
    {
        "pINJOIN_CONTENT_UNSAFE", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPINJOINCONTENTUNSAFE());








}


void test_CatalogsFeedValidationErrors_pRICE_CANNOT_BE_DETERMINED_is_assigned_from_json()
{
    bourne::json input =
    {
        "pRICE_CANNOT_BE_DETERMINED", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPRICECANNOTBEDETERMINED());








}


void test_CatalogsFeedValidationErrors_pRICE_MISSING_is_assigned_from_json()
{
    bourne::json input =
    {
        "pRICE_MISSING", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPRICEMISSING());








}


void test_CatalogsFeedValidationErrors_pRODUCT_LINK_MISSING_is_assigned_from_json()
{
    bourne::json input =
    {
        "pRODUCT_LINK_MISSING", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPRODUCTLINKMISSING());








}


void test_CatalogsFeedValidationErrors_pRODUCT_PRICE_INVALID_is_assigned_from_json()
{
    bourne::json input =
    {
        "pRODUCT_PRICE_INVALID", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPRODUCTPRICEINVALID());








}


void test_CatalogsFeedValidationErrors_rEQUIRED_COLUMNS_MISSING_is_assigned_from_json()
{
    bourne::json input =
    {
        "rEQUIRED_COLUMNS_MISSING", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getREQUIREDCOLUMNSMISSING());








}


void test_CatalogsFeedValidationErrors_tITLE_MISSING_is_assigned_from_json()
{
    bourne::json input =
    {
        "tITLE_MISSING", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTITLEMISSING());








}



void test_CatalogsFeedValidationErrors_aDULT_INVALID_is_converted_to_json()
{
    bourne::json input =
    {
        "aDULT_INVALID", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aDULT_INVALID"] == output["aDULT_INVALID"]);




}


void test_CatalogsFeedValidationErrors_aDWORDS_FORMAT_INVALID_is_converted_to_json()
{
    bourne::json input =
    {
        "aDWORDS_FORMAT_INVALID", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aDWORDS_FORMAT_INVALID"] == output["aDWORDS_FORMAT_INVALID"]);




}


void test_CatalogsFeedValidationErrors_aVAILABILITY_INVALID_is_converted_to_json()
{
    bourne::json input =
    {
        "aVAILABILITY_INVALID", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aVAILABILITY_INVALID"] == output["aVAILABILITY_INVALID"]);




}


void test_CatalogsFeedValidationErrors_bLOCKLISTED_IMAGE_SIGNATURE_is_converted_to_json()
{
    bourne::json input =
    {
        "bLOCKLISTED_IMAGE_SIGNATURE", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bLOCKLISTED_IMAGE_SIGNATURE"] == output["bLOCKLISTED_IMAGE_SIGNATURE"]);




}


void test_CatalogsFeedValidationErrors_dELIMITER_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "dELIMITER_ERROR", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["dELIMITER_ERROR"] == output["dELIMITER_ERROR"]);




}


void test_CatalogsFeedValidationErrors_dESCRIPTION_MISSING_is_converted_to_json()
{
    bourne::json input =
    {
        "dESCRIPTION_MISSING", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["dESCRIPTION_MISSING"] == output["dESCRIPTION_MISSING"]);




}


void test_CatalogsFeedValidationErrors_dUPLICATE_PRODUCTS_is_converted_to_json()
{
    bourne::json input =
    {
        "dUPLICATE_PRODUCTS", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["dUPLICATE_PRODUCTS"] == output["dUPLICATE_PRODUCTS"]);




}


void test_CatalogsFeedValidationErrors_eNCODING_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "eNCODING_ERROR", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["eNCODING_ERROR"] == output["eNCODING_ERROR"]);




}


void test_CatalogsFeedValidationErrors_fEED_LENGTH_TOO_LONG_is_converted_to_json()
{
    bourne::json input =
    {
        "fEED_LENGTH_TOO_LONG", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fEED_LENGTH_TOO_LONG"] == output["fEED_LENGTH_TOO_LONG"]);




}


void test_CatalogsFeedValidationErrors_fEED_TOO_SMALL_is_converted_to_json()
{
    bourne::json input =
    {
        "fEED_TOO_SMALL", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fEED_TOO_SMALL"] == output["fEED_TOO_SMALL"]);




}


void test_CatalogsFeedValidationErrors_fETCH_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "fETCH_ERROR", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fETCH_ERROR"] == output["fETCH_ERROR"]);




}


void test_CatalogsFeedValidationErrors_fETCH_INACTIVE_FEED_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "fETCH_INACTIVE_FEED_ERROR", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fETCH_INACTIVE_FEED_ERROR"] == output["fETCH_INACTIVE_FEED_ERROR"]);




}


void test_CatalogsFeedValidationErrors_iMAGE_LINK_INVALID_is_converted_to_json()
{
    bourne::json input =
    {
        "iMAGE_LINK_INVALID", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iMAGE_LINK_INVALID"] == output["iMAGE_LINK_INVALID"]);




}


void test_CatalogsFeedValidationErrors_iMAGE_LINK_LENGTH_TOO_LONG_is_converted_to_json()
{
    bourne::json input =
    {
        "iMAGE_LINK_LENGTH_TOO_LONG", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iMAGE_LINK_LENGTH_TOO_LONG"] == output["iMAGE_LINK_LENGTH_TOO_LONG"]);




}


void test_CatalogsFeedValidationErrors_iMAGE_LINK_MISSING_is_converted_to_json()
{
    bourne::json input =
    {
        "iMAGE_LINK_MISSING", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iMAGE_LINK_MISSING"] == output["iMAGE_LINK_MISSING"]);




}


void test_CatalogsFeedValidationErrors_iNTERNAL_SERVICE_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "iNTERNAL_SERVICE_ERROR", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iNTERNAL_SERVICE_ERROR"] == output["iNTERNAL_SERVICE_ERROR"]);




}


void test_CatalogsFeedValidationErrors_iNVALID_DOMAIN_is_converted_to_json()
{
    bourne::json input =
    {
        "iNVALID_DOMAIN", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iNVALID_DOMAIN"] == output["iNVALID_DOMAIN"]);




}


void test_CatalogsFeedValidationErrors_iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE_is_converted_to_json()
{
    bourne::json input =
    {
        "iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE"] == output["iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE"]);




}


void test_CatalogsFeedValidationErrors_iTEMID_MISSING_is_converted_to_json()
{
    bourne::json input =
    {
        "iTEMID_MISSING", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iTEMID_MISSING"] == output["iTEMID_MISSING"]);




}


void test_CatalogsFeedValidationErrors_lINK_FORMAT_INVALID_is_converted_to_json()
{
    bourne::json input =
    {
        "lINK_FORMAT_INVALID", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lINK_FORMAT_INVALID"] == output["lINK_FORMAT_INVALID"]);




}


void test_CatalogsFeedValidationErrors_lINK_LENGTH_TOO_LONG_is_converted_to_json()
{
    bourne::json input =
    {
        "lINK_LENGTH_TOO_LONG", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lINK_LENGTH_TOO_LONG"] == output["lINK_LENGTH_TOO_LONG"]);




}


void test_CatalogsFeedValidationErrors_lIST_PRICE_INVALID_is_converted_to_json()
{
    bourne::json input =
    {
        "lIST_PRICE_INVALID", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lIST_PRICE_INVALID"] == output["lIST_PRICE_INVALID"]);




}


void test_CatalogsFeedValidationErrors_mALFORMED_XML_is_converted_to_json()
{
    bourne::json input =
    {
        "mALFORMED_XML", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["mALFORMED_XML"] == output["mALFORMED_XML"]);




}


void test_CatalogsFeedValidationErrors_mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED_is_converted_to_json()
{
    bourne::json input =
    {
        "mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED"] == output["mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED"]);




}


void test_CatalogsFeedValidationErrors_nO_VERIFIED_DOMAIN_is_converted_to_json()
{
    bourne::json input =
    {
        "nO_VERIFIED_DOMAIN", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["nO_VERIFIED_DOMAIN"] == output["nO_VERIFIED_DOMAIN"]);




}


void test_CatalogsFeedValidationErrors_pARSE_LINE_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "pARSE_LINE_ERROR", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pARSE_LINE_ERROR"] == output["pARSE_LINE_ERROR"]);




}


void test_CatalogsFeedValidationErrors_pINJOIN_CONTENT_UNSAFE_is_converted_to_json()
{
    bourne::json input =
    {
        "pINJOIN_CONTENT_UNSAFE", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pINJOIN_CONTENT_UNSAFE"] == output["pINJOIN_CONTENT_UNSAFE"]);




}


void test_CatalogsFeedValidationErrors_pRICE_CANNOT_BE_DETERMINED_is_converted_to_json()
{
    bourne::json input =
    {
        "pRICE_CANNOT_BE_DETERMINED", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pRICE_CANNOT_BE_DETERMINED"] == output["pRICE_CANNOT_BE_DETERMINED"]);




}


void test_CatalogsFeedValidationErrors_pRICE_MISSING_is_converted_to_json()
{
    bourne::json input =
    {
        "pRICE_MISSING", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pRICE_MISSING"] == output["pRICE_MISSING"]);




}


void test_CatalogsFeedValidationErrors_pRODUCT_LINK_MISSING_is_converted_to_json()
{
    bourne::json input =
    {
        "pRODUCT_LINK_MISSING", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pRODUCT_LINK_MISSING"] == output["pRODUCT_LINK_MISSING"]);




}


void test_CatalogsFeedValidationErrors_pRODUCT_PRICE_INVALID_is_converted_to_json()
{
    bourne::json input =
    {
        "pRODUCT_PRICE_INVALID", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pRODUCT_PRICE_INVALID"] == output["pRODUCT_PRICE_INVALID"]);




}


void test_CatalogsFeedValidationErrors_rEQUIRED_COLUMNS_MISSING_is_converted_to_json()
{
    bourne::json input =
    {
        "rEQUIRED_COLUMNS_MISSING", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rEQUIRED_COLUMNS_MISSING"] == output["rEQUIRED_COLUMNS_MISSING"]);




}


void test_CatalogsFeedValidationErrors_tITLE_MISSING_is_converted_to_json()
{
    bourne::json input =
    {
        "tITLE_MISSING", 1
    };

    CatalogsFeedValidationErrors obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["tITLE_MISSING"] == output["tITLE_MISSING"]);




}


