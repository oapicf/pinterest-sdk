/*
 * attribution_windows.h
 *
 * 
 */

#ifndef _attribution_windows_H_
#define _attribution_windows_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct attribution_windows_t attribution_windows_t;




typedef struct attribution_windows_t {
    int *click_window_days; //numeric
    int *engagement_window_days; //numeric
    int *view_window_days; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} attribution_windows_t;

__attribute__((deprecated)) attribution_windows_t *attribution_windows_create(
    int *click_window_days,
    int *engagement_window_days,
    int *view_window_days
);

void attribution_windows_free(attribution_windows_t *attribution_windows);

attribution_windows_t *attribution_windows_parseFromJSON(cJSON *attribution_windowsJSON);

cJSON *attribution_windows_convertToJSON(attribution_windows_t *attribution_windows);

#endif /* _attribution_windows_H_ */

