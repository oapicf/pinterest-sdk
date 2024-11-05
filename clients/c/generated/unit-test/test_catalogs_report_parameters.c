#ifndef catalogs_report_parameters_TEST
#define catalogs_report_parameters_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_report_parameters_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_report_parameters.h"
catalogs_report_parameters_t* instantiate_catalogs_report_parameters(int include_optional);

#include "test_catalogs_hotel_report_parameters_report.c"


catalogs_report_parameters_t* instantiate_catalogs_report_parameters(int include_optional) {
  catalogs_report_parameters_t* catalogs_report_parameters = NULL;
  if (include_optional) {
    catalogs_report_parameters = catalogs_report_parameters_create(
      pinterest_rest_api_catalogs_report_parameters__RETAIL,
       // false, not to have infinite recursion
      instantiate_catalogs_hotel_report_parameters_report(0)
    );
  } else {
    catalogs_report_parameters = catalogs_report_parameters_create(
      pinterest_rest_api_catalogs_report_parameters__RETAIL,
      NULL
    );
  }

  return catalogs_report_parameters;
}


#ifdef catalogs_report_parameters_MAIN

void test_catalogs_report_parameters(int include_optional) {
    catalogs_report_parameters_t* catalogs_report_parameters_1 = instantiate_catalogs_report_parameters(include_optional);

	cJSON* jsoncatalogs_report_parameters_1 = catalogs_report_parameters_convertToJSON(catalogs_report_parameters_1);
	printf("catalogs_report_parameters :\n%s\n", cJSON_Print(jsoncatalogs_report_parameters_1));
	catalogs_report_parameters_t* catalogs_report_parameters_2 = catalogs_report_parameters_parseFromJSON(jsoncatalogs_report_parameters_1);
	cJSON* jsoncatalogs_report_parameters_2 = catalogs_report_parameters_convertToJSON(catalogs_report_parameters_2);
	printf("repeating catalogs_report_parameters:\n%s\n", cJSON_Print(jsoncatalogs_report_parameters_2));
}

int main() {
  test_catalogs_report_parameters(1);
  test_catalogs_report_parameters(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_report_parameters_MAIN
#endif // catalogs_report_parameters_TEST
