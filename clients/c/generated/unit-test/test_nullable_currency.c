#ifndef nullable_currency_TEST
#define nullable_currency_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define nullable_currency_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/nullable_currency.h"
nullable_currency_t* instantiate_nullable_currency(int include_optional);



nullable_currency_t* instantiate_nullable_currency(int include_optional) {
  nullable_currency_t* nullable_currency = NULL;
  if (include_optional) {
    nullable_currency = nullable_currency_create(
    );
  } else {
    nullable_currency = nullable_currency_create(
    );
  }

  return nullable_currency;
}


#ifdef nullable_currency_MAIN

void test_nullable_currency(int include_optional) {
    nullable_currency_t* nullable_currency_1 = instantiate_nullable_currency(include_optional);

	cJSON* jsonnullable_currency_1 = nullable_currency_convertToJSON(nullable_currency_1);
	printf("nullable_currency :\n%s\n", cJSON_Print(jsonnullable_currency_1));
	nullable_currency_t* nullable_currency_2 = nullable_currency_parseFromJSON(jsonnullable_currency_1);
	cJSON* jsonnullable_currency_2 = nullable_currency_convertToJSON(nullable_currency_2);
	printf("repeating nullable_currency:\n%s\n", cJSON_Print(jsonnullable_currency_2));
}

int main() {
  test_nullable_currency(1);
  test_nullable_currency(0);

  printf("Hello world \n");
  return 0;
}

#endif // nullable_currency_MAIN
#endif // nullable_currency_TEST
