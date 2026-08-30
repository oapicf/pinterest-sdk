
# Table `ConversionDeletionRequestCreate`
(mapped from: ConversionDeletionRequestCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**deletionTargets** | deletion_targets | long NOT NULL |  | [**ConversionDeletionRequestTargets**](ConversionDeletionRequestTargets.md) | Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request. |  [foreignkey]



