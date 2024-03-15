#ifndef get_mmm_report_response_TEST
#define get_mmm_report_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_mmm_report_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_mmm_report_response.h"
get_mmm_report_response_t* instantiate_get_mmm_report_response(int include_optional);

#include "test_get_mmm_report_response_data.c"


get_mmm_report_response_t* instantiate_get_mmm_report_response(int include_optional) {
  get_mmm_report_response_t* get_mmm_report_response = NULL;
  if (include_optional) {
    get_mmm_report_response = get_mmm_report_response_create(
      0,
       // false, not to have infinite recursion
      instantiate_get_mmm_report_response_data(0),
      "ok",
      "success"
    );
  } else {
    get_mmm_report_response = get_mmm_report_response_create(
      0,
      NULL,
      "ok",
      "success"
    );
  }

  return get_mmm_report_response;
}


#ifdef get_mmm_report_response_MAIN

void test_get_mmm_report_response(int include_optional) {
    get_mmm_report_response_t* get_mmm_report_response_1 = instantiate_get_mmm_report_response(include_optional);

	cJSON* jsonget_mmm_report_response_1 = get_mmm_report_response_convertToJSON(get_mmm_report_response_1);
	printf("get_mmm_report_response :\n%s\n", cJSON_Print(jsonget_mmm_report_response_1));
	get_mmm_report_response_t* get_mmm_report_response_2 = get_mmm_report_response_parseFromJSON(jsonget_mmm_report_response_1);
	cJSON* jsonget_mmm_report_response_2 = get_mmm_report_response_convertToJSON(get_mmm_report_response_2);
	printf("repeating get_mmm_report_response:\n%s\n", cJSON_Print(jsonget_mmm_report_response_2));
}

int main() {
  test_get_mmm_report_response(1);
  test_get_mmm_report_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_mmm_report_response_MAIN
#endif // get_mmm_report_response_TEST
