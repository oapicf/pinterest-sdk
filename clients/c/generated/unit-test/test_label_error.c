#ifndef label_error_TEST
#define label_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define label_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/label_error.h"
label_error_t* instantiate_label_error(int include_optional);

#include "test_label.c"


label_error_t* instantiate_label_error(int include_optional) {
  label_error_t* label_error = NULL;
  if (include_optional) {
    label_error = label_error_create(
       // false, not to have infinite recursion
      instantiate_label(0),
      list_createList()
    );
  } else {
    label_error = label_error_create(
      NULL,
      list_createList()
    );
  }

  return label_error;
}


#ifdef label_error_MAIN

void test_label_error(int include_optional) {
    label_error_t* label_error_1 = instantiate_label_error(include_optional);

	cJSON* jsonlabel_error_1 = label_error_convertToJSON(label_error_1);
	printf("label_error :\n%s\n", cJSON_Print(jsonlabel_error_1));
	label_error_t* label_error_2 = label_error_parseFromJSON(jsonlabel_error_1);
	cJSON* jsonlabel_error_2 = label_error_convertToJSON(label_error_2);
	printf("repeating label_error:\n%s\n", cJSON_Print(jsonlabel_error_2));
}

int main() {
  test_label_error(1);
  test_label_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // label_error_MAIN
#endif // label_error_TEST
