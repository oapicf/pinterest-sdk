#ifndef audience_insight_category_common_TEST
#define audience_insight_category_common_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_insight_category_common_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_insight_category_common.h"
audience_insight_category_common_t* instantiate_audience_insight_category_common(int include_optional);



audience_insight_category_common_t* instantiate_audience_insight_category_common(int include_optional) {
  audience_insight_category_common_t* audience_insight_category_common = NULL;
  if (include_optional) {
    audience_insight_category_common = audience_insight_category_common_create(
      "549755885175",
      "travel",
      0.551,
      1.2,
      "549755885175"
    );
  } else {
    audience_insight_category_common = audience_insight_category_common_create(
      "549755885175",
      "travel",
      0.551,
      1.2,
      "549755885175"
    );
  }

  return audience_insight_category_common;
}


#ifdef audience_insight_category_common_MAIN

void test_audience_insight_category_common(int include_optional) {
    audience_insight_category_common_t* audience_insight_category_common_1 = instantiate_audience_insight_category_common(include_optional);

	cJSON* jsonaudience_insight_category_common_1 = audience_insight_category_common_convertToJSON(audience_insight_category_common_1);
	printf("audience_insight_category_common :\n%s\n", cJSON_Print(jsonaudience_insight_category_common_1));
	audience_insight_category_common_t* audience_insight_category_common_2 = audience_insight_category_common_parseFromJSON(jsonaudience_insight_category_common_1);
	cJSON* jsonaudience_insight_category_common_2 = audience_insight_category_common_convertToJSON(audience_insight_category_common_2);
	printf("repeating audience_insight_category_common:\n%s\n", cJSON_Print(jsonaudience_insight_category_common_2));
}

int main() {
  test_audience_insight_category_common(1);
  test_audience_insight_category_common(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_insight_category_common_MAIN
#endif // audience_insight_category_common_TEST
