#ifndef label_create_request_labels_inner_TEST
#define label_create_request_labels_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define label_create_request_labels_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/label_create_request_labels_inner.h"
label_create_request_labels_inner_t* instantiate_label_create_request_labels_inner(int include_optional);



label_create_request_labels_inner_t* instantiate_label_create_request_labels_inner(int include_optional) {
  label_create_request_labels_inner_t* label_create_request_labels_inner = NULL;
  if (include_optional) {
    label_create_request_labels_inner = label_create_request_labels_inner_create(
      pinterest_rest_api_label_create_request_labels_inner__"BRAND",
      "0"
    );
  } else {
    label_create_request_labels_inner = label_create_request_labels_inner_create(
      pinterest_rest_api_label_create_request_labels_inner__"BRAND",
      "0"
    );
  }

  return label_create_request_labels_inner;
}


#ifdef label_create_request_labels_inner_MAIN

void test_label_create_request_labels_inner(int include_optional) {
    label_create_request_labels_inner_t* label_create_request_labels_inner_1 = instantiate_label_create_request_labels_inner(include_optional);

	cJSON* jsonlabel_create_request_labels_inner_1 = label_create_request_labels_inner_convertToJSON(label_create_request_labels_inner_1);
	printf("label_create_request_labels_inner :\n%s\n", cJSON_Print(jsonlabel_create_request_labels_inner_1));
	label_create_request_labels_inner_t* label_create_request_labels_inner_2 = label_create_request_labels_inner_parseFromJSON(jsonlabel_create_request_labels_inner_1);
	cJSON* jsonlabel_create_request_labels_inner_2 = label_create_request_labels_inner_convertToJSON(label_create_request_labels_inner_2);
	printf("repeating label_create_request_labels_inner:\n%s\n", cJSON_Print(jsonlabel_create_request_labels_inner_2));
}

int main() {
  test_label_create_request_labels_inner(1);
  test_label_create_request_labels_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // label_create_request_labels_inner_MAIN
#endif // label_create_request_labels_inner_TEST
