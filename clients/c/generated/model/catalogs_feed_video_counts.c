#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_video_counts.h"



static catalogs_feed_video_counts_t *catalogs_feed_video_counts_create_internal(
    int *ingested_videos,
    int *not_ingested_videos,
    int *total_videos
    ) {
    catalogs_feed_video_counts_t *catalogs_feed_video_counts_local_var = malloc(sizeof(catalogs_feed_video_counts_t));
    if (!catalogs_feed_video_counts_local_var) {
        return NULL;
    }
    memset(catalogs_feed_video_counts_local_var, 0, sizeof(catalogs_feed_video_counts_t));
    catalogs_feed_video_counts_local_var->_library_owned = 1;
    catalogs_feed_video_counts_local_var->ingested_videos = ingested_videos;
    catalogs_feed_video_counts_local_var->not_ingested_videos = not_ingested_videos;
    catalogs_feed_video_counts_local_var->total_videos = total_videos;
    return catalogs_feed_video_counts_local_var;
}

__attribute__((deprecated)) catalogs_feed_video_counts_t *catalogs_feed_video_counts_create(
    int *ingested_videos,
    int *not_ingested_videos,
    int *total_videos
    ) {
    int *ingested_videos_copy = NULL;
    if (ingested_videos) {
        ingested_videos_copy = malloc(sizeof(int));
        if (ingested_videos_copy) *ingested_videos_copy = *ingested_videos;
    }
    int *not_ingested_videos_copy = NULL;
    if (not_ingested_videos) {
        not_ingested_videos_copy = malloc(sizeof(int));
        if (not_ingested_videos_copy) *not_ingested_videos_copy = *not_ingested_videos;
    }
    int *total_videos_copy = NULL;
    if (total_videos) {
        total_videos_copy = malloc(sizeof(int));
        if (total_videos_copy) *total_videos_copy = *total_videos;
    }
    catalogs_feed_video_counts_t *result = catalogs_feed_video_counts_create_internal (
        ingested_videos_copy,
        not_ingested_videos_copy,
        total_videos_copy
        );
    if (!result) {
        free(ingested_videos_copy);
        free(not_ingested_videos_copy);
        free(total_videos_copy);
    }
    return result;
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
    if (catalogs_feed_video_counts->ingested_videos) {
        free(catalogs_feed_video_counts->ingested_videos);
        catalogs_feed_video_counts->ingested_videos = NULL;
    }
    if (catalogs_feed_video_counts->not_ingested_videos) {
        free(catalogs_feed_video_counts->not_ingested_videos);
        catalogs_feed_video_counts->not_ingested_videos = NULL;
    }
    if (catalogs_feed_video_counts->total_videos) {
        free(catalogs_feed_video_counts->total_videos);
        catalogs_feed_video_counts->total_videos = NULL;
    }
    free(catalogs_feed_video_counts);
}

cJSON *catalogs_feed_video_counts_convertToJSON(catalogs_feed_video_counts_t *catalogs_feed_video_counts) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_video_counts->ingested_videos
    if(catalogs_feed_video_counts->ingested_videos) {
    if(cJSON_AddNumberToObject(item, "ingested_videos", *catalogs_feed_video_counts->ingested_videos) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_video_counts->not_ingested_videos
    if(catalogs_feed_video_counts->not_ingested_videos) {
    if(cJSON_AddNumberToObject(item, "not_ingested_videos", *catalogs_feed_video_counts->not_ingested_videos) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_video_counts->total_videos
    if(catalogs_feed_video_counts->total_videos) {
    if(cJSON_AddNumberToObject(item, "total_videos", *catalogs_feed_video_counts->total_videos) == NULL) {
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

    // define the local variable for catalogs_feed_video_counts->ingested_videos
    int *ingested_videos_local_var = NULL;

    // define the local variable for catalogs_feed_video_counts->not_ingested_videos
    int *not_ingested_videos_local_var = NULL;

    // define the local variable for catalogs_feed_video_counts->total_videos
    int *total_videos_local_var = NULL;

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
    ingested_videos_local_var = malloc(sizeof(int));
    if(!ingested_videos_local_var)
    {
        goto end;
    }
    *ingested_videos_local_var = ingested_videos->valuedouble;
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
    not_ingested_videos_local_var = malloc(sizeof(int));
    if(!not_ingested_videos_local_var)
    {
        goto end;
    }
    *not_ingested_videos_local_var = not_ingested_videos->valuedouble;
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
    total_videos_local_var = malloc(sizeof(int));
    if(!total_videos_local_var)
    {
        goto end;
    }
    *total_videos_local_var = total_videos->valuedouble;
    }



    catalogs_feed_video_counts_local_var = catalogs_feed_video_counts_create_internal (
        ingested_videos_local_var,
        not_ingested_videos_local_var,
        total_videos_local_var
        );

    if (!catalogs_feed_video_counts_local_var) {
        goto end;
    }

    return catalogs_feed_video_counts_local_var;
end:
    if (ingested_videos_local_var) {
        free(ingested_videos_local_var);
        ingested_videos_local_var = NULL;
    }
    if (not_ingested_videos_local_var) {
        free(not_ingested_videos_local_var);
        not_ingested_videos_local_var = NULL;
    }
    if (total_videos_local_var) {
        free(total_videos_local_var);
        total_videos_local_var = NULL;
    }
    return NULL;

}
