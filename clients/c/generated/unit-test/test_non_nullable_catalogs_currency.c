#ifndef non_nullable_catalogs_currency_TEST
#define non_nullable_catalogs_currency_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define non_nullable_catalogs_currency_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/non_nullable_catalogs_currency.h"
non_nullable_catalogs_currency_t* instantiate_non_nullable_catalogs_currency(int include_optional);



non_nullable_catalogs_currency_t* instantiate_non_nullable_catalogs_currency(int include_optional) {
  non_nullable_catalogs_currency_t* non_nullable_catalogs_currency = NULL;
  if (include_optional) {
    non_nullable_catalogs_currency = non_nullable_catalogs_currency_create(
    );
  } else {
    non_nullable_catalogs_currency = non_nullable_catalogs_currency_create(
    );
  }

  return non_nullable_catalogs_currency;
}


#ifdef non_nullable_catalogs_currency_MAIN

void test_non_nullable_catalogs_currency(int include_optional) {
    non_nullable_catalogs_currency_t* non_nullable_catalogs_currency_1 = instantiate_non_nullable_catalogs_currency(include_optional);

	cJSON* jsonnon_nullable_catalogs_currency_1 = non_nullable_catalogs_currency_convertToJSON(non_nullable_catalogs_currency_1);
	printf("non_nullable_catalogs_currency :\n%s\n", cJSON_Print(jsonnon_nullable_catalogs_currency_1));
	non_nullable_catalogs_currency_t* non_nullable_catalogs_currency_2 = non_nullable_catalogs_currency_parseFromJSON(jsonnon_nullable_catalogs_currency_1);
	cJSON* jsonnon_nullable_catalogs_currency_2 = non_nullable_catalogs_currency_convertToJSON(non_nullable_catalogs_currency_2);
	printf("repeating non_nullable_catalogs_currency:\n%s\n", cJSON_Print(jsonnon_nullable_catalogs_currency_2));
}

int main() {
  test_non_nullable_catalogs_currency(1);
  test_non_nullable_catalogs_currency(0);

  printf("Hello world \n");
  return 0;
}

#endif // non_nullable_catalogs_currency_MAIN
#endif // non_nullable_catalogs_currency_TEST
