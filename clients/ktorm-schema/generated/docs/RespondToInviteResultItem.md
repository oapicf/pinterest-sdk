
# Table `RespondToInviteResultItem`
(mapped from: RespondToInviteResultItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**exception** | exception | long |  | [**InviteExceptionResponse**](InviteExceptionResponse.md) |  |  [optional] [foreignkey]
**invite** | invite | long |  | [**BaseInviteDataResponse**](BaseInviteDataResponse.md) | An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created. |  [optional] [foreignkey]




