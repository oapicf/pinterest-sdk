#ifndef ad_accounts_country_response_data_TEST
#define ad_accounts_country_response_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_accounts_country_response_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_accounts_country_response_data.h"
ad_accounts_country_response_data_t* instantiate_ad_accounts_country_response_data(int include_optional);



ad_accounts_country_response_data_t* instantiate_ad_accounts_country_response_data(int include_optional) {
  ad_accounts_country_response_data_t* ad_accounts_country_response_data = NULL;
  if (include_optional) {
    ad_accounts_country_response_data = ad_accounts_country_response_data_create(
      pinterest_rest_api_ad_accounts_country_response_data__"US",
      "Dollars",
      1,
      "United States of America"
    );
  } else {
    ad_accounts_country_response_data = ad_accounts_country_response_data_create(
      pinterest_rest_api_ad_accounts_country_response_data__"US",
      "Dollars",
      1,
      "United States of America"
    );
  }

  return ad_accounts_country_response_data;
}


#ifdef ad_accounts_country_response_data_MAIN

void test_ad_accounts_country_response_data(int include_optional) {
    ad_accounts_country_response_data_t* ad_accounts_country_response_data_1 = instantiate_ad_accounts_country_response_data(include_optional);

	cJSON* jsonad_accounts_country_response_data_1 = ad_accounts_country_response_data_convertToJSON(ad_accounts_country_response_data_1);
	printf("ad_accounts_country_response_data :\n%s\n", cJSON_Print(jsonad_accounts_country_response_data_1));
	ad_accounts_country_response_data_t* ad_accounts_country_response_data_2 = ad_accounts_country_response_data_parseFromJSON(jsonad_accounts_country_response_data_1);
	cJSON* jsonad_accounts_country_response_data_2 = ad_accounts_country_response_data_convertToJSON(ad_accounts_country_response_data_2);
	printf("repeating ad_accounts_country_response_data:\n%s\n", cJSON_Print(jsonad_accounts_country_response_data_2));
}

int main() {
  test_ad_accounts_country_response_data(1);
  test_ad_accounts_country_response_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_accounts_country_response_data_MAIN
#endif // ad_accounts_country_response_data_TEST
