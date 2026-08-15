
#include "DeletePartnerAssetsResult.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_DeletePartnerAssetsResult_asset_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "asset_id", "hello"
    };

    DeletePartnerAssetsResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssetId().c_str());






}


void test_DeletePartnerAssetsResult_asset_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "asset_type", "hello"
    };

    DeletePartnerAssetsResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssetType().c_str());






}


void test_DeletePartnerAssetsResult_is_shared_partner_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_shared_partner", true
    };

    DeletePartnerAssetsResult obj(input.dump());

    TEST_ASSERT(true == obj.isIsSharedPartner());




}


void test_DeletePartnerAssetsResult_partner_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "partner_id", "hello"
    };

    DeletePartnerAssetsResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartnerId().c_str());






}




void test_DeletePartnerAssetsResult_asset_id_is_converted_to_json()
{

    bourne::json input =
    {
        "asset_id", "hello"
    };

    DeletePartnerAssetsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["asset_id"] == output["asset_id"]);



}


void test_DeletePartnerAssetsResult_asset_type_is_converted_to_json()
{

    bourne::json input =
    {
        "asset_type", "hello"
    };

    DeletePartnerAssetsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["asset_type"] == output["asset_type"]);



}


void test_DeletePartnerAssetsResult_is_shared_partner_is_converted_to_json()
{


    bourne::json input =
    {
        "is_shared_partner", true
    };

    DeletePartnerAssetsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_shared_partner"] == output["is_shared_partner"]);


}


void test_DeletePartnerAssetsResult_partner_id_is_converted_to_json()
{

    bourne::json input =
    {
        "partner_id", "hello"
    };

    DeletePartnerAssetsResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partner_id"] == output["partner_id"]);



}



