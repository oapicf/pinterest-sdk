#ifndef age_trends_bucket_TEST
#define age_trends_bucket_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define age_trends_bucket_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/age_trends_bucket.h"
age_trends_bucket_t* instantiate_age_trends_bucket(int include_optional);



age_trends_bucket_t* instantiate_age_trends_bucket(int include_optional) {
  age_trends_bucket_t* age_trends_bucket = NULL;
  if (include_optional) {
    age_trends_bucket = age_trends_bucket_create(
    );
  } else {
    age_trends_bucket = age_trends_bucket_create(
    );
  }

  return age_trends_bucket;
}


#ifdef age_trends_bucket_MAIN

void test_age_trends_bucket(int include_optional) {
    age_trends_bucket_t* age_trends_bucket_1 = instantiate_age_trends_bucket(include_optional);

	cJSON* jsonage_trends_bucket_1 = age_trends_bucket_convertToJSON(age_trends_bucket_1);
	printf("age_trends_bucket :\n%s\n", cJSON_Print(jsonage_trends_bucket_1));
	age_trends_bucket_t* age_trends_bucket_2 = age_trends_bucket_parseFromJSON(jsonage_trends_bucket_1);
	cJSON* jsonage_trends_bucket_2 = age_trends_bucket_convertToJSON(age_trends_bucket_2);
	printf("repeating age_trends_bucket:\n%s\n", cJSON_Print(jsonage_trends_bucket_2));
}

int main() {
  test_age_trends_bucket(1);
  test_age_trends_bucket(0);

  printf("Hello world \n");
  return 0;
}

#endif // age_trends_bucket_MAIN
#endif // age_trends_bucket_TEST
