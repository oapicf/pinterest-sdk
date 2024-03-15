#ifndef interest_TEST
#define interest_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define interest_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/interest.h"
interest_t* instantiate_interest(int include_optional);



interest_t* instantiate_interest(int include_optional) {
  interest_t* interest = NULL;
  if (include_optional) {
    interest = interest_create(
      "0",
      "903972677830",
      "man cave",
      "Man cave"
    );
  } else {
    interest = interest_create(
      "0",
      "903972677830",
      "man cave",
      "Man cave"
    );
  }

  return interest;
}


#ifdef interest_MAIN

void test_interest(int include_optional) {
    interest_t* interest_1 = instantiate_interest(include_optional);

	cJSON* jsoninterest_1 = interest_convertToJSON(interest_1);
	printf("interest :\n%s\n", cJSON_Print(jsoninterest_1));
	interest_t* interest_2 = interest_parseFromJSON(jsoninterest_1);
	cJSON* jsoninterest_2 = interest_convertToJSON(interest_2);
	printf("repeating interest:\n%s\n", cJSON_Print(jsoninterest_2));
}

int main() {
  test_interest(1);
  test_interest(0);

  printf("Hello world \n");
  return 0;
}

#endif // interest_MAIN
#endif // interest_TEST
