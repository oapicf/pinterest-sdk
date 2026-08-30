#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_events_user_data_properties.h"



static conversion_events_user_data_properties_t *conversion_events_user_data_properties_create_internal(
    char *click_id,
    char *client_ip_address,
    char *client_user_agent,
    list_t *country,
    list_t *ct,
    list_t *db,
    list_t *em,
    list_t *external_id,
    list_t *fn,
    list_t *ge,
    list_t *hashed_maids,
    list_t *ln,
    char *partner_id,
    list_t *ph,
    list_t *st,
    list_t *zp
    ) {
    conversion_events_user_data_properties_t *conversion_events_user_data_properties_local_var = malloc(sizeof(conversion_events_user_data_properties_t));
    if (!conversion_events_user_data_properties_local_var) {
        return NULL;
    }
    memset(conversion_events_user_data_properties_local_var, 0, sizeof(conversion_events_user_data_properties_t));
    conversion_events_user_data_properties_local_var->_library_owned = 1;
    conversion_events_user_data_properties_local_var->click_id = click_id;
    conversion_events_user_data_properties_local_var->client_ip_address = client_ip_address;
    conversion_events_user_data_properties_local_var->client_user_agent = client_user_agent;
    conversion_events_user_data_properties_local_var->country = country;
    conversion_events_user_data_properties_local_var->ct = ct;
    conversion_events_user_data_properties_local_var->db = db;
    conversion_events_user_data_properties_local_var->em = em;
    conversion_events_user_data_properties_local_var->external_id = external_id;
    conversion_events_user_data_properties_local_var->fn = fn;
    conversion_events_user_data_properties_local_var->ge = ge;
    conversion_events_user_data_properties_local_var->hashed_maids = hashed_maids;
    conversion_events_user_data_properties_local_var->ln = ln;
    conversion_events_user_data_properties_local_var->partner_id = partner_id;
    conversion_events_user_data_properties_local_var->ph = ph;
    conversion_events_user_data_properties_local_var->st = st;
    conversion_events_user_data_properties_local_var->zp = zp;
    return conversion_events_user_data_properties_local_var;
}

__attribute__((deprecated)) conversion_events_user_data_properties_t *conversion_events_user_data_properties_create(
    char *click_id,
    char *client_ip_address,
    char *client_user_agent,
    list_t *country,
    list_t *ct,
    list_t *db,
    list_t *em,
    list_t *external_id,
    list_t *fn,
    list_t *ge,
    list_t *hashed_maids,
    list_t *ln,
    char *partner_id,
    list_t *ph,
    list_t *st,
    list_t *zp
    ) {
    conversion_events_user_data_properties_t *result = conversion_events_user_data_properties_create_internal (
        click_id,
        client_ip_address,
        client_user_agent,
        country,
        ct,
        db,
        em,
        external_id,
        fn,
        ge,
        hashed_maids,
        ln,
        partner_id,
        ph,
        st,
        zp
        );
    if (!result) {
    }
    return result;
}

void conversion_events_user_data_properties_free(conversion_events_user_data_properties_t *conversion_events_user_data_properties) {
    if(NULL == conversion_events_user_data_properties){
        return ;
    }
    if(conversion_events_user_data_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_events_user_data_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_events_user_data_properties->click_id) {
        free(conversion_events_user_data_properties->click_id);
        conversion_events_user_data_properties->click_id = NULL;
    }
    if (conversion_events_user_data_properties->client_ip_address) {
        free(conversion_events_user_data_properties->client_ip_address);
        conversion_events_user_data_properties->client_ip_address = NULL;
    }
    if (conversion_events_user_data_properties->client_user_agent) {
        free(conversion_events_user_data_properties->client_user_agent);
        conversion_events_user_data_properties->client_user_agent = NULL;
    }
    if (conversion_events_user_data_properties->country) {
        list_ForEach(listEntry, conversion_events_user_data_properties->country) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data_properties->country);
        conversion_events_user_data_properties->country = NULL;
    }
    if (conversion_events_user_data_properties->ct) {
        list_ForEach(listEntry, conversion_events_user_data_properties->ct) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data_properties->ct);
        conversion_events_user_data_properties->ct = NULL;
    }
    if (conversion_events_user_data_properties->db) {
        list_ForEach(listEntry, conversion_events_user_data_properties->db) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data_properties->db);
        conversion_events_user_data_properties->db = NULL;
    }
    if (conversion_events_user_data_properties->em) {
        list_ForEach(listEntry, conversion_events_user_data_properties->em) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data_properties->em);
        conversion_events_user_data_properties->em = NULL;
    }
    if (conversion_events_user_data_properties->external_id) {
        list_ForEach(listEntry, conversion_events_user_data_properties->external_id) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data_properties->external_id);
        conversion_events_user_data_properties->external_id = NULL;
    }
    if (conversion_events_user_data_properties->fn) {
        list_ForEach(listEntry, conversion_events_user_data_properties->fn) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data_properties->fn);
        conversion_events_user_data_properties->fn = NULL;
    }
    if (conversion_events_user_data_properties->ge) {
        list_ForEach(listEntry, conversion_events_user_data_properties->ge) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data_properties->ge);
        conversion_events_user_data_properties->ge = NULL;
    }
    if (conversion_events_user_data_properties->hashed_maids) {
        list_ForEach(listEntry, conversion_events_user_data_properties->hashed_maids) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data_properties->hashed_maids);
        conversion_events_user_data_properties->hashed_maids = NULL;
    }
    if (conversion_events_user_data_properties->ln) {
        list_ForEach(listEntry, conversion_events_user_data_properties->ln) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data_properties->ln);
        conversion_events_user_data_properties->ln = NULL;
    }
    if (conversion_events_user_data_properties->partner_id) {
        free(conversion_events_user_data_properties->partner_id);
        conversion_events_user_data_properties->partner_id = NULL;
    }
    if (conversion_events_user_data_properties->ph) {
        list_ForEach(listEntry, conversion_events_user_data_properties->ph) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data_properties->ph);
        conversion_events_user_data_properties->ph = NULL;
    }
    if (conversion_events_user_data_properties->st) {
        list_ForEach(listEntry, conversion_events_user_data_properties->st) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data_properties->st);
        conversion_events_user_data_properties->st = NULL;
    }
    if (conversion_events_user_data_properties->zp) {
        list_ForEach(listEntry, conversion_events_user_data_properties->zp) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data_properties->zp);
        conversion_events_user_data_properties->zp = NULL;
    }
    free(conversion_events_user_data_properties);
}

cJSON *conversion_events_user_data_properties_convertToJSON(conversion_events_user_data_properties_t *conversion_events_user_data_properties) {
    cJSON *item = cJSON_CreateObject();

    // conversion_events_user_data_properties->click_id
    if(conversion_events_user_data_properties->click_id) {
    if(cJSON_AddStringToObject(item, "click_id", conversion_events_user_data_properties->click_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_user_data_properties->client_ip_address
    if(conversion_events_user_data_properties->client_ip_address) {
    if(cJSON_AddStringToObject(item, "client_ip_address", conversion_events_user_data_properties->client_ip_address) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_user_data_properties->client_user_agent
    if(conversion_events_user_data_properties->client_user_agent) {
    if(cJSON_AddStringToObject(item, "client_user_agent", conversion_events_user_data_properties->client_user_agent) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_user_data_properties->country
    if(conversion_events_user_data_properties->country) {
    cJSON *country = cJSON_AddArrayToObject(item, "country");
    if(country == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *countryListEntry;
    list_ForEach(countryListEntry, conversion_events_user_data_properties->country) {
    if(cJSON_AddStringToObject(country, "", countryListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data_properties->ct
    if(conversion_events_user_data_properties->ct) {
    cJSON *ct = cJSON_AddArrayToObject(item, "ct");
    if(ct == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *ctListEntry;
    list_ForEach(ctListEntry, conversion_events_user_data_properties->ct) {
    if(cJSON_AddStringToObject(ct, "", ctListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data_properties->db
    if(conversion_events_user_data_properties->db) {
    cJSON *db = cJSON_AddArrayToObject(item, "db");
    if(db == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *dbListEntry;
    list_ForEach(dbListEntry, conversion_events_user_data_properties->db) {
    if(cJSON_AddStringToObject(db, "", dbListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data_properties->em
    if(conversion_events_user_data_properties->em) {
    cJSON *em = cJSON_AddArrayToObject(item, "em");
    if(em == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *emListEntry;
    list_ForEach(emListEntry, conversion_events_user_data_properties->em) {
    if(cJSON_AddStringToObject(em, "", emListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data_properties->external_id
    if(conversion_events_user_data_properties->external_id) {
    cJSON *external_id = cJSON_AddArrayToObject(item, "external_id");
    if(external_id == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *external_idListEntry;
    list_ForEach(external_idListEntry, conversion_events_user_data_properties->external_id) {
    if(cJSON_AddStringToObject(external_id, "", external_idListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data_properties->fn
    if(conversion_events_user_data_properties->fn) {
    cJSON *fn = cJSON_AddArrayToObject(item, "fn");
    if(fn == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *fnListEntry;
    list_ForEach(fnListEntry, conversion_events_user_data_properties->fn) {
    if(cJSON_AddStringToObject(fn, "", fnListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data_properties->ge
    if(conversion_events_user_data_properties->ge) {
    cJSON *ge = cJSON_AddArrayToObject(item, "ge");
    if(ge == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *geListEntry;
    list_ForEach(geListEntry, conversion_events_user_data_properties->ge) {
    if(cJSON_AddStringToObject(ge, "", geListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data_properties->hashed_maids
    if(conversion_events_user_data_properties->hashed_maids) {
    cJSON *hashed_maids = cJSON_AddArrayToObject(item, "hashed_maids");
    if(hashed_maids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *hashed_maidsListEntry;
    list_ForEach(hashed_maidsListEntry, conversion_events_user_data_properties->hashed_maids) {
    if(cJSON_AddStringToObject(hashed_maids, "", hashed_maidsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data_properties->ln
    if(conversion_events_user_data_properties->ln) {
    cJSON *ln = cJSON_AddArrayToObject(item, "ln");
    if(ln == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *lnListEntry;
    list_ForEach(lnListEntry, conversion_events_user_data_properties->ln) {
    if(cJSON_AddStringToObject(ln, "", lnListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data_properties->partner_id
    if(conversion_events_user_data_properties->partner_id) {
    if(cJSON_AddStringToObject(item, "partner_id", conversion_events_user_data_properties->partner_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_user_data_properties->ph
    if(conversion_events_user_data_properties->ph) {
    cJSON *ph = cJSON_AddArrayToObject(item, "ph");
    if(ph == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *phListEntry;
    list_ForEach(phListEntry, conversion_events_user_data_properties->ph) {
    if(cJSON_AddStringToObject(ph, "", phListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data_properties->st
    if(conversion_events_user_data_properties->st) {
    cJSON *st = cJSON_AddArrayToObject(item, "st");
    if(st == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *stListEntry;
    list_ForEach(stListEntry, conversion_events_user_data_properties->st) {
    if(cJSON_AddStringToObject(st, "", stListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data_properties->zp
    if(conversion_events_user_data_properties->zp) {
    cJSON *zp = cJSON_AddArrayToObject(item, "zp");
    if(zp == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *zpListEntry;
    list_ForEach(zpListEntry, conversion_events_user_data_properties->zp) {
    if(cJSON_AddStringToObject(zp, "", zpListEntry->data) == NULL)
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

conversion_events_user_data_properties_t *conversion_events_user_data_properties_parseFromJSON(cJSON *conversion_events_user_data_propertiesJSON){

    conversion_events_user_data_properties_t *conversion_events_user_data_properties_local_var = NULL;

    char *click_id_local_str = NULL;

    char *client_ip_address_local_str = NULL;

    char *client_user_agent_local_str = NULL;

    // define the local list for conversion_events_user_data_properties->country
    list_t *countryList = NULL;

    // define the local list for conversion_events_user_data_properties->ct
    list_t *ctList = NULL;

    // define the local list for conversion_events_user_data_properties->db
    list_t *dbList = NULL;

    // define the local list for conversion_events_user_data_properties->em
    list_t *emList = NULL;

    // define the local list for conversion_events_user_data_properties->external_id
    list_t *external_idList = NULL;

    // define the local list for conversion_events_user_data_properties->fn
    list_t *fnList = NULL;

    // define the local list for conversion_events_user_data_properties->ge
    list_t *geList = NULL;

    // define the local list for conversion_events_user_data_properties->hashed_maids
    list_t *hashed_maidsList = NULL;

    // define the local list for conversion_events_user_data_properties->ln
    list_t *lnList = NULL;

    char *partner_id_local_str = NULL;

    // define the local list for conversion_events_user_data_properties->ph
    list_t *phList = NULL;

    // define the local list for conversion_events_user_data_properties->st
    list_t *stList = NULL;

    // define the local list for conversion_events_user_data_properties->zp
    list_t *zpList = NULL;

    // conversion_events_user_data_properties->click_id
    cJSON *click_id = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "click_id");
    if (cJSON_IsNull(click_id)) {
        click_id = NULL;
    }
    if (click_id) { 
    if(!cJSON_IsString(click_id) && !cJSON_IsNull(click_id))
    {
    goto end; //String
    }
    }

    // conversion_events_user_data_properties->client_ip_address
    cJSON *client_ip_address = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "client_ip_address");
    if (cJSON_IsNull(client_ip_address)) {
        client_ip_address = NULL;
    }
    if (client_ip_address) { 
    if(!cJSON_IsString(client_ip_address) && !cJSON_IsNull(client_ip_address))
    {
    goto end; //String
    }
    }

    // conversion_events_user_data_properties->client_user_agent
    cJSON *client_user_agent = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "client_user_agent");
    if (cJSON_IsNull(client_user_agent)) {
        client_user_agent = NULL;
    }
    if (client_user_agent) { 
    if(!cJSON_IsString(client_user_agent) && !cJSON_IsNull(client_user_agent))
    {
    goto end; //String
    }
    }

    // conversion_events_user_data_properties->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (country) { 
    cJSON *country_local = NULL;
    if(!cJSON_IsArray(country)) {
        goto end;//primitive container
    }
    countryList = list_createList();

    cJSON_ArrayForEach(country_local, country)
    {
        if(!cJSON_IsString(country_local))
        {
            goto end;
        }
        list_addElement(countryList , strdup(country_local->valuestring));
    }
    }

    // conversion_events_user_data_properties->ct
    cJSON *ct = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "ct");
    if (cJSON_IsNull(ct)) {
        ct = NULL;
    }
    if (ct) { 
    cJSON *ct_local = NULL;
    if(!cJSON_IsArray(ct)) {
        goto end;//primitive container
    }
    ctList = list_createList();

    cJSON_ArrayForEach(ct_local, ct)
    {
        if(!cJSON_IsString(ct_local))
        {
            goto end;
        }
        list_addElement(ctList , strdup(ct_local->valuestring));
    }
    }

    // conversion_events_user_data_properties->db
    cJSON *db = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "db");
    if (cJSON_IsNull(db)) {
        db = NULL;
    }
    if (db) { 
    cJSON *db_local = NULL;
    if(!cJSON_IsArray(db)) {
        goto end;//primitive container
    }
    dbList = list_createList();

    cJSON_ArrayForEach(db_local, db)
    {
        if(!cJSON_IsString(db_local))
        {
            goto end;
        }
        list_addElement(dbList , strdup(db_local->valuestring));
    }
    }

    // conversion_events_user_data_properties->em
    cJSON *em = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "em");
    if (cJSON_IsNull(em)) {
        em = NULL;
    }
    if (em) { 
    cJSON *em_local = NULL;
    if(!cJSON_IsArray(em)) {
        goto end;//primitive container
    }
    emList = list_createList();

    cJSON_ArrayForEach(em_local, em)
    {
        if(!cJSON_IsString(em_local))
        {
            goto end;
        }
        list_addElement(emList , strdup(em_local->valuestring));
    }
    }

    // conversion_events_user_data_properties->external_id
    cJSON *external_id = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "external_id");
    if (cJSON_IsNull(external_id)) {
        external_id = NULL;
    }
    if (external_id) { 
    cJSON *external_id_local = NULL;
    if(!cJSON_IsArray(external_id)) {
        goto end;//primitive container
    }
    external_idList = list_createList();

    cJSON_ArrayForEach(external_id_local, external_id)
    {
        if(!cJSON_IsString(external_id_local))
        {
            goto end;
        }
        list_addElement(external_idList , strdup(external_id_local->valuestring));
    }
    }

    // conversion_events_user_data_properties->fn
    cJSON *fn = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "fn");
    if (cJSON_IsNull(fn)) {
        fn = NULL;
    }
    if (fn) { 
    cJSON *fn_local = NULL;
    if(!cJSON_IsArray(fn)) {
        goto end;//primitive container
    }
    fnList = list_createList();

    cJSON_ArrayForEach(fn_local, fn)
    {
        if(!cJSON_IsString(fn_local))
        {
            goto end;
        }
        list_addElement(fnList , strdup(fn_local->valuestring));
    }
    }

    // conversion_events_user_data_properties->ge
    cJSON *ge = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "ge");
    if (cJSON_IsNull(ge)) {
        ge = NULL;
    }
    if (ge) { 
    cJSON *ge_local = NULL;
    if(!cJSON_IsArray(ge)) {
        goto end;//primitive container
    }
    geList = list_createList();

    cJSON_ArrayForEach(ge_local, ge)
    {
        if(!cJSON_IsString(ge_local))
        {
            goto end;
        }
        list_addElement(geList , strdup(ge_local->valuestring));
    }
    }

    // conversion_events_user_data_properties->hashed_maids
    cJSON *hashed_maids = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "hashed_maids");
    if (cJSON_IsNull(hashed_maids)) {
        hashed_maids = NULL;
    }
    if (hashed_maids) { 
    cJSON *hashed_maids_local = NULL;
    if(!cJSON_IsArray(hashed_maids)) {
        goto end;//primitive container
    }
    hashed_maidsList = list_createList();

    cJSON_ArrayForEach(hashed_maids_local, hashed_maids)
    {
        if(!cJSON_IsString(hashed_maids_local))
        {
            goto end;
        }
        list_addElement(hashed_maidsList , strdup(hashed_maids_local->valuestring));
    }
    }

    // conversion_events_user_data_properties->ln
    cJSON *ln = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "ln");
    if (cJSON_IsNull(ln)) {
        ln = NULL;
    }
    if (ln) { 
    cJSON *ln_local = NULL;
    if(!cJSON_IsArray(ln)) {
        goto end;//primitive container
    }
    lnList = list_createList();

    cJSON_ArrayForEach(ln_local, ln)
    {
        if(!cJSON_IsString(ln_local))
        {
            goto end;
        }
        list_addElement(lnList , strdup(ln_local->valuestring));
    }
    }

    // conversion_events_user_data_properties->partner_id
    cJSON *partner_id = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "partner_id");
    if (cJSON_IsNull(partner_id)) {
        partner_id = NULL;
    }
    if (partner_id) { 
    if(!cJSON_IsString(partner_id) && !cJSON_IsNull(partner_id))
    {
    goto end; //String
    }
    }

    // conversion_events_user_data_properties->ph
    cJSON *ph = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "ph");
    if (cJSON_IsNull(ph)) {
        ph = NULL;
    }
    if (ph) { 
    cJSON *ph_local = NULL;
    if(!cJSON_IsArray(ph)) {
        goto end;//primitive container
    }
    phList = list_createList();

    cJSON_ArrayForEach(ph_local, ph)
    {
        if(!cJSON_IsString(ph_local))
        {
            goto end;
        }
        list_addElement(phList , strdup(ph_local->valuestring));
    }
    }

    // conversion_events_user_data_properties->st
    cJSON *st = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "st");
    if (cJSON_IsNull(st)) {
        st = NULL;
    }
    if (st) { 
    cJSON *st_local = NULL;
    if(!cJSON_IsArray(st)) {
        goto end;//primitive container
    }
    stList = list_createList();

    cJSON_ArrayForEach(st_local, st)
    {
        if(!cJSON_IsString(st_local))
        {
            goto end;
        }
        list_addElement(stList , strdup(st_local->valuestring));
    }
    }

    // conversion_events_user_data_properties->zp
    cJSON *zp = cJSON_GetObjectItemCaseSensitive(conversion_events_user_data_propertiesJSON, "zp");
    if (cJSON_IsNull(zp)) {
        zp = NULL;
    }
    if (zp) { 
    cJSON *zp_local = NULL;
    if(!cJSON_IsArray(zp)) {
        goto end;//primitive container
    }
    zpList = list_createList();

    cJSON_ArrayForEach(zp_local, zp)
    {
        if(!cJSON_IsString(zp_local))
        {
            goto end;
        }
        list_addElement(zpList , strdup(zp_local->valuestring));
    }
    }


    if (click_id && !cJSON_IsNull(click_id)) click_id_local_str = strdup(click_id->valuestring);
    if (client_ip_address && !cJSON_IsNull(client_ip_address)) client_ip_address_local_str = strdup(client_ip_address->valuestring);
    if (client_user_agent && !cJSON_IsNull(client_user_agent)) client_user_agent_local_str = strdup(client_user_agent->valuestring);
    if (partner_id && !cJSON_IsNull(partner_id)) partner_id_local_str = strdup(partner_id->valuestring);

    conversion_events_user_data_properties_local_var = conversion_events_user_data_properties_create_internal (
        click_id_local_str,
        client_ip_address_local_str,
        client_user_agent_local_str,
        country ? countryList : NULL,
        ct ? ctList : NULL,
        db ? dbList : NULL,
        em ? emList : NULL,
        external_id ? external_idList : NULL,
        fn ? fnList : NULL,
        ge ? geList : NULL,
        hashed_maids ? hashed_maidsList : NULL,
        ln ? lnList : NULL,
        partner_id_local_str,
        ph ? phList : NULL,
        st ? stList : NULL,
        zp ? zpList : NULL
        );

    if (!conversion_events_user_data_properties_local_var) {
        goto end;
    }

    return conversion_events_user_data_properties_local_var;
end:
    if (click_id_local_str) {
        free(click_id_local_str);
        click_id_local_str = NULL;
    }
    if (client_ip_address_local_str) {
        free(client_ip_address_local_str);
        client_ip_address_local_str = NULL;
    }
    if (client_user_agent_local_str) {
        free(client_user_agent_local_str);
        client_user_agent_local_str = NULL;
    }
    if (countryList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, countryList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(countryList);
        countryList = NULL;
    }
    if (ctList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ctList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ctList);
        ctList = NULL;
    }
    if (dbList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dbList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dbList);
        dbList = NULL;
    }
    if (emList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, emList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(emList);
        emList = NULL;
    }
    if (external_idList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, external_idList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(external_idList);
        external_idList = NULL;
    }
    if (fnList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, fnList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(fnList);
        fnList = NULL;
    }
    if (geList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, geList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(geList);
        geList = NULL;
    }
    if (hashed_maidsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, hashed_maidsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(hashed_maidsList);
        hashed_maidsList = NULL;
    }
    if (lnList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, lnList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(lnList);
        lnList = NULL;
    }
    if (partner_id_local_str) {
        free(partner_id_local_str);
        partner_id_local_str = NULL;
    }
    if (phList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, phList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(phList);
        phList = NULL;
    }
    if (stList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, stList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(stList);
        stList = NULL;
    }
    if (zpList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, zpList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(zpList);
        zpList = NULL;
    }
    return NULL;

}
