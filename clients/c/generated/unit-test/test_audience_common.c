#ifndef audience_common_TEST
#define audience_common_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_common_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_common.h"
audience_common_t* instantiate_audience_common(int include_optional);

#include "test_audience_rule.c"


audience_common_t* instantiate_audience_common(int include_optional) {
  audience_common_t* audience_common = NULL;
  if (include_optional) {
    audience_common = audience_common_create(
      "549755885175",
      "string",
       // false, not to have infinite recursion
      instantiate_audience_rule(0)
    );
  } else {
    audience_common = audience_common_create(
      "549755885175",
      "string",
      NULL
    );
  }

  return audience_common;
}


#ifdef audience_common_MAIN

void test_audience_common(int include_optional) {
    audience_common_t* audience_common_1 = instantiate_audience_common(include_optional);

	cJSON* jsonaudience_common_1 = audience_common_convertToJSON(audience_common_1);
	printf("audience_common :\n%s\n", cJSON_Print(jsonaudience_common_1));
	audience_common_t* audience_common_2 = audience_common_parseFromJSON(jsonaudience_common_1);
	cJSON* jsonaudience_common_2 = audience_common_convertToJSON(audience_common_2);
	printf("repeating audience_common:\n%s\n", cJSON_Print(jsonaudience_common_2));
}

int main() {
  test_audience_common(1);
  test_audience_common(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_common_MAIN
#endif // audience_common_TEST
