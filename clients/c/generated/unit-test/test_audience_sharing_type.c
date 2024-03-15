#ifndef audience_sharing_type_TEST
#define audience_sharing_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_sharing_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_sharing_type.h"
audience_sharing_type_t* instantiate_audience_sharing_type(int include_optional);



audience_sharing_type_t* instantiate_audience_sharing_type(int include_optional) {
  audience_sharing_type_t* audience_sharing_type = NULL;
  if (include_optional) {
    audience_sharing_type = audience_sharing_type_create(
    );
  } else {
    audience_sharing_type = audience_sharing_type_create(
    );
  }

  return audience_sharing_type;
}


#ifdef audience_sharing_type_MAIN

void test_audience_sharing_type(int include_optional) {
    audience_sharing_type_t* audience_sharing_type_1 = instantiate_audience_sharing_type(include_optional);

	cJSON* jsonaudience_sharing_type_1 = audience_sharing_type_convertToJSON(audience_sharing_type_1);
	printf("audience_sharing_type :\n%s\n", cJSON_Print(jsonaudience_sharing_type_1));
	audience_sharing_type_t* audience_sharing_type_2 = audience_sharing_type_parseFromJSON(jsonaudience_sharing_type_1);
	cJSON* jsonaudience_sharing_type_2 = audience_sharing_type_convertToJSON(audience_sharing_type_2);
	printf("repeating audience_sharing_type:\n%s\n", cJSON_Print(jsonaudience_sharing_type_2));
}

int main() {
  test_audience_sharing_type(1);
  test_audience_sharing_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_sharing_type_MAIN
#endif // audience_sharing_type_TEST
