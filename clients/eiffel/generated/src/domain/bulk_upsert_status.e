note
 description:"[
		Pinterest REST API
 		Pinterest's REST API
  		The version of the OpenAPI document: 5.12.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class BULK_UPSERT_STATUS

feature -- Access

  value: detachable STRING_32
      -- enumerated value.
    note
            option: stable
    attribute
    end

feature -- Enum

 val_running: BULK_UPSERT_STATUS
    once
      create Result
      Result.set_value ("RUNNING")
    end

 val_succeeded: BULK_UPSERT_STATUS
    once
      create Result
      Result.set_value ("SUCCEEDED")
    end

 val_failed: BULK_UPSERT_STATUS
    once
      create Result
      Result.set_value ("FAILED")
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
