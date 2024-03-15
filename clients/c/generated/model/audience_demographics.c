#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_demographics.h"



audience_demographics_t *audience_demographics_create(
    list_t *ages,
    list_t *genders,
    list_t *devices,
    list_t *metros,
    list_t *countries
    ) {
    audience_demographics_t *audience_demographics_local_var = malloc(sizeof(audience_demographics_t));
    if (!audience_demographics_local_var) {
        return NULL;
    }
    audience_demographics_local_var->ages = ages;
    audience_demographics_local_var->genders = genders;
    audience_demographics_local_var->devices = devices;
    audience_demographics_local_var->metros = metros;
    audience_demographics_local_var->countries = countries;

    return audience_demographics_local_var;
}


void audience_demographics_free(audience_demographics_t *audience_demographics) {
    if(NULL == audience_demographics){
        return ;
    }
    listEntry_t *listEntry;
    if (audience_demographics->ages) {
        list_ForEach(listEntry, audience_demographics->ages) {
            audience_demographic_value_free(listEntry->data);
        }
        list_freeList(audience_demographics->ages);
        audience_demographics->ages = NULL;
    }
    if (audience_demographics->genders) {
        list_ForEach(listEntry, audience_demographics->genders) {
            audience_demographic_value_free(listEntry->data);
        }
        list_freeList(audience_demographics->genders);
        audience_demographics->genders = NULL;
    }
    if (audience_demographics->devices) {
        list_ForEach(listEntry, audience_demographics->devices) {
            audience_demographic_value_free(listEntry->data);
        }
        list_freeList(audience_demographics->devices);
        audience_demographics->devices = NULL;
    }
    if (audience_demographics->metros) {
        list_ForEach(listEntry, audience_demographics->metros) {
            audience_demographic_value_free(listEntry->data);
        }
        list_freeList(audience_demographics->metros);
        audience_demographics->metros = NULL;
    }
    if (audience_demographics->countries) {
        list_ForEach(listEntry, audience_demographics->countries) {
            audience_demographic_value_free(listEntry->data);
        }
        list_freeList(audience_demographics->countries);
        audience_demographics->countries = NULL;
    }
    free(audience_demographics);
}

cJSON *audience_demographics_convertToJSON(audience_demographics_t *audience_demographics) {
    cJSON *item = cJSON_CreateObject();

    // audience_demographics->ages
    if(audience_demographics->ages) {
    cJSON *ages = cJSON_AddArrayToObject(item, "ages");
    if(ages == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *agesListEntry;
    if (audience_demographics->ages) {
    list_ForEach(agesListEntry, audience_demographics->ages) {
    cJSON *itemLocal = audience_demographic_value_convertToJSON(agesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(ages, itemLocal);
    }
    }
    }


    // audience_demographics->genders
    if(audience_demographics->genders) {
    cJSON *genders = cJSON_AddArrayToObject(item, "genders");
    if(genders == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *gendersListEntry;
    if (audience_demographics->genders) {
    list_ForEach(gendersListEntry, audience_demographics->genders) {
    cJSON *itemLocal = audience_demographic_value_convertToJSON(gendersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(genders, itemLocal);
    }
    }
    }


    // audience_demographics->devices
    if(audience_demographics->devices) {
    cJSON *devices = cJSON_AddArrayToObject(item, "devices");
    if(devices == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *devicesListEntry;
    if (audience_demographics->devices) {
    list_ForEach(devicesListEntry, audience_demographics->devices) {
    cJSON *itemLocal = audience_demographic_value_convertToJSON(devicesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(devices, itemLocal);
    }
    }
    }


    // audience_demographics->metros
    if(audience_demographics->metros) {
    cJSON *metros = cJSON_AddArrayToObject(item, "metros");
    if(metros == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *metrosListEntry;
    if (audience_demographics->metros) {
    list_ForEach(metrosListEntry, audience_demographics->metros) {
    cJSON *itemLocal = audience_demographic_value_convertToJSON(metrosListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(metros, itemLocal);
    }
    }
    }


    // audience_demographics->countries
    if(audience_demographics->countries) {
    cJSON *countries = cJSON_AddArrayToObject(item, "countries");
    if(countries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *countriesListEntry;
    if (audience_demographics->countries) {
    list_ForEach(countriesListEntry, audience_demographics->countries) {
    cJSON *itemLocal = audience_demographic_value_convertToJSON(countriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(countries, itemLocal);
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

audience_demographics_t *audience_demographics_parseFromJSON(cJSON *audience_demographicsJSON){

    audience_demographics_t *audience_demographics_local_var = NULL;

    // define the local list for audience_demographics->ages
    list_t *agesList = NULL;

    // define the local list for audience_demographics->genders
    list_t *gendersList = NULL;

    // define the local list for audience_demographics->devices
    list_t *devicesList = NULL;

    // define the local list for audience_demographics->metros
    list_t *metrosList = NULL;

    // define the local list for audience_demographics->countries
    list_t *countriesList = NULL;

    // audience_demographics->ages
    cJSON *ages = cJSON_GetObjectItemCaseSensitive(audience_demographicsJSON, "ages");
    if (ages) { 
    cJSON *ages_local_nonprimitive = NULL;
    if(!cJSON_IsArray(ages)){
        goto end; //nonprimitive container
    }

    agesList = list_createList();

    cJSON_ArrayForEach(ages_local_nonprimitive,ages )
    {
        if(!cJSON_IsObject(ages_local_nonprimitive)){
            goto end;
        }
        audience_demographic_value_t *agesItem = audience_demographic_value_parseFromJSON(ages_local_nonprimitive);

        list_addElement(agesList, agesItem);
    }
    }

    // audience_demographics->genders
    cJSON *genders = cJSON_GetObjectItemCaseSensitive(audience_demographicsJSON, "genders");
    if (genders) { 
    cJSON *genders_local_nonprimitive = NULL;
    if(!cJSON_IsArray(genders)){
        goto end; //nonprimitive container
    }

    gendersList = list_createList();

    cJSON_ArrayForEach(genders_local_nonprimitive,genders )
    {
        if(!cJSON_IsObject(genders_local_nonprimitive)){
            goto end;
        }
        audience_demographic_value_t *gendersItem = audience_demographic_value_parseFromJSON(genders_local_nonprimitive);

        list_addElement(gendersList, gendersItem);
    }
    }

    // audience_demographics->devices
    cJSON *devices = cJSON_GetObjectItemCaseSensitive(audience_demographicsJSON, "devices");
    if (devices) { 
    cJSON *devices_local_nonprimitive = NULL;
    if(!cJSON_IsArray(devices)){
        goto end; //nonprimitive container
    }

    devicesList = list_createList();

    cJSON_ArrayForEach(devices_local_nonprimitive,devices )
    {
        if(!cJSON_IsObject(devices_local_nonprimitive)){
            goto end;
        }
        audience_demographic_value_t *devicesItem = audience_demographic_value_parseFromJSON(devices_local_nonprimitive);

        list_addElement(devicesList, devicesItem);
    }
    }

    // audience_demographics->metros
    cJSON *metros = cJSON_GetObjectItemCaseSensitive(audience_demographicsJSON, "metros");
    if (metros) { 
    cJSON *metros_local_nonprimitive = NULL;
    if(!cJSON_IsArray(metros)){
        goto end; //nonprimitive container
    }

    metrosList = list_createList();

    cJSON_ArrayForEach(metros_local_nonprimitive,metros )
    {
        if(!cJSON_IsObject(metros_local_nonprimitive)){
            goto end;
        }
        audience_demographic_value_t *metrosItem = audience_demographic_value_parseFromJSON(metros_local_nonprimitive);

        list_addElement(metrosList, metrosItem);
    }
    }

    // audience_demographics->countries
    cJSON *countries = cJSON_GetObjectItemCaseSensitive(audience_demographicsJSON, "countries");
    if (countries) { 
    cJSON *countries_local_nonprimitive = NULL;
    if(!cJSON_IsArray(countries)){
        goto end; //nonprimitive container
    }

    countriesList = list_createList();

    cJSON_ArrayForEach(countries_local_nonprimitive,countries )
    {
        if(!cJSON_IsObject(countries_local_nonprimitive)){
            goto end;
        }
        audience_demographic_value_t *countriesItem = audience_demographic_value_parseFromJSON(countries_local_nonprimitive);

        list_addElement(countriesList, countriesItem);
    }
    }


    audience_demographics_local_var = audience_demographics_create (
        ages ? agesList : NULL,
        genders ? gendersList : NULL,
        devices ? devicesList : NULL,
        metros ? metrosList : NULL,
        countries ? countriesList : NULL
        );

    return audience_demographics_local_var;
end:
    if (agesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, agesList) {
            audience_demographic_value_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(agesList);
        agesList = NULL;
    }
    if (gendersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, gendersList) {
            audience_demographic_value_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(gendersList);
        gendersList = NULL;
    }
    if (devicesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, devicesList) {
            audience_demographic_value_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(devicesList);
        devicesList = NULL;
    }
    if (metrosList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, metrosList) {
            audience_demographic_value_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(metrosList);
        metrosList = NULL;
    }
    if (countriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, countriesList) {
            audience_demographic_value_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(countriesList);
        countriesList = NULL;
    }
    return NULL;

}
