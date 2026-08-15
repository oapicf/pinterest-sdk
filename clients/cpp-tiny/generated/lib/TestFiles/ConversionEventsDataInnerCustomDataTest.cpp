
#include "ConversionEvents_data_inner_custom_data.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ConversionEvents_data_inner_custom_data_content_brand_is_assigned_from_json()
{


    bourne::json input =
    {
        "content_brand", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getContentBrand().c_str());






}


void test_ConversionEvents_data_inner_custom_data_content_category_is_assigned_from_json()
{


    bourne::json input =
    {
        "content_category", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getContentCategory().c_str());






}



void test_ConversionEvents_data_inner_custom_data_content_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "content_name", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getContentName().c_str());






}



void test_ConversionEvents_data_inner_custom_data_currency_is_assigned_from_json()
{


    bourne::json input =
    {
        "currency", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCurrency().c_str());






}


void test_ConversionEvents_data_inner_custom_data_external_measurement_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "external_measurement_id", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getExternalMeasurementId().c_str());






}


void test_ConversionEvents_data_inner_custom_data_external_measurement_vendor_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "external_measurement_vendor_id", 1
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExternalMeasurementVendorId());








}


void test_ConversionEvents_data_inner_custom_data_np_is_assigned_from_json()
{


    bourne::json input =
    {
        "np", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNp().c_str());






}


void test_ConversionEvents_data_inner_custom_data_num_items_is_assigned_from_json()
{






    bourne::json input =
    {
        "num_items", 1
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getNumItems());


}


void test_ConversionEvents_data_inner_custom_data_opt_out_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "opt_out_type", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOptOutType().c_str());






}


void test_ConversionEvents_data_inner_custom_data_order_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "order_id", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOrderId().c_str());






}


void test_ConversionEvents_data_inner_custom_data_predicted_ltv_is_assigned_from_json()
{


    bourne::json input =
    {
        "predicted_ltv", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPredictedLtv().c_str());






}


void test_ConversionEvents_data_inner_custom_data_search_string_is_assigned_from_json()
{


    bourne::json input =
    {
        "search_string", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSearchString().c_str());






}


void test_ConversionEvents_data_inner_custom_data_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "value", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValue().c_str());






}



void test_ConversionEvents_data_inner_custom_data_content_brand_is_converted_to_json()
{

    bourne::json input =
    {
        "content_brand", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["content_brand"] == output["content_brand"]);



}


void test_ConversionEvents_data_inner_custom_data_content_category_is_converted_to_json()
{

    bourne::json input =
    {
        "content_category", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["content_category"] == output["content_category"]);



}



void test_ConversionEvents_data_inner_custom_data_content_name_is_converted_to_json()
{

    bourne::json input =
    {
        "content_name", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["content_name"] == output["content_name"]);



}



void test_ConversionEvents_data_inner_custom_data_currency_is_converted_to_json()
{

    bourne::json input =
    {
        "currency", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["currency"] == output["currency"]);



}


void test_ConversionEvents_data_inner_custom_data_external_measurement_id_is_converted_to_json()
{

    bourne::json input =
    {
        "external_measurement_id", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["external_measurement_id"] == output["external_measurement_id"]);



}


void test_ConversionEvents_data_inner_custom_data_external_measurement_vendor_id_is_converted_to_json()
{
    bourne::json input =
    {
        "external_measurement_vendor_id", 1
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["external_measurement_vendor_id"] == output["external_measurement_vendor_id"]);




}


void test_ConversionEvents_data_inner_custom_data_np_is_converted_to_json()
{

    bourne::json input =
    {
        "np", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["np"] == output["np"]);



}


void test_ConversionEvents_data_inner_custom_data_num_items_is_converted_to_json()
{



    bourne::json input =
    {
        "num_items", 1
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["num_items"] == output["num_items"]);

}


void test_ConversionEvents_data_inner_custom_data_opt_out_type_is_converted_to_json()
{

    bourne::json input =
    {
        "opt_out_type", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["opt_out_type"] == output["opt_out_type"]);



}


void test_ConversionEvents_data_inner_custom_data_order_id_is_converted_to_json()
{

    bourne::json input =
    {
        "order_id", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order_id"] == output["order_id"]);



}


void test_ConversionEvents_data_inner_custom_data_predicted_ltv_is_converted_to_json()
{

    bourne::json input =
    {
        "predicted_ltv", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["predicted_ltv"] == output["predicted_ltv"]);



}


void test_ConversionEvents_data_inner_custom_data_search_string_is_converted_to_json()
{

    bourne::json input =
    {
        "search_string", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["search_string"] == output["search_string"]);



}


void test_ConversionEvents_data_inner_custom_data_value_is_converted_to_json()
{

    bourne::json input =
    {
        "value", "hello"
    };

    ConversionEvents_data_inner_custom_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);



}


