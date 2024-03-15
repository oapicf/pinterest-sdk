#ifndef match_type_response_TEST
#define match_type_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define match_type_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/match_type_response.h"
match_type_response_t* instantiate_match_type_response(int include_optional);



match_type_response_t* instantiate_match_type_response(int include_optional) {
  match_type_response_t* match_type_response = NULL;
  if (include_optional) {
    match_type_response = match_type_response_create(
    );
  } else {
    match_type_response = match_type_response_create(
    );
  }

  return match_type_response;
}


#ifdef match_type_response_MAIN

void test_match_type_response(int include_optional) {
    match_type_response_t* match_type_response_1 = instantiate_match_type_response(include_optional);

	cJSON* jsonmatch_type_response_1 = match_type_response_convertToJSON(match_type_response_1);
	printf("match_type_response :\n%s\n", cJSON_Print(jsonmatch_type_response_1));
	match_type_response_t* match_type_response_2 = match_type_response_parseFromJSON(jsonmatch_type_response_1);
	cJSON* jsonmatch_type_response_2 = match_type_response_convertToJSON(match_type_response_2);
	printf("repeating match_type_response:\n%s\n", cJSON_Print(jsonmatch_type_response_2));
}

int main() {
  test_match_type_response(1);
  test_match_type_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // match_type_response_MAIN
#endif // match_type_response_TEST
