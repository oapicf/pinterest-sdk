#ifndef catalogs_hotel_report_parameters_report_TEST
#define catalogs_hotel_report_parameters_report_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_hotel_report_parameters_report_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_hotel_report_parameters_report.h"
catalogs_hotel_report_parameters_report_t* instantiate_catalogs_hotel_report_parameters_report(int include_optional);



catalogs_hotel_report_parameters_report_t* instantiate_catalogs_hotel_report_parameters_report(int include_optional) {
  catalogs_hotel_report_parameters_report_t* catalogs_hotel_report_parameters_report = NULL;
  if (include_optional) {
    catalogs_hotel_report_parameters_report = catalogs_hotel_report_parameters_report_create(
      pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_FEED_INGESTION_ISSUES,
      "a",
      "a",
      "a"
    );
  } else {
    catalogs_hotel_report_parameters_report = catalogs_hotel_report_parameters_report_create(
      pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_FEED_INGESTION_ISSUES,
      "a",
      "a",
      "a"
    );
  }

  return catalogs_hotel_report_parameters_report;
}


#ifdef catalogs_hotel_report_parameters_report_MAIN

void test_catalogs_hotel_report_parameters_report(int include_optional) {
    catalogs_hotel_report_parameters_report_t* catalogs_hotel_report_parameters_report_1 = instantiate_catalogs_hotel_report_parameters_report(include_optional);

	cJSON* jsoncatalogs_hotel_report_parameters_report_1 = catalogs_hotel_report_parameters_report_convertToJSON(catalogs_hotel_report_parameters_report_1);
	printf("catalogs_hotel_report_parameters_report :\n%s\n", cJSON_Print(jsoncatalogs_hotel_report_parameters_report_1));
	catalogs_hotel_report_parameters_report_t* catalogs_hotel_report_parameters_report_2 = catalogs_hotel_report_parameters_report_parseFromJSON(jsoncatalogs_hotel_report_parameters_report_1);
	cJSON* jsoncatalogs_hotel_report_parameters_report_2 = catalogs_hotel_report_parameters_report_convertToJSON(catalogs_hotel_report_parameters_report_2);
	printf("repeating catalogs_hotel_report_parameters_report:\n%s\n", cJSON_Print(jsoncatalogs_hotel_report_parameters_report_2));
}

int main() {
  test_catalogs_hotel_report_parameters_report(1);
  test_catalogs_hotel_report_parameters_report(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_hotel_report_parameters_report_MAIN
#endif // catalogs_hotel_report_parameters_report_TEST
