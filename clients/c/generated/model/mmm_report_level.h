/*
 * mmm_report_level.h
 *
 * 
 */

#ifndef _mmm_report_level_H_
#define _mmm_report_level_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct mmm_report_level_t mmm_report_level_t;


// Enum  for mmm_report_level

typedef enum { pinterest_rest_api_mmm_report_level__NULL = 0, pinterest_rest_api_mmm_report_level__CAMPAIGN_TARGETING, pinterest_rest_api_mmm_report_level__AD_GROUP_TARGETING } pinterest_rest_api_mmm_report_level__e;

char* mmm_report_level_mmm_report_level_ToString(pinterest_rest_api_mmm_report_level__e mmm_report_level);

pinterest_rest_api_mmm_report_level__e mmm_report_level_mmm_report_level_FromString(char* mmm_report_level);

cJSON *mmm_report_level_convertToJSON(pinterest_rest_api_mmm_report_level__e mmm_report_level);

pinterest_rest_api_mmm_report_level__e mmm_report_level_parseFromJSON(cJSON *mmm_report_levelJSON);

#endif /* _mmm_report_level_H_ */

