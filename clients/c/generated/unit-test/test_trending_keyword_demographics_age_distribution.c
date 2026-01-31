#ifndef trending_keyword_demographics_age_distribution_TEST
#define trending_keyword_demographics_age_distribution_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define trending_keyword_demographics_age_distribution_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/trending_keyword_demographics_age_distribution.h"
trending_keyword_demographics_age_distribution_t* instantiate_trending_keyword_demographics_age_distribution(int include_optional);



trending_keyword_demographics_age_distribution_t* instantiate_trending_keyword_demographics_age_distribution(int include_optional) {
  trending_keyword_demographics_age_distribution_t* trending_keyword_demographics_age_distribution = NULL;
  if (include_optional) {
    trending_keyword_demographics_age_distribution = trending_keyword_demographics_age_distribution_create(
      pinterest_rest_api_trending_keyword_demographics_age_distribution_AGEDISTRIBUTION_18-24
    );
  } else {
    trending_keyword_demographics_age_distribution = trending_keyword_demographics_age_distribution_create(
      pinterest_rest_api_trending_keyword_demographics_age_distribution_AGEDISTRIBUTION_18-24
    );
  }

  return trending_keyword_demographics_age_distribution;
}


#ifdef trending_keyword_demographics_age_distribution_MAIN

void test_trending_keyword_demographics_age_distribution(int include_optional) {
    trending_keyword_demographics_age_distribution_t* trending_keyword_demographics_age_distribution_1 = instantiate_trending_keyword_demographics_age_distribution(include_optional);

	cJSON* jsontrending_keyword_demographics_age_distribution_1 = trending_keyword_demographics_age_distribution_convertToJSON(trending_keyword_demographics_age_distribution_1);
	printf("trending_keyword_demographics_age_distribution :\n%s\n", cJSON_Print(jsontrending_keyword_demographics_age_distribution_1));
	trending_keyword_demographics_age_distribution_t* trending_keyword_demographics_age_distribution_2 = trending_keyword_demographics_age_distribution_parseFromJSON(jsontrending_keyword_demographics_age_distribution_1);
	cJSON* jsontrending_keyword_demographics_age_distribution_2 = trending_keyword_demographics_age_distribution_convertToJSON(trending_keyword_demographics_age_distribution_2);
	printf("repeating trending_keyword_demographics_age_distribution:\n%s\n", cJSON_Print(jsontrending_keyword_demographics_age_distribution_2));
}

int main() {
  test_trending_keyword_demographics_age_distribution(1);
  test_trending_keyword_demographics_age_distribution(0);

  printf("Hello world \n");
  return 0;
}

#endif // trending_keyword_demographics_age_distribution_MAIN
#endif // trending_keyword_demographics_age_distribution_TEST
