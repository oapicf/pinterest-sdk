
#include "IntegrationMetadata.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_IntegrationMetadata_additional_id_1_is_assigned_from_json()
{


    bourne::json input =
    {
        "additional_id_1", "hello"
    };

    IntegrationMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdditionalId1().c_str());






}


void test_IntegrationMetadata_connected_advertiser_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "connected_advertiser_id", "hello"
    };

    IntegrationMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConnectedAdvertiserId().c_str());






}


void test_IntegrationMetadata_connected_lba_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "connected_lba_id", "hello"
    };

    IntegrationMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConnectedLbaId().c_str());






}


void test_IntegrationMetadata_connected_merchant_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "connected_merchant_id", "hello"
    };

    IntegrationMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConnectedMerchantId().c_str());






}


void test_IntegrationMetadata_connected_tag_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "connected_tag_id", "hello"
    };

    IntegrationMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConnectedTagId().c_str());






}


void test_IntegrationMetadata_connected_user_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "connected_user_id", "hello"
    };

    IntegrationMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConnectedUserId().c_str());






}


void test_IntegrationMetadata_created_timestamp_is_assigned_from_json()
{








}


void test_IntegrationMetadata_external_business_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "external_business_id", "hello"
    };

    IntegrationMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getExternalBusinessId().c_str());






}


void test_IntegrationMetadata_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    IntegrationMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_IntegrationMetadata_partner_access_token_expiry_is_assigned_from_json()
{








}


void test_IntegrationMetadata_partner_metadata_is_assigned_from_json()
{


    bourne::json input =
    {
        "partner_metadata", "hello"
    };

    IntegrationMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartnerMetadata().c_str());






}


void test_IntegrationMetadata_partner_refresh_token_expiry_is_assigned_from_json()
{








}


void test_IntegrationMetadata_scopes_is_assigned_from_json()
{


    bourne::json input =
    {
        "scopes", "hello"
    };

    IntegrationMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getScopes().c_str());






}


void test_IntegrationMetadata_updated_timestamp_is_assigned_from_json()
{








}



void test_IntegrationMetadata_additional_id_1_is_converted_to_json()
{

    bourne::json input =
    {
        "additional_id_1", "hello"
    };

    IntegrationMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["additional_id_1"] == output["additional_id_1"]);



}


void test_IntegrationMetadata_connected_advertiser_id_is_converted_to_json()
{

    bourne::json input =
    {
        "connected_advertiser_id", "hello"
    };

    IntegrationMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["connected_advertiser_id"] == output["connected_advertiser_id"]);



}


void test_IntegrationMetadata_connected_lba_id_is_converted_to_json()
{

    bourne::json input =
    {
        "connected_lba_id", "hello"
    };

    IntegrationMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["connected_lba_id"] == output["connected_lba_id"]);



}


void test_IntegrationMetadata_connected_merchant_id_is_converted_to_json()
{

    bourne::json input =
    {
        "connected_merchant_id", "hello"
    };

    IntegrationMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["connected_merchant_id"] == output["connected_merchant_id"]);



}


void test_IntegrationMetadata_connected_tag_id_is_converted_to_json()
{

    bourne::json input =
    {
        "connected_tag_id", "hello"
    };

    IntegrationMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["connected_tag_id"] == output["connected_tag_id"]);



}


void test_IntegrationMetadata_connected_user_id_is_converted_to_json()
{

    bourne::json input =
    {
        "connected_user_id", "hello"
    };

    IntegrationMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["connected_user_id"] == output["connected_user_id"]);



}


void test_IntegrationMetadata_created_timestamp_is_converted_to_json()
{




}


void test_IntegrationMetadata_external_business_id_is_converted_to_json()
{

    bourne::json input =
    {
        "external_business_id", "hello"
    };

    IntegrationMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["external_business_id"] == output["external_business_id"]);



}


void test_IntegrationMetadata_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    IntegrationMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_IntegrationMetadata_partner_access_token_expiry_is_converted_to_json()
{




}


void test_IntegrationMetadata_partner_metadata_is_converted_to_json()
{

    bourne::json input =
    {
        "partner_metadata", "hello"
    };

    IntegrationMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partner_metadata"] == output["partner_metadata"]);



}


void test_IntegrationMetadata_partner_refresh_token_expiry_is_converted_to_json()
{




}


void test_IntegrationMetadata_scopes_is_converted_to_json()
{

    bourne::json input =
    {
        "scopes", "hello"
    };

    IntegrationMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["scopes"] == output["scopes"]);



}


void test_IntegrationMetadata_updated_timestamp_is_converted_to_json()
{




}


