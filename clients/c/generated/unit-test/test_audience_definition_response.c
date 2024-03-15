#ifndef audience_definition_response_TEST
#define audience_definition_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_definition_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_definition_response.h"
audience_definition_response_t* instantiate_audience_definition_response(int include_optional);



audience_definition_response_t* instantiate_audience_definition_response(int include_optional) {
  audience_definition_response_t* audience_definition_response = NULL;
  if (include_optional) {
    audience_definition_response = audience_definition_response_create(
      list_createList()
    );
  } else {
    audience_definition_response = audience_definition_response_create(
      list_createList()
    );
  }

  return audience_definition_response;
}


#ifdef audience_definition_response_MAIN

void test_audience_definition_response(int include_optional) {
    audience_definition_response_t* audience_definition_response_1 = instantiate_audience_definition_response(include_optional);

	cJSON* jsonaudience_definition_response_1 = audience_definition_response_convertToJSON(audience_definition_response_1);
	printf("audience_definition_response :\n%s\n", cJSON_Print(jsonaudience_definition_response_1));
	audience_definition_response_t* audience_definition_response_2 = audience_definition_response_parseFromJSON(jsonaudience_definition_response_1);
	cJSON* jsonaudience_definition_response_2 = audience_definition_response_convertToJSON(audience_definition_response_2);
	printf("repeating audience_definition_response:\n%s\n", cJSON_Print(jsonaudience_definition_response_2));
}

int main() {
  test_audience_definition_response(1);
  test_audience_definition_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_definition_response_MAIN
#endif // audience_definition_response_TEST
