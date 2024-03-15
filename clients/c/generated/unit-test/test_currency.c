#ifndef currency_TEST
#define currency_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define currency_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/currency.h"
currency_t* instantiate_currency(int include_optional);



currency_t* instantiate_currency(int include_optional) {
  currency_t* currency = NULL;
  if (include_optional) {
    currency = currency_create(
    );
  } else {
    currency = currency_create(
    );
  }

  return currency;
}


#ifdef currency_MAIN

void test_currency(int include_optional) {
    currency_t* currency_1 = instantiate_currency(include_optional);

	cJSON* jsoncurrency_1 = currency_convertToJSON(currency_1);
	printf("currency :\n%s\n", cJSON_Print(jsoncurrency_1));
	currency_t* currency_2 = currency_parseFromJSON(jsoncurrency_1);
	cJSON* jsoncurrency_2 = currency_convertToJSON(currency_2);
	printf("repeating currency:\n%s\n", cJSON_Print(jsoncurrency_2));
}

int main() {
  test_currency(1);
  test_currency(0);

  printf("Hello world \n");
  return 0;
}

#endif // currency_MAIN
#endif // currency_TEST
