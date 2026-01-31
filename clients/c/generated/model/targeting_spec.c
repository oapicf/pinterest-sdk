#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec.h"


char* targeting_spec_age_bucket_ToString(pinterest_rest_api_targeting_spec__e age_bucket) {
    char *age_bucketArray[] =  { "NULL", "18-24", "19+", "20+", "21+", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    return age_bucketArray[age_bucket - 1];
}

pinterest_rest_api_targeting_spec__e targeting_spec_age_bucket_FromString(char* age_bucket) {
    int stringToReturn = 0;
    char *age_bucketArray[] =  { "NULL", "18-24", "19+", "20+", "21+", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    size_t sizeofArray = sizeof(age_bucketArray) / sizeof(age_bucketArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(age_bucket, age_bucketArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* targeting_spec_apptype_ToString(pinterest_rest_api_targeting_spec__e apptype) {
    char *apptypeArray[] =  { "NULL", "android_mobile", "android_tablet", "ipad", "iphone", "web", "web_mobile" };
    return apptypeArray[apptype - 1];
}

pinterest_rest_api_targeting_spec__e targeting_spec_apptype_FromString(char* apptype) {
    int stringToReturn = 0;
    char *apptypeArray[] =  { "NULL", "android_mobile", "android_tablet", "ipad", "iphone", "web", "web_mobile" };
    size_t sizeofArray = sizeof(apptypeArray) / sizeof(apptypeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(apptype, apptypeArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* targeting_spec_gender_ToString(pinterest_rest_api_targeting_spec__e gender) {
    char *genderArray[] =  { "NULL", "unknown", "male", "female" };
    return genderArray[gender - 1];
}

pinterest_rest_api_targeting_spec__e targeting_spec_gender_FromString(char* gender) {
    int stringToReturn = 0;
    char *genderArray[] =  { "NULL", "unknown", "male", "female" };
    size_t sizeofArray = sizeof(genderArray) / sizeof(genderArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(gender, genderArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* targeting_spec_targeting_strategy_ToString(pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_e targeting_strategy) {
    char *targeting_strategyArray[] =  { "NULL", "CHOOSE_YOUR_OWN", "FIND_NEW_CUSTOMERS", "RECONNECT_WITH_USERS" };
    return targeting_strategyArray[targeting_strategy - 1];
}

pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_e targeting_spec_targeting_strategy_FromString(char* targeting_strategy) {
    int stringToReturn = 0;
    char *targeting_strategyArray[] =  { "NULL", "CHOOSE_YOUR_OWN", "FIND_NEW_CUSTOMERS", "RECONNECT_WITH_USERS" };
    size_t sizeofArray = sizeof(targeting_strategyArray) / sizeof(targeting_strategyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(targeting_strategy, targeting_strategyArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static targeting_spec_t *targeting_spec_create_internal(
    list_t *age_bucket,
    list_t *apptype,
    list_t *audience_exclude,
    list_t *audience_include,
    list_t *gender,
    list_t *geo,
    list_t *interest,
    list_t *locale,
    list_t *location,
    char *maximum_age,
    char *minimum_age,
    list_t *shopping_retargeting,
    list_t *targeting_strategy
    ) {
    targeting_spec_t *targeting_spec_local_var = malloc(sizeof(targeting_spec_t));
    if (!targeting_spec_local_var) {
        return NULL;
    }
    targeting_spec_local_var->age_bucket = age_bucket;
    targeting_spec_local_var->apptype = apptype;
    targeting_spec_local_var->audience_exclude = audience_exclude;
    targeting_spec_local_var->audience_include = audience_include;
    targeting_spec_local_var->gender = gender;
    targeting_spec_local_var->geo = geo;
    targeting_spec_local_var->interest = interest;
    targeting_spec_local_var->locale = locale;
    targeting_spec_local_var->location = location;
    targeting_spec_local_var->maximum_age = maximum_age;
    targeting_spec_local_var->minimum_age = minimum_age;
    targeting_spec_local_var->shopping_retargeting = shopping_retargeting;
    targeting_spec_local_var->targeting_strategy = targeting_strategy;

    targeting_spec_local_var->_library_owned = 1;
    return targeting_spec_local_var;
}

__attribute__((deprecated)) targeting_spec_t *targeting_spec_create(
    list_t *age_bucket,
    list_t *apptype,
    list_t *audience_exclude,
    list_t *audience_include,
    list_t *gender,
    list_t *geo,
    list_t *interest,
    list_t *locale,
    list_t *location,
    char *maximum_age,
    char *minimum_age,
    list_t *shopping_retargeting,
    list_t *targeting_strategy
    ) {
    return targeting_spec_create_internal (
        age_bucket,
        apptype,
        audience_exclude,
        audience_include,
        gender,
        geo,
        interest,
        locale,
        location,
        maximum_age,
        minimum_age,
        shopping_retargeting,
        targeting_strategy
        );
}

void targeting_spec_free(targeting_spec_t *targeting_spec) {
    if(NULL == targeting_spec){
        return ;
    }
    if(targeting_spec->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_spec_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_spec->age_bucket) {
        list_ForEach(listEntry, targeting_spec->age_bucket) {
            targeting_spec_age_bucket_free(listEntry->data);
        }
        list_freeList(targeting_spec->age_bucket);
        targeting_spec->age_bucket = NULL;
    }
    if (targeting_spec->apptype) {
        list_ForEach(listEntry, targeting_spec->apptype) {
            targeting_spec_app_type_free(listEntry->data);
        }
        list_freeList(targeting_spec->apptype);
        targeting_spec->apptype = NULL;
    }
    if (targeting_spec->audience_exclude) {
        list_ForEach(listEntry, targeting_spec->audience_exclude) {
            free(listEntry->data);
        }
        list_freeList(targeting_spec->audience_exclude);
        targeting_spec->audience_exclude = NULL;
    }
    if (targeting_spec->audience_include) {
        list_ForEach(listEntry, targeting_spec->audience_include) {
            free(listEntry->data);
        }
        list_freeList(targeting_spec->audience_include);
        targeting_spec->audience_include = NULL;
    }
    if (targeting_spec->gender) {
        list_ForEach(listEntry, targeting_spec->gender) {
            targeting_spec_gender_free(listEntry->data);
        }
        list_freeList(targeting_spec->gender);
        targeting_spec->gender = NULL;
    }
    if (targeting_spec->geo) {
        list_ForEach(listEntry, targeting_spec->geo) {
            free(listEntry->data);
        }
        list_freeList(targeting_spec->geo);
        targeting_spec->geo = NULL;
    }
    if (targeting_spec->interest) {
        list_ForEach(listEntry, targeting_spec->interest) {
            free(listEntry->data);
        }
        list_freeList(targeting_spec->interest);
        targeting_spec->interest = NULL;
    }
    if (targeting_spec->locale) {
        list_ForEach(listEntry, targeting_spec->locale) {
            free(listEntry->data);
        }
        list_freeList(targeting_spec->locale);
        targeting_spec->locale = NULL;
    }
    if (targeting_spec->location) {
        list_ForEach(listEntry, targeting_spec->location) {
            free(listEntry->data);
        }
        list_freeList(targeting_spec->location);
        targeting_spec->location = NULL;
    }
    if (targeting_spec->maximum_age) {
        free(targeting_spec->maximum_age);
        targeting_spec->maximum_age = NULL;
    }
    if (targeting_spec->minimum_age) {
        free(targeting_spec->minimum_age);
        targeting_spec->minimum_age = NULL;
    }
    if (targeting_spec->shopping_retargeting) {
        list_ForEach(listEntry, targeting_spec->shopping_retargeting) {
            targeting_spec_shopping_retargeting_free(listEntry->data);
        }
        list_freeList(targeting_spec->shopping_retargeting);
        targeting_spec->shopping_retargeting = NULL;
    }
    if (targeting_spec->targeting_strategy) {
        list_ForEach(listEntry, targeting_spec->targeting_strategy) {
            free(listEntry->data);
        }
        list_freeList(targeting_spec->targeting_strategy);
        targeting_spec->targeting_strategy = NULL;
    }
    free(targeting_spec);
}

cJSON *targeting_spec_convertToJSON(targeting_spec_t *targeting_spec) {
    cJSON *item = cJSON_CreateObject();

    // targeting_spec->age_bucket
    if(targeting_spec->age_bucket != pinterest_rest_api_list_AGEBUCKET_NULL) {
    cJSON *age_bucket = cJSON_AddArrayToObject(item, "AGE_BUCKET");
    if(age_bucket == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *age_bucketListEntry;
    if (targeting_spec->age_bucket) {
    list_ForEach(age_bucketListEntry, targeting_spec->age_bucket) {
    cJSON *itemLocal = targeting_spec_age_bucket_convertToJSON((pinterest_rest_api_targeting_spec__e)age_bucketListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(age_bucket, itemLocal);
    }
    }
    }


    // targeting_spec->apptype
    if(targeting_spec->apptype != pinterest_rest_api_list_APPTYPE_NULL) {
    cJSON *apptype = cJSON_AddArrayToObject(item, "APPTYPE");
    if(apptype == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *apptypeListEntry;
    if (targeting_spec->apptype) {
    list_ForEach(apptypeListEntry, targeting_spec->apptype) {
    cJSON *itemLocal = targeting_spec_app_type_convertToJSON((pinterest_rest_api_targeting_spec__e)apptypeListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(apptype, itemLocal);
    }
    }
    }


    // targeting_spec->audience_exclude
    if(targeting_spec->audience_exclude) {
    cJSON *audience_exclude = cJSON_AddArrayToObject(item, "AUDIENCE_EXCLUDE");
    if(audience_exclude == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *audience_excludeListEntry;
    list_ForEach(audience_excludeListEntry, targeting_spec->audience_exclude) {
    if(cJSON_AddStringToObject(audience_exclude, "", audience_excludeListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // targeting_spec->audience_include
    if(targeting_spec->audience_include) {
    cJSON *audience_include = cJSON_AddArrayToObject(item, "AUDIENCE_INCLUDE");
    if(audience_include == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *audience_includeListEntry;
    list_ForEach(audience_includeListEntry, targeting_spec->audience_include) {
    if(cJSON_AddStringToObject(audience_include, "", audience_includeListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // targeting_spec->gender
    if(targeting_spec->gender != pinterest_rest_api_list_GENDER_NULL) {
    cJSON *gender = cJSON_AddArrayToObject(item, "GENDER");
    if(gender == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *genderListEntry;
    if (targeting_spec->gender) {
    list_ForEach(genderListEntry, targeting_spec->gender) {
    cJSON *itemLocal = targeting_spec_gender_convertToJSON((pinterest_rest_api_targeting_spec__e)genderListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(gender, itemLocal);
    }
    }
    }


    // targeting_spec->geo
    if(targeting_spec->geo) {
    cJSON *geo = cJSON_AddArrayToObject(item, "GEO");
    if(geo == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *geoListEntry;
    list_ForEach(geoListEntry, targeting_spec->geo) {
    if(cJSON_AddStringToObject(geo, "", geoListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // targeting_spec->interest
    if(targeting_spec->interest) {
    cJSON *interest = cJSON_AddArrayToObject(item, "INTEREST");
    if(interest == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *interestListEntry;
    list_ForEach(interestListEntry, targeting_spec->interest) {
    if(cJSON_AddStringToObject(interest, "", interestListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // targeting_spec->locale
    if(targeting_spec->locale) {
    cJSON *locale = cJSON_AddArrayToObject(item, "LOCALE");
    if(locale == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *localeListEntry;
    list_ForEach(localeListEntry, targeting_spec->locale) {
    if(cJSON_AddStringToObject(locale, "", localeListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // targeting_spec->location
    if(targeting_spec->location) {
    cJSON *location = cJSON_AddArrayToObject(item, "LOCATION");
    if(location == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *locationListEntry;
    list_ForEach(locationListEntry, targeting_spec->location) {
    if(cJSON_AddStringToObject(location, "", locationListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // targeting_spec->maximum_age
    if(targeting_spec->maximum_age) {
    if(cJSON_AddStringToObject(item, "MAXIMUM_AGE", targeting_spec->maximum_age) == NULL) {
    goto fail; //String
    }
    }


    // targeting_spec->minimum_age
    if(targeting_spec->minimum_age) {
    if(cJSON_AddStringToObject(item, "MINIMUM_AGE", targeting_spec->minimum_age) == NULL) {
    goto fail; //String
    }
    }


    // targeting_spec->shopping_retargeting
    if(targeting_spec->shopping_retargeting) {
    cJSON *shopping_retargeting = cJSON_AddArrayToObject(item, "SHOPPING_RETARGETING");
    if(shopping_retargeting == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *shopping_retargetingListEntry;
    if (targeting_spec->shopping_retargeting) {
    list_ForEach(shopping_retargetingListEntry, targeting_spec->shopping_retargeting) {
    cJSON *itemLocal = targeting_spec_shopping_retargeting_convertToJSON(shopping_retargetingListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(shopping_retargeting, itemLocal);
    }
    }
    }


    // targeting_spec->targeting_strategy
    if(targeting_spec->targeting_strategy != pinterest_rest_api_targeting_spec_TARGETINGSTRATEGY_NULL) {
    cJSON *targeting_strategy = cJSON_AddArrayToObject(item, "TARGETING_STRATEGY");
    if(targeting_strategy == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *targeting_strategyListEntry;
    list_ForEach(targeting_strategyListEntry, targeting_spec->targeting_strategy) {
    if(cJSON_AddStringToObject(targeting_strategy, "", targeting_strategyListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

targeting_spec_t *targeting_spec_parseFromJSON(cJSON *targeting_specJSON){

    targeting_spec_t *targeting_spec_local_var = NULL;

    // define the local list for targeting_spec->age_bucket
    list_t *age_bucketList = NULL;

    // define the local list for targeting_spec->apptype
    list_t *apptypeList = NULL;

    // define the local list for targeting_spec->audience_exclude
    list_t *audience_excludeList = NULL;

    // define the local list for targeting_spec->audience_include
    list_t *audience_includeList = NULL;

    // define the local list for targeting_spec->gender
    list_t *genderList = NULL;

    // define the local list for targeting_spec->geo
    list_t *geoList = NULL;

    // define the local list for targeting_spec->interest
    list_t *interestList = NULL;

    // define the local list for targeting_spec->locale
    list_t *localeList = NULL;

    // define the local list for targeting_spec->location
    list_t *locationList = NULL;

    // define the local list for targeting_spec->shopping_retargeting
    list_t *shopping_retargetingList = NULL;

    // define the local list for targeting_spec->targeting_strategy
    list_t *targeting_strategyList = NULL;

    // targeting_spec->age_bucket
    cJSON *age_bucket = cJSON_GetObjectItemCaseSensitive(targeting_specJSON, "AGE_BUCKET");
    if (cJSON_IsNull(age_bucket)) {
        age_bucket = NULL;
    }
    if (age_bucket) { 
    cJSON *age_bucket_local_nonprimitive = NULL;
    if(!cJSON_IsArray(age_bucket)){
        goto end; //nonprimitive container
    }

    age_bucketList = list_createList();

    cJSON_ArrayForEach(age_bucket_local_nonprimitive,age_bucket )
    {
        if(!cJSON_IsObject(age_bucket_local_nonprimitive)){
            goto end;
        }
        targeting_spec_targeting_spec_age_bucket_e age_bucketItem = targeting_spec_age_bucket_parseFromJSON(age_bucket_local_nonprimitive);

        list_addElement(age_bucketList, (void *)age_bucketItem);
    }
    }

    // targeting_spec->apptype
    cJSON *apptype = cJSON_GetObjectItemCaseSensitive(targeting_specJSON, "APPTYPE");
    if (cJSON_IsNull(apptype)) {
        apptype = NULL;
    }
    if (apptype) { 
    cJSON *apptype_local_nonprimitive = NULL;
    if(!cJSON_IsArray(apptype)){
        goto end; //nonprimitive container
    }

    apptypeList = list_createList();

    cJSON_ArrayForEach(apptype_local_nonprimitive,apptype )
    {
        if(!cJSON_IsObject(apptype_local_nonprimitive)){
            goto end;
        }
        targeting_spec_targeting_spec_app_type_e apptypeItem = targeting_spec_app_type_parseFromJSON(apptype_local_nonprimitive);

        list_addElement(apptypeList, (void *)apptypeItem);
    }
    }

    // targeting_spec->audience_exclude
    cJSON *audience_exclude = cJSON_GetObjectItemCaseSensitive(targeting_specJSON, "AUDIENCE_EXCLUDE");
    if (cJSON_IsNull(audience_exclude)) {
        audience_exclude = NULL;
    }
    if (audience_exclude) { 
    cJSON *audience_exclude_local = NULL;
    if(!cJSON_IsArray(audience_exclude)) {
        goto end;//primitive container
    }
    audience_excludeList = list_createList();

    cJSON_ArrayForEach(audience_exclude_local, audience_exclude)
    {
        if(!cJSON_IsString(audience_exclude_local))
        {
            goto end;
        }
        list_addElement(audience_excludeList , strdup(audience_exclude_local->valuestring));
    }
    }

    // targeting_spec->audience_include
    cJSON *audience_include = cJSON_GetObjectItemCaseSensitive(targeting_specJSON, "AUDIENCE_INCLUDE");
    if (cJSON_IsNull(audience_include)) {
        audience_include = NULL;
    }
    if (audience_include) { 
    cJSON *audience_include_local = NULL;
    if(!cJSON_IsArray(audience_include)) {
        goto end;//primitive container
    }
    audience_includeList = list_createList();

    cJSON_ArrayForEach(audience_include_local, audience_include)
    {
        if(!cJSON_IsString(audience_include_local))
        {
            goto end;
        }
        list_addElement(audience_includeList , strdup(audience_include_local->valuestring));
    }
    }

    // targeting_spec->gender
    cJSON *gender = cJSON_GetObjectItemCaseSensitive(targeting_specJSON, "GENDER");
    if (cJSON_IsNull(gender)) {
        gender = NULL;
    }
    if (gender) { 
    cJSON *gender_local_nonprimitive = NULL;
    if(!cJSON_IsArray(gender)){
        goto end; //nonprimitive container
    }

    genderList = list_createList();

    cJSON_ArrayForEach(gender_local_nonprimitive,gender )
    {
        if(!cJSON_IsObject(gender_local_nonprimitive)){
            goto end;
        }
        targeting_spec_targeting_spec_gender_e genderItem = targeting_spec_gender_parseFromJSON(gender_local_nonprimitive);

        list_addElement(genderList, (void *)genderItem);
    }
    }

    // targeting_spec->geo
    cJSON *geo = cJSON_GetObjectItemCaseSensitive(targeting_specJSON, "GEO");
    if (cJSON_IsNull(geo)) {
        geo = NULL;
    }
    if (geo) { 
    cJSON *geo_local = NULL;
    if(!cJSON_IsArray(geo)) {
        goto end;//primitive container
    }
    geoList = list_createList();

    cJSON_ArrayForEach(geo_local, geo)
    {
        if(!cJSON_IsString(geo_local))
        {
            goto end;
        }
        list_addElement(geoList , strdup(geo_local->valuestring));
    }
    }

    // targeting_spec->interest
    cJSON *interest = cJSON_GetObjectItemCaseSensitive(targeting_specJSON, "INTEREST");
    if (cJSON_IsNull(interest)) {
        interest = NULL;
    }
    if (interest) { 
    cJSON *interest_local = NULL;
    if(!cJSON_IsArray(interest)) {
        goto end;//primitive container
    }
    interestList = list_createList();

    cJSON_ArrayForEach(interest_local, interest)
    {
        if(!cJSON_IsString(interest_local))
        {
            goto end;
        }
        list_addElement(interestList , strdup(interest_local->valuestring));
    }
    }

    // targeting_spec->locale
    cJSON *locale = cJSON_GetObjectItemCaseSensitive(targeting_specJSON, "LOCALE");
    if (cJSON_IsNull(locale)) {
        locale = NULL;
    }
    if (locale) { 
    cJSON *locale_local = NULL;
    if(!cJSON_IsArray(locale)) {
        goto end;//primitive container
    }
    localeList = list_createList();

    cJSON_ArrayForEach(locale_local, locale)
    {
        if(!cJSON_IsString(locale_local))
        {
            goto end;
        }
        list_addElement(localeList , strdup(locale_local->valuestring));
    }
    }

    // targeting_spec->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(targeting_specJSON, "LOCATION");
    if (cJSON_IsNull(location)) {
        location = NULL;
    }
    if (location) { 
    cJSON *location_local = NULL;
    if(!cJSON_IsArray(location)) {
        goto end;//primitive container
    }
    locationList = list_createList();

    cJSON_ArrayForEach(location_local, location)
    {
        if(!cJSON_IsString(location_local))
        {
            goto end;
        }
        list_addElement(locationList , strdup(location_local->valuestring));
    }
    }

    // targeting_spec->maximum_age
    cJSON *maximum_age = cJSON_GetObjectItemCaseSensitive(targeting_specJSON, "MAXIMUM_AGE");
    if (cJSON_IsNull(maximum_age)) {
        maximum_age = NULL;
    }
    if (maximum_age) { 
    if(!cJSON_IsString(maximum_age) && !cJSON_IsNull(maximum_age))
    {
    goto end; //String
    }
    }

    // targeting_spec->minimum_age
    cJSON *minimum_age = cJSON_GetObjectItemCaseSensitive(targeting_specJSON, "MINIMUM_AGE");
    if (cJSON_IsNull(minimum_age)) {
        minimum_age = NULL;
    }
    if (minimum_age) { 
    if(!cJSON_IsString(minimum_age) && !cJSON_IsNull(minimum_age))
    {
    goto end; //String
    }
    }

    // targeting_spec->shopping_retargeting
    cJSON *shopping_retargeting = cJSON_GetObjectItemCaseSensitive(targeting_specJSON, "SHOPPING_RETARGETING");
    if (cJSON_IsNull(shopping_retargeting)) {
        shopping_retargeting = NULL;
    }
    if (shopping_retargeting) { 
    cJSON *shopping_retargeting_local_nonprimitive = NULL;
    if(!cJSON_IsArray(shopping_retargeting)){
        goto end; //nonprimitive container
    }

    shopping_retargetingList = list_createList();

    cJSON_ArrayForEach(shopping_retargeting_local_nonprimitive,shopping_retargeting )
    {
        if(!cJSON_IsObject(shopping_retargeting_local_nonprimitive)){
            goto end;
        }
        targeting_spec_shopping_retargeting_t *shopping_retargetingItem = targeting_spec_shopping_retargeting_parseFromJSON(shopping_retargeting_local_nonprimitive);

        list_addElement(shopping_retargetingList, shopping_retargetingItem);
    }
    }

    // targeting_spec->targeting_strategy
    cJSON *targeting_strategy = cJSON_GetObjectItemCaseSensitive(targeting_specJSON, "TARGETING_STRATEGY");
    if (cJSON_IsNull(targeting_strategy)) {
        targeting_strategy = NULL;
    }
    if (targeting_strategy) { 
    cJSON *targeting_strategy_local = NULL;
    if(!cJSON_IsArray(targeting_strategy)) {
        goto end;//primitive container
    }
    targeting_strategyList = list_createList();

    cJSON_ArrayForEach(targeting_strategy_local, targeting_strategy)
    {
        if(!cJSON_IsString(targeting_strategy_local))
        {
            goto end;
        }
        list_addElement(targeting_strategyList , strdup(targeting_strategy_local->valuestring));
    }
    }


    targeting_spec_local_var = targeting_spec_create_internal (
        age_bucket ? age_bucketList : NULL,
        apptype ? apptypeList : NULL,
        audience_exclude ? audience_excludeList : NULL,
        audience_include ? audience_includeList : NULL,
        gender ? genderList : NULL,
        geo ? geoList : NULL,
        interest ? interestList : NULL,
        locale ? localeList : NULL,
        location ? locationList : NULL,
        maximum_age && !cJSON_IsNull(maximum_age) ? strdup(maximum_age->valuestring) : NULL,
        minimum_age && !cJSON_IsNull(minimum_age) ? strdup(minimum_age->valuestring) : NULL,
        shopping_retargeting ? shopping_retargetingList : NULL,
        targeting_strategy ? targeting_strategyList : NULL
        );

    return targeting_spec_local_var;
end:
    if (age_bucketList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, age_bucketList) {
            targeting_spec_age_bucket_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(age_bucketList);
        age_bucketList = NULL;
    }
    if (apptypeList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, apptypeList) {
            targeting_spec_app_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(apptypeList);
        apptypeList = NULL;
    }
    if (audience_excludeList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, audience_excludeList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(audience_excludeList);
        audience_excludeList = NULL;
    }
    if (audience_includeList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, audience_includeList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(audience_includeList);
        audience_includeList = NULL;
    }
    if (genderList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, genderList) {
            targeting_spec_gender_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(genderList);
        genderList = NULL;
    }
    if (geoList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, geoList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(geoList);
        geoList = NULL;
    }
    if (interestList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, interestList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(interestList);
        interestList = NULL;
    }
    if (localeList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, localeList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(localeList);
        localeList = NULL;
    }
    if (locationList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, locationList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(locationList);
        locationList = NULL;
    }
    if (shopping_retargetingList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, shopping_retargetingList) {
            targeting_spec_shopping_retargeting_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(shopping_retargetingList);
        shopping_retargetingList = NULL;
    }
    if (targeting_strategyList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, targeting_strategyList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(targeting_strategyList);
        targeting_strategyList = NULL;
    }
    return NULL;

}
