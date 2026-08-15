
#include "IntegrationRecord.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_IntegrationRecord_additional_id_1_is_assigned_from_json()
{


    bourne::json input =
    {
        "additional_id_1", "hello"
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdditionalId1().c_str());






}


void test_IntegrationRecord_connected_advertiser_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "connected_advertiser_id", "hello"
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConnectedAdvertiserId().c_str());






}


void test_IntegrationRecord_connected_lba_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "connected_lba_id", "hello"
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConnectedLbaId().c_str());






}


void test_IntegrationRecord_connected_merchant_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "connected_merchant_id", "hello"
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConnectedMerchantId().c_str());






}


void test_IntegrationRecord_connected_tag_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "connected_tag_id", "hello"
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConnectedTagId().c_str());






}


void test_IntegrationRecord_connected_user_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "connected_user_id", "hello"
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConnectedUserId().c_str());






}


void test_IntegrationRecord_created_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedTime());








}


void test_IntegrationRecord_external_business_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "external_business_id", "hello"
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getExternalBusinessId().c_str());






}


void test_IntegrationRecord_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_IntegrationRecord_partner_access_token_is_assigned_from_json()
{


    bourne::json input =
    {
        "partner_access_token", "hello"
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartnerAccessToken().c_str());






}


void test_IntegrationRecord_partner_access_token_expiry_is_assigned_from_json()
{
    bourne::json input =
    {
        "partner_access_token_expiry", 1
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPartnerAccessTokenExpiry());








}


void test_IntegrationRecord_partner_metadata_is_assigned_from_json()
{


    bourne::json input =
    {
        "partner_metadata", "hello"
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartnerMetadata().c_str());






}


void test_IntegrationRecord_partner_primary_email_is_assigned_from_json()
{


    bourne::json input =
    {
        "partner_primary_email", "hello"
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartnerPrimaryEmail().c_str());






}


void test_IntegrationRecord_partner_refresh_token_is_assigned_from_json()
{


    bourne::json input =
    {
        "partner_refresh_token", "hello"
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartnerRefreshToken().c_str());






}


void test_IntegrationRecord_partner_refresh_token_expiry_is_assigned_from_json()
{
    bourne::json input =
    {
        "partner_refresh_token_expiry", 1
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPartnerRefreshTokenExpiry());








}


void test_IntegrationRecord_scopes_is_assigned_from_json()
{


    bourne::json input =
    {
        "scopes", "hello"
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getScopes().c_str());






}


void test_IntegrationRecord_updated_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    IntegrationRecord obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUpdatedTime());








}



void test_IntegrationRecord_additional_id_1_is_converted_to_json()
{

    bourne::json input =
    {
        "additional_id_1", "hello"
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["additional_id_1"] == output["additional_id_1"]);



}


void test_IntegrationRecord_connected_advertiser_id_is_converted_to_json()
{

    bourne::json input =
    {
        "connected_advertiser_id", "hello"
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["connected_advertiser_id"] == output["connected_advertiser_id"]);



}


void test_IntegrationRecord_connected_lba_id_is_converted_to_json()
{

    bourne::json input =
    {
        "connected_lba_id", "hello"
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["connected_lba_id"] == output["connected_lba_id"]);



}


void test_IntegrationRecord_connected_merchant_id_is_converted_to_json()
{

    bourne::json input =
    {
        "connected_merchant_id", "hello"
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["connected_merchant_id"] == output["connected_merchant_id"]);



}


void test_IntegrationRecord_connected_tag_id_is_converted_to_json()
{

    bourne::json input =
    {
        "connected_tag_id", "hello"
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["connected_tag_id"] == output["connected_tag_id"]);



}


void test_IntegrationRecord_connected_user_id_is_converted_to_json()
{

    bourne::json input =
    {
        "connected_user_id", "hello"
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["connected_user_id"] == output["connected_user_id"]);



}


void test_IntegrationRecord_created_time_is_converted_to_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_time"] == output["created_time"]);




}


void test_IntegrationRecord_external_business_id_is_converted_to_json()
{

    bourne::json input =
    {
        "external_business_id", "hello"
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["external_business_id"] == output["external_business_id"]);



}


void test_IntegrationRecord_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_IntegrationRecord_partner_access_token_is_converted_to_json()
{

    bourne::json input =
    {
        "partner_access_token", "hello"
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partner_access_token"] == output["partner_access_token"]);



}


void test_IntegrationRecord_partner_access_token_expiry_is_converted_to_json()
{
    bourne::json input =
    {
        "partner_access_token_expiry", 1
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partner_access_token_expiry"] == output["partner_access_token_expiry"]);




}


void test_IntegrationRecord_partner_metadata_is_converted_to_json()
{

    bourne::json input =
    {
        "partner_metadata", "hello"
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partner_metadata"] == output["partner_metadata"]);



}


void test_IntegrationRecord_partner_primary_email_is_converted_to_json()
{

    bourne::json input =
    {
        "partner_primary_email", "hello"
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partner_primary_email"] == output["partner_primary_email"]);



}


void test_IntegrationRecord_partner_refresh_token_is_converted_to_json()
{

    bourne::json input =
    {
        "partner_refresh_token", "hello"
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partner_refresh_token"] == output["partner_refresh_token"]);



}


void test_IntegrationRecord_partner_refresh_token_expiry_is_converted_to_json()
{
    bourne::json input =
    {
        "partner_refresh_token_expiry", 1
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partner_refresh_token_expiry"] == output["partner_refresh_token_expiry"]);




}


void test_IntegrationRecord_scopes_is_converted_to_json()
{

    bourne::json input =
    {
        "scopes", "hello"
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["scopes"] == output["scopes"]);



}


void test_IntegrationRecord_updated_time_is_converted_to_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    IntegrationRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["updated_time"] == output["updated_time"]);




}


