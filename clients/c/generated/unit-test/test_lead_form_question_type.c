#ifndef lead_form_question_type_TEST
#define lead_form_question_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define lead_form_question_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/lead_form_question_type.h"
lead_form_question_type_t* instantiate_lead_form_question_type(int include_optional);



lead_form_question_type_t* instantiate_lead_form_question_type(int include_optional) {
  lead_form_question_type_t* lead_form_question_type = NULL;
  if (include_optional) {
    lead_form_question_type = lead_form_question_type_create(
    );
  } else {
    lead_form_question_type = lead_form_question_type_create(
    );
  }

  return lead_form_question_type;
}


#ifdef lead_form_question_type_MAIN

void test_lead_form_question_type(int include_optional) {
    lead_form_question_type_t* lead_form_question_type_1 = instantiate_lead_form_question_type(include_optional);

	cJSON* jsonlead_form_question_type_1 = lead_form_question_type_convertToJSON(lead_form_question_type_1);
	printf("lead_form_question_type :\n%s\n", cJSON_Print(jsonlead_form_question_type_1));
	lead_form_question_type_t* lead_form_question_type_2 = lead_form_question_type_parseFromJSON(jsonlead_form_question_type_1);
	cJSON* jsonlead_form_question_type_2 = lead_form_question_type_convertToJSON(lead_form_question_type_2);
	printf("repeating lead_form_question_type:\n%s\n", cJSON_Print(jsonlead_form_question_type_2));
}

int main() {
  test_lead_form_question_type(1);
  test_lead_form_question_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // lead_form_question_type_MAIN
#endif // lead_form_question_type_TEST
