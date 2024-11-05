/*
 * reports_stats_200_response.h
 *
 * 
 */

#ifndef _reports_stats_200_response_H_
#define _reports_stats_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct reports_stats_200_response_t reports_stats_200_response_t;

#include "catalogs_report_stats.h"



typedef struct reports_stats_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} reports_stats_200_response_t;

reports_stats_200_response_t *reports_stats_200_response_create(
    list_t *items,
    char *bookmark
);

void reports_stats_200_response_free(reports_stats_200_response_t *reports_stats_200_response);

reports_stats_200_response_t *reports_stats_200_response_parseFromJSON(cJSON *reports_stats_200_responseJSON);

cJSON *reports_stats_200_response_convertToJSON(reports_stats_200_response_t *reports_stats_200_response);

#endif /* _reports_stats_200_response_H_ */

