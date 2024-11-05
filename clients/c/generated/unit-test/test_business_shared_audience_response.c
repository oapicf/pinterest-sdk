#ifndef business_shared_audience_response_TEST
#define business_shared_audience_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_shared_audience_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_shared_audience_response.h"
business_shared_audience_response_t* instantiate_business_shared_audience_response(int include_optional);



business_shared_audience_response_t* instantiate_business_shared_audience_response(int include_optional) {
  business_shared_audience_response_t* business_shared_audience_response = NULL;
  if (include_optional) {
    business_shared_audience_response = business_shared_audience_response_create(
      "2542621871096",
      [RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER],
      ["549755885175"]
    );
  } else {
    business_shared_audience_response = business_shared_audience_response_create(
      "2542621871096",
      [RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER],
      ["549755885175"]
    );
  }

  return business_shared_audience_response;
}


#ifdef business_shared_audience_response_MAIN

void test_business_shared_audience_response(int include_optional) {
    business_shared_audience_response_t* business_shared_audience_response_1 = instantiate_business_shared_audience_response(include_optional);

	cJSON* jsonbusiness_shared_audience_response_1 = business_shared_audience_response_convertToJSON(business_shared_audience_response_1);
	printf("business_shared_audience_response :\n%s\n", cJSON_Print(jsonbusiness_shared_audience_response_1));
	business_shared_audience_response_t* business_shared_audience_response_2 = business_shared_audience_response_parseFromJSON(jsonbusiness_shared_audience_response_1);
	cJSON* jsonbusiness_shared_audience_response_2 = business_shared_audience_response_convertToJSON(business_shared_audience_response_2);
	printf("repeating business_shared_audience_response:\n%s\n", cJSON_Print(jsonbusiness_shared_audience_response_2));
}

int main() {
  test_business_shared_audience_response(1);
  test_business_shared_audience_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_shared_audience_response_MAIN
#endif // business_shared_audience_response_TEST
