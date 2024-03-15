#ifndef audience_update_operation_type_TEST
#define audience_update_operation_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_update_operation_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_update_operation_type.h"
audience_update_operation_type_t* instantiate_audience_update_operation_type(int include_optional);



audience_update_operation_type_t* instantiate_audience_update_operation_type(int include_optional) {
  audience_update_operation_type_t* audience_update_operation_type = NULL;
  if (include_optional) {
    audience_update_operation_type = audience_update_operation_type_create(
    );
  } else {
    audience_update_operation_type = audience_update_operation_type_create(
    );
  }

  return audience_update_operation_type;
}


#ifdef audience_update_operation_type_MAIN

void test_audience_update_operation_type(int include_optional) {
    audience_update_operation_type_t* audience_update_operation_type_1 = instantiate_audience_update_operation_type(include_optional);

	cJSON* jsonaudience_update_operation_type_1 = audience_update_operation_type_convertToJSON(audience_update_operation_type_1);
	printf("audience_update_operation_type :\n%s\n", cJSON_Print(jsonaudience_update_operation_type_1));
	audience_update_operation_type_t* audience_update_operation_type_2 = audience_update_operation_type_parseFromJSON(jsonaudience_update_operation_type_1);
	cJSON* jsonaudience_update_operation_type_2 = audience_update_operation_type_convertToJSON(audience_update_operation_type_2);
	printf("repeating audience_update_operation_type:\n%s\n", cJSON_Print(jsonaudience_update_operation_type_2));
}

int main() {
  test_audience_update_operation_type(1);
  test_audience_update_operation_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_update_operation_type_MAIN
#endif // audience_update_operation_type_TEST
