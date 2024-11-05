#ifndef business_shared_audience_TEST
#define business_shared_audience_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_shared_audience_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_shared_audience.h"
business_shared_audience_t* instantiate_business_shared_audience(int include_optional);



business_shared_audience_t* instantiate_business_shared_audience(int include_optional) {
  business_shared_audience_t* business_shared_audience = NULL;
  if (include_optional) {
    business_shared_audience = business_shared_audience_create(
      "2542621871096",
      pinterest_rest_api_business_shared_audience__SHARE,
      list_createList()
    );
  } else {
    business_shared_audience = business_shared_audience_create(
      "2542621871096",
      pinterest_rest_api_business_shared_audience__SHARE,
      list_createList()
    );
  }

  return business_shared_audience;
}


#ifdef business_shared_audience_MAIN

void test_business_shared_audience(int include_optional) {
    business_shared_audience_t* business_shared_audience_1 = instantiate_business_shared_audience(include_optional);

	cJSON* jsonbusiness_shared_audience_1 = business_shared_audience_convertToJSON(business_shared_audience_1);
	printf("business_shared_audience :\n%s\n", cJSON_Print(jsonbusiness_shared_audience_1));
	business_shared_audience_t* business_shared_audience_2 = business_shared_audience_parseFromJSON(jsonbusiness_shared_audience_1);
	cJSON* jsonbusiness_shared_audience_2 = business_shared_audience_convertToJSON(business_shared_audience_2);
	printf("repeating business_shared_audience:\n%s\n", cJSON_Print(jsonbusiness_shared_audience_2));
}

int main() {
  test_business_shared_audience(1);
  test_business_shared_audience(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_shared_audience_MAIN
#endif // business_shared_audience_TEST
