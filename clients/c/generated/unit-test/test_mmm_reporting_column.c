#ifndef mmm_reporting_column_TEST
#define mmm_reporting_column_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define mmm_reporting_column_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/mmm_reporting_column.h"
mmm_reporting_column_t* instantiate_mmm_reporting_column(int include_optional);



mmm_reporting_column_t* instantiate_mmm_reporting_column(int include_optional) {
  mmm_reporting_column_t* mmm_reporting_column = NULL;
  if (include_optional) {
    mmm_reporting_column = mmm_reporting_column_create(
    );
  } else {
    mmm_reporting_column = mmm_reporting_column_create(
    );
  }

  return mmm_reporting_column;
}


#ifdef mmm_reporting_column_MAIN

void test_mmm_reporting_column(int include_optional) {
    mmm_reporting_column_t* mmm_reporting_column_1 = instantiate_mmm_reporting_column(include_optional);

	cJSON* jsonmmm_reporting_column_1 = mmm_reporting_column_convertToJSON(mmm_reporting_column_1);
	printf("mmm_reporting_column :\n%s\n", cJSON_Print(jsonmmm_reporting_column_1));
	mmm_reporting_column_t* mmm_reporting_column_2 = mmm_reporting_column_parseFromJSON(jsonmmm_reporting_column_1);
	cJSON* jsonmmm_reporting_column_2 = mmm_reporting_column_convertToJSON(mmm_reporting_column_2);
	printf("repeating mmm_reporting_column:\n%s\n", cJSON_Print(jsonmmm_reporting_column_2));
}

int main() {
  test_mmm_reporting_column(1);
  test_mmm_reporting_column(0);

  printf("Hello world \n");
  return 0;
}

#endif // mmm_reporting_column_MAIN
#endif // mmm_reporting_column_TEST
