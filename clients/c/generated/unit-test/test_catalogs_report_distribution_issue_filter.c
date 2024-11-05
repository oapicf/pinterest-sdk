#ifndef catalogs_report_distribution_issue_filter_TEST
#define catalogs_report_distribution_issue_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_report_distribution_issue_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_report_distribution_issue_filter.h"
catalogs_report_distribution_issue_filter_t* instantiate_catalogs_report_distribution_issue_filter(int include_optional);



catalogs_report_distribution_issue_filter_t* instantiate_catalogs_report_distribution_issue_filter(int include_optional) {
  catalogs_report_distribution_issue_filter_t* catalogs_report_distribution_issue_filter = NULL;
  if (include_optional) {
    catalogs_report_distribution_issue_filter = catalogs_report_distribution_issue_filter_create(
      pinterest_rest_api_catalogs_report_distribution_issue_filter_REPORTTYPE_DISTRIBUTION_ISSUES,
      "a"
    );
  } else {
    catalogs_report_distribution_issue_filter = catalogs_report_distribution_issue_filter_create(
      pinterest_rest_api_catalogs_report_distribution_issue_filter_REPORTTYPE_DISTRIBUTION_ISSUES,
      "a"
    );
  }

  return catalogs_report_distribution_issue_filter;
}


#ifdef catalogs_report_distribution_issue_filter_MAIN

void test_catalogs_report_distribution_issue_filter(int include_optional) {
    catalogs_report_distribution_issue_filter_t* catalogs_report_distribution_issue_filter_1 = instantiate_catalogs_report_distribution_issue_filter(include_optional);

	cJSON* jsoncatalogs_report_distribution_issue_filter_1 = catalogs_report_distribution_issue_filter_convertToJSON(catalogs_report_distribution_issue_filter_1);
	printf("catalogs_report_distribution_issue_filter :\n%s\n", cJSON_Print(jsoncatalogs_report_distribution_issue_filter_1));
	catalogs_report_distribution_issue_filter_t* catalogs_report_distribution_issue_filter_2 = catalogs_report_distribution_issue_filter_parseFromJSON(jsoncatalogs_report_distribution_issue_filter_1);
	cJSON* jsoncatalogs_report_distribution_issue_filter_2 = catalogs_report_distribution_issue_filter_convertToJSON(catalogs_report_distribution_issue_filter_2);
	printf("repeating catalogs_report_distribution_issue_filter:\n%s\n", cJSON_Print(jsoncatalogs_report_distribution_issue_filter_2));
}

int main() {
  test_catalogs_report_distribution_issue_filter(1);
  test_catalogs_report_distribution_issue_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_report_distribution_issue_filter_MAIN
#endif // catalogs_report_distribution_issue_filter_TEST
