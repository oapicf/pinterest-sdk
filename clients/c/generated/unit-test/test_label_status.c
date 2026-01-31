#ifndef label_status_TEST
#define label_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define label_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/label_status.h"
label_status_t* instantiate_label_status(int include_optional);



label_status_t* instantiate_label_status(int include_optional) {
  label_status_t* label_status = NULL;
  if (include_optional) {
    label_status = label_status_create(
    );
  } else {
    label_status = label_status_create(
    );
  }

  return label_status;
}


#ifdef label_status_MAIN

void test_label_status(int include_optional) {
    label_status_t* label_status_1 = instantiate_label_status(include_optional);

	cJSON* jsonlabel_status_1 = label_status_convertToJSON(label_status_1);
	printf("label_status :\n%s\n", cJSON_Print(jsonlabel_status_1));
	label_status_t* label_status_2 = label_status_parseFromJSON(jsonlabel_status_1);
	cJSON* jsonlabel_status_2 = label_status_convertToJSON(label_status_2);
	printf("repeating label_status:\n%s\n", cJSON_Print(jsonlabel_status_2));
}

int main() {
  test_label_status(1);
  test_label_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // label_status_MAIN
#endif // label_status_TEST
