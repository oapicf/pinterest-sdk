
#include "CatalogsFeedVideoCounts.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsFeedVideoCounts_ingested_videos_is_assigned_from_json()
{
    bourne::json input =
    {
        "ingested_videos", 1
    };

    CatalogsFeedVideoCounts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIngestedVideos());








}


void test_CatalogsFeedVideoCounts_not_ingested_videos_is_assigned_from_json()
{
    bourne::json input =
    {
        "not_ingested_videos", 1
    };

    CatalogsFeedVideoCounts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getNotIngestedVideos());








}


void test_CatalogsFeedVideoCounts_total_videos_is_assigned_from_json()
{
    bourne::json input =
    {
        "total_videos", 1
    };

    CatalogsFeedVideoCounts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotalVideos());








}



void test_CatalogsFeedVideoCounts_ingested_videos_is_converted_to_json()
{
    bourne::json input =
    {
        "ingested_videos", 1
    };

    CatalogsFeedVideoCounts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ingested_videos"] == output["ingested_videos"]);




}


void test_CatalogsFeedVideoCounts_not_ingested_videos_is_converted_to_json()
{
    bourne::json input =
    {
        "not_ingested_videos", 1
    };

    CatalogsFeedVideoCounts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["not_ingested_videos"] == output["not_ingested_videos"]);




}


void test_CatalogsFeedVideoCounts_total_videos_is_converted_to_json()
{
    bourne::json input =
    {
        "total_videos", 1
    };

    CatalogsFeedVideoCounts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["total_videos"] == output["total_videos"]);




}


