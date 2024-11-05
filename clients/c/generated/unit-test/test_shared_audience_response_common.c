#ifndef shared_audience_response_common_TEST
#define shared_audience_response_common_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define shared_audience_response_common_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/shared_audience_response_common.h"
shared_audience_response_common_t* instantiate_shared_audience_response_common(int include_optional);



shared_audience_response_common_t* instantiate_shared_audience_response_common(int include_optional) {
  shared_audience_response_common_t* shared_audience_response_common = NULL;
  if (include_optional) {
    shared_audience_response_common = shared_audience_response_common_create(
      "2542621871096",
      ["RESOURCE_PINNER_LIST_READER","RESOURCE_PINNER_LIST_OWNER"]
    );
  } else {
    shared_audience_response_common = shared_audience_response_common_create(
      "2542621871096",
      ["RESOURCE_PINNER_LIST_READER","RESOURCE_PINNER_LIST_OWNER"]
    );
  }

  return shared_audience_response_common;
}


#ifdef shared_audience_response_common_MAIN

void test_shared_audience_response_common(int include_optional) {
    shared_audience_response_common_t* shared_audience_response_common_1 = instantiate_shared_audience_response_common(include_optional);

	cJSON* jsonshared_audience_response_common_1 = shared_audience_response_common_convertToJSON(shared_audience_response_common_1);
	printf("shared_audience_response_common :\n%s\n", cJSON_Print(jsonshared_audience_response_common_1));
	shared_audience_response_common_t* shared_audience_response_common_2 = shared_audience_response_common_parseFromJSON(jsonshared_audience_response_common_1);
	cJSON* jsonshared_audience_response_common_2 = shared_audience_response_common_convertToJSON(shared_audience_response_common_2);
	printf("repeating shared_audience_response_common:\n%s\n", cJSON_Print(jsonshared_audience_response_common_2));
}

int main() {
  test_shared_audience_response_common(1);
  test_shared_audience_response_common(0);

  printf("Hello world \n");
  return 0;
}

#endif // shared_audience_response_common_MAIN
#endif // shared_audience_response_common_TEST
