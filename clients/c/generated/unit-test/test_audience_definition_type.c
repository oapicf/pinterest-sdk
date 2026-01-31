#ifndef audience_definition_type_TEST
#define audience_definition_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_definition_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_definition_type.h"
audience_definition_type_t* instantiate_audience_definition_type(int include_optional);



audience_definition_type_t* instantiate_audience_definition_type(int include_optional) {
  audience_definition_type_t* audience_definition_type = NULL;
  if (include_optional) {
    audience_definition_type = audience_definition_type_create(
      pinterest_rest_api_audience_definition_type_SCOPE_IMPRESSION_PLUS_ENGAGEMENT
    );
  } else {
    audience_definition_type = audience_definition_type_create(
      pinterest_rest_api_audience_definition_type_SCOPE_IMPRESSION_PLUS_ENGAGEMENT
    );
  }

  return audience_definition_type;
}


#ifdef audience_definition_type_MAIN

void test_audience_definition_type(int include_optional) {
    audience_definition_type_t* audience_definition_type_1 = instantiate_audience_definition_type(include_optional);

	cJSON* jsonaudience_definition_type_1 = audience_definition_type_convertToJSON(audience_definition_type_1);
	printf("audience_definition_type :\n%s\n", cJSON_Print(jsonaudience_definition_type_1));
	audience_definition_type_t* audience_definition_type_2 = audience_definition_type_parseFromJSON(jsonaudience_definition_type_1);
	cJSON* jsonaudience_definition_type_2 = audience_definition_type_convertToJSON(audience_definition_type_2);
	printf("repeating audience_definition_type:\n%s\n", cJSON_Print(jsonaudience_definition_type_2));
}

int main() {
  test_audience_definition_type(1);
  test_audience_definition_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_definition_type_MAIN
#endif // audience_definition_type_TEST
