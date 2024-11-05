#ifndef catalogs_report_feed_ingestion_stats_TEST
#define catalogs_report_feed_ingestion_stats_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_report_feed_ingestion_stats_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_report_feed_ingestion_stats.h"
catalogs_report_feed_ingestion_stats_t* instantiate_catalogs_report_feed_ingestion_stats(int include_optional);



catalogs_report_feed_ingestion_stats_t* instantiate_catalogs_report_feed_ingestion_stats(int include_optional) {
  catalogs_report_feed_ingestion_stats_t* catalogs_report_feed_ingestion_stats = NULL;
  if (include_optional) {
    catalogs_report_feed_ingestion_stats = catalogs_report_feed_ingestion_stats_create(
      pinterest_rest_api_catalogs_report_feed_ingestion_stats_REPORTTYPE_FEED_INGESTION_ISSUES,
      "a",
      112,
      "AVAILABILITY_INVALID",
      "0",
      10,
      pinterest_rest_api_catalogs_report_feed_ingestion_stats_SEVERITY_WARN
    );
  } else {
    catalogs_report_feed_ingestion_stats = catalogs_report_feed_ingestion_stats_create(
      pinterest_rest_api_catalogs_report_feed_ingestion_stats_REPORTTYPE_FEED_INGESTION_ISSUES,
      "a",
      112,
      "AVAILABILITY_INVALID",
      "0",
      10,
      pinterest_rest_api_catalogs_report_feed_ingestion_stats_SEVERITY_WARN
    );
  }

  return catalogs_report_feed_ingestion_stats;
}


#ifdef catalogs_report_feed_ingestion_stats_MAIN

void test_catalogs_report_feed_ingestion_stats(int include_optional) {
    catalogs_report_feed_ingestion_stats_t* catalogs_report_feed_ingestion_stats_1 = instantiate_catalogs_report_feed_ingestion_stats(include_optional);

	cJSON* jsoncatalogs_report_feed_ingestion_stats_1 = catalogs_report_feed_ingestion_stats_convertToJSON(catalogs_report_feed_ingestion_stats_1);
	printf("catalogs_report_feed_ingestion_stats :\n%s\n", cJSON_Print(jsoncatalogs_report_feed_ingestion_stats_1));
	catalogs_report_feed_ingestion_stats_t* catalogs_report_feed_ingestion_stats_2 = catalogs_report_feed_ingestion_stats_parseFromJSON(jsoncatalogs_report_feed_ingestion_stats_1);
	cJSON* jsoncatalogs_report_feed_ingestion_stats_2 = catalogs_report_feed_ingestion_stats_convertToJSON(catalogs_report_feed_ingestion_stats_2);
	printf("repeating catalogs_report_feed_ingestion_stats:\n%s\n", cJSON_Print(jsoncatalogs_report_feed_ingestion_stats_2));
}

int main() {
  test_catalogs_report_feed_ingestion_stats(1);
  test_catalogs_report_feed_ingestion_stats(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_report_feed_ingestion_stats_MAIN
#endif // catalogs_report_feed_ingestion_stats_TEST
