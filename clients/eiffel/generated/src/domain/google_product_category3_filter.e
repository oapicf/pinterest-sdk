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
class GOOGLE_PRODUCT_CATEGORY3_FILTER




feature --Access

    g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_LIST_CRITERIA
      

feature -- Change Element

    set_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3 (a_name: like g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3)
        -- Set 'g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3' with 'a_name'.
      do
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3 := a_name
      ensure
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3_set: g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3 = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass GOOGLE_PRODUCT_CATEGORY3_FILTER%N")
        if attached g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3 as l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3 then
          Result.append ("%Ng_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3:")
          Result.append (l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3.out)
          Result.append ("%N")
        end
      end
end

