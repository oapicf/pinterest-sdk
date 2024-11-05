#ifndef catalogs_create_report_response_TEST
#define catalogs_create_report_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_create_report_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_create_report_response.h"
catalogs_create_report_response_t* instantiate_catalogs_create_report_response(int include_optional);



catalogs_create_report_response_t* instantiate_catalogs_create_report_response(int include_optional) {
  catalogs_create_report_response_t* catalogs_create_report_response = NULL;
  if (include_optional) {
    catalogs_create_report_response = catalogs_create_report_response_create(
      "0"
    );
  } else {
    catalogs_create_report_response = catalogs_create_report_response_create(
      "0"
    );
  }

  return catalogs_create_report_response;
}


#ifdef catalogs_create_report_response_MAIN

void test_catalogs_create_report_response(int include_optional) {
    catalogs_create_report_response_t* catalogs_create_report_response_1 = instantiate_catalogs_create_report_response(include_optional);

	cJSON* jsoncatalogs_create_report_response_1 = catalogs_create_report_response_convertToJSON(catalogs_create_report_response_1);
	printf("catalogs_create_report_response :\n%s\n", cJSON_Print(jsoncatalogs_create_report_response_1));
	catalogs_create_report_response_t* catalogs_create_report_response_2 = catalogs_create_report_response_parseFromJSON(jsoncatalogs_create_report_response_1);
	cJSON* jsoncatalogs_create_report_response_2 = catalogs_create_report_response_convertToJSON(catalogs_create_report_response_2);
	printf("repeating catalogs_create_report_response:\n%s\n", cJSON_Print(jsoncatalogs_create_report_response_2));
}

int main() {
  test_catalogs_create_report_response(1);
  test_catalogs_create_report_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_create_report_response_MAIN
#endif // catalogs_create_report_response_TEST
