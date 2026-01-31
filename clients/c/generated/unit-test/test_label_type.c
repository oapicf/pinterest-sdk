#ifndef label_type_TEST
#define label_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define label_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/label_type.h"
label_type_t* instantiate_label_type(int include_optional);



label_type_t* instantiate_label_type(int include_optional) {
  label_type_t* label_type = NULL;
  if (include_optional) {
    label_type = label_type_create(
    );
  } else {
    label_type = label_type_create(
    );
  }

  return label_type;
}


#ifdef label_type_MAIN

void test_label_type(int include_optional) {
    label_type_t* label_type_1 = instantiate_label_type(include_optional);

	cJSON* jsonlabel_type_1 = label_type_convertToJSON(label_type_1);
	printf("label_type :\n%s\n", cJSON_Print(jsonlabel_type_1));
	label_type_t* label_type_2 = label_type_parseFromJSON(jsonlabel_type_1);
	cJSON* jsonlabel_type_2 = label_type_convertToJSON(label_type_2);
	printf("repeating label_type:\n%s\n", cJSON_Print(jsonlabel_type_2));
}

int main() {
  test_label_type(1);
  test_label_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // label_type_MAIN
#endif // label_type_TEST
