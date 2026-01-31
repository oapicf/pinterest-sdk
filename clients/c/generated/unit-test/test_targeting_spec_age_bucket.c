#ifndef targeting_spec_age_bucket_TEST
#define targeting_spec_age_bucket_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_spec_age_bucket_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_spec_age_bucket.h"
targeting_spec_age_bucket_t* instantiate_targeting_spec_age_bucket(int include_optional);



targeting_spec_age_bucket_t* instantiate_targeting_spec_age_bucket(int include_optional) {
  targeting_spec_age_bucket_t* targeting_spec_age_bucket = NULL;
  if (include_optional) {
    targeting_spec_age_bucket = targeting_spec_age_bucket_create(
    );
  } else {
    targeting_spec_age_bucket = targeting_spec_age_bucket_create(
    );
  }

  return targeting_spec_age_bucket;
}


#ifdef targeting_spec_age_bucket_MAIN

void test_targeting_spec_age_bucket(int include_optional) {
    targeting_spec_age_bucket_t* targeting_spec_age_bucket_1 = instantiate_targeting_spec_age_bucket(include_optional);

	cJSON* jsontargeting_spec_age_bucket_1 = targeting_spec_age_bucket_convertToJSON(targeting_spec_age_bucket_1);
	printf("targeting_spec_age_bucket :\n%s\n", cJSON_Print(jsontargeting_spec_age_bucket_1));
	targeting_spec_age_bucket_t* targeting_spec_age_bucket_2 = targeting_spec_age_bucket_parseFromJSON(jsontargeting_spec_age_bucket_1);
	cJSON* jsontargeting_spec_age_bucket_2 = targeting_spec_age_bucket_convertToJSON(targeting_spec_age_bucket_2);
	printf("repeating targeting_spec_age_bucket:\n%s\n", cJSON_Print(jsontargeting_spec_age_bucket_2));
}

int main() {
  test_targeting_spec_age_bucket(1);
  test_targeting_spec_age_bucket(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_spec_age_bucket_MAIN
#endif // targeting_spec_age_bucket_TEST
