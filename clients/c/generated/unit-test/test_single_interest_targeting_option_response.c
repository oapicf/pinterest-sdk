#ifndef single_interest_targeting_option_response_TEST
#define single_interest_targeting_option_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define single_interest_targeting_option_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/single_interest_targeting_option_response.h"
single_interest_targeting_option_response_t* instantiate_single_interest_targeting_option_response(int include_optional);



single_interest_targeting_option_response_t* instantiate_single_interest_targeting_option_response(int include_optional) {
  single_interest_targeting_option_response_t* single_interest_targeting_option_response = NULL;
  if (include_optional) {
    single_interest_targeting_option_response = single_interest_targeting_option_response_create(
      "945391946569",
      "Dress",
      list_createList(),
      2
    );
  } else {
    single_interest_targeting_option_response = single_interest_targeting_option_response_create(
      "945391946569",
      "Dress",
      list_createList(),
      2
    );
  }

  return single_interest_targeting_option_response;
}


#ifdef single_interest_targeting_option_response_MAIN

void test_single_interest_targeting_option_response(int include_optional) {
    single_interest_targeting_option_response_t* single_interest_targeting_option_response_1 = instantiate_single_interest_targeting_option_response(include_optional);

	cJSON* jsonsingle_interest_targeting_option_response_1 = single_interest_targeting_option_response_convertToJSON(single_interest_targeting_option_response_1);
	printf("single_interest_targeting_option_response :\n%s\n", cJSON_Print(jsonsingle_interest_targeting_option_response_1));
	single_interest_targeting_option_response_t* single_interest_targeting_option_response_2 = single_interest_targeting_option_response_parseFromJSON(jsonsingle_interest_targeting_option_response_1);
	cJSON* jsonsingle_interest_targeting_option_response_2 = single_interest_targeting_option_response_convertToJSON(single_interest_targeting_option_response_2);
	printf("repeating single_interest_targeting_option_response:\n%s\n", cJSON_Print(jsonsingle_interest_targeting_option_response_2));
}

int main() {
  test_single_interest_targeting_option_response(1);
  test_single_interest_targeting_option_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // single_interest_targeting_option_response_MAIN
#endif // single_interest_targeting_option_response_TEST
