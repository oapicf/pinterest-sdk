#ifndef audience_account_type_TEST
#define audience_account_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_account_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_account_type.h"
audience_account_type_t* instantiate_audience_account_type(int include_optional);



audience_account_type_t* instantiate_audience_account_type(int include_optional) {
  audience_account_type_t* audience_account_type = NULL;
  if (include_optional) {
    audience_account_type = audience_account_type_create(
    );
  } else {
    audience_account_type = audience_account_type_create(
    );
  }

  return audience_account_type;
}


#ifdef audience_account_type_MAIN

void test_audience_account_type(int include_optional) {
    audience_account_type_t* audience_account_type_1 = instantiate_audience_account_type(include_optional);

	cJSON* jsonaudience_account_type_1 = audience_account_type_convertToJSON(audience_account_type_1);
	printf("audience_account_type :\n%s\n", cJSON_Print(jsonaudience_account_type_1));
	audience_account_type_t* audience_account_type_2 = audience_account_type_parseFromJSON(jsonaudience_account_type_1);
	cJSON* jsonaudience_account_type_2 = audience_account_type_convertToJSON(audience_account_type_2);
	printf("repeating audience_account_type:\n%s\n", cJSON_Print(jsonaudience_account_type_2));
}

int main() {
  test_audience_account_type(1);
  test_audience_account_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_account_type_MAIN
#endif // audience_account_type_TEST
