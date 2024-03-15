#ifndef audience_insight_category_array_response_TEST
#define audience_insight_category_array_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_insight_category_array_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_insight_category_array_response.h"
audience_insight_category_array_response_t* instantiate_audience_insight_category_array_response(int include_optional);



audience_insight_category_array_response_t* instantiate_audience_insight_category_array_response(int include_optional) {
  audience_insight_category_array_response_t* audience_insight_category_array_response = NULL;
  if (include_optional) {
    audience_insight_category_array_response = audience_insight_category_array_response_create(
      list_createList()
    );
  } else {
    audience_insight_category_array_response = audience_insight_category_array_response_create(
      list_createList()
    );
  }

  return audience_insight_category_array_response;
}


#ifdef audience_insight_category_array_response_MAIN

void test_audience_insight_category_array_response(int include_optional) {
    audience_insight_category_array_response_t* audience_insight_category_array_response_1 = instantiate_audience_insight_category_array_response(include_optional);

	cJSON* jsonaudience_insight_category_array_response_1 = audience_insight_category_array_response_convertToJSON(audience_insight_category_array_response_1);
	printf("audience_insight_category_array_response :\n%s\n", cJSON_Print(jsonaudience_insight_category_array_response_1));
	audience_insight_category_array_response_t* audience_insight_category_array_response_2 = audience_insight_category_array_response_parseFromJSON(jsonaudience_insight_category_array_response_1);
	cJSON* jsonaudience_insight_category_array_response_2 = audience_insight_category_array_response_convertToJSON(audience_insight_category_array_response_2);
	printf("repeating audience_insight_category_array_response:\n%s\n", cJSON_Print(jsonaudience_insight_category_array_response_2));
}

int main() {
  test_audience_insight_category_array_response(1);
  test_audience_insight_category_array_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_insight_category_array_response_MAIN
#endif // audience_insight_category_array_response_TEST
