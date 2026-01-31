#ifndef label_update_request_labels_inner_TEST
#define label_update_request_labels_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define label_update_request_labels_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/label_update_request_labels_inner.h"
label_update_request_labels_inner_t* instantiate_label_update_request_labels_inner(int include_optional);



label_update_request_labels_inner_t* instantiate_label_update_request_labels_inner(int include_optional) {
  label_update_request_labels_inner_t* label_update_request_labels_inner = NULL;
  if (include_optional) {
    label_update_request_labels_inner = label_update_request_labels_inner_create(
      "1106385754497",
      pinterest_rest_api_label_update_request_labels_inner__"ACTIVE",
      "0"
    );
  } else {
    label_update_request_labels_inner = label_update_request_labels_inner_create(
      "1106385754497",
      pinterest_rest_api_label_update_request_labels_inner__"ACTIVE",
      "0"
    );
  }

  return label_update_request_labels_inner;
}


#ifdef label_update_request_labels_inner_MAIN

void test_label_update_request_labels_inner(int include_optional) {
    label_update_request_labels_inner_t* label_update_request_labels_inner_1 = instantiate_label_update_request_labels_inner(include_optional);

	cJSON* jsonlabel_update_request_labels_inner_1 = label_update_request_labels_inner_convertToJSON(label_update_request_labels_inner_1);
	printf("label_update_request_labels_inner :\n%s\n", cJSON_Print(jsonlabel_update_request_labels_inner_1));
	label_update_request_labels_inner_t* label_update_request_labels_inner_2 = label_update_request_labels_inner_parseFromJSON(jsonlabel_update_request_labels_inner_1);
	cJSON* jsonlabel_update_request_labels_inner_2 = label_update_request_labels_inner_convertToJSON(label_update_request_labels_inner_2);
	printf("repeating label_update_request_labels_inner:\n%s\n", cJSON_Print(jsonlabel_update_request_labels_inner_2));
}

int main() {
  test_label_update_request_labels_inner(1);
  test_label_update_request_labels_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // label_update_request_labels_inner_MAIN
#endif // label_update_request_labels_inner_TEST
