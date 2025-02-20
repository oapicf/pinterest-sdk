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
class CONVERSION_API_RESPONSE_EVENTS_INNER




feature --Access

    status: detachable STRING_32
      -- Whether the event was processed successfully.
    error_message: detachable STRING_32
      -- Error message containing more information about why the event failed to be processed.
    warning_message: detachable STRING_32
      -- Warning messages about any fields in the event which are not standard. These are not critical to event processing.

feature -- Change Element

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name
      end

    set_error_message (a_name: like error_message)
        -- Set 'error_message' with 'a_name'.
      do
        error_message := a_name
      ensure
        error_message_set: error_message = a_name
      end

    set_warning_message (a_name: like warning_message)
        -- Set 'warning_message' with 'a_name'.
      do
        warning_message := a_name
      ensure
        warning_message_set: warning_message = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CONVERSION_API_RESPONSE_EVENTS_INNER%N")
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")
        end
        if attached error_message as l_error_message then
          Result.append ("%Nerror_message:")
          Result.append (l_error_message.out)
          Result.append ("%N")
        end
        if attached warning_message as l_warning_message then
          Result.append ("%Nwarning_message:")
          Result.append (l_warning_message.out)
          Result.append ("%N")
        end
      end
end

