#ifndef audience_demographics_TEST
#define audience_demographics_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_demographics_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_demographics.h"
audience_demographics_t* instantiate_audience_demographics(int include_optional);



audience_demographics_t* instantiate_audience_demographics(int include_optional) {
  audience_demographics_t* audience_demographics = NULL;
  if (include_optional) {
    audience_demographics = audience_demographics_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    audience_demographics = audience_demographics_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return audience_demographics;
}


#ifdef audience_demographics_MAIN

void test_audience_demographics(int include_optional) {
    audience_demographics_t* audience_demographics_1 = instantiate_audience_demographics(include_optional);

	cJSON* jsonaudience_demographics_1 = audience_demographics_convertToJSON(audience_demographics_1);
	printf("audience_demographics :\n%s\n", cJSON_Print(jsonaudience_demographics_1));
	audience_demographics_t* audience_demographics_2 = audience_demographics_parseFromJSON(jsonaudience_demographics_1);
	cJSON* jsonaudience_demographics_2 = audience_demographics_convertToJSON(audience_demographics_2);
	printf("repeating audience_demographics:\n%s\n", cJSON_Print(jsonaudience_demographics_2));
}

int main() {
  test_audience_demographics(1);
  test_audience_demographics(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_demographics_MAIN
#endif // audience_demographics_TEST
