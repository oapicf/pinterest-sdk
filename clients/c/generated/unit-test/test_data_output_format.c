#ifndef data_output_format_TEST
#define data_output_format_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define data_output_format_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/data_output_format.h"
data_output_format_t* instantiate_data_output_format(int include_optional);



data_output_format_t* instantiate_data_output_format(int include_optional) {
  data_output_format_t* data_output_format = NULL;
  if (include_optional) {
    data_output_format = data_output_format_create(
    );
  } else {
    data_output_format = data_output_format_create(
    );
  }

  return data_output_format;
}


#ifdef data_output_format_MAIN

void test_data_output_format(int include_optional) {
    data_output_format_t* data_output_format_1 = instantiate_data_output_format(include_optional);

	cJSON* jsondata_output_format_1 = data_output_format_convertToJSON(data_output_format_1);
	printf("data_output_format :\n%s\n", cJSON_Print(jsondata_output_format_1));
	data_output_format_t* data_output_format_2 = data_output_format_parseFromJSON(jsondata_output_format_1);
	cJSON* jsondata_output_format_2 = data_output_format_convertToJSON(data_output_format_2);
	printf("repeating data_output_format:\n%s\n", cJSON_Print(jsondata_output_format_2));
}

int main() {
  test_data_output_format(1);
  test_data_output_format(0);

  printf("Hello world \n");
  return 0;
}

#endif // data_output_format_MAIN
#endif // data_output_format_TEST
