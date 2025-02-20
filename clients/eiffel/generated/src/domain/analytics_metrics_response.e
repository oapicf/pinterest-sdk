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
class ANALYTICS_METRICS_RESPONSE




feature --Access

    summary_metrics: detachable STRING_TABLE [REAL_32]
      -- The metric name and value over the requested period for each requested metric
    daily_metrics: detachable LIST [ANALYTICS_DAILY_METRICS]
      -- Array with the requested daily metric records

feature -- Change Element

    set_summary_metrics (a_name: like summary_metrics)
        -- Set 'summary_metrics' with 'a_name'.
      do
        summary_metrics := a_name
      ensure
        summary_metrics_set: summary_metrics = a_name
      end

    set_daily_metrics (a_name: like daily_metrics)
        -- Set 'daily_metrics' with 'a_name'.
      do
        daily_metrics := a_name
      ensure
        daily_metrics_set: daily_metrics = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ANALYTICS_METRICS_RESPONSE%N")
        if attached summary_metrics as l_summary_metrics then
          Result.append ("%Nsummary_metrics:")
          across l_summary_metrics as ic loop
            Result.append ("%N")
            Result.append ("key:")
            Result.append (ic.key.out)
            Result.append (" - ")
            Result.append ("val:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached daily_metrics as l_daily_metrics then
          across l_daily_metrics as ic loop
            Result.append ("%N daily_metrics:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

