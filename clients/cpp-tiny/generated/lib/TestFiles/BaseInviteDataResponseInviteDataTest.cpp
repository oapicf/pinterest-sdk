
#include "BaseInviteDataResponse_invite_data.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BaseInviteDataResponse_invite_data_invite_expiration_is_assigned_from_json()
{
    bourne::json input =
    {
        "invite_expiration", 1
    };

    BaseInviteDataResponse_invite_data obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInviteExpiration());








}


void test_BaseInviteDataResponse_invite_data_invite_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "invite_status", "hello"
    };

    BaseInviteDataResponse_invite_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInviteStatus().c_str());






}


void test_BaseInviteDataResponse_invite_data_invite_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "invite_type", "hello"
    };

    BaseInviteDataResponse_invite_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInviteType().c_str());






}


void test_BaseInviteDataResponse_invite_data_last_updated_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "last_updated_time", 1
    };

    BaseInviteDataResponse_invite_data obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLastUpdatedTime());








}


void test_BaseInviteDataResponse_invite_data_sent_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "sent_at", 1
    };

    BaseInviteDataResponse_invite_data obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSentAt());








}



void test_BaseInviteDataResponse_invite_data_invite_expiration_is_converted_to_json()
{
    bourne::json input =
    {
        "invite_expiration", 1
    };

    BaseInviteDataResponse_invite_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["invite_expiration"] == output["invite_expiration"]);




}


void test_BaseInviteDataResponse_invite_data_invite_status_is_converted_to_json()
{

    bourne::json input =
    {
        "invite_status", "hello"
    };

    BaseInviteDataResponse_invite_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["invite_status"] == output["invite_status"]);



}


void test_BaseInviteDataResponse_invite_data_invite_type_is_converted_to_json()
{

    bourne::json input =
    {
        "invite_type", "hello"
    };

    BaseInviteDataResponse_invite_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["invite_type"] == output["invite_type"]);



}


void test_BaseInviteDataResponse_invite_data_last_updated_time_is_converted_to_json()
{
    bourne::json input =
    {
        "last_updated_time", 1
    };

    BaseInviteDataResponse_invite_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["last_updated_time"] == output["last_updated_time"]);




}


void test_BaseInviteDataResponse_invite_data_sent_at_is_converted_to_json()
{
    bourne::json input =
    {
        "sent_at", 1
    };

    BaseInviteDataResponse_invite_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sent_at"] == output["sent_at"]);




}


