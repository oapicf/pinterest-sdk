#ifndef targeting_template_keyword_TEST
#define targeting_template_keyword_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_template_keyword_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_template_keyword.h"
targeting_template_keyword_t* instantiate_targeting_template_keyword(int include_optional);



targeting_template_keyword_t* instantiate_targeting_template_keyword(int include_optional) {
  targeting_template_keyword_t* targeting_template_keyword = NULL;
  if (include_optional) {
    targeting_template_keyword = targeting_template_keyword_create(
      pinterest_rest_api_targeting_template_keyword__"BROAD",
      "couples halloween costumes"
    );
  } else {
    targeting_template_keyword = targeting_template_keyword_create(
      pinterest_rest_api_targeting_template_keyword__"BROAD",
      "couples halloween costumes"
    );
  }

  return targeting_template_keyword;
}


#ifdef targeting_template_keyword_MAIN

void test_targeting_template_keyword(int include_optional) {
    targeting_template_keyword_t* targeting_template_keyword_1 = instantiate_targeting_template_keyword(include_optional);

	cJSON* jsontargeting_template_keyword_1 = targeting_template_keyword_convertToJSON(targeting_template_keyword_1);
	printf("targeting_template_keyword :\n%s\n", cJSON_Print(jsontargeting_template_keyword_1));
	targeting_template_keyword_t* targeting_template_keyword_2 = targeting_template_keyword_parseFromJSON(jsontargeting_template_keyword_1);
	cJSON* jsontargeting_template_keyword_2 = targeting_template_keyword_convertToJSON(targeting_template_keyword_2);
	printf("repeating targeting_template_keyword:\n%s\n", cJSON_Print(jsontargeting_template_keyword_2));
}

int main() {
  test_targeting_template_keyword(1);
  test_targeting_template_keyword(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_template_keyword_MAIN
#endif // targeting_template_keyword_TEST
