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
class AD_ACCOUNTS_COUNTRY_RESPONSE_DATA




feature --Access

    code: detachable AD_COUNTRY
      
    currency: detachable STRING_32
      -- Country currency.
    index: REAL_32
      -- Country index
    name: detachable STRING_32
      -- Country name

feature -- Change Element

    set_code (a_name: like code)
        -- Set 'code' with 'a_name'.
      do
        code := a_name
      ensure
        code_set: code = a_name
      end

    set_currency (a_name: like currency)
        -- Set 'currency' with 'a_name'.
      do
        currency := a_name
      ensure
        currency_set: currency = a_name
      end

    set_index (a_name: like index)
        -- Set 'index' with 'a_name'.
      do
        index := a_name
      ensure
        index_set: index = a_name
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass AD_ACCOUNTS_COUNTRY_RESPONSE_DATA%N")
        if attached code as l_code then
          Result.append ("%Ncode:")
          Result.append (l_code.out)
          Result.append ("%N")
        end
        if attached currency as l_currency then
          Result.append ("%Ncurrency:")
          Result.append (l_currency.out)
          Result.append ("%N")
        end
        if attached index as l_index then
          Result.append ("%Nindex:")
          Result.append (l_index.out)
          Result.append ("%N")
        end
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
      end
end
