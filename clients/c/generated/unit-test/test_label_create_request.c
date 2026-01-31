#ifndef label_create_request_TEST
#define label_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define label_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/label_create_request.h"
label_create_request_t* instantiate_label_create_request(int include_optional);



label_create_request_t* instantiate_label_create_request(int include_optional) {
  label_create_request_t* label_create_request = NULL;
  if (include_optional) {
    label_create_request = label_create_request_create(
      list_createList(),
      "626753052072"
    );
  } else {
    label_create_request = label_create_request_create(
      list_createList(),
      "626753052072"
    );
  }

  return label_create_request;
}


#ifdef label_create_request_MAIN

void test_label_create_request(int include_optional) {
    label_create_request_t* label_create_request_1 = instantiate_label_create_request(include_optional);

	cJSON* jsonlabel_create_request_1 = label_create_request_convertToJSON(label_create_request_1);
	printf("label_create_request :\n%s\n", cJSON_Print(jsonlabel_create_request_1));
	label_create_request_t* label_create_request_2 = label_create_request_parseFromJSON(jsonlabel_create_request_1);
	cJSON* jsonlabel_create_request_2 = label_create_request_convertToJSON(label_create_request_2);
	printf("repeating label_create_request:\n%s\n", cJSON_Print(jsonlabel_create_request_2));
}

int main() {
  test_label_create_request(1);
  test_label_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // label_create_request_MAIN
#endif // label_create_request_TEST
