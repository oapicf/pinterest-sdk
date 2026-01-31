#ifndef trending_keyword_demographics_TEST
#define trending_keyword_demographics_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define trending_keyword_demographics_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/trending_keyword_demographics.h"
trending_keyword_demographics_t* instantiate_trending_keyword_demographics(int include_optional);



trending_keyword_demographics_t* instantiate_trending_keyword_demographics(int include_optional) {
  trending_keyword_demographics_t* trending_keyword_demographics = NULL;
  if (include_optional) {
    trending_keyword_demographics = trending_keyword_demographics_create(
      {"18-24":0.36,"25-34":0.38,"35-44":0.16,"45-49":0.04,"50-54":0.04,"55-64":0.04,"65+":0.04},
      {"female":0.85,"male":0.09,"unspecified":0.06}
    );
  } else {
    trending_keyword_demographics = trending_keyword_demographics_create(
      {"18-24":0.36,"25-34":0.38,"35-44":0.16,"45-49":0.04,"50-54":0.04,"55-64":0.04,"65+":0.04},
      {"female":0.85,"male":0.09,"unspecified":0.06}
    );
  }

  return trending_keyword_demographics;
}


#ifdef trending_keyword_demographics_MAIN

void test_trending_keyword_demographics(int include_optional) {
    trending_keyword_demographics_t* trending_keyword_demographics_1 = instantiate_trending_keyword_demographics(include_optional);

	cJSON* jsontrending_keyword_demographics_1 = trending_keyword_demographics_convertToJSON(trending_keyword_demographics_1);
	printf("trending_keyword_demographics :\n%s\n", cJSON_Print(jsontrending_keyword_demographics_1));
	trending_keyword_demographics_t* trending_keyword_demographics_2 = trending_keyword_demographics_parseFromJSON(jsontrending_keyword_demographics_1);
	cJSON* jsontrending_keyword_demographics_2 = trending_keyword_demographics_convertToJSON(trending_keyword_demographics_2);
	printf("repeating trending_keyword_demographics:\n%s\n", cJSON_Print(jsontrending_keyword_demographics_2));
}

int main() {
  test_trending_keyword_demographics(1);
  test_trending_keyword_demographics(0);

  printf("Hello world \n");
  return 0;
}

#endif // trending_keyword_demographics_MAIN
#endif // trending_keyword_demographics_TEST
