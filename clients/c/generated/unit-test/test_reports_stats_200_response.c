#ifndef reports_stats_200_response_TEST
#define reports_stats_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define reports_stats_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/reports_stats_200_response.h"
reports_stats_200_response_t* instantiate_reports_stats_200_response(int include_optional);



reports_stats_200_response_t* instantiate_reports_stats_200_response(int include_optional) {
  reports_stats_200_response_t* reports_stats_200_response = NULL;
  if (include_optional) {
    reports_stats_200_response = reports_stats_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    reports_stats_200_response = reports_stats_200_response_create(
      list_createList(),
      "0"
    );
  }

  return reports_stats_200_response;
}


#ifdef reports_stats_200_response_MAIN

void test_reports_stats_200_response(int include_optional) {
    reports_stats_200_response_t* reports_stats_200_response_1 = instantiate_reports_stats_200_response(include_optional);

	cJSON* jsonreports_stats_200_response_1 = reports_stats_200_response_convertToJSON(reports_stats_200_response_1);
	printf("reports_stats_200_response :\n%s\n", cJSON_Print(jsonreports_stats_200_response_1));
	reports_stats_200_response_t* reports_stats_200_response_2 = reports_stats_200_response_parseFromJSON(jsonreports_stats_200_response_1);
	cJSON* jsonreports_stats_200_response_2 = reports_stats_200_response_convertToJSON(reports_stats_200_response_2);
	printf("repeating reports_stats_200_response:\n%s\n", cJSON_Print(jsonreports_stats_200_response_2));
}

int main() {
  test_reports_stats_200_response(1);
  test_reports_stats_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // reports_stats_200_response_MAIN
#endif // reports_stats_200_response_TEST
