#ifndef shared_audience_response_TEST
#define shared_audience_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define shared_audience_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/shared_audience_response.h"
shared_audience_response_t* instantiate_shared_audience_response(int include_optional);



shared_audience_response_t* instantiate_shared_audience_response(int include_optional) {
  shared_audience_response_t* shared_audience_response = NULL;
  if (include_optional) {
    shared_audience_response = shared_audience_response_create(
      "2542621871096",
      [RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER],
      ["549755885175"]
    );
  } else {
    shared_audience_response = shared_audience_response_create(
      "2542621871096",
      [RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER],
      ["549755885175"]
    );
  }

  return shared_audience_response;
}


#ifdef shared_audience_response_MAIN

void test_shared_audience_response(int include_optional) {
    shared_audience_response_t* shared_audience_response_1 = instantiate_shared_audience_response(include_optional);

	cJSON* jsonshared_audience_response_1 = shared_audience_response_convertToJSON(shared_audience_response_1);
	printf("shared_audience_response :\n%s\n", cJSON_Print(jsonshared_audience_response_1));
	shared_audience_response_t* shared_audience_response_2 = shared_audience_response_parseFromJSON(jsonshared_audience_response_1);
	cJSON* jsonshared_audience_response_2 = shared_audience_response_convertToJSON(shared_audience_response_2);
	printf("repeating shared_audience_response:\n%s\n", cJSON_Print(jsonshared_audience_response_2));
}

int main() {
  test_shared_audience_response(1);
  test_shared_audience_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // shared_audience_response_MAIN
#endif // shared_audience_response_TEST
