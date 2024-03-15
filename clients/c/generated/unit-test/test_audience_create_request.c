#ifndef audience_create_request_TEST
#define audience_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_create_request.h"
audience_create_request_t* instantiate_audience_create_request(int include_optional);

#include "test_audience_rule.c"
#include "test_audience_create_request_1_audience_type.c"


audience_create_request_t* instantiate_audience_create_request(int include_optional) {
  audience_create_request_t* audience_create_request = NULL;
  if (include_optional) {
    audience_create_request = audience_create_request_create(
      "549755885175",
      "string",
       // false, not to have infinite recursion
      instantiate_audience_rule(0),
      "string",
      "0"
    );
  } else {
    audience_create_request = audience_create_request_create(
      "549755885175",
      "string",
      NULL,
      "string",
      "0"
    );
  }

  return audience_create_request;
}


#ifdef audience_create_request_MAIN

void test_audience_create_request(int include_optional) {
    audience_create_request_t* audience_create_request_1 = instantiate_audience_create_request(include_optional);

	cJSON* jsonaudience_create_request_1 = audience_create_request_convertToJSON(audience_create_request_1);
	printf("audience_create_request :\n%s\n", cJSON_Print(jsonaudience_create_request_1));
	audience_create_request_t* audience_create_request_2 = audience_create_request_parseFromJSON(jsonaudience_create_request_1);
	cJSON* jsonaudience_create_request_2 = audience_create_request_convertToJSON(audience_create_request_2);
	printf("repeating audience_create_request:\n%s\n", cJSON_Print(jsonaudience_create_request_2));
}

int main() {
  test_audience_create_request(1);
  test_audience_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_create_request_MAIN
#endif // audience_create_request_TEST
