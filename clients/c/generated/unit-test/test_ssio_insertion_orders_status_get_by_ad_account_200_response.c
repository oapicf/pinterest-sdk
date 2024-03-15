#ifndef ssio_insertion_orders_status_get_by_ad_account_200_response_TEST
#define ssio_insertion_orders_status_get_by_ad_account_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ssio_insertion_orders_status_get_by_ad_account_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ssio_insertion_orders_status_get_by_ad_account_200_response.h"
ssio_insertion_orders_status_get_by_ad_account_200_response_t* instantiate_ssio_insertion_orders_status_get_by_ad_account_200_response(int include_optional);



ssio_insertion_orders_status_get_by_ad_account_200_response_t* instantiate_ssio_insertion_orders_status_get_by_ad_account_200_response(int include_optional) {
  ssio_insertion_orders_status_get_by_ad_account_200_response_t* ssio_insertion_orders_status_get_by_ad_account_200_response = NULL;
  if (include_optional) {
    ssio_insertion_orders_status_get_by_ad_account_200_response = ssio_insertion_orders_status_get_by_ad_account_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    ssio_insertion_orders_status_get_by_ad_account_200_response = ssio_insertion_orders_status_get_by_ad_account_200_response_create(
      list_createList(),
      "0"
    );
  }

  return ssio_insertion_orders_status_get_by_ad_account_200_response;
}


#ifdef ssio_insertion_orders_status_get_by_ad_account_200_response_MAIN

void test_ssio_insertion_orders_status_get_by_ad_account_200_response(int include_optional) {
    ssio_insertion_orders_status_get_by_ad_account_200_response_t* ssio_insertion_orders_status_get_by_ad_account_200_response_1 = instantiate_ssio_insertion_orders_status_get_by_ad_account_200_response(include_optional);

	cJSON* jsonssio_insertion_orders_status_get_by_ad_account_200_response_1 = ssio_insertion_orders_status_get_by_ad_account_200_response_convertToJSON(ssio_insertion_orders_status_get_by_ad_account_200_response_1);
	printf("ssio_insertion_orders_status_get_by_ad_account_200_response :\n%s\n", cJSON_Print(jsonssio_insertion_orders_status_get_by_ad_account_200_response_1));
	ssio_insertion_orders_status_get_by_ad_account_200_response_t* ssio_insertion_orders_status_get_by_ad_account_200_response_2 = ssio_insertion_orders_status_get_by_ad_account_200_response_parseFromJSON(jsonssio_insertion_orders_status_get_by_ad_account_200_response_1);
	cJSON* jsonssio_insertion_orders_status_get_by_ad_account_200_response_2 = ssio_insertion_orders_status_get_by_ad_account_200_response_convertToJSON(ssio_insertion_orders_status_get_by_ad_account_200_response_2);
	printf("repeating ssio_insertion_orders_status_get_by_ad_account_200_response:\n%s\n", cJSON_Print(jsonssio_insertion_orders_status_get_by_ad_account_200_response_2));
}

int main() {
  test_ssio_insertion_orders_status_get_by_ad_account_200_response(1);
  test_ssio_insertion_orders_status_get_by_ad_account_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // ssio_insertion_orders_status_get_by_ad_account_200_response_MAIN
#endif // ssio_insertion_orders_status_get_by_ad_account_200_response_TEST
