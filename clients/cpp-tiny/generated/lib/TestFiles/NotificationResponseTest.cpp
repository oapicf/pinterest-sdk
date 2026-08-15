
#include "NotificationResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_NotificationResponse_success_is_assigned_from_json()
{




    bourne::json input =
    {
        "success", true
    };

    NotificationResponse obj(input.dump());

    TEST_ASSERT(true == obj.isSuccess());




}


void test_NotificationResponse_received_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "received_at", 1
    };

    NotificationResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getReceivedAt());








}


void test_NotificationResponse_error_msg_is_assigned_from_json()
{


    bourne::json input =
    {
        "error_msg", "hello"
    };

    NotificationResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getErrorMsg().c_str());






}



void test_NotificationResponse_success_is_converted_to_json()
{


    bourne::json input =
    {
        "success", true
    };

    NotificationResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["success"] == output["success"]);


}


void test_NotificationResponse_received_at_is_converted_to_json()
{
    bourne::json input =
    {
        "received_at", 1
    };

    NotificationResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["received_at"] == output["received_at"]);




}


void test_NotificationResponse_error_msg_is_converted_to_json()
{

    bourne::json input =
    {
        "error_msg", "hello"
    };

    NotificationResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["error_msg"] == output["error_msg"]);



}


