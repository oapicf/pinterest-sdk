
#include "CatalogsFeedIngestionWarnings.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADCONTENTREADERROR());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADDNSLOOKUPERROR());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADFILENOTACCESSIBLE());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADFILENOTFOUND());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_400_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_400", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS400());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_403_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_403", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS403());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_404_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_404", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS404());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_405_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_405", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS405());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_410_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_410", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS410());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_429_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_429", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS429());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_500_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_500", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS500());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_502_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_502", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS502());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_503_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_503", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS503());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_504_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_504", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS504());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_507_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_507", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS507());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_508_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_508", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS508());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_520_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_520", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS520());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_521_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_521", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS521());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_522_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_522", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS522());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_525_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_525", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADHTTPSTATUS525());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADINTERNALCONFIGURATIONERROR());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_INTERNAL_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_INTERNAL_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADINTERNALERROR());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADINTERNALFAILEDTODOWNLOAD());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADINTERNALMALFORMEDURL());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADINTERNALRATELIMITED());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADINTERNALREQUESTEXPIRED());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_INVALID_FILE_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_INVALID_FILE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADINVALIDFILE());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_SITE_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_SITE_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADSITEERROR());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_SITE_TIMEOUT_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_SITE_TIMEOUT", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADSITETIMEOUT());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_SSL_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_SSL_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADSSLERROR());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEDOWNLOADSSLHANDSHAKEERROR());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_PROCESSING_EMPTY_FILE_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_PROCESSING_EMPTY_FILE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEPROCESSINGEMPTYFILE());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEPROCESSINGHEIGHTTOOSMALL());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_PROCESSING_TOO_MANY_PIXELS_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_PROCESSING_TOO_MANY_PIXELS", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEPROCESSINGTOOMANYPIXELS());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_PROCESSING_TYPE_MISMATCH_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_PROCESSING_TYPE_MISMATCH", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEPROCESSINGTYPEMISMATCH());








}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADIMAGEPROCESSINGWIDTHTOOSMALL());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADCONTENTREADERROR());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADDNSLOOKUPERROR());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADFILENOTACCESSIBLE());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADFILENOTFOUND());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_400_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_400", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS400());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_403_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_403", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS403());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_404_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_404", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS404());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_405_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_405", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS405());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_410_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_410", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS410());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_429_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_429", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS429());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_500_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_500", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS500());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_502_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_502", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS502());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_503_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_503", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS503());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_504_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_504", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS504());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_507_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_507", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS507());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_508_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_508", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS508());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_520_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_520", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS520());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_521_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_521", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS521());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_522_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_522", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS522());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_525_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_525", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADHTTPSTATUS525());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADINTERNALCONFIGURATIONERROR());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_INTERNAL_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_INTERNAL_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADINTERNALERROR());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADINTERNALFAILEDTODOWNLOAD());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADINTERNALMALFORMEDURL());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADINTERNALRATELIMITED());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADINTERNALREQUESTEXPIRED());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_INVALID_FILE_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_INVALID_FILE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADINVALIDFILE());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_SITE_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_SITE_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADSITEERROR());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_SITE_TIMEOUT_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_SITE_TIMEOUT", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADSITETIMEOUT());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_SSL_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_SSL_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADSSLERROR());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEODOWNLOADSSLHANDSHAKEERROR());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_LENGTH_TOO_SHORT_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_LENGTH_TOO_SHORT", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEOLENGTHTOOSHORT());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_PROCESSING_EMPTY_FILE_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_PROCESSING_EMPTY_FILE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEOPROCESSINGEMPTYFILE());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEOPROCESSINGHEIGHTTOOSMALL());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_PROCESSING_TOO_MANY_PIXELS_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_PROCESSING_TOO_MANY_PIXELS", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEOPROCESSINGTOOMANYPIXELS());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_PROCESSING_TYPE_MISMATCH_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_PROCESSING_TYPE_MISMATCH", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEOPROCESSINGTYPEMISMATCH());








}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL_is_assigned_from_json()
{
    bourne::json input =
    {
        "aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADVIDEOPROCESSINGWIDTHTOOSMALL());








}


void test_CatalogsFeedIngestionWarnings_aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE_is_assigned_from_json()
{
    bourne::json input =
    {
        "aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADDITIONALIMAGEFILENOTACCESSIBLE());








}


void test_CatalogsFeedIngestionWarnings_aDDITIONAL_IMAGE_FILE_NOT_FOUND_is_assigned_from_json()
{
    bourne::json input =
    {
        "aDDITIONAL_IMAGE_FILE_NOT_FOUND", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADDITIONALIMAGEFILENOTFOUND());








}


void test_CatalogsFeedIngestionWarnings_aDDITIONAL_IMAGE_INVALID_FILE_is_assigned_from_json()
{
    bourne::json input =
    {
        "aDDITIONAL_IMAGE_INVALID_FILE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADDITIONALIMAGEINVALIDFILE());








}


void test_CatalogsFeedIngestionWarnings_aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADDITIONALIMAGELEVELINTERNALERROR());








}


void test_CatalogsFeedIngestionWarnings_aDDITIONAL_IMAGE_MALFORMED_URL_is_assigned_from_json()
{
    bourne::json input =
    {
        "aDDITIONAL_IMAGE_MALFORMED_URL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getADDITIONALIMAGEMALFORMEDURL());








}


void test_CatalogsFeedIngestionWarnings_fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT_is_assigned_from_json()
{
    bourne::json input =
    {
        "fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFETCHGOOGLESHEETPUBLICCANEDIT());








}


void test_CatalogsFeedIngestionWarnings_hOTEL_PRICE_HEADER_IS_PRESENT_is_assigned_from_json()
{
    bourne::json input =
    {
        "hOTEL_PRICE_HEADER_IS_PRESENT", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getHOTELPRICEHEADERISPRESENT());








}


void test_CatalogsFeedIngestionWarnings_vIDEO_DOWNLOAD_VIDEO_TOO_SHORT_is_assigned_from_json()
{
    bourne::json input =
    {
        "vIDEO_DOWNLOAD_VIDEO_TOO_SHORT", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getVIDEODOWNLOADVIDEOTOOSHORT());








}


void test_CatalogsFeedIngestionWarnings_vIDEO_FILE_NOT_ACCESSIBLE_is_assigned_from_json()
{
    bourne::json input =
    {
        "vIDEO_FILE_NOT_ACCESSIBLE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getVIDEOFILENOTACCESSIBLE());








}


void test_CatalogsFeedIngestionWarnings_vIDEO_FILE_NOT_FOUND_is_assigned_from_json()
{
    bourne::json input =
    {
        "vIDEO_FILE_NOT_FOUND", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getVIDEOFILENOTFOUND());








}


void test_CatalogsFeedIngestionWarnings_vIDEO_INVALID_FILE_is_assigned_from_json()
{
    bourne::json input =
    {
        "vIDEO_INVALID_FILE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getVIDEOINVALIDFILE());








}


void test_CatalogsFeedIngestionWarnings_vIDEO_LEVEL_INTERNAL_ERROR_is_assigned_from_json()
{
    bourne::json input =
    {
        "vIDEO_LEVEL_INTERNAL_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getVIDEOLEVELINTERNALERROR());








}


void test_CatalogsFeedIngestionWarnings_vIDEO_MALFORMED_URL_is_assigned_from_json()
{
    bourne::json input =
    {
        "vIDEO_MALFORMED_URL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getVIDEOMALFORMEDURL());








}



void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR"] == output["aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR"] == output["aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE"] == output["aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND"] == output["aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_400_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_400", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_400"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_400"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_403_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_403", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_403"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_403"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_404_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_404", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_404"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_404"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_405_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_405", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_405"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_405"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_410_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_410", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_410"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_410"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_429_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_429", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_429"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_429"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_500_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_500", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_500"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_500"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_502_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_502", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_502"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_502"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_503_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_503", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_503"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_503"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_504_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_504", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_504"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_504"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_507_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_507", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_507"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_507"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_508_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_508", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_508"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_508"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_520_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_520", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_520"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_520"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_521_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_521", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_521"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_521"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_522_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_522", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_522"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_522"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_HTTP_STATUS_525_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_HTTP_STATUS_525", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_HTTP_STATUS_525"] == output["aD_IMAGE_DOWNLOAD_HTTP_STATUS_525"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR"] == output["aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_INTERNAL_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_INTERNAL_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_INTERNAL_ERROR"] == output["aD_IMAGE_DOWNLOAD_INTERNAL_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD"] == output["aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL"] == output["aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED"] == output["aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED"] == output["aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_INVALID_FILE_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_INVALID_FILE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_INVALID_FILE"] == output["aD_IMAGE_DOWNLOAD_INVALID_FILE"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_SITE_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_SITE_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_SITE_ERROR"] == output["aD_IMAGE_DOWNLOAD_SITE_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_SITE_TIMEOUT_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_SITE_TIMEOUT", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_SITE_TIMEOUT"] == output["aD_IMAGE_DOWNLOAD_SITE_TIMEOUT"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_SSL_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_SSL_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_SSL_ERROR"] == output["aD_IMAGE_DOWNLOAD_SSL_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR"] == output["aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_PROCESSING_EMPTY_FILE_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_PROCESSING_EMPTY_FILE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_PROCESSING_EMPTY_FILE"] == output["aD_IMAGE_PROCESSING_EMPTY_FILE"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL"] == output["aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_PROCESSING_TOO_MANY_PIXELS_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_PROCESSING_TOO_MANY_PIXELS", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_PROCESSING_TOO_MANY_PIXELS"] == output["aD_IMAGE_PROCESSING_TOO_MANY_PIXELS"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_PROCESSING_TYPE_MISMATCH_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_PROCESSING_TYPE_MISMATCH", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_PROCESSING_TYPE_MISMATCH"] == output["aD_IMAGE_PROCESSING_TYPE_MISMATCH"]);




}


void test_CatalogsFeedIngestionWarnings_aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL"] == output["aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR"] == output["aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR"] == output["aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE"] == output["aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND"] == output["aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_400_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_400", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_400"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_400"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_403_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_403", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_403"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_403"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_404_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_404", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_404"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_404"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_405_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_405", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_405"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_405"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_410_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_410", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_410"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_410"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_429_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_429", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_429"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_429"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_500_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_500", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_500"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_500"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_502_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_502", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_502"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_502"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_503_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_503", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_503"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_503"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_504_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_504", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_504"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_504"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_507_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_507", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_507"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_507"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_508_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_508", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_508"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_508"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_520_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_520", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_520"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_520"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_521_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_521", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_521"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_521"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_522_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_522", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_522"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_522"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_HTTP_STATUS_525_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_HTTP_STATUS_525", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_HTTP_STATUS_525"] == output["aD_VIDEO_DOWNLOAD_HTTP_STATUS_525"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR"] == output["aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_INTERNAL_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_INTERNAL_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_INTERNAL_ERROR"] == output["aD_VIDEO_DOWNLOAD_INTERNAL_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD"] == output["aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL"] == output["aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED"] == output["aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED"] == output["aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_INVALID_FILE_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_INVALID_FILE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_INVALID_FILE"] == output["aD_VIDEO_DOWNLOAD_INVALID_FILE"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_SITE_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_SITE_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_SITE_ERROR"] == output["aD_VIDEO_DOWNLOAD_SITE_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_SITE_TIMEOUT_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_SITE_TIMEOUT", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_SITE_TIMEOUT"] == output["aD_VIDEO_DOWNLOAD_SITE_TIMEOUT"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_SSL_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_SSL_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_SSL_ERROR"] == output["aD_VIDEO_DOWNLOAD_SSL_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR"] == output["aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_LENGTH_TOO_SHORT_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_LENGTH_TOO_SHORT", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_LENGTH_TOO_SHORT"] == output["aD_VIDEO_LENGTH_TOO_SHORT"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_PROCESSING_EMPTY_FILE_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_PROCESSING_EMPTY_FILE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_PROCESSING_EMPTY_FILE"] == output["aD_VIDEO_PROCESSING_EMPTY_FILE"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL"] == output["aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_PROCESSING_TOO_MANY_PIXELS_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_PROCESSING_TOO_MANY_PIXELS", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_PROCESSING_TOO_MANY_PIXELS"] == output["aD_VIDEO_PROCESSING_TOO_MANY_PIXELS"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_PROCESSING_TYPE_MISMATCH_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_PROCESSING_TYPE_MISMATCH", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_PROCESSING_TYPE_MISMATCH"] == output["aD_VIDEO_PROCESSING_TYPE_MISMATCH"]);




}


void test_CatalogsFeedIngestionWarnings_aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL_is_converted_to_json()
{
    bourne::json input =
    {
        "aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL"] == output["aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL"]);




}


void test_CatalogsFeedIngestionWarnings_aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE_is_converted_to_json()
{
    bourne::json input =
    {
        "aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE"] == output["aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE"]);




}


void test_CatalogsFeedIngestionWarnings_aDDITIONAL_IMAGE_FILE_NOT_FOUND_is_converted_to_json()
{
    bourne::json input =
    {
        "aDDITIONAL_IMAGE_FILE_NOT_FOUND", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aDDITIONAL_IMAGE_FILE_NOT_FOUND"] == output["aDDITIONAL_IMAGE_FILE_NOT_FOUND"]);




}


void test_CatalogsFeedIngestionWarnings_aDDITIONAL_IMAGE_INVALID_FILE_is_converted_to_json()
{
    bourne::json input =
    {
        "aDDITIONAL_IMAGE_INVALID_FILE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aDDITIONAL_IMAGE_INVALID_FILE"] == output["aDDITIONAL_IMAGE_INVALID_FILE"]);




}


void test_CatalogsFeedIngestionWarnings_aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR"] == output["aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_aDDITIONAL_IMAGE_MALFORMED_URL_is_converted_to_json()
{
    bourne::json input =
    {
        "aDDITIONAL_IMAGE_MALFORMED_URL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aDDITIONAL_IMAGE_MALFORMED_URL"] == output["aDDITIONAL_IMAGE_MALFORMED_URL"]);




}


void test_CatalogsFeedIngestionWarnings_fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT_is_converted_to_json()
{
    bourne::json input =
    {
        "fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT"] == output["fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT"]);




}


void test_CatalogsFeedIngestionWarnings_hOTEL_PRICE_HEADER_IS_PRESENT_is_converted_to_json()
{
    bourne::json input =
    {
        "hOTEL_PRICE_HEADER_IS_PRESENT", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["hOTEL_PRICE_HEADER_IS_PRESENT"] == output["hOTEL_PRICE_HEADER_IS_PRESENT"]);




}


void test_CatalogsFeedIngestionWarnings_vIDEO_DOWNLOAD_VIDEO_TOO_SHORT_is_converted_to_json()
{
    bourne::json input =
    {
        "vIDEO_DOWNLOAD_VIDEO_TOO_SHORT", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vIDEO_DOWNLOAD_VIDEO_TOO_SHORT"] == output["vIDEO_DOWNLOAD_VIDEO_TOO_SHORT"]);




}


void test_CatalogsFeedIngestionWarnings_vIDEO_FILE_NOT_ACCESSIBLE_is_converted_to_json()
{
    bourne::json input =
    {
        "vIDEO_FILE_NOT_ACCESSIBLE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vIDEO_FILE_NOT_ACCESSIBLE"] == output["vIDEO_FILE_NOT_ACCESSIBLE"]);




}


void test_CatalogsFeedIngestionWarnings_vIDEO_FILE_NOT_FOUND_is_converted_to_json()
{
    bourne::json input =
    {
        "vIDEO_FILE_NOT_FOUND", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vIDEO_FILE_NOT_FOUND"] == output["vIDEO_FILE_NOT_FOUND"]);




}


void test_CatalogsFeedIngestionWarnings_vIDEO_INVALID_FILE_is_converted_to_json()
{
    bourne::json input =
    {
        "vIDEO_INVALID_FILE", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vIDEO_INVALID_FILE"] == output["vIDEO_INVALID_FILE"]);




}


void test_CatalogsFeedIngestionWarnings_vIDEO_LEVEL_INTERNAL_ERROR_is_converted_to_json()
{
    bourne::json input =
    {
        "vIDEO_LEVEL_INTERNAL_ERROR", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vIDEO_LEVEL_INTERNAL_ERROR"] == output["vIDEO_LEVEL_INTERNAL_ERROR"]);




}


void test_CatalogsFeedIngestionWarnings_vIDEO_MALFORMED_URL_is_converted_to_json()
{
    bourne::json input =
    {
        "vIDEO_MALFORMED_URL", 1
    };

    CatalogsFeedIngestionWarnings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["vIDEO_MALFORMED_URL"] == output["vIDEO_MALFORMED_URL"]);




}


