
# Table `AdsCreditRedeemRequest`
(mapped from: AdsCreditRedeemRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerCodeHash** | offerCodeHash | text NOT NULL |  | **kotlin.String** | Takes in a SHA256 hash of the offerCode. | 
**validateOnly** | validateOnly | boolean NOT NULL |  | **kotlin.Boolean** | If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account | 




