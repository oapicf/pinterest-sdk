#ifndef audience_share_type_TEST
#define audience_share_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_share_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_share_type.h"
audience_share_type_t* instantiate_audience_share_type(int include_optional);



audience_share_type_t* instantiate_audience_share_type(int include_optional) {
  audience_share_type_t* audience_share_type = NULL;
  if (include_optional) {
    audience_share_type = audience_share_type_create(
    );
  } else {
    audience_share_type = audience_share_type_create(
    );
  }

  return audience_share_type;
}


#ifdef audience_share_type_MAIN

void test_audience_share_type(int include_optional) {
    audience_share_type_t* audience_share_type_1 = instantiate_audience_share_type(include_optional);

	cJSON* jsonaudience_share_type_1 = audience_share_type_convertToJSON(audience_share_type_1);
	printf("audience_share_type :\n%s\n", cJSON_Print(jsonaudience_share_type_1));
	audience_share_type_t* audience_share_type_2 = audience_share_type_parseFromJSON(jsonaudience_share_type_1);
	cJSON* jsonaudience_share_type_2 = audience_share_type_convertToJSON(audience_share_type_2);
	printf("repeating audience_share_type:\n%s\n", cJSON_Print(jsonaudience_share_type_2));
}

int main() {
  test_audience_share_type(1);
  test_audience_share_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_share_type_MAIN
#endif // audience_share_type_TEST
