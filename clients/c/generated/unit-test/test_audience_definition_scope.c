#ifndef audience_definition_scope_TEST
#define audience_definition_scope_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_definition_scope_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_definition_scope.h"
audience_definition_scope_t* instantiate_audience_definition_scope(int include_optional);



audience_definition_scope_t* instantiate_audience_definition_scope(int include_optional) {
  audience_definition_scope_t* audience_definition_scope = NULL;
  if (include_optional) {
    audience_definition_scope = audience_definition_scope_create(
      pinterest_rest_api_audience_definition_scope_SCOPE_PARTNER
    );
  } else {
    audience_definition_scope = audience_definition_scope_create(
      pinterest_rest_api_audience_definition_scope_SCOPE_PARTNER
    );
  }

  return audience_definition_scope;
}


#ifdef audience_definition_scope_MAIN

void test_audience_definition_scope(int include_optional) {
    audience_definition_scope_t* audience_definition_scope_1 = instantiate_audience_definition_scope(include_optional);

	cJSON* jsonaudience_definition_scope_1 = audience_definition_scope_convertToJSON(audience_definition_scope_1);
	printf("audience_definition_scope :\n%s\n", cJSON_Print(jsonaudience_definition_scope_1));
	audience_definition_scope_t* audience_definition_scope_2 = audience_definition_scope_parseFromJSON(jsonaudience_definition_scope_1);
	cJSON* jsonaudience_definition_scope_2 = audience_definition_scope_convertToJSON(audience_definition_scope_2);
	printf("repeating audience_definition_scope:\n%s\n", cJSON_Print(jsonaudience_definition_scope_2));
}

int main() {
  test_audience_definition_scope(1);
  test_audience_definition_scope(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_definition_scope_MAIN
#endif // audience_definition_scope_TEST
