#ifndef gender_bucket_TEST
#define gender_bucket_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define gender_bucket_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/gender_bucket.h"
gender_bucket_t* instantiate_gender_bucket(int include_optional);



gender_bucket_t* instantiate_gender_bucket(int include_optional) {
  gender_bucket_t* gender_bucket = NULL;
  if (include_optional) {
    gender_bucket = gender_bucket_create(
    );
  } else {
    gender_bucket = gender_bucket_create(
    );
  }

  return gender_bucket;
}


#ifdef gender_bucket_MAIN

void test_gender_bucket(int include_optional) {
    gender_bucket_t* gender_bucket_1 = instantiate_gender_bucket(include_optional);

	cJSON* jsongender_bucket_1 = gender_bucket_convertToJSON(gender_bucket_1);
	printf("gender_bucket :\n%s\n", cJSON_Print(jsongender_bucket_1));
	gender_bucket_t* gender_bucket_2 = gender_bucket_parseFromJSON(jsongender_bucket_1);
	cJSON* jsongender_bucket_2 = gender_bucket_convertToJSON(gender_bucket_2);
	printf("repeating gender_bucket:\n%s\n", cJSON_Print(jsongender_bucket_2));
}

int main() {
  test_gender_bucket(1);
  test_gender_bucket(0);

  printf("Hello world \n");
  return 0;
}

#endif // gender_bucket_MAIN
#endif // gender_bucket_TEST
