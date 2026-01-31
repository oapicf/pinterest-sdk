#ifndef label_update_request_TEST
#define label_update_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define label_update_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/label_update_request.h"
label_update_request_t* instantiate_label_update_request(int include_optional);



label_update_request_t* instantiate_label_update_request(int include_optional) {
  label_update_request_t* label_update_request = NULL;
  if (include_optional) {
    label_update_request = label_update_request_create(
      list_createList()
    );
  } else {
    label_update_request = label_update_request_create(
      list_createList()
    );
  }

  return label_update_request;
}


#ifdef label_update_request_MAIN

void test_label_update_request(int include_optional) {
    label_update_request_t* label_update_request_1 = instantiate_label_update_request(include_optional);

	cJSON* jsonlabel_update_request_1 = label_update_request_convertToJSON(label_update_request_1);
	printf("label_update_request :\n%s\n", cJSON_Print(jsonlabel_update_request_1));
	label_update_request_t* label_update_request_2 = label_update_request_parseFromJSON(jsonlabel_update_request_1);
	cJSON* jsonlabel_update_request_2 = label_update_request_convertToJSON(label_update_request_2);
	printf("repeating label_update_request:\n%s\n", cJSON_Print(jsonlabel_update_request_2));
}

int main() {
  test_label_update_request(1);
  test_label_update_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // label_update_request_MAIN
#endif // label_update_request_TEST
