#ifndef availability_filter_TEST
#define availability_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define availability_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/availability_filter.h"
availability_filter_t* instantiate_availability_filter(int include_optional);



availability_filter_t* instantiate_availability_filter(int include_optional) {
  availability_filter_t* availability_filter = NULL;
  if (include_optional) {
    availability_filter = availability_filter_create(
      0
    );
  } else {
    availability_filter = availability_filter_create(
      0
    );
  }

  return availability_filter;
}


#ifdef availability_filter_MAIN

void test_availability_filter(int include_optional) {
    availability_filter_t* availability_filter_1 = instantiate_availability_filter(include_optional);

	cJSON* jsonavailability_filter_1 = availability_filter_convertToJSON(availability_filter_1);
	printf("availability_filter :\n%s\n", cJSON_Print(jsonavailability_filter_1));
	availability_filter_t* availability_filter_2 = availability_filter_parseFromJSON(jsonavailability_filter_1);
	cJSON* jsonavailability_filter_2 = availability_filter_convertToJSON(availability_filter_2);
	printf("repeating availability_filter:\n%s\n", cJSON_Print(jsonavailability_filter_2));
}

int main() {
  test_availability_filter(1);
  test_availability_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // availability_filter_MAIN
#endif // availability_filter_TEST
