/*
 * trending_topic.h
 *
 * Individual trending topic within an interest category
 */

#ifndef _trending_topic_H_
#define _trending_topic_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trending_topic_t trending_topic_t;

#include "trending_pin.h"



typedef struct trending_topic_t {
    char *description; // string
    int percent_growth_mom; //numeric
    list_t *pins; //nonprimitive container
    list_t *related_interests; //primitive container
    list_t *related_searches; //primitive container
    list_t* time_series; //map
    char *title; // string

    int _library_owned; // Is the library responsible for freeing this object?
} trending_topic_t;

__attribute__((deprecated)) trending_topic_t *trending_topic_create(
    char *description,
    int percent_growth_mom,
    list_t *pins,
    list_t *related_interests,
    list_t *related_searches,
    list_t* time_series,
    char *title
);

void trending_topic_free(trending_topic_t *trending_topic);

trending_topic_t *trending_topic_parseFromJSON(cJSON *trending_topicJSON);

cJSON *trending_topic_convertToJSON(trending_topic_t *trending_topic);

#endif /* _trending_topic_H_ */

