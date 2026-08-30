# schedules_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SchedulesCreate**](schedules_api.md#SchedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**SchedulesList**](schedules_api.md#SchedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**SchedulesUpdate**](schedules_api.md#SchedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules


<a name="SchedulesCreate"></a>
# **SchedulesCreate**
> SchedulesCreate200ResponseInner SchedulesCreate(adAccountId, scheduleCreate)

Create schedules

Batch create schedules
<a name="SchedulesList"></a>
# **SchedulesList**
> SchedulesList200Response SchedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType)

Get Schedules

Get schedules for a specific advertiser
<a name="SchedulesUpdate"></a>
# **SchedulesUpdate**
> SchedulesCreate200ResponseInner SchedulesUpdate(adAccountId, scheduleBatchUpdate)

Update schedules

Update one or more schedules
