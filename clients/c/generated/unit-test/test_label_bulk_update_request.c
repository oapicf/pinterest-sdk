#ifndef label_bulk_update_request_TEST
#define label_bulk_update_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define label_bulk_update_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/label_bulk_update_request.h"
label_bulk_update_request_t* instantiate_label_bulk_update_request(int include_optional);



label_bulk_update_request_t* instantiate_label_bulk_update_request(int include_optional) {
  label_bulk_update_request_t* label_bulk_update_request = NULL;
  if (include_optional) {
    label_bulk_update_request = label_bulk_update_request_create(
      "1106385754497",
      pinterest_rest_api_label_bulk_update_request_STATUS_"ARCHIVED",
      "0"
    );
  } else {
    label_bulk_update_request = label_bulk_update_request_create(
      "1106385754497",
      pinterest_rest_api_label_bulk_update_request_STATUS_"ARCHIVED",
      "0"
    );
  }

  return label_bulk_update_request;
}


#ifdef label_bulk_update_request_MAIN

void test_label_bulk_update_request(int include_optional) {
    label_bulk_update_request_t* label_bulk_update_request_1 = instantiate_label_bulk_update_request(include_optional);

	cJSON* jsonlabel_bulk_update_request_1 = label_bulk_update_request_convertToJSON(label_bulk_update_request_1);
	printf("label_bulk_update_request :\n%s\n", cJSON_Print(jsonlabel_bulk_update_request_1));
	label_bulk_update_request_t* label_bulk_update_request_2 = label_bulk_update_request_parseFromJSON(jsonlabel_bulk_update_request_1);
	cJSON* jsonlabel_bulk_update_request_2 = label_bulk_update_request_convertToJSON(label_bulk_update_request_2);
	printf("repeating label_bulk_update_request:\n%s\n", cJSON_Print(jsonlabel_bulk_update_request_2));
}

int main() {
  test_label_bulk_update_request(1);
  test_label_bulk_update_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // label_bulk_update_request_MAIN
#endif // label_bulk_update_request_TEST
