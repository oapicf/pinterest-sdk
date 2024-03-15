#ifndef audience_TEST
#define audience_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience.h"
audience_t* instantiate_audience(int include_optional);

#include "test_audience_rule.c"


audience_t* instantiate_audience(int include_optional) {
  audience_t* audience = NULL;
  if (include_optional) {
    audience = audience_create(
      "549755885175",
      "1234",
      "ACME Tools",
      "0",
      "People who love making quilts.",
       // false, not to have infinite recursion
      instantiate_audience_rule(0),
      1000,
      "0",
      "audience",
      1451431341,
      1451431341
    );
  } else {
    audience = audience_create(
      "549755885175",
      "1234",
      "ACME Tools",
      "0",
      "People who love making quilts.",
      NULL,
      1000,
      "0",
      "audience",
      1451431341,
      1451431341
    );
  }

  return audience;
}


#ifdef audience_MAIN

void test_audience(int include_optional) {
    audience_t* audience_1 = instantiate_audience(include_optional);

	cJSON* jsonaudience_1 = audience_convertToJSON(audience_1);
	printf("audience :\n%s\n", cJSON_Print(jsonaudience_1));
	audience_t* audience_2 = audience_parseFromJSON(jsonaudience_1);
	cJSON* jsonaudience_2 = audience_convertToJSON(audience_2);
	printf("repeating audience:\n%s\n", cJSON_Print(jsonaudience_2));
}

int main() {
  test_audience(1);
  test_audience(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_MAIN
#endif // audience_TEST
