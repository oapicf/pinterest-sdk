#ifndef country_TEST
#define country_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define country_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/country.h"
country_t* instantiate_country(int include_optional);



country_t* instantiate_country(int include_optional) {
  country_t* country = NULL;
  if (include_optional) {
    country = country_create(
    );
  } else {
    country = country_create(
    );
  }

  return country;
}


#ifdef country_MAIN

void test_country(int include_optional) {
    country_t* country_1 = instantiate_country(include_optional);

	cJSON* jsoncountry_1 = country_convertToJSON(country_1);
	printf("country :\n%s\n", cJSON_Print(jsoncountry_1));
	country_t* country_2 = country_parseFromJSON(jsoncountry_1);
	cJSON* jsoncountry_2 = country_convertToJSON(country_2);
	printf("repeating country:\n%s\n", cJSON_Print(jsoncountry_2));
}

int main() {
  test_country(1);
  test_country(0);

  printf("Hello world \n");
  return 0;
}

#endif // country_MAIN
#endif // country_TEST
