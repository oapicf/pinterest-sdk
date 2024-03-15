#ifndef gender_TEST
#define gender_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define gender_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/gender.h"
gender_t* instantiate_gender(int include_optional);



gender_t* instantiate_gender(int include_optional) {
  gender_t* gender = NULL;
  if (include_optional) {
    gender = gender_create(
    );
  } else {
    gender = gender_create(
    );
  }

  return gender;
}


#ifdef gender_MAIN

void test_gender(int include_optional) {
    gender_t* gender_1 = instantiate_gender(include_optional);

	cJSON* jsongender_1 = gender_convertToJSON(gender_1);
	printf("gender :\n%s\n", cJSON_Print(jsongender_1));
	gender_t* gender_2 = gender_parseFromJSON(jsongender_1);
	cJSON* jsongender_2 = gender_convertToJSON(gender_2);
	printf("repeating gender:\n%s\n", cJSON_Print(jsongender_2));
}

int main() {
  test_gender(1);
  test_gender(0);

  printf("Hello world \n");
  return 0;
}

#endif // gender_MAIN
#endif // gender_TEST
