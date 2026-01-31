#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_guest_ratings.h"



static catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_create_internal(
    double max_score,
    int number_of_reviewers,
    char *rating_system,
    double score
    ) {
    catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_local_var = malloc(sizeof(catalogs_hotel_guest_ratings_t));
    if (!catalogs_hotel_guest_ratings_local_var) {
        return NULL;
    }
    catalogs_hotel_guest_ratings_local_var->max_score = max_score;
    catalogs_hotel_guest_ratings_local_var->number_of_reviewers = number_of_reviewers;
    catalogs_hotel_guest_ratings_local_var->rating_system = rating_system;
    catalogs_hotel_guest_ratings_local_var->score = score;

    catalogs_hotel_guest_ratings_local_var->_library_owned = 1;
    return catalogs_hotel_guest_ratings_local_var;
}

__attribute__((deprecated)) catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_create(
    double max_score,
    int number_of_reviewers,
    char *rating_system,
    double score
    ) {
    return catalogs_hotel_guest_ratings_create_internal (
        max_score,
        number_of_reviewers,
        rating_system,
        score
        );
}

void catalogs_hotel_guest_ratings_free(catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings) {
    if(NULL == catalogs_hotel_guest_ratings){
        return ;
    }
    if(catalogs_hotel_guest_ratings->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_hotel_guest_ratings_free");
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

    // catalogs_hotel_guest_ratings->max_score
    if(catalogs_hotel_guest_ratings->max_score) {
    if(cJSON_AddNumberToObject(item, "max_score", catalogs_hotel_guest_ratings->max_score) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_hotel_guest_ratings->number_of_reviewers
    if(catalogs_hotel_guest_ratings->number_of_reviewers) {
    if(cJSON_AddNumberToObject(item, "number_of_reviewers", catalogs_hotel_guest_ratings->number_of_reviewers) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_hotel_guest_ratings->rating_system
    if(catalogs_hotel_guest_ratings->rating_system) {
    if(cJSON_AddStringToObject(item, "rating_system", catalogs_hotel_guest_ratings->rating_system) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_hotel_guest_ratings->score
    if(catalogs_hotel_guest_ratings->score) {
    if(cJSON_AddNumberToObject(item, "score", catalogs_hotel_guest_ratings->score) == NULL) {
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

catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_parseFromJSON(cJSON *catalogs_hotel_guest_ratingsJSON){

    catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_local_var = NULL;

    // catalogs_hotel_guest_ratings->max_score
    cJSON *max_score = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_guest_ratingsJSON, "max_score");
    if (cJSON_IsNull(max_score)) {
        max_score = NULL;
    }
    if (max_score) { 
    if(!cJSON_IsNumber(max_score))
    {
    goto end; //Numeric
    }
    }

    // catalogs_hotel_guest_ratings->number_of_reviewers
    cJSON *number_of_reviewers = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_guest_ratingsJSON, "number_of_reviewers");
    if (cJSON_IsNull(number_of_reviewers)) {
        number_of_reviewers = NULL;
    }
    if (number_of_reviewers) { 
    if(!cJSON_IsNumber(number_of_reviewers))
    {
    goto end; //Numeric
    }
    }

    // catalogs_hotel_guest_ratings->rating_system
    cJSON *rating_system = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_guest_ratingsJSON, "rating_system");
    if (cJSON_IsNull(rating_system)) {
        rating_system = NULL;
    }
    if (rating_system) { 
    if(!cJSON_IsString(rating_system) && !cJSON_IsNull(rating_system))
    {
    goto end; //String
    }
    }

    // catalogs_hotel_guest_ratings->score
    cJSON *score = cJSON_GetObjectItemCaseSensitive(catalogs_hotel_guest_ratingsJSON, "score");
    if (cJSON_IsNull(score)) {
        score = NULL;
    }
    if (score) { 
    if(!cJSON_IsNumber(score))
    {
    goto end; //Numeric
    }
    }


    catalogs_hotel_guest_ratings_local_var = catalogs_hotel_guest_ratings_create_internal (
        max_score ? max_score->valuedouble : 0,
        number_of_reviewers ? number_of_reviewers->valuedouble : 0,
        rating_system && !cJSON_IsNull(rating_system) ? strdup(rating_system->valuestring) : NULL,
        score ? score->valuedouble : 0
        );

    return catalogs_hotel_guest_ratings_local_var;
end:
    return NULL;

}
