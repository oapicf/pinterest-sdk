#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_guest_ratings.h"



catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_create(
    double score,
    int number_of_reviewers,
    double max_score,
    char *rating_system
    ) {
    catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_local_var = malloc(sizeof(catalogs_hotel_guest_ratings_t));
    if (!catalogs_hotel_guest_ratings_local_var) {
        return NULL;
    }
    catalogs_hotel_guest_ratings_local_var->score = score;
    catalogs_hotel_guest_ratings_local_var->number_of_reviewers = number_of_reviewers;
    catalogs_hotel_guest_ratings_local_var->max_score = max_score;
    catalogs_hotel_guest_ratings_local_var->rating_system = rating_system;

    return catalogs_hotel_guest_ratings_local_var;
}


void catalogs_hotel_guest_ratings_free(catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings) {
    if(NULL == catalogs_hotel_guest_ratings){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_hotel_guest_ratings->rating_system) {
        free(catalogs_hotel_guest_ratings->rating_system);
        catalogs_hotel_guest_ratings->rating_system = NULL;
    }
    free(catalogs_hotel_guest_ratings);
}

cJSON *catalogs_hotel_guest_ratings_convertToJSON(catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_guest_ratings->score
    if(catalogs_hotel_guest_ratings->score) {
    if(cJSON_AddNumberToObject(item, "score", catalogs_hotel_guest_ratings->score) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_hotel_guest_ratings->number_of_reviewers
    if(catalogs_hotel_guest_ratings->number_of_reviewers) {
    if(cJSON_AddNumberToObject(item, "number_of_reviewers", catalogs_hotel_guest_ratings->number_of_reviewers) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_hotel_guest_ratings->max_score
    if(catalogs_hotel_guest_ratings->max_score) {
    if(cJSON_AddNumberToObject(item, "max_score", catalogs_hotel_guest_ratings->max_score) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_hotel_guest_ratings->rating_system
    if(catalogs_hotel_guest_ratings->rating_system) {
    if(cJSON_AddStringToObject(item, "rating_system", catalogs_hotel_guest_ratings->rating_system) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_parseFromJSON(cJSON *catalogs_hotel_guest_ratingsJSON){

    catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_local_var = NULL;

    // catalogs_hotel_guest_ratings->score
    cJSON *score = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_guest_ratingsJSON, "score");
    if (score) { 
    if(!cJSON_IsNumber(score))
    {
    goto end; //Numeric
    }
    }

    // catalogs_hotel_guest_ratings->number_of_reviewers
    cJSON *number_of_reviewers = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_guest_ratingsJSON, "number_of_reviewers");
    if (number_of_reviewers) { 
    if(!cJSON_IsNumber(number_of_reviewers))
    {
    goto end; //Numeric
    }
    }

    // catalogs_hotel_guest_ratings->max_score
    cJSON *max_score = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_guest_ratingsJSON, "max_score");
    if (max_score) { 
    if(!cJSON_IsNumber(max_score))
    {
    goto end; //Numeric
    }
    }

    // catalogs_hotel_guest_ratings->rating_system
    cJSON *rating_system = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_guest_ratingsJSON, "rating_system");
    if (rating_system) { 
    if(!cJSON_IsString(rating_system) && !cJSON_IsNull(rating_system))
    {
    goto end; //String
    }
    }


    catalogs_hotel_guest_ratings_local_var = catalogs_hotel_guest_ratings_create (
        score ? score->valuedouble : 0,
        number_of_reviewers ? number_of_reviewers->valuedouble : 0,
        max_score ? max_score->valuedouble : 0,
        rating_system && !cJSON_IsNull(rating_system) ? strdup(rating_system->valuestring) : NULL
        );

    return catalogs_hotel_guest_ratings_local_var;
end:
    return NULL;

}
