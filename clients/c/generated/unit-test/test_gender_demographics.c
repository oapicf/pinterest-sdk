#ifndef gender_demographics_TEST
#define gender_demographics_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define gender_demographics_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/gender_demographics.h"
gender_demographics_t* instantiate_gender_demographics(int include_optional);



gender_demographics_t* instantiate_gender_demographics(int include_optional) {
  gender_demographics_t* gender_demographics = NULL;
  if (include_optional) {
    gender_demographics = gender_demographics_create(
      1.337,
      1.337,
      1.337
    );
  } else {
    gender_demographics = gender_demographics_create(
      1.337,
      1.337,
      1.337
    );
  }

  return gender_demographics;
}


#ifdef gender_demographics_MAIN

void test_gender_demographics(int include_optional) {
    gender_demographics_t* gender_demographics_1 = instantiate_gender_demographics(include_optional);

	cJSON* jsongender_demographics_1 = gender_demographics_convertToJSON(gender_demographics_1);
	printf("gender_demographics :\n%s\n", cJSON_Print(jsongender_demographics_1));
	gender_demographics_t* gender_demographics_2 = gender_demographics_parseFromJSON(jsongender_demographics_1);
	cJSON* jsongender_demographics_2 = gender_demographics_convertToJSON(gender_demographics_2);
	printf("repeating gender_demographics:\n%s\n", cJSON_Print(jsongender_demographics_2));
}

int main() {
  test_gender_demographics(1);
  test_gender_demographics(0);

  printf("Hello world \n");
  return 0;
}

#endif // gender_demographics_MAIN
#endif // gender_demographics_TEST
