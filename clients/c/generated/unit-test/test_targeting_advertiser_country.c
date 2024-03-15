#ifndef targeting_advertiser_country_TEST
#define targeting_advertiser_country_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_advertiser_country_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_advertiser_country.h"
targeting_advertiser_country_t* instantiate_targeting_advertiser_country(int include_optional);



targeting_advertiser_country_t* instantiate_targeting_advertiser_country(int include_optional) {
  targeting_advertiser_country_t* targeting_advertiser_country = NULL;
  if (include_optional) {
    targeting_advertiser_country = targeting_advertiser_country_create(
    );
  } else {
    targeting_advertiser_country = targeting_advertiser_country_create(
    );
  }

  return targeting_advertiser_country;
}


#ifdef targeting_advertiser_country_MAIN

void test_targeting_advertiser_country(int include_optional) {
    targeting_advertiser_country_t* targeting_advertiser_country_1 = instantiate_targeting_advertiser_country(include_optional);

	cJSON* jsontargeting_advertiser_country_1 = targeting_advertiser_country_convertToJSON(targeting_advertiser_country_1);
	printf("targeting_advertiser_country :\n%s\n", cJSON_Print(jsontargeting_advertiser_country_1));
	targeting_advertiser_country_t* targeting_advertiser_country_2 = targeting_advertiser_country_parseFromJSON(jsontargeting_advertiser_country_1);
	cJSON* jsontargeting_advertiser_country_2 = targeting_advertiser_country_convertToJSON(targeting_advertiser_country_2);
	printf("repeating targeting_advertiser_country:\n%s\n", cJSON_Print(jsontargeting_advertiser_country_2));
}

int main() {
  test_targeting_advertiser_country(1);
  test_targeting_advertiser_country(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_advertiser_country_MAIN
#endif // targeting_advertiser_country_TEST
