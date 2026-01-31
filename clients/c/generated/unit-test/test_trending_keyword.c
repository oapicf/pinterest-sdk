#ifndef trending_keyword_TEST
#define trending_keyword_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define trending_keyword_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/trending_keyword.h"
trending_keyword_t* instantiate_trending_keyword(int include_optional);

#include "test_trending_keyword_demographics.c"


trending_keyword_t* instantiate_trending_keyword(int include_optional) {
  trending_keyword_t* trending_keyword = NULL;
  if (include_optional) {
    trending_keyword = trending_keyword_create(
       // false, not to have infinite recursion
      instantiate_trending_keyword_demographics(0),
      false,
      "couples halloween costumes",
      400,
      50,
      -5,
      {"2024-01-07":45,"2024-01-14":62,"2024-01-21":78,"2024-01-28":85},
      {"2023-10-10":31,"2023-10-17":54,"2023-10-24":77,"2023-10-31":100}
    );
  } else {
    trending_keyword = trending_keyword_create(
      NULL,
      false,
      "couples halloween costumes",
      400,
      50,
      -5,
      {"2024-01-07":45,"2024-01-14":62,"2024-01-21":78,"2024-01-28":85},
      {"2023-10-10":31,"2023-10-17":54,"2023-10-24":77,"2023-10-31":100}
    );
  }

  return trending_keyword;
}


#ifdef trending_keyword_MAIN

void test_trending_keyword(int include_optional) {
    trending_keyword_t* trending_keyword_1 = instantiate_trending_keyword(include_optional);

	cJSON* jsontrending_keyword_1 = trending_keyword_convertToJSON(trending_keyword_1);
	printf("trending_keyword :\n%s\n", cJSON_Print(jsontrending_keyword_1));
	trending_keyword_t* trending_keyword_2 = trending_keyword_parseFromJSON(jsontrending_keyword_1);
	cJSON* jsontrending_keyword_2 = trending_keyword_convertToJSON(trending_keyword_2);
	printf("repeating trending_keyword:\n%s\n", cJSON_Print(jsontrending_keyword_2));
}

int main() {
  test_trending_keyword(1);
  test_trending_keyword(0);

  printf("Hello world \n");
  return 0;
}

#endif // trending_keyword_MAIN
#endif // trending_keyword_TEST
