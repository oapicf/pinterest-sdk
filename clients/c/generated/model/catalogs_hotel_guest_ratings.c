#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_hotel_guest_ratings.h"



static catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_create_internal(
    double *max_score,
    int *number_of_reviewers,
    char *rating_system,
    double *score
    ) {
    catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_local_var = malloc(sizeof(catalogs_hotel_guest_ratings_t));
    if (!catalogs_hotel_guest_ratings_local_var) {
        return NULL;
    }
    memset(catalogs_hotel_guest_ratings_local_var, 0, sizeof(catalogs_hotel_guest_ratings_t));
    catalogs_hotel_guest_ratings_local_var->_library_owned = 1;
    catalogs_hotel_guest_ratings_local_var->max_score = max_score;
    catalogs_hotel_guest_ratings_local_var->number_of_reviewers = number_of_reviewers;
    catalogs_hotel_guest_ratings_local_var->rating_system = rating_system;
    catalogs_hotel_guest_ratings_local_var->score = score;
    return catalogs_hotel_guest_ratings_local_var;
}

__attribute__((deprecated)) catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_create(
    double *max_score,
    int *number_of_reviewers,
    char *rating_system,
    double *score
    ) {
    double *max_score_copy = NULL;
    if (max_score) {
        max_score_copy = malloc(sizeof(double));
        if (max_score_copy) *max_score_copy = *max_score;
    }
    int *number_of_reviewers_copy = NULL;
    if (number_of_reviewers) {
        number_of_reviewers_copy = malloc(sizeof(int));
        if (number_of_reviewers_copy) *number_of_reviewers_copy = *number_of_reviewers;
    }
    double *score_copy = NULL;
    if (score) {
        score_copy = malloc(sizeof(double));
        if (score_copy) *score_copy = *score;
    }
    catalogs_hotel_guest_ratings_t *result = catalogs_hotel_guest_ratings_create_internal (
        max_score_copy,
        number_of_reviewers_copy,
        rating_system,
        score_copy
        );
    if (!result) {
        free(max_score_copy);
        free(number_of_reviewers_copy);
        free(score_copy);
    }
    return result;
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
    if (catalogs_hotel_guest_ratings->max_score) {
        free(catalogs_hotel_guest_ratings->max_score);
        catalogs_hotel_guest_ratings->max_score = NULL;
    }
    if (catalogs_hotel_guest_ratings->number_of_reviewers) {
        free(catalogs_hotel_guest_ratings->number_of_reviewers);
        catalogs_hotel_guest_ratings->number_of_reviewers = NULL;
    }
    if (catalogs_hotel_guest_ratings->rating_system) {
        free(catalogs_hotel_guest_ratings->rating_system);
        catalogs_hotel_guest_ratings->rating_system = NULL;
    }
    if (catalogs_hotel_guest_ratings->score) {
        free(catalogs_hotel_guest_ratings->score);
        catalogs_hotel_guest_ratings->score = NULL;
    }
    free(catalogs_hotel_guest_ratings);
}

cJSON *catalogs_hotel_guest_ratings_convertToJSON(catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_hotel_guest_ratings->max_score
    if(catalogs_hotel_guest_ratings->max_score) {
    if(cJSON_AddNumberToObject(item, "max_score", *catalogs_hotel_guest_ratings->max_score) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_hotel_guest_ratings->number_of_reviewers
    if(catalogs_hotel_guest_ratings->number_of_reviewers) {
    if(cJSON_AddNumberToObject(item, "number_of_reviewers", *catalogs_hotel_guest_ratings->number_of_reviewers) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "score", *catalogs_hotel_guest_ratings->score) == NULL) {
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

    // define the local variable for catalogs_hotel_guest_ratings->max_score
    double *max_score_local_var = NULL;

    // define the local variable for catalogs_hotel_guest_ratings->number_of_reviewers
    int *number_of_reviewers_local_var = NULL;

    char *rating_system_local_str = NULL;

    // define the local variable for catalogs_hotel_guest_ratings->score
    double *score_local_var = NULL;

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
    max_score_local_var = malloc(sizeof(double));
    if(!max_score_local_var)
    {
        goto end;
    }
    *max_score_local_var = max_score->valuedouble;
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
    number_of_reviewers_local_var = malloc(sizeof(int));
    if(!number_of_reviewers_local_var)
    {
        goto end;
    }
    *number_of_reviewers_local_var = number_of_reviewers->valuedouble;
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
    score_local_var = malloc(sizeof(double));
    if(!score_local_var)
    {
        goto end;
    }
    *score_local_var = score->valuedouble;
    }


    if (rating_system && !cJSON_IsNull(rating_system)) rating_system_local_str = strdup(rating_system->valuestring);

    catalogs_hotel_guest_ratings_local_var = catalogs_hotel_guest_ratings_create_internal (
        max_score_local_var,
        number_of_reviewers_local_var,
        rating_system_local_str,
        score_local_var
        );

    if (!catalogs_hotel_guest_ratings_local_var) {
        goto end;
    }

    return catalogs_hotel_guest_ratings_local_var;
end:
    if (max_score_local_var) {
        free(max_score_local_var);
        max_score_local_var = NULL;
    }
    if (number_of_reviewers_local_var) {
        free(number_of_reviewers_local_var);
        number_of_reviewers_local_var = NULL;
    }
    if (rating_system_local_str) {
        free(rating_system_local_str);
        rating_system_local_str = NULL;
    }
    if (score_local_var) {
        free(score_local_var);
        score_local_var = NULL;
    }
    return NULL;

}
