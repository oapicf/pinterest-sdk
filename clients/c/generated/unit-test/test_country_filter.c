#ifndef country_filter_TEST
#define country_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define country_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/country_filter.h"
country_filter_t* instantiate_country_filter(int include_optional);



country_filter_t* instantiate_country_filter(int include_optional) {
  country_filter_t* country_filter = NULL;
  if (include_optional) {
    country_filter = country_filter_create(
      0
    );
  } else {
    country_filter = country_filter_create(
      0
    );
  }

  return country_filter;
}


#ifdef country_filter_MAIN

void test_country_filter(int include_optional) {
    country_filter_t* country_filter_1 = instantiate_country_filter(include_optional);

	cJSON* jsoncountry_filter_1 = country_filter_convertToJSON(country_filter_1);
	printf("country_filter :\n%s\n", cJSON_Print(jsoncountry_filter_1));
	country_filter_t* country_filter_2 = country_filter_parseFromJSON(jsoncountry_filter_1);
	cJSON* jsoncountry_filter_2 = country_filter_convertToJSON(country_filter_2);
	printf("repeating country_filter:\n%s\n", cJSON_Print(jsoncountry_filter_2));
}

int main() {
  test_country_filter(1);
  test_country_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // country_filter_MAIN
#endif // country_filter_TEST
