#ifndef granularity_TEST
#define granularity_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define granularity_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/granularity.h"
granularity_t* instantiate_granularity(int include_optional);



granularity_t* instantiate_granularity(int include_optional) {
  granularity_t* granularity = NULL;
  if (include_optional) {
    granularity = granularity_create(
    );
  } else {
    granularity = granularity_create(
    );
  }

  return granularity;
}


#ifdef granularity_MAIN

void test_granularity(int include_optional) {
    granularity_t* granularity_1 = instantiate_granularity(include_optional);

	cJSON* jsongranularity_1 = granularity_convertToJSON(granularity_1);
	printf("granularity :\n%s\n", cJSON_Print(jsongranularity_1));
	granularity_t* granularity_2 = granularity_parseFromJSON(jsongranularity_1);
	cJSON* jsongranularity_2 = granularity_convertToJSON(granularity_2);
	printf("repeating granularity:\n%s\n", cJSON_Print(jsongranularity_2));
}

int main() {
  test_granularity(1);
  test_granularity(0);

  printf("Hello world \n");
  return 0;
}

#endif // granularity_MAIN
#endif // granularity_TEST
