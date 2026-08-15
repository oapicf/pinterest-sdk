
#include "ConversionTagConfigs.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ConversionTagConfigs_aem_db_enabled_is_assigned_from_json()
{




    bourne::json input =
    {
        "aem_db_enabled", true
    };

    ConversionTagConfigs obj(input.dump());

    TEST_ASSERT(true == obj.isAemDbEnabled());




}


void test_ConversionTagConfigs_aem_enabled_is_assigned_from_json()
{




    bourne::json input =
    {
        "aem_enabled", true
    };

    ConversionTagConfigs obj(input.dump());

    TEST_ASSERT(true == obj.isAemEnabled());




}


void test_ConversionTagConfigs_aem_external_id_enabled_is_assigned_from_json()
{




    bourne::json input =
    {
        "aem_external_id_enabled", true
    };

    ConversionTagConfigs obj(input.dump());

    TEST_ASSERT(true == obj.isAemExternalIdEnabled());




}


void test_ConversionTagConfigs_aem_fnln_enabled_is_assigned_from_json()
{




    bourne::json input =
    {
        "aem_fnln_enabled", true
    };

    ConversionTagConfigs obj(input.dump());

    TEST_ASSERT(true == obj.isAemFnlnEnabled());




}


void test_ConversionTagConfigs_aem_ge_enabled_is_assigned_from_json()
{




    bourne::json input =
    {
        "aem_ge_enabled", true
    };

    ConversionTagConfigs obj(input.dump());

    TEST_ASSERT(true == obj.isAemGeEnabled());




}


void test_ConversionTagConfigs_aem_loc_enabled_is_assigned_from_json()
{




    bourne::json input =
    {
        "aem_loc_enabled", true
    };

    ConversionTagConfigs obj(input.dump());

    TEST_ASSERT(true == obj.isAemLocEnabled());




}


void test_ConversionTagConfigs_aem_ph_enabled_is_assigned_from_json()
{




    bourne::json input =
    {
        "aem_ph_enabled", true
    };

    ConversionTagConfigs obj(input.dump());

    TEST_ASSERT(true == obj.isAemPhEnabled());




}


void test_ConversionTagConfigs_md_frequency_is_assigned_from_json()
{








}




void test_ConversionTagConfigs_aem_db_enabled_is_converted_to_json()
{


    bourne::json input =
    {
        "aem_db_enabled", true
    };

    ConversionTagConfigs obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aem_db_enabled"] == output["aem_db_enabled"]);


}


void test_ConversionTagConfigs_aem_enabled_is_converted_to_json()
{


    bourne::json input =
    {
        "aem_enabled", true
    };

    ConversionTagConfigs obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aem_enabled"] == output["aem_enabled"]);


}


void test_ConversionTagConfigs_aem_external_id_enabled_is_converted_to_json()
{


    bourne::json input =
    {
        "aem_external_id_enabled", true
    };

    ConversionTagConfigs obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aem_external_id_enabled"] == output["aem_external_id_enabled"]);


}


void test_ConversionTagConfigs_aem_fnln_enabled_is_converted_to_json()
{


    bourne::json input =
    {
        "aem_fnln_enabled", true
    };

    ConversionTagConfigs obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aem_fnln_enabled"] == output["aem_fnln_enabled"]);


}


void test_ConversionTagConfigs_aem_ge_enabled_is_converted_to_json()
{


    bourne::json input =
    {
        "aem_ge_enabled", true
    };

    ConversionTagConfigs obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aem_ge_enabled"] == output["aem_ge_enabled"]);


}


void test_ConversionTagConfigs_aem_loc_enabled_is_converted_to_json()
{


    bourne::json input =
    {
        "aem_loc_enabled", true
    };

    ConversionTagConfigs obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aem_loc_enabled"] == output["aem_loc_enabled"]);


}


void test_ConversionTagConfigs_aem_ph_enabled_is_converted_to_json()
{


    bourne::json input =
    {
        "aem_ph_enabled", true
    };

    ConversionTagConfigs obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aem_ph_enabled"] == output["aem_ph_enabled"]);


}


void test_ConversionTagConfigs_md_frequency_is_converted_to_json()
{




}



