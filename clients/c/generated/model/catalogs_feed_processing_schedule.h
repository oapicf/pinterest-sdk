/*
 * catalogs_feed_processing_schedule.h
 *
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 */

#ifndef _catalogs_feed_processing_schedule_H_
#define _catalogs_feed_processing_schedule_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_processing_schedule_t catalogs_feed_processing_schedule_t;

#include "catalogs_feed_processing_schedule_timezone.h"



typedef struct catalogs_feed_processing_schedule_t {
    char *time; // string
    catalogs_feed_processing_schedule_timezone_t *timezone; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_feed_processing_schedule_t;

__attribute__((deprecated)) catalogs_feed_processing_schedule_t *catalogs_feed_processing_schedule_create(
    char *time,
    catalogs_feed_processing_schedule_timezone_t *timezone
);

void catalogs_feed_processing_schedule_free(catalogs_feed_processing_schedule_t *catalogs_feed_processing_schedule);

catalogs_feed_processing_schedule_t *catalogs_feed_processing_schedule_parseFromJSON(cJSON *catalogs_feed_processing_scheduleJSON);

cJSON *catalogs_feed_processing_schedule_convertToJSON(catalogs_feed_processing_schedule_t *catalogs_feed_processing_schedule);

#endif /* _catalogs_feed_processing_schedule_H_ */

