#ifndef data_status_TEST
#define data_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define data_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/data_status.h"
data_status_t* instantiate_data_status(int include_optional);



data_status_t* instantiate_data_status(int include_optional) {
  data_status_t* data_status = NULL;
  if (include_optional) {
    data_status = data_status_create(
    );
  } else {
    data_status = data_status_create(
    );
  }

  return data_status;
}


#ifdef data_status_MAIN

void test_data_status(int include_optional) {
    data_status_t* data_status_1 = instantiate_data_status(include_optional);

	cJSON* jsondata_status_1 = data_status_convertToJSON(data_status_1);
	printf("data_status :\n%s\n", cJSON_Print(jsondata_status_1));
	data_status_t* data_status_2 = data_status_parseFromJSON(jsondata_status_1);
	cJSON* jsondata_status_2 = data_status_convertToJSON(data_status_2);
	printf("repeating data_status:\n%s\n", cJSON_Print(jsondata_status_2));
}

int main() {
  test_data_status(1);
  test_data_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // data_status_MAIN
#endif // data_status_TEST
