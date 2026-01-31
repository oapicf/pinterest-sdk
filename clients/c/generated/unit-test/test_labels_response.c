#ifndef labels_response_TEST
#define labels_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define labels_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/labels_response.h"
labels_response_t* instantiate_labels_response(int include_optional);



labels_response_t* instantiate_labels_response(int include_optional) {
  labels_response_t* labels_response = NULL;
  if (include_optional) {
    labels_response = labels_response_create(
      list_createList(),
      list_createList()
    );
  } else {
    labels_response = labels_response_create(
      list_createList(),
      list_createList()
    );
  }

  return labels_response;
}


#ifdef labels_response_MAIN

void test_labels_response(int include_optional) {
    labels_response_t* labels_response_1 = instantiate_labels_response(include_optional);

	cJSON* jsonlabels_response_1 = labels_response_convertToJSON(labels_response_1);
	printf("labels_response :\n%s\n", cJSON_Print(jsonlabels_response_1));
	labels_response_t* labels_response_2 = labels_response_parseFromJSON(jsonlabels_response_1);
	cJSON* jsonlabels_response_2 = labels_response_convertToJSON(labels_response_2);
	printf("repeating labels_response:\n%s\n", cJSON_Print(jsonlabels_response_2));
}

int main() {
  test_labels_response(1);
  test_labels_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // labels_response_MAIN
#endif // labels_response_TEST
