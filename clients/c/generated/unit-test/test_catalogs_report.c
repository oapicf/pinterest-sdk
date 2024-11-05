#ifndef catalogs_report_TEST
#define catalogs_report_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_report_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_report.h"
catalogs_report_t* instantiate_catalogs_report(int include_optional);



catalogs_report_t* instantiate_catalogs_report(int include_optional) {
  catalogs_report_t* catalogs_report = NULL;
  if (include_optional) {
    catalogs_report = catalogs_report_create(
      pinterest_rest_api_catalogs_report_REPORTSTATUS_FINISHED,
      "0",
      1.337
    );
  } else {
    catalogs_report = catalogs_report_create(
      pinterest_rest_api_catalogs_report_REPORTSTATUS_FINISHED,
      "0",
      1.337
    );
  }

  return catalogs_report;
}


#ifdef catalogs_report_MAIN

void test_catalogs_report(int include_optional) {
    catalogs_report_t* catalogs_report_1 = instantiate_catalogs_report(include_optional);

	cJSON* jsoncatalogs_report_1 = catalogs_report_convertToJSON(catalogs_report_1);
	printf("catalogs_report :\n%s\n", cJSON_Print(jsoncatalogs_report_1));
	catalogs_report_t* catalogs_report_2 = catalogs_report_parseFromJSON(jsoncatalogs_report_1);
	cJSON* jsoncatalogs_report_2 = catalogs_report_convertToJSON(catalogs_report_2);
	printf("repeating catalogs_report:\n%s\n", cJSON_Print(jsoncatalogs_report_2));
}

int main() {
  test_catalogs_report(1);
  test_catalogs_report(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_report_MAIN
#endif // catalogs_report_TEST
