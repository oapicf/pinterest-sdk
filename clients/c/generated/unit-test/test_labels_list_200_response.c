#ifndef labels_list_200_response_TEST
#define labels_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define labels_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/labels_list_200_response.h"
labels_list_200_response_t* instantiate_labels_list_200_response(int include_optional);



labels_list_200_response_t* instantiate_labels_list_200_response(int include_optional) {
  labels_list_200_response_t* labels_list_200_response = NULL;
  if (include_optional) {
    labels_list_200_response = labels_list_200_response_create(
      "0",
      list_createList()
    );
  } else {
    labels_list_200_response = labels_list_200_response_create(
      "0",
      list_createList()
    );
  }

  return labels_list_200_response;
}


#ifdef labels_list_200_response_MAIN

void test_labels_list_200_response(int include_optional) {
    labels_list_200_response_t* labels_list_200_response_1 = instantiate_labels_list_200_response(include_optional);

	cJSON* jsonlabels_list_200_response_1 = labels_list_200_response_convertToJSON(labels_list_200_response_1);
	printf("labels_list_200_response :\n%s\n", cJSON_Print(jsonlabels_list_200_response_1));
	labels_list_200_response_t* labels_list_200_response_2 = labels_list_200_response_parseFromJSON(jsonlabels_list_200_response_1);
	cJSON* jsonlabels_list_200_response_2 = labels_list_200_response_convertToJSON(labels_list_200_response_2);
	printf("repeating labels_list_200_response:\n%s\n", cJSON_Print(jsonlabels_list_200_response_2));
}

int main() {
  test_labels_list_200_response(1);
  test_labels_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // labels_list_200_response_MAIN
#endif // labels_list_200_response_TEST
