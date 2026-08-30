

# AgeBucketMultipliers

This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).

The class is defined in **[AgeBucketMultipliers.java](../../src/main/java/org/openapitools/model/AgeBucketMultipliers.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AGE_BUCKET** | `TargetingSpecAgeBucket` | Age bucket identifier. |  [optional property]



