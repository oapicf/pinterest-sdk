#ifndef lead_form_question_TEST
#define lead_form_question_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define lead_form_question_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/lead_form_question.h"
lead_form_question_t* instantiate_lead_form_question(int include_optional);



lead_form_question_t* instantiate_lead_form_question(int include_optional) {
  lead_form_question_t* lead_form_question = NULL;
  if (include_optional) {
    lead_form_question = lead_form_question_create(
      pinterest_rest_api_lead_form_question__"FIRST_NAME",
      pinterest_rest_api_lead_form_question__"RADIO_LIST",
      "0",
      list_createList()
    );
  } else {
    lead_form_question = lead_form_question_create(
      pinterest_rest_api_lead_form_question__"FIRST_NAME",
      pinterest_rest_api_lead_form_question__"RADIO_LIST",
      "0",
      list_createList()
    );
  }

  return lead_form_question;
}


#ifdef lead_form_question_MAIN

void test_lead_form_question(int include_optional) {
    lead_form_question_t* lead_form_question_1 = instantiate_lead_form_question(include_optional);

	cJSON* jsonlead_form_question_1 = lead_form_question_convertToJSON(lead_form_question_1);
	printf("lead_form_question :\n%s\n", cJSON_Print(jsonlead_form_question_1));
	lead_form_question_t* lead_form_question_2 = lead_form_question_parseFromJSON(jsonlead_form_question_1);
	cJSON* jsonlead_form_question_2 = lead_form_question_convertToJSON(lead_form_question_2);
	printf("repeating lead_form_question:\n%s\n", cJSON_Print(jsonlead_form_question_2));
}

int main() {
  test_lead_form_question(1);
  test_lead_form_question(0);

  printf("Hello world \n");
  return 0;
}

#endif // lead_form_question_MAIN
#endif // lead_form_question_TEST
