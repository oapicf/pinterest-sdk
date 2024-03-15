#ifndef ad_country_TEST
#define ad_country_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_country_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_country.h"
ad_country_t* instantiate_ad_country(int include_optional);



ad_country_t* instantiate_ad_country(int include_optional) {
  ad_country_t* ad_country = NULL;
  if (include_optional) {
    ad_country = ad_country_create(
    );
  } else {
    ad_country = ad_country_create(
    );
  }

  return ad_country;
}


#ifdef ad_country_MAIN

void test_ad_country(int include_optional) {
    ad_country_t* ad_country_1 = instantiate_ad_country(include_optional);

	cJSON* jsonad_country_1 = ad_country_convertToJSON(ad_country_1);
	printf("ad_country :\n%s\n", cJSON_Print(jsonad_country_1));
	ad_country_t* ad_country_2 = ad_country_parseFromJSON(jsonad_country_1);
	cJSON* jsonad_country_2 = ad_country_convertToJSON(ad_country_2);
	printf("repeating ad_country:\n%s\n", cJSON_Print(jsonad_country_2));
}

int main() {
  test_ad_country(1);
  test_ad_country(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_country_MAIN
#endif // ad_country_TEST
