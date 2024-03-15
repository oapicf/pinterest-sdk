#ifndef audience_demographic_value_TEST
#define audience_demographic_value_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_demographic_value_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_demographic_value.h"
audience_demographic_value_t* instantiate_audience_demographic_value(int include_optional);



audience_demographic_value_t* instantiate_audience_demographic_value(int include_optional) {
  audience_demographic_value_t* audience_demographic_value = NULL;
  if (include_optional) {
    audience_demographic_value = audience_demographic_value_create(
      "us",
      "United States",
      0.551
    );
  } else {
    audience_demographic_value = audience_demographic_value_create(
      "us",
      "United States",
      0.551
    );
  }

  return audience_demographic_value;
}


#ifdef audience_demographic_value_MAIN

void test_audience_demographic_value(int include_optional) {
    audience_demographic_value_t* audience_demographic_value_1 = instantiate_audience_demographic_value(include_optional);

	cJSON* jsonaudience_demographic_value_1 = audience_demographic_value_convertToJSON(audience_demographic_value_1);
	printf("audience_demographic_value :\n%s\n", cJSON_Print(jsonaudience_demographic_value_1));
	audience_demographic_value_t* audience_demographic_value_2 = audience_demographic_value_parseFromJSON(jsonaudience_demographic_value_1);
	cJSON* jsonaudience_demographic_value_2 = audience_demographic_value_convertToJSON(audience_demographic_value_2);
	printf("repeating audience_demographic_value:\n%s\n", cJSON_Print(jsonaudience_demographic_value_2));
}

int main() {
  test_audience_demographic_value(1);
  test_audience_demographic_value(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_demographic_value_MAIN
#endif // audience_demographic_value_TEST
