/*
 * catalogs_feed_video_counts.h
 *
 * Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 */

#ifndef _catalogs_feed_video_counts_H_
#define _catalogs_feed_video_counts_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_video_counts_t catalogs_feed_video_counts_t;




typedef struct catalogs_feed_video_counts_t {
    int *ingested_videos; //numeric
    int *not_ingested_videos; //numeric
    int *total_videos; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_feed_video_counts_t;

__attribute__((deprecated)) catalogs_feed_video_counts_t *catalogs_feed_video_counts_create(
    int *ingested_videos,
    int *not_ingested_videos,
    int *total_videos
);

void catalogs_feed_video_counts_free(catalogs_feed_video_counts_t *catalogs_feed_video_counts);

catalogs_feed_video_counts_t *catalogs_feed_video_counts_parseFromJSON(cJSON *catalogs_feed_video_countsJSON);

cJSON *catalogs_feed_video_counts_convertToJSON(catalogs_feed_video_counts_t *catalogs_feed_video_counts);

#endif /* _catalogs_feed_video_counts_H_ */

