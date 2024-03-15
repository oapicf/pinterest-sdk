#ifndef gender_filter_TEST
#define gender_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define gender_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/gender_filter.h"
gender_filter_t* instantiate_gender_filter(int include_optional);



gender_filter_t* instantiate_gender_filter(int include_optional) {
  gender_filter_t* gender_filter = NULL;
  if (include_optional) {
    gender_filter = gender_filter_create(
      0
    );
  } else {
    gender_filter = gender_filter_create(
      0
    );
  }

  return gender_filter;
}


#ifdef gender_filter_MAIN

void test_gender_filter(int include_optional) {
    gender_filter_t* gender_filter_1 = instantiate_gender_filter(include_optional);

	cJSON* jsongender_filter_1 = gender_filter_convertToJSON(gender_filter_1);
	printf("gender_filter :\n%s\n", cJSON_Print(jsongender_filter_1));
	gender_filter_t* gender_filter_2 = gender_filter_parseFromJSON(jsongender_filter_1);
	cJSON* jsongender_filter_2 = gender_filter_convertToJSON(gender_filter_2);
	printf("repeating gender_filter:\n%s\n", cJSON_Print(jsongender_filter_2));
}

int main() {
  test_gender_filter(1);
  test_gender_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // gender_filter_MAIN
#endif // gender_filter_TEST
