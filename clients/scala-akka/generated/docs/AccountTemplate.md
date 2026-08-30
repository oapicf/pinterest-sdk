

# AccountTemplate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | ID of the Ad Account that owns the template |  [optional] [readonly]
**adAccountIds** | **Seq&lt;String&gt;** | IDs of the Ad Accounts that have access to this template |  [optional]
**adeColumns** | **Seq&lt;String&gt;** | A list of ADE columns |  [optional]
**attributionType** | **AnyType** | Attribution type for Brand/Category/SKU reports |  [optional]
**clickWindowDays** | **BigDecimal** | The length of the sliding window over which click conversions will be attributed |  [optional]
**columns** | **Seq&lt;ReportingColumn&gt;** | A list of columns to be included in the report |  [optional]
**conversionReportTimeType** | **ConversionReportTimeType** | Conversion report time type |  [optional]
**creationSource** | **CreationSource** | The surface used to create this template |  [optional]
**customColumnIds** | **Seq&lt;String&gt;** | A list of custom column IDs |  [optional]
**displayMetadata** | **String** | Additional metadata about this reporting template |  [optional]
**engagementWindowDays** | **BigDecimal** | The length of the sliding window over which engagement conversions will be attributed |  [optional]
**filtersJson** | **String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values |  [optional]
**granularity** | **Granularity** |  |  [optional]
**id** | **String** | Template ID |  [readonly]
**ingestionSources** | **Seq&lt;IngestionSource&gt;** | The filter on the conversion ingestion source method for conversion metrics |  [optional]
**isDefault** | **Boolean** | A boolean representing if this is the default view that loads for this template type |  [optional]
**isDeleted** | **Boolean** | A boolean that indicates if the template has been deleted |  [optional]
**isOwnedByUser** | **Boolean** | A boolean value that indicates if the user owns the template |  [optional]
**isScheduled** | **Boolean** | A boolean value that indicates if this template has been used to create a scheduled report |  [optional]
**name** | **String** | Template Name |  [optional]
**reportEndRelativeDaysInPast** | **BigDecimal** | The number of days prior to the day the report will be delivered at which the report will end |  [optional]
**reportFormat** | **DataOutputFormat** |  |  [optional]
**reportLevel** | **MetricsReportingLevel** |  |  [optional]
**reportStartRelativeDaysInPast** | **BigDecimal** | The number of days prior to the day the report will be delivered at which the report will start |  [optional]
**reportingTimeZone** | **ReportingTimeZone** | Timezone for reporting data |  [optional]
**sortBy** | **AnyType** | Unified metric sort configuration |  [optional]
**`type`** | **String** | Type of the template |  [optional]
**updatedTime** | **BigDecimal** | Time of last update in seconds since Unix epoch |  [optional] [readonly]
**userId** | **String** | ID of the user who created the template |  [optional]
**viewWindowDays** | **BigDecimal** | The length of the sliding window over which view conversions will be attributed |  [optional]



