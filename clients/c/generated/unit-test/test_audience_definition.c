#ifndef audience_definition_TEST
#define audience_definition_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_definition_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_definition.h"
audience_definition_t* instantiate_audience_definition(int include_optional);



audience_definition_t* instantiate_audience_definition(int include_optional) {
  audience_definition_t* audience_definition = NULL;
  if (include_optional) {
    audience_definition = audience_definition_create(
      "2022-10-09",
      "0",
      "0"
    );
  } else {
    audience_definition = audience_definition_create(
      "2022-10-09",
      "0",
      "0"
    );
  }

  return audience_definition;
}


#ifdef audience_definition_MAIN

void test_audience_definition(int include_optional) {
    audience_definition_t* audience_definition_1 = instantiate_audience_definition(include_optional);

	cJSON* jsonaudience_definition_1 = audience_definition_convertToJSON(audience_definition_1);
	printf("audience_definition :\n%s\n", cJSON_Print(jsonaudience_definition_1));
	audience_definition_t* audience_definition_2 = audience_definition_parseFromJSON(jsonaudience_definition_1);
	cJSON* jsonaudience_definition_2 = audience_definition_convertToJSON(audience_definition_2);
	printf("repeating audience_definition:\n%s\n", cJSON_Print(jsonaudience_definition_2));
}

int main() {
  test_audience_definition(1);
  test_audience_definition(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_definition_MAIN
#endif // audience_definition_TEST
