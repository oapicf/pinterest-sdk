#ifndef get_mmm_report_response_data_TEST
#define get_mmm_report_response_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_mmm_report_response_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_mmm_report_response_data.h"
get_mmm_report_response_data_t* instantiate_get_mmm_report_response_data(int include_optional);



get_mmm_report_response_data_t* instantiate_get_mmm_report_response_data(int include_optional) {
  get_mmm_report_response_data_t* get_mmm_report_response_data = NULL;
  if (include_optional) {
    get_mmm_report_response_data = get_mmm_report_response_data_create(
      pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_DOES_NOT_EXIST,
      "0",
      1.337
    );
  } else {
    get_mmm_report_response_data = get_mmm_report_response_data_create(
      pinterest_rest_api_get_mmm_report_response_data_REPORTSTATUS_DOES_NOT_EXIST,
      "0",
      1.337
    );
  }

  return get_mmm_report_response_data;
}


#ifdef get_mmm_report_response_data_MAIN

void test_get_mmm_report_response_data(int include_optional) {
    get_mmm_report_response_data_t* get_mmm_report_response_data_1 = instantiate_get_mmm_report_response_data(include_optional);

	cJSON* jsonget_mmm_report_response_data_1 = get_mmm_report_response_data_convertToJSON(get_mmm_report_response_data_1);
	printf("get_mmm_report_response_data :\n%s\n", cJSON_Print(jsonget_mmm_report_response_data_1));
	get_mmm_report_response_data_t* get_mmm_report_response_data_2 = get_mmm_report_response_data_parseFromJSON(jsonget_mmm_report_response_data_1);
	cJSON* jsonget_mmm_report_response_data_2 = get_mmm_report_response_data_convertToJSON(get_mmm_report_response_data_2);
	printf("repeating get_mmm_report_response_data:\n%s\n", cJSON_Print(jsonget_mmm_report_response_data_2));
}

int main() {
  test_get_mmm_report_response_data(1);
  test_get_mmm_report_response_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_mmm_report_response_data_MAIN
#endif // get_mmm_report_response_data_TEST
