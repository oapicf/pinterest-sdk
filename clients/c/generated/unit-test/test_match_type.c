#ifndef match_type_TEST
#define match_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define match_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/match_type.h"
match_type_t* instantiate_match_type(int include_optional);



match_type_t* instantiate_match_type(int include_optional) {
  match_type_t* match_type = NULL;
  if (include_optional) {
    match_type = match_type_create(
    );
  } else {
    match_type = match_type_create(
    );
  }

  return match_type;
}


#ifdef match_type_MAIN

void test_match_type(int include_optional) {
    match_type_t* match_type_1 = instantiate_match_type(include_optional);

	cJSON* jsonmatch_type_1 = match_type_convertToJSON(match_type_1);
	printf("match_type :\n%s\n", cJSON_Print(jsonmatch_type_1));
	match_type_t* match_type_2 = match_type_parseFromJSON(jsonmatch_type_1);
	cJSON* jsonmatch_type_2 = match_type_convertToJSON(match_type_2);
	printf("repeating match_type:\n%s\n", cJSON_Print(jsonmatch_type_2));
}

int main() {
  test_match_type(1);
  test_match_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // match_type_MAIN
#endif // match_type_TEST
