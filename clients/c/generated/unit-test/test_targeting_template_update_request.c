#ifndef targeting_template_update_request_TEST
#define targeting_template_update_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_template_update_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_template_update_request.h"
targeting_template_update_request_t* instantiate_targeting_template_update_request(int include_optional);



targeting_template_update_request_t* instantiate_targeting_template_update_request(int include_optional) {
  targeting_template_update_request_t* targeting_template_update_request = NULL;
  if (include_optional) {
    targeting_template_update_request = targeting_template_update_request_create(
      pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_REMOVE,
      "643"
    );
  } else {
    targeting_template_update_request = targeting_template_update_request_create(
      pinterest_rest_api_targeting_template_update_request_OPERATIONTYPE_REMOVE,
      "643"
    );
  }

  return targeting_template_update_request;
}


#ifdef targeting_template_update_request_MAIN

void test_targeting_template_update_request(int include_optional) {
    targeting_template_update_request_t* targeting_template_update_request_1 = instantiate_targeting_template_update_request(include_optional);

	cJSON* jsontargeting_template_update_request_1 = targeting_template_update_request_convertToJSON(targeting_template_update_request_1);
	printf("targeting_template_update_request :\n%s\n", cJSON_Print(jsontargeting_template_update_request_1));
	targeting_template_update_request_t* targeting_template_update_request_2 = targeting_template_update_request_parseFromJSON(jsontargeting_template_update_request_1);
	cJSON* jsontargeting_template_update_request_2 = targeting_template_update_request_convertToJSON(targeting_template_update_request_2);
	printf("repeating targeting_template_update_request:\n%s\n", cJSON_Print(jsontargeting_template_update_request_2));
}

int main() {
  test_targeting_template_update_request(1);
  test_targeting_template_update_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_template_update_request_MAIN
#endif // targeting_template_update_request_TEST
