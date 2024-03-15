#ifndef audience_insight_type_TEST
#define audience_insight_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_insight_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_insight_type.h"
audience_insight_type_t* instantiate_audience_insight_type(int include_optional);



audience_insight_type_t* instantiate_audience_insight_type(int include_optional) {
  audience_insight_type_t* audience_insight_type = NULL;
  if (include_optional) {
    audience_insight_type = audience_insight_type_create(
    );
  } else {
    audience_insight_type = audience_insight_type_create(
    );
  }

  return audience_insight_type;
}


#ifdef audience_insight_type_MAIN

void test_audience_insight_type(int include_optional) {
    audience_insight_type_t* audience_insight_type_1 = instantiate_audience_insight_type(include_optional);

	cJSON* jsonaudience_insight_type_1 = audience_insight_type_convertToJSON(audience_insight_type_1);
	printf("audience_insight_type :\n%s\n", cJSON_Print(jsonaudience_insight_type_1));
	audience_insight_type_t* audience_insight_type_2 = audience_insight_type_parseFromJSON(jsonaudience_insight_type_1);
	cJSON* jsonaudience_insight_type_2 = audience_insight_type_convertToJSON(audience_insight_type_2);
	printf("repeating audience_insight_type:\n%s\n", cJSON_Print(jsonaudience_insight_type_2));
}

int main() {
  test_audience_insight_type(1);
  test_audience_insight_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_insight_type_MAIN
#endif // audience_insight_type_TEST
