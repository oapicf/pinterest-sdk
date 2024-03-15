/*
 * language.h
 *
 * Language code, which is among the offical ISO 639-1 language list.
 */

#ifndef _language_H_
#define _language_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct language_t language_t;


// Enum  for language

typedef enum { pinterest_rest_api_language__NULL = 0, pinterest_rest_api_language__AM, pinterest_rest_api_language__AR, pinterest_rest_api_language__AZ, pinterest_rest_api_language__BG, pinterest_rest_api_language__BN, pinterest_rest_api_language__BS, pinterest_rest_api_language__CA, pinterest_rest_api_language__CS, pinterest_rest_api_language__DA, pinterest_rest_api_language__DV, pinterest_rest_api_language__DZ, pinterest_rest_api_language__DE, pinterest_rest_api_language__EL, pinterest_rest_api_language__EN, pinterest_rest_api_language__ES, pinterest_rest_api_language__ET, pinterest_rest_api_language__FA, pinterest_rest_api_language__FI, pinterest_rest_api_language__FR, pinterest_rest_api_language__HE, pinterest_rest_api_language__HI, pinterest_rest_api_language__HR, pinterest_rest_api_language__HU, pinterest_rest_api_language__HY, pinterest_rest_api_language__ID, pinterest_rest_api_language__IN, pinterest_rest_api_language__IS, pinterest_rest_api_language__IT, pinterest_rest_api_language__IW, pinterest_rest_api_language__JA, pinterest_rest_api_language__KA, pinterest_rest_api_language__KM, pinterest_rest_api_language__KO, pinterest_rest_api_language__LO, pinterest_rest_api_language__LT, pinterest_rest_api_language__LV, pinterest_rest_api_language__MK, pinterest_rest_api_language__MN, pinterest_rest_api_language__MS, pinterest_rest_api_language__MY, pinterest_rest_api_language__NB, pinterest_rest_api_language__NE, pinterest_rest_api_language__NL, pinterest_rest_api_language__NO, pinterest_rest_api_language__PL, pinterest_rest_api_language__PT, pinterest_rest_api_language__RO, pinterest_rest_api_language__RU, pinterest_rest_api_language__SK, pinterest_rest_api_language__SL, pinterest_rest_api_language__SQ, pinterest_rest_api_language__SR, pinterest_rest_api_language__SV, pinterest_rest_api_language__TL, pinterest_rest_api_language__UK, pinterest_rest_api_language__VI, pinterest_rest_api_language__TE, pinterest_rest_api_language__TH, pinterest_rest_api_language__TR, pinterest_rest_api_language__XX, pinterest_rest_api_language__ZH } pinterest_rest_api_language__e;

char* language_language_ToString(pinterest_rest_api_language__e language);

pinterest_rest_api_language__e language_language_FromString(char* language);

//cJSON *language_language_convertToJSON(pinterest_rest_api_language__e language);

//pinterest_rest_api_language__e language_language_parseFromJSON(cJSON *languageJSON);

#endif /* _language_H_ */

