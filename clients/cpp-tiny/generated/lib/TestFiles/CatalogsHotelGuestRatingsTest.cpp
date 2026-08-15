
#include "CatalogsHotelGuestRatings.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsHotelGuestRatings_max_score_is_assigned_from_json()
{








}


void test_CatalogsHotelGuestRatings_number_of_reviewers_is_assigned_from_json()
{
    bourne::json input =
    {
        "number_of_reviewers", 1
    };

    CatalogsHotelGuestRatings obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getNumberOfReviewers());








}


void test_CatalogsHotelGuestRatings_rating_system_is_assigned_from_json()
{


    bourne::json input =
    {
        "rating_system", "hello"
    };

    CatalogsHotelGuestRatings obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRatingSystem().c_str());






}


void test_CatalogsHotelGuestRatings_score_is_assigned_from_json()
{








}



void test_CatalogsHotelGuestRatings_max_score_is_converted_to_json()
{




}


void test_CatalogsHotelGuestRatings_number_of_reviewers_is_converted_to_json()
{
    bourne::json input =
    {
        "number_of_reviewers", 1
    };

    CatalogsHotelGuestRatings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["number_of_reviewers"] == output["number_of_reviewers"]);




}


void test_CatalogsHotelGuestRatings_rating_system_is_converted_to_json()
{

    bourne::json input =
    {
        "rating_system", "hello"
    };

    CatalogsHotelGuestRatings obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rating_system"] == output["rating_system"]);



}


void test_CatalogsHotelGuestRatings_score_is_converted_to_json()
{




}


