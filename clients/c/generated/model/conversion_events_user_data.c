#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_events_user_data.h"



conversion_events_user_data_t *conversion_events_user_data_create(
    list_t *ph,
    list_t *ge,
    list_t *db,
    list_t *ln,
    list_t *fn,
    list_t *ct,
    list_t *st,
    list_t *zp,
    list_t *country,
    list_t *external_id,
    char *click_id,
    char *partner_id
    ) {
    conversion_events_user_data_t *conversion_events_user_data_local_var = malloc(sizeof(conversion_events_user_data_t));
    if (!conversion_events_user_data_local_var) {
        return NULL;
    }
    conversion_events_user_data_local_var->ph = ph;
    conversion_events_user_data_local_var->ge = ge;
    conversion_events_user_data_local_var->db = db;
    conversion_events_user_data_local_var->ln = ln;
    conversion_events_user_data_local_var->fn = fn;
    conversion_events_user_data_local_var->ct = ct;
    conversion_events_user_data_local_var->st = st;
    conversion_events_user_data_local_var->zp = zp;
    conversion_events_user_data_local_var->country = country;
    conversion_events_user_data_local_var->external_id = external_id;
    conversion_events_user_data_local_var->click_id = click_id;
    conversion_events_user_data_local_var->partner_id = partner_id;

    return conversion_events_user_data_local_var;
}


void conversion_events_user_data_free(conversion_events_user_data_t *conversion_events_user_data) {
    if(NULL == conversion_events_user_data){
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_events_user_data->ph) {
        list_ForEach(listEntry, conversion_events_user_data->ph) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data->ph);
        conversion_events_user_data->ph = NULL;
    }
    if (conversion_events_user_data->ge) {
        list_ForEach(listEntry, conversion_events_user_data->ge) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data->ge);
        conversion_events_user_data->ge = NULL;
    }
    if (conversion_events_user_data->db) {
        list_ForEach(listEntry, conversion_events_user_data->db) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data->db);
        conversion_events_user_data->db = NULL;
    }
    if (conversion_events_user_data->ln) {
        list_ForEach(listEntry, conversion_events_user_data->ln) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data->ln);
        conversion_events_user_data->ln = NULL;
    }
    if (conversion_events_user_data->fn) {
        list_ForEach(listEntry, conversion_events_user_data->fn) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data->fn);
        conversion_events_user_data->fn = NULL;
    }
    if (conversion_events_user_data->ct) {
        list_ForEach(listEntry, conversion_events_user_data->ct) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data->ct);
        conversion_events_user_data->ct = NULL;
    }
    if (conversion_events_user_data->st) {
        list_ForEach(listEntry, conversion_events_user_data->st) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data->st);
        conversion_events_user_data->st = NULL;
    }
    if (conversion_events_user_data->zp) {
        list_ForEach(listEntry, conversion_events_user_data->zp) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data->zp);
        conversion_events_user_data->zp = NULL;
    }
    if (conversion_events_user_data->country) {
        list_ForEach(listEntry, conversion_events_user_data->country) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data->country);
        conversion_events_user_data->country = NULL;
    }
    if (conversion_events_user_data->external_id) {
        list_ForEach(listEntry, conversion_events_user_data->external_id) {
            free(listEntry->data);
        }
        list_freeList(conversion_events_user_data->external_id);
        conversion_events_user_data->external_id = NULL;
    }
    if (conversion_events_user_data->click_id) {
        free(conversion_events_user_data->click_id);
        conversion_events_user_data->click_id = NULL;
    }
    if (conversion_events_user_data->partner_id) {
        free(conversion_events_user_data->partner_id);
        conversion_events_user_data->partner_id = NULL;
    }
    free(conversion_events_user_data);
}

cJSON *conversion_events_user_data_convertToJSON(conversion_events_user_data_t *conversion_events_user_data) {
    cJSON *item = cJSON_CreateObject();

    // conversion_events_user_data->ph
    if(conversion_events_user_data->ph) {
    cJSON *ph = cJSON_AddArrayToObject(item, "ph");
    if(ph == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *phListEntry;
    list_ForEach(phListEntry, conversion_events_user_data->ph) {
    if(cJSON_AddStringToObject(ph, "", (char*)phListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data->ge
    if(conversion_events_user_data->ge) {
    cJSON *ge = cJSON_AddArrayToObject(item, "ge");
    if(ge == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *geListEntry;
    list_ForEach(geListEntry, conversion_events_user_data->ge) {
    if(cJSON_AddStringToObject(ge, "", (char*)geListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data->db
    if(conversion_events_user_data->db) {
    cJSON *db = cJSON_AddArrayToObject(item, "db");
    if(db == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *dbListEntry;
    list_ForEach(dbListEntry, conversion_events_user_data->db) {
    if(cJSON_AddStringToObject(db, "", (char*)dbListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data->ln
    if(conversion_events_user_data->ln) {
    cJSON *ln = cJSON_AddArrayToObject(item, "ln");
    if(ln == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *lnListEntry;
    list_ForEach(lnListEntry, conversion_events_user_data->ln) {
    if(cJSON_AddStringToObject(ln, "", (char*)lnListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data->fn
    if(conversion_events_user_data->fn) {
    cJSON *fn = cJSON_AddArrayToObject(item, "fn");
    if(fn == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *fnListEntry;
    list_ForEach(fnListEntry, conversion_events_user_data->fn) {
    if(cJSON_AddStringToObject(fn, "", (char*)fnListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data->ct
    if(conversion_events_user_data->ct) {
    cJSON *ct = cJSON_AddArrayToObject(item, "ct");
    if(ct == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *ctListEntry;
    list_ForEach(ctListEntry, conversion_events_user_data->ct) {
    if(cJSON_AddStringToObject(ct, "", (char*)ctListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data->st
    if(conversion_events_user_data->st) {
    cJSON *st = cJSON_AddArrayToObject(item, "st");
    if(st == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *stListEntry;
    list_ForEach(stListEntry, conversion_events_user_data->st) {
    if(cJSON_AddStringToObject(st, "", (char*)stListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data->zp
    if(conversion_events_user_data->zp) {
    cJSON *zp = cJSON_AddArrayToObject(item, "zp");
    if(zp == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *zpListEntry;
    list_ForEach(zpListEntry, conversion_events_user_data->zp) {
    if(cJSON_AddStringToObject(zp, "", (char*)zpListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data->country
    if(conversion_events_user_data->country) {
    cJSON *country = cJSON_AddArrayToObject(item, "country");
    if(country == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *countryListEntry;
    list_ForEach(countryListEntry, conversion_events_user_data->country) {
    if(cJSON_AddStringToObject(country, "", (char*)countryListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data->external_id
    if(conversion_events_user_data->external_id) {
    cJSON *external_id = cJSON_AddArrayToObject(item, "external_id");
    if(external_id == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *external_idListEntry;
    list_ForEach(external_idListEntry, conversion_events_user_data->external_id) {
    if(cJSON_AddStringToObject(external_id, "", (char*)external_idListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_events_user_data->click_id
    if(conversion_events_user_data->click_id) {
    if(cJSON_AddStringToObject(item, "click_id", conversion_events_user_data->click_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_events_user_data->partner_id
    if(conversion_events_user_data->partner_id) {
    if(cJSON_AddStringToObject(item, "partner_id", conversion_events_user_data->partner_id) == NULL) {
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

conversion_events_user_data_t *conversion_events_user_data_parseFromJSON(cJSON *conversion_events_user_dataJSON){

    conversion_events_user_data_t *conversion_events_user_data_local_var = NULL;

    // define the local list for conversion_events_user_data->ph
    list_t *phList = NULL;

    // define the local list for conversion_events_user_data->ge
    list_t *geList = NULL;

    // define the local list for conversion_events_user_data->db
    list_t *dbList = NULL;

    // define the local list for conversion_events_user_data->ln
    list_t *lnList = NULL;

    // define the local list for conversion_events_user_data->fn
    list_t *fnList = NULL;

    // define the local list for conversion_events_user_data->ct
    list_t *ctList = NULL;

    // define the local list for conversion_events_user_data->st
    list_t *stList = NULL;

    // define the local list for conversion_events_user_data->zp
    list_t *zpList = NULL;

    // define the local list for conversion_events_user_data->country
    list_t *countryList = NULL;

    // define the local list for conversion_events_user_data->external_id
    list_t *external_idList = NULL;

    // conversion_events_user_data->ph
    cJSON *ph = cJSON_GetObjectItemCaseSensitive(conversion_events_user_dataJSON, "ph");
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

    // conversion_events_user_data->ge
    cJSON *ge = cJSON_GetObjectItemCaseSensitive(conversion_events_user_dataJSON, "ge");
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

    // conversion_events_user_data->db
    cJSON *db = cJSON_GetObjectItemCaseSensitive(conversion_events_user_dataJSON, "db");
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

    // conversion_events_user_data->ln
    cJSON *ln = cJSON_GetObjectItemCaseSensitive(conversion_events_user_dataJSON, "ln");
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

    // conversion_events_user_data->fn
    cJSON *fn = cJSON_GetObjectItemCaseSensitive(conversion_events_user_dataJSON, "fn");
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

    // conversion_events_user_data->ct
    cJSON *ct = cJSON_GetObjectItemCaseSensitive(conversion_events_user_dataJSON, "ct");
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

    // conversion_events_user_data->st
    cJSON *st = cJSON_GetObjectItemCaseSensitive(conversion_events_user_dataJSON, "st");
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

    // conversion_events_user_data->zp
    cJSON *zp = cJSON_GetObjectItemCaseSensitive(conversion_events_user_dataJSON, "zp");
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

    // conversion_events_user_data->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(conversion_events_user_dataJSON, "country");
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

    // conversion_events_user_data->external_id
    cJSON *external_id = cJSON_GetObjectItemCaseSensitive(conversion_events_user_dataJSON, "external_id");
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

    // conversion_events_user_data->click_id
    cJSON *click_id = cJSON_GetObjectItemCaseSensitive(conversion_events_user_dataJSON, "click_id");
    if (click_id) { 
    if(!cJSON_IsString(click_id) && !cJSON_IsNull(click_id))
    {
    goto end; //String
    }
    }

    // conversion_events_user_data->partner_id
    cJSON *partner_id = cJSON_GetObjectItemCaseSensitive(conversion_events_user_dataJSON, "partner_id");
    if (partner_id) { 
    if(!cJSON_IsString(partner_id) && !cJSON_IsNull(partner_id))
    {
    goto end; //String
    }
    }


    conversion_events_user_data_local_var = conversion_events_user_data_create (
        ph ? phList : NULL,
        ge ? geList : NULL,
        db ? dbList : NULL,
        ln ? lnList : NULL,
        fn ? fnList : NULL,
        ct ? ctList : NULL,
        st ? stList : NULL,
        zp ? zpList : NULL,
        country ? countryList : NULL,
        external_id ? external_idList : NULL,
        click_id && !cJSON_IsNull(click_id) ? strdup(click_id->valuestring) : NULL,
        partner_id && !cJSON_IsNull(partner_id) ? strdup(partner_id->valuestring) : NULL
        );

    return conversion_events_user_data_local_var;
end:
    if (phList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, phList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(phList);
        phList = NULL;
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
    if (dbList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dbList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dbList);
        dbList = NULL;
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
    if (fnList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, fnList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(fnList);
        fnList = NULL;
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
    if (countryList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, countryList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(countryList);
        countryList = NULL;
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
    return NULL;

}
