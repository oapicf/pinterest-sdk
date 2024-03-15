#ifndef create_mmm_report_response_data_TEST
#define create_mmm_report_response_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_mmm_report_response_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_mmm_report_response_data.h"
create_mmm_report_response_data_t* instantiate_create_mmm_report_response_data(int include_optional);



create_mmm_report_response_data_t* instantiate_create_mmm_report_response_data(int include_optional) {
  create_mmm_report_response_data_t* create_mmm_report_response_data = NULL;
  if (include_optional) {
    create_mmm_report_response_data = create_mmm_report_response_data_create(
      "FINISHED",
      "0",
      "0",
      "success"
    );
  } else {
    create_mmm_report_response_data = create_mmm_report_response_data_create(
      "FINISHED",
      "0",
      "0",
      "success"
    );
  }

  return create_mmm_report_response_data;
}


#ifdef create_mmm_report_response_data_MAIN

void test_create_mmm_report_response_data(int include_optional) {
    create_mmm_report_response_data_t* create_mmm_report_response_data_1 = instantiate_create_mmm_report_response_data(include_optional);

	cJSON* jsoncreate_mmm_report_response_data_1 = create_mmm_report_response_data_convertToJSON(create_mmm_report_response_data_1);
	printf("create_mmm_report_response_data :\n%s\n", cJSON_Print(jsoncreate_mmm_report_response_data_1));
	create_mmm_report_response_data_t* create_mmm_report_response_data_2 = create_mmm_report_response_data_parseFromJSON(jsoncreate_mmm_report_response_data_1);
	cJSON* jsoncreate_mmm_report_response_data_2 = create_mmm_report_response_data_convertToJSON(create_mmm_report_response_data_2);
	printf("repeating create_mmm_report_response_data:\n%s\n", cJSON_Print(jsoncreate_mmm_report_response_data_2));
}

int main() {
  test_create_mmm_report_response_data(1);
  test_create_mmm_report_response_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_mmm_report_response_data_MAIN
#endif // create_mmm_report_response_data_TEST
