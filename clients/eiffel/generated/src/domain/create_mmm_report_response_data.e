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
class CREATE_MMM_REPORT_RESPONSE_DATA




feature --Access

    report_status: detachable BULK_REPORTING_JOB_STATUS
      
    token: detachable STRING_32
      
    message: detachable STRING_32
      
    status: detachable STRING_32
      

feature -- Change Element

    set_report_status (a_name: like report_status)
        -- Set 'report_status' with 'a_name'.
      do
        report_status := a_name
      ensure
        report_status_set: report_status = a_name
      end

    set_token (a_name: like token)
        -- Set 'token' with 'a_name'.
      do
        token := a_name
      ensure
        token_set: token = a_name
      end

    set_message (a_name: like message)
        -- Set 'message' with 'a_name'.
      do
        message := a_name
      ensure
        message_set: message = a_name
      end

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CREATE_MMM_REPORT_RESPONSE_DATA%N")
        if attached report_status as l_report_status then
          Result.append ("%Nreport_status:")
          Result.append (l_report_status.out)
          Result.append ("%N")
        end
        if attached token as l_token then
          Result.append ("%Ntoken:")
          Result.append (l_token.out)
          Result.append ("%N")
        end
        if attached message as l_message then
          Result.append ("%Nmessage:")
          Result.append (l_message.out)
          Result.append ("%N")
        end
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")
        end
      end
end

