/*
 * performance_plus_campaign_settings.h
 *
 * Pinterest Performance+ campaign settings.
 */

#ifndef _performance_plus_campaign_settings_H_
#define _performance_plus_campaign_settings_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct performance_plus_campaign_settings_t performance_plus_campaign_settings_t;




typedef struct performance_plus_campaign_settings_t {
    int *boost_prospecting_ad_group_bid; //boolean
    list_t *pinner_list_exclusions; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} performance_plus_campaign_settings_t;

__attribute__((deprecated)) performance_plus_campaign_settings_t *performance_plus_campaign_settings_create(
    int *boost_prospecting_ad_group_bid,
    list_t *pinner_list_exclusions
);

void performance_plus_campaign_settings_free(performance_plus_campaign_settings_t *performance_plus_campaign_settings);

performance_plus_campaign_settings_t *performance_plus_campaign_settings_parseFromJSON(cJSON *performance_plus_campaign_settingsJSON);

cJSON *performance_plus_campaign_settings_convertToJSON(performance_plus_campaign_settings_t *performance_plus_campaign_settings);

#endif /* _performance_plus_campaign_settings_H_ */

