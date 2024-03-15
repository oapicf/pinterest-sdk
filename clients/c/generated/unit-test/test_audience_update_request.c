#ifndef audience_update_request_TEST
#define audience_update_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_update_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_update_request.h"
audience_update_request_t* instantiate_audience_update_request(int include_optional);

#include "test_audience_rule.c"


audience_update_request_t* instantiate_audience_update_request(int include_optional) {
  audience_update_request_t* audience_update_request = NULL;
  if (include_optional) {
    audience_update_request = audience_update_request_create(
      "549755885175",
      "string",
       // false, not to have infinite recursion
      instantiate_audience_rule(0),
      "string",
      pinterest_rest_api_audience_update_request__"UPDATE"
    );
  } else {
    audience_update_request = audience_update_request_create(
      "549755885175",
      "string",
      NULL,
      "string",
      pinterest_rest_api_audience_update_request__"UPDATE"
    );
  }

  return audience_update_request;
}


#ifdef audience_update_request_MAIN

void test_audience_update_request(int include_optional) {
    audience_update_request_t* audience_update_request_1 = instantiate_audience_update_request(include_optional);

	cJSON* jsonaudience_update_request_1 = audience_update_request_convertToJSON(audience_update_request_1);
	printf("audience_update_request :\n%s\n", cJSON_Print(jsonaudience_update_request_1));
	audience_update_request_t* audience_update_request_2 = audience_update_request_parseFromJSON(jsonaudience_update_request_1);
	cJSON* jsonaudience_update_request_2 = audience_update_request_convertToJSON(audience_update_request_2);
	printf("repeating audience_update_request:\n%s\n", cJSON_Print(jsonaudience_update_request_2));
}

int main() {
  test_audience_update_request(1);
  test_audience_update_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_update_request_MAIN
#endif // audience_update_request_TEST
