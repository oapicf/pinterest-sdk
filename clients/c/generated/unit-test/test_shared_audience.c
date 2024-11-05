#ifndef shared_audience_TEST
#define shared_audience_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define shared_audience_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/shared_audience.h"
shared_audience_t* instantiate_shared_audience(int include_optional);



shared_audience_t* instantiate_shared_audience(int include_optional) {
  shared_audience_t* shared_audience = NULL;
  if (include_optional) {
    shared_audience = shared_audience_create(
      "2542621871096",
      pinterest_rest_api_shared_audience__SHARE,
      list_createList()
    );
  } else {
    shared_audience = shared_audience_create(
      "2542621871096",
      pinterest_rest_api_shared_audience__SHARE,
      list_createList()
    );
  }

  return shared_audience;
}


#ifdef shared_audience_MAIN

void test_shared_audience(int include_optional) {
    shared_audience_t* shared_audience_1 = instantiate_shared_audience(include_optional);

	cJSON* jsonshared_audience_1 = shared_audience_convertToJSON(shared_audience_1);
	printf("shared_audience :\n%s\n", cJSON_Print(jsonshared_audience_1));
	shared_audience_t* shared_audience_2 = shared_audience_parseFromJSON(jsonshared_audience_1);
	cJSON* jsonshared_audience_2 = shared_audience_convertToJSON(shared_audience_2);
	printf("repeating shared_audience:\n%s\n", cJSON_Print(jsonshared_audience_2));
}

int main() {
  test_shared_audience(1);
  test_shared_audience(0);

  printf("Hello world \n");
  return 0;
}

#endif // shared_audience_MAIN
#endif // shared_audience_TEST
