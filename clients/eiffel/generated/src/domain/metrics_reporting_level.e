note
 description:"[
		Pinterest REST API
 		Pinterest's REST API
  		The version of the OpenAPI document: 5.14.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class METRICS_REPORTING_LEVEL

feature -- Access

  value: detachable STRING_32
      -- enumerated value.
    note
            option: stable
    attribute
    end

feature -- Enum

 val_advertiser: METRICS_REPORTING_LEVEL
    once
      create Result
      Result.set_value ("ADVERTISER")
    end

 val_advertiser_targeting: METRICS_REPORTING_LEVEL
    once
      create Result
      Result.set_value ("ADVERTISER_TARGETING")
    end

 val_campaign: METRICS_REPORTING_LEVEL
    once
      create Result
      Result.set_value ("CAMPAIGN")
    end

 val_campaign_targeting: METRICS_REPORTING_LEVEL
    once
      create Result
      Result.set_value ("CAMPAIGN_TARGETING")
    end

 val_ad_group: METRICS_REPORTING_LEVEL
    once
      create Result
      Result.set_value ("AD_GROUP")
    end

 val_ad_group_targeting: METRICS_REPORTING_LEVEL
    once
      create Result
      Result.set_value ("AD_GROUP_TARGETING")
    end

 val_pin_promotion: METRICS_REPORTING_LEVEL
    once
      create Result
      Result.set_value ("PIN_PROMOTION")
    end

 val_pin_promotion_targeting: METRICS_REPORTING_LEVEL
    once
      create Result
      Result.set_value ("PIN_PROMOTION_TARGETING")
    end

 val_keyword: METRICS_REPORTING_LEVEL
    once
      create Result
      Result.set_value ("KEYWORD")
    end

 val_product_group: METRICS_REPORTING_LEVEL
    once
      create Result
      Result.set_value ("PRODUCT_GROUP")
    end

 val_product_group_targeting: METRICS_REPORTING_LEVEL
    once
      create Result
      Result.set_value ("PRODUCT_GROUP_TARGETING")
    end

 val_product_item: METRICS_REPORTING_LEVEL
    once
      create Result
      Result.set_value ("PRODUCT_ITEM")
    end

 val_product_item_targeting: METRICS_REPORTING_LEVEL
    once
      create Result
      Result.set_value ("PRODUCT_ITEM_TARGETING")
    end


feature -- Element Change

  set_value (a_val: like value)
      -- Set `value' with `a_value'.
    do
      value := a_val
    ensure
      value_set: value = a_val
    end


end

