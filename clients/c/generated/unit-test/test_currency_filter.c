#ifndef currency_filter_TEST
#define currency_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define currency_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/currency_filter.h"
currency_filter_t* instantiate_currency_filter(int include_optional);



currency_filter_t* instantiate_currency_filter(int include_optional) {
  currency_filter_t* currency_filter = NULL;
  if (include_optional) {
    currency_filter = currency_filter_create(
      0
    );
  } else {
    currency_filter = currency_filter_create(
      0
    );
  }

  return currency_filter;
}


#ifdef currency_filter_MAIN

void test_currency_filter(int include_optional) {
    currency_filter_t* currency_filter_1 = instantiate_currency_filter(include_optional);

	cJSON* jsoncurrency_filter_1 = currency_filter_convertToJSON(currency_filter_1);
	printf("currency_filter :\n%s\n", cJSON_Print(jsoncurrency_filter_1));
	currency_filter_t* currency_filter_2 = currency_filter_parseFromJSON(jsoncurrency_filter_1);
	cJSON* jsoncurrency_filter_2 = currency_filter_convertToJSON(currency_filter_2);
	printf("repeating currency_filter:\n%s\n", cJSON_Print(jsoncurrency_filter_2));
}

int main() {
  test_currency_filter(1);
  test_currency_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // currency_filter_MAIN
#endif // currency_filter_TEST
