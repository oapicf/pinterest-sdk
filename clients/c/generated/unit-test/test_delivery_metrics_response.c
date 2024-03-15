#ifndef delivery_metrics_response_TEST
#define delivery_metrics_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delivery_metrics_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delivery_metrics_response.h"
delivery_metrics_response_t* instantiate_delivery_metrics_response(int include_optional);



delivery_metrics_response_t* instantiate_delivery_metrics_response(int include_optional) {
  delivery_metrics_response_t* delivery_metrics_response = NULL;
  if (include_optional) {
    delivery_metrics_response = delivery_metrics_response_create(
      list_createList()
    );
  } else {
    delivery_metrics_response = delivery_metrics_response_create(
      list_createList()
    );
  }

  return delivery_metrics_response;
}


#ifdef delivery_metrics_response_MAIN

void test_delivery_metrics_response(int include_optional) {
    delivery_metrics_response_t* delivery_metrics_response_1 = instantiate_delivery_metrics_response(include_optional);

	cJSON* jsondelivery_metrics_response_1 = delivery_metrics_response_convertToJSON(delivery_metrics_response_1);
	printf("delivery_metrics_response :\n%s\n", cJSON_Print(jsondelivery_metrics_response_1));
	delivery_metrics_response_t* delivery_metrics_response_2 = delivery_metrics_response_parseFromJSON(jsondelivery_metrics_response_1);
	cJSON* jsondelivery_metrics_response_2 = delivery_metrics_response_convertToJSON(delivery_metrics_response_2);
	printf("repeating delivery_metrics_response:\n%s\n", cJSON_Print(jsondelivery_metrics_response_2));
}

int main() {
  test_delivery_metrics_response(1);
  test_delivery_metrics_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // delivery_metrics_response_MAIN
#endif // delivery_metrics_response_TEST
