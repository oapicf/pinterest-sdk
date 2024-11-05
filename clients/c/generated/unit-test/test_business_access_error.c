#ifndef business_access_error_TEST
#define business_access_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_access_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_access_error.h"
business_access_error_t* instantiate_business_access_error(int include_optional);



business_access_error_t* instantiate_business_access_error(int include_optional) {
  business_access_error_t* business_access_error = NULL;
  if (include_optional) {
    business_access_error = business_access_error_create(
      56,
      "0"
    );
  } else {
    business_access_error = business_access_error_create(
      56,
      "0"
    );
  }

  return business_access_error;
}


#ifdef business_access_error_MAIN

void test_business_access_error(int include_optional) {
    business_access_error_t* business_access_error_1 = instantiate_business_access_error(include_optional);

	cJSON* jsonbusiness_access_error_1 = business_access_error_convertToJSON(business_access_error_1);
	printf("business_access_error :\n%s\n", cJSON_Print(jsonbusiness_access_error_1));
	business_access_error_t* business_access_error_2 = business_access_error_parseFromJSON(jsonbusiness_access_error_1);
	cJSON* jsonbusiness_access_error_2 = business_access_error_convertToJSON(business_access_error_2);
	printf("repeating business_access_error:\n%s\n", cJSON_Print(jsonbusiness_access_error_2));
}

int main() {
  test_business_access_error(1);
  test_business_access_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_access_error_MAIN
#endif // business_access_error_TEST
