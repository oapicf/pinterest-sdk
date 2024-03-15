#ifndef billing_profiles_get_200_response_TEST
#define billing_profiles_get_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define billing_profiles_get_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/billing_profiles_get_200_response.h"
billing_profiles_get_200_response_t* instantiate_billing_profiles_get_200_response(int include_optional);



billing_profiles_get_200_response_t* instantiate_billing_profiles_get_200_response(int include_optional) {
  billing_profiles_get_200_response_t* billing_profiles_get_200_response = NULL;
  if (include_optional) {
    billing_profiles_get_200_response = billing_profiles_get_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    billing_profiles_get_200_response = billing_profiles_get_200_response_create(
      list_createList(),
      "0"
    );
  }

  return billing_profiles_get_200_response;
}


#ifdef billing_profiles_get_200_response_MAIN

void test_billing_profiles_get_200_response(int include_optional) {
    billing_profiles_get_200_response_t* billing_profiles_get_200_response_1 = instantiate_billing_profiles_get_200_response(include_optional);

	cJSON* jsonbilling_profiles_get_200_response_1 = billing_profiles_get_200_response_convertToJSON(billing_profiles_get_200_response_1);
	printf("billing_profiles_get_200_response :\n%s\n", cJSON_Print(jsonbilling_profiles_get_200_response_1));
	billing_profiles_get_200_response_t* billing_profiles_get_200_response_2 = billing_profiles_get_200_response_parseFromJSON(jsonbilling_profiles_get_200_response_1);
	cJSON* jsonbilling_profiles_get_200_response_2 = billing_profiles_get_200_response_convertToJSON(billing_profiles_get_200_response_2);
	printf("repeating billing_profiles_get_200_response:\n%s\n", cJSON_Print(jsonbilling_profiles_get_200_response_2));
}

int main() {
  test_billing_profiles_get_200_response(1);
  test_billing_profiles_get_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // billing_profiles_get_200_response_MAIN
#endif // billing_profiles_get_200_response_TEST
