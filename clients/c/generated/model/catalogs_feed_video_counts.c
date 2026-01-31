#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_video_counts.h"



static catalogs_feed_video_counts_t *catalogs_feed_video_counts_create_internal(
    int ingested_videos,
    int not_ingested_videos,
    int total_videos
    ) {
    catalogs_feed_video_counts_t *catalogs_feed_video_counts_local_var = malloc(sizeof(catalogs_feed_video_counts_t));
    if (!catalogs_feed_video_counts_local_var) {
        return NULL;
    }
    catalogs_feed_video_counts_local_var->ingested_videos = ingested_videos;
    catalogs_feed_video_counts_local_var->not_ingested_videos = not_ingested_videos;
    catalogs_feed_video_counts_local_var->total_videos = total_videos;

    catalogs_feed_video_counts_local_var->_library_owned = 1;
    return catalogs_feed_video_counts_local_var;
}

__attribute__((deprecated)) catalogs_feed_video_counts_t *catalogs_feed_video_counts_create(
    int ingested_videos,
    int not_ingested_videos,
    int total_videos
    ) {
    return catalogs_feed_video_counts_create_internal (
        ingested_videos,
        not_ingested_videos,
        total_videos
        );
}

void catalogs_feed_video_counts_free(catalogs_feed_video_counts_t *catalogs_feed_video_counts) {
    if(NULL == catalogs_feed_video_counts){
        return ;
    }
    if(catalogs_feed_video_counts->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_feed_video_counts_free");
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_feed_video_counts);
}

cJSON *catalogs_feed_video_counts_convertToJSON(catalogs_feed_video_counts_t *catalogs_feed_video_counts) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_video_counts->ingested_videos
    if(catalogs_feed_video_counts->ingested_videos) {
    if(cJSON_AddNumberToObject(item, "ingested_videos", catalogs_feed_video_counts->ingested_videos) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_video_counts->not_ingested_videos
    if(catalogs_feed_video_counts->not_ingested_videos) {
    if(cJSON_AddNumberToObject(item, "not_ingested_videos", catalogs_feed_video_counts->not_ingested_videos) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_video_counts->total_videos
    if(catalogs_feed_video_counts->total_videos) {
    if(cJSON_AddNumberToObject(item, "total_videos", catalogs_feed_video_counts->total_videos) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_feed_video_counts_t *catalogs_feed_video_counts_parseFromJSON(cJSON *catalogs_feed_video_countsJSON){

    catalogs_feed_video_counts_t *catalogs_feed_video_counts_local_var = NULL;

    // catalogs_feed_video_counts->ingested_videos
    cJSON *ingested_videos = cJSON_GetObjectItemCaseSensitive(catalogs_feed_video_countsJSON, "ingested_videos");
    if (cJSON_IsNull(ingested_videos)) {
        ingested_videos = NULL;
    }
    if (ingested_videos) { 
    if(!cJSON_IsNumber(ingested_videos))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_video_counts->not_ingested_videos
    cJSON *not_ingested_videos = cJSON_GetObjectItemCaseSensitive(catalogs_feed_video_countsJSON, "not_ingested_videos");
    if (cJSON_IsNull(not_ingested_videos)) {
        not_ingested_videos = NULL;
    }
    if (not_ingested_videos) { 
    if(!cJSON_IsNumber(not_ingested_videos))
    {
    goto end; //Numeric
    }
    }

    // catalogs_feed_video_counts->total_videos
    cJSON *total_videos = cJSON_GetObjectItemCaseSensitive(catalogs_feed_video_countsJSON, "total_videos");
    if (cJSON_IsNull(total_videos)) {
        total_videos = NULL;
    }
    if (total_videos) { 
    if(!cJSON_IsNumber(total_videos))
    {
    goto end; //Numeric
    }
    }


    catalogs_feed_video_counts_local_var = catalogs_feed_video_counts_create_internal (
        ingested_videos ? ingested_videos->valuedouble : 0,
        not_ingested_videos ? not_ingested_videos->valuedouble : 0,
        total_videos ? total_videos->valuedouble : 0
        );

    return catalogs_feed_video_counts_local_var;
end:
    return NULL;

}
