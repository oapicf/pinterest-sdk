#ifndef create_mmm_report_request_TEST
#define create_mmm_report_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_mmm_report_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_mmm_report_request.h"
create_mmm_report_request_t* instantiate_create_mmm_report_request(int include_optional);



create_mmm_report_request_t* instantiate_create_mmm_report_request(int include_optional) {
  create_mmm_report_request_t* create_mmm_report_request = NULL;
  if (include_optional) {
    create_mmm_report_request = create_mmm_report_request_create(
      "0",
      "2020-12-20",
      "2020-12-20",
      pinterest_rest_api_create_mmm_report_request_GRANULARITY_DAY,
      pinterest_rest_api_create_mmm_report_request_LEVEL_CAMPAIGN_TARGETING,
      ["GENDER"],
      list_createList(),
      list_createList()
    );
  } else {
    create_mmm_report_request = create_mmm_report_request_create(
      "0",
      "2020-12-20",
      "2020-12-20",
      pinterest_rest_api_create_mmm_report_request_GRANULARITY_DAY,
      pinterest_rest_api_create_mmm_report_request_LEVEL_CAMPAIGN_TARGETING,
      ["GENDER"],
      list_createList(),
      list_createList()
    );
  }

  return create_mmm_report_request;
}


#ifdef create_mmm_report_request_MAIN

void test_create_mmm_report_request(int include_optional) {
    create_mmm_report_request_t* create_mmm_report_request_1 = instantiate_create_mmm_report_request(include_optional);

	cJSON* jsoncreate_mmm_report_request_1 = create_mmm_report_request_convertToJSON(create_mmm_report_request_1);
	printf("create_mmm_report_request :\n%s\n", cJSON_Print(jsoncreate_mmm_report_request_1));
	create_mmm_report_request_t* create_mmm_report_request_2 = create_mmm_report_request_parseFromJSON(jsoncreate_mmm_report_request_1);
	cJSON* jsoncreate_mmm_report_request_2 = create_mmm_report_request_convertToJSON(create_mmm_report_request_2);
	printf("repeating create_mmm_report_request:\n%s\n", cJSON_Print(jsoncreate_mmm_report_request_2));
}

int main() {
  test_create_mmm_report_request(1);
  test_create_mmm_report_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_mmm_report_request_MAIN
#endif // create_mmm_report_request_TEST
