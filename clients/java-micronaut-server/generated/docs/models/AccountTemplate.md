

# AccountTemplate

The class is defined in **[AccountTemplate.java](../../src/main/java/org/openapitools/model/AccountTemplate.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | ID of the Ad Account that owns the template |  [optional property] [readonly property]
**adAccountIds** | `List&lt;String&gt;` | IDs of the Ad Accounts that have access to this template |  [optional property]
**adeColumns** | `List&lt;String&gt;` | A list of ADE columns |  [optional property]
**attributionType** | `Object` | Attribution type for Brand/Category/SKU reports |  [optional property]
**clickWindowDays** | `BigDecimal` | The length of the sliding window over which click conversions will be attributed |  [optional property]
**columns** | `List&lt;ReportingColumn&gt;` | A list of columns to be included in the report |  [optional property]
**conversionReportTimeType** | `ConversionReportTimeType` | Conversion report time type |  [optional property]
**creationSource** | `CreationSource` | The surface used to create this template |  [optional property]
**customColumnIds** | `List&lt;String&gt;` | A list of custom column IDs |  [optional property]
**displayMetadata** | `String` | Additional metadata about this reporting template |  [optional property]
**engagementWindowDays** | `BigDecimal` | The length of the sliding window over which engagement conversions will be attributed |  [optional property]
**filtersJson** | `String` | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values |  [optional property]
**granularity** | `Granularity` |  |  [optional property]
**id** | `String` | Template ID |  [readonly property]
**ingestionSources** | `List&lt;IngestionSource&gt;` | The filter on the conversion ingestion source method for conversion metrics |  [optional property]
**isDefault** | `Boolean` | A boolean representing if this is the default view that loads for this template type |  [optional property]
**isDeleted** | `Boolean` | A boolean that indicates if the template has been deleted |  [optional property]
**isOwnedByUser** | `Boolean` | A boolean value that indicates if the user owns the template |  [optional property]
**isScheduled** | `Boolean` | A boolean value that indicates if this template has been used to create a scheduled report |  [optional property]
**name** | `String` | Template Name |  [optional property]
**reportEndRelativeDaysInPast** | `BigDecimal` | The number of days prior to the day the report will be delivered at which the report will end |  [optional property]
**reportFormat** | `DataOutputFormat` |  |  [optional property]
**reportLevel** | `MetricsReportingLevel` |  |  [optional property]
**reportStartRelativeDaysInPast** | `BigDecimal` | The number of days prior to the day the report will be delivered at which the report will start |  [optional property]
**reportingTimeZone** | `ReportingTimeZone` | Timezone for reporting data |  [optional property]
**sortBy** | `Object` | Unified metric sort configuration |  [optional property]
**type** | `String` | Type of the template |  [optional property]
**updatedTime** | `BigDecimal` | Time of last update in seconds since Unix epoch |  [optional property] [readonly property]
**userId** | `String` | ID of the user who created the template |  [optional property]
**viewWindowDays** | `BigDecimal` | The length of the sliding window over which view conversions will be attributed |  [optional property]
































