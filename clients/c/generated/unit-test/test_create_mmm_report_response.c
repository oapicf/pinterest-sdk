#ifndef create_mmm_report_response_TEST
#define create_mmm_report_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_mmm_report_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_mmm_report_response.h"
create_mmm_report_response_t* instantiate_create_mmm_report_response(int include_optional);

#include "test_create_mmm_report_response_data.c"


create_mmm_report_response_t* instantiate_create_mmm_report_response(int include_optional) {
  create_mmm_report_response_t* create_mmm_report_response = NULL;
  if (include_optional) {
    create_mmm_report_response = create_mmm_report_response_create(
      0,
       // false, not to have infinite recursion
      instantiate_create_mmm_report_response_data(0)
    );
  } else {
    create_mmm_report_response = create_mmm_report_response_create(
      0,
      NULL
    );
  }

  return create_mmm_report_response;
}


#ifdef create_mmm_report_response_MAIN

void test_create_mmm_report_response(int include_optional) {
    create_mmm_report_response_t* create_mmm_report_response_1 = instantiate_create_mmm_report_response(include_optional);

	cJSON* jsoncreate_mmm_report_response_1 = create_mmm_report_response_convertToJSON(create_mmm_report_response_1);
	printf("create_mmm_report_response :\n%s\n", cJSON_Print(jsoncreate_mmm_report_response_1));
	create_mmm_report_response_t* create_mmm_report_response_2 = create_mmm_report_response_parseFromJSON(jsoncreate_mmm_report_response_1);
	cJSON* jsoncreate_mmm_report_response_2 = create_mmm_report_response_convertToJSON(create_mmm_report_response_2);
	printf("repeating create_mmm_report_response:\n%s\n", cJSON_Print(jsoncreate_mmm_report_response_2));
}

int main() {
  test_create_mmm_report_response(1);
  test_create_mmm_report_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_mmm_report_response_MAIN
#endif // create_mmm_report_response_TEST
