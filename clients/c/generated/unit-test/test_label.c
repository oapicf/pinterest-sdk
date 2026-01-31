#ifndef label_TEST
#define label_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define label_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/label.h"
label_t* instantiate_label(int include_optional);



label_t* instantiate_label(int include_optional) {
  label_t* label = NULL;
  if (include_optional) {
    label = label_create(
      "1106385754497",
      pinterest_rest_api_label__"BRAND",
      "626753052072",
      pinterest_rest_api_label_PARENTTYPE_"CAMPAIGN",
      pinterest_rest_api_label__"ACTIVE",
      "0"
    );
  } else {
    label = label_create(
      "1106385754497",
      pinterest_rest_api_label__"BRAND",
      "626753052072",
      pinterest_rest_api_label_PARENTTYPE_"CAMPAIGN",
      pinterest_rest_api_label__"ACTIVE",
      "0"
    );
  }

  return label;
}


#ifdef label_MAIN

void test_label(int include_optional) {
    label_t* label_1 = instantiate_label(include_optional);

	cJSON* jsonlabel_1 = label_convertToJSON(label_1);
	printf("label :\n%s\n", cJSON_Print(jsonlabel_1));
	label_t* label_2 = label_parseFromJSON(jsonlabel_1);
	cJSON* jsonlabel_2 = label_convertToJSON(label_2);
	printf("repeating label:\n%s\n", cJSON_Print(jsonlabel_2));
}

int main() {
  test_label(1);
  test_label(0);

  printf("Hello world \n");
  return 0;
}

#endif // label_MAIN
#endif // label_TEST
