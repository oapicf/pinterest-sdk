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
class ORDER_LINE_RESPONSE




feature --Access

    errors: detachable LIST [ORDER_LINE_ERROR]
      -- Error list if update(s) fail.
    order_line: detachable LIST [ORDER_LINE]
      -- Order Line object array.

feature -- Change Element

    set_errors (a_name: like errors)
        -- Set 'errors' with 'a_name'.
      do
        errors := a_name
      ensure
        errors_set: errors = a_name
      end

    set_order_line (a_name: like order_line)
        -- Set 'order_line' with 'a_name'.
      do
        order_line := a_name
      ensure
        order_line_set: order_line = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ORDER_LINE_RESPONSE%N")
        if attached errors as l_errors then
          across l_errors as ic loop
            Result.append ("%N errors:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached order_line as l_order_line then
          across l_order_line as ic loop
            Result.append ("%N order_line:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

