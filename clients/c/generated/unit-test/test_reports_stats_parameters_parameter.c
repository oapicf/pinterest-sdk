#ifndef reports_stats_parameters_parameter_TEST
#define reports_stats_parameters_parameter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define reports_stats_parameters_parameter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/reports_stats_parameters_parameter.h"
reports_stats_parameters_parameter_t* instantiate_reports_stats_parameters_parameter(int include_optional);

#include "test_catalogs_hotel_report_stats_parameters_report.c"


reports_stats_parameters_parameter_t* instantiate_reports_stats_parameters_parameter(int include_optional) {
  reports_stats_parameters_parameter_t* reports_stats_parameters_parameter = NULL;
  if (include_optional) {
    reports_stats_parameters_parameter = reports_stats_parameters_parameter_create(
      pinterest_rest_api_reports_stats_parameters_parameter__RETAIL,
       // false, not to have infinite recursion
      instantiate_catalogs_hotel_report_stats_parameters_report(0)
    );
  } else {
    reports_stats_parameters_parameter = reports_stats_parameters_parameter_create(
      pinterest_rest_api_reports_stats_parameters_parameter__RETAIL,
      NULL
    );
  }

  return reports_stats_parameters_parameter;
}


#ifdef reports_stats_parameters_parameter_MAIN

void test_reports_stats_parameters_parameter(int include_optional) {
    reports_stats_parameters_parameter_t* reports_stats_parameters_parameter_1 = instantiate_reports_stats_parameters_parameter(include_optional);

	cJSON* jsonreports_stats_parameters_parameter_1 = reports_stats_parameters_parameter_convertToJSON(reports_stats_parameters_parameter_1);
	printf("reports_stats_parameters_parameter :\n%s\n", cJSON_Print(jsonreports_stats_parameters_parameter_1));
	reports_stats_parameters_parameter_t* reports_stats_parameters_parameter_2 = reports_stats_parameters_parameter_parseFromJSON(jsonreports_stats_parameters_parameter_1);
	cJSON* jsonreports_stats_parameters_parameter_2 = reports_stats_parameters_parameter_convertToJSON(reports_stats_parameters_parameter_2);
	printf("repeating reports_stats_parameters_parameter:\n%s\n", cJSON_Print(jsonreports_stats_parameters_parameter_2));
}

int main() {
  test_reports_stats_parameters_parameter(1);
  test_reports_stats_parameters_parameter(0);

  printf("Hello world \n");
  return 0;
}

#endif // reports_stats_parameters_parameter_MAIN
#endif // reports_stats_parameters_parameter_TEST
