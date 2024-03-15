#ifndef partner_type_TEST
#define partner_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define partner_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/partner_type.h"
partner_type_t* instantiate_partner_type(int include_optional);



partner_type_t* instantiate_partner_type(int include_optional) {
  partner_type_t* partner_type = NULL;
  if (include_optional) {
    partner_type = partner_type_create(
    );
  } else {
    partner_type = partner_type_create(
    );
  }

  return partner_type;
}


#ifdef partner_type_MAIN

void test_partner_type(int include_optional) {
    partner_type_t* partner_type_1 = instantiate_partner_type(include_optional);

	cJSON* jsonpartner_type_1 = partner_type_convertToJSON(partner_type_1);
	printf("partner_type :\n%s\n", cJSON_Print(jsonpartner_type_1));
	partner_type_t* partner_type_2 = partner_type_parseFromJSON(jsonpartner_type_1);
	cJSON* jsonpartner_type_2 = partner_type_convertToJSON(partner_type_2);
	printf("repeating partner_type:\n%s\n", cJSON_Print(jsonpartner_type_2));
}

int main() {
  test_partner_type(1);
  test_partner_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // partner_type_MAIN
#endif // partner_type_TEST
