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
class CATALOGS_PRODUCT_GROUP_FILTER_KEYS




feature --Access

    MIN_PRICE: detachable CATALOGS_PRODUCT_GROUP_PRICING_CRITERIA
      
    MAX_PRICE: detachable CATALOGS_PRODUCT_GROUP_PRICING_CRITERIA
      
    CURRENCY: detachable CATALOGS_PRODUCT_GROUP_CURRENCY_CRITERIA
      
    ITEM_ID: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_CRITERIA
      
    AVAILABILITY: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_CRITERIA
      
    BRAND: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_CRITERIA
      
    CONDITION: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_CRITERIA
      
    c_us_to_m__la_be_l_0: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_CRITERIA
      
    c_us_to_m__la_be_l_1: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_CRITERIA
      
    c_us_to_m__la_be_l_2: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_CRITERIA
      
    c_us_to_m__la_be_l_3: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_CRITERIA
      
    c_us_to_m__la_be_l_4: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_CRITERIA
      
    ITEM_GROUP_ID: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_CRITERIA
      
    GENDER: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_GENDER_CRITERIA
      
    MEDIA_TYPE: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_MEDIA_TYPES_CRITERIA
      
    p_ro_du_ct__ty_pe_4: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_LIST_CRITERIA
      
    p_ro_du_ct__ty_pe_3: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_LIST_CRITERIA
      
    p_ro_du_ct__ty_pe_2: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_LIST_CRITERIA
      
    p_ro_du_ct__ty_pe_1: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_LIST_CRITERIA
      
    p_ro_du_ct__ty_pe_0: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_LIST_CRITERIA
      
    g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_6: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_LIST_CRITERIA
      
    g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_5: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_LIST_CRITERIA
      
    g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_4: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_LIST_CRITERIA
      
    g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_LIST_CRITERIA
      
    g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_2: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_LIST_CRITERIA
      
    g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_1: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_LIST_CRITERIA
      
    g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_0: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_LIST_CRITERIA
      
    PRODUCT_GROUP: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_CRITERIA
      

feature -- Change Element

    set_MIN_PRICE (a_name: like MIN_PRICE)
        -- Set 'MIN_PRICE' with 'a_name'.
      do
        MIN_PRICE := a_name
      ensure
        MIN_PRICE_set: MIN_PRICE = a_name
      end

    set_MAX_PRICE (a_name: like MAX_PRICE)
        -- Set 'MAX_PRICE' with 'a_name'.
      do
        MAX_PRICE := a_name
      ensure
        MAX_PRICE_set: MAX_PRICE = a_name
      end

    set_CURRENCY (a_name: like CURRENCY)
        -- Set 'CURRENCY' with 'a_name'.
      do
        CURRENCY := a_name
      ensure
        CURRENCY_set: CURRENCY = a_name
      end

    set_ITEM_ID (a_name: like ITEM_ID)
        -- Set 'ITEM_ID' with 'a_name'.
      do
        ITEM_ID := a_name
      ensure
        ITEM_ID_set: ITEM_ID = a_name
      end

    set_AVAILABILITY (a_name: like AVAILABILITY)
        -- Set 'AVAILABILITY' with 'a_name'.
      do
        AVAILABILITY := a_name
      ensure
        AVAILABILITY_set: AVAILABILITY = a_name
      end

    set_BRAND (a_name: like BRAND)
        -- Set 'BRAND' with 'a_name'.
      do
        BRAND := a_name
      ensure
        BRAND_set: BRAND = a_name
      end

    set_CONDITION (a_name: like CONDITION)
        -- Set 'CONDITION' with 'a_name'.
      do
        CONDITION := a_name
      ensure
        CONDITION_set: CONDITION = a_name
      end

    set_c_us_to_m__la_be_l_0 (a_name: like c_us_to_m__la_be_l_0)
        -- Set 'c_us_to_m__la_be_l_0' with 'a_name'.
      do
        c_us_to_m__la_be_l_0 := a_name
      ensure
        c_us_to_m__la_be_l_0_set: c_us_to_m__la_be_l_0 = a_name
      end

    set_c_us_to_m__la_be_l_1 (a_name: like c_us_to_m__la_be_l_1)
        -- Set 'c_us_to_m__la_be_l_1' with 'a_name'.
      do
        c_us_to_m__la_be_l_1 := a_name
      ensure
        c_us_to_m__la_be_l_1_set: c_us_to_m__la_be_l_1 = a_name
      end

    set_c_us_to_m__la_be_l_2 (a_name: like c_us_to_m__la_be_l_2)
        -- Set 'c_us_to_m__la_be_l_2' with 'a_name'.
      do
        c_us_to_m__la_be_l_2 := a_name
      ensure
        c_us_to_m__la_be_l_2_set: c_us_to_m__la_be_l_2 = a_name
      end

    set_c_us_to_m__la_be_l_3 (a_name: like c_us_to_m__la_be_l_3)
        -- Set 'c_us_to_m__la_be_l_3' with 'a_name'.
      do
        c_us_to_m__la_be_l_3 := a_name
      ensure
        c_us_to_m__la_be_l_3_set: c_us_to_m__la_be_l_3 = a_name
      end

    set_c_us_to_m__la_be_l_4 (a_name: like c_us_to_m__la_be_l_4)
        -- Set 'c_us_to_m__la_be_l_4' with 'a_name'.
      do
        c_us_to_m__la_be_l_4 := a_name
      ensure
        c_us_to_m__la_be_l_4_set: c_us_to_m__la_be_l_4 = a_name
      end

    set_ITEM_GROUP_ID (a_name: like ITEM_GROUP_ID)
        -- Set 'ITEM_GROUP_ID' with 'a_name'.
      do
        ITEM_GROUP_ID := a_name
      ensure
        ITEM_GROUP_ID_set: ITEM_GROUP_ID = a_name
      end

    set_GENDER (a_name: like GENDER)
        -- Set 'GENDER' with 'a_name'.
      do
        GENDER := a_name
      ensure
        GENDER_set: GENDER = a_name
      end

    set_MEDIA_TYPE (a_name: like MEDIA_TYPE)
        -- Set 'MEDIA_TYPE' with 'a_name'.
      do
        MEDIA_TYPE := a_name
      ensure
        MEDIA_TYPE_set: MEDIA_TYPE = a_name
      end

    set_p_ro_du_ct__ty_pe_4 (a_name: like p_ro_du_ct__ty_pe_4)
        -- Set 'p_ro_du_ct__ty_pe_4' with 'a_name'.
      do
        p_ro_du_ct__ty_pe_4 := a_name
      ensure
        p_ro_du_ct__ty_pe_4_set: p_ro_du_ct__ty_pe_4 = a_name
      end

    set_p_ro_du_ct__ty_pe_3 (a_name: like p_ro_du_ct__ty_pe_3)
        -- Set 'p_ro_du_ct__ty_pe_3' with 'a_name'.
      do
        p_ro_du_ct__ty_pe_3 := a_name
      ensure
        p_ro_du_ct__ty_pe_3_set: p_ro_du_ct__ty_pe_3 = a_name
      end

    set_p_ro_du_ct__ty_pe_2 (a_name: like p_ro_du_ct__ty_pe_2)
        -- Set 'p_ro_du_ct__ty_pe_2' with 'a_name'.
      do
        p_ro_du_ct__ty_pe_2 := a_name
      ensure
        p_ro_du_ct__ty_pe_2_set: p_ro_du_ct__ty_pe_2 = a_name
      end

    set_p_ro_du_ct__ty_pe_1 (a_name: like p_ro_du_ct__ty_pe_1)
        -- Set 'p_ro_du_ct__ty_pe_1' with 'a_name'.
      do
        p_ro_du_ct__ty_pe_1 := a_name
      ensure
        p_ro_du_ct__ty_pe_1_set: p_ro_du_ct__ty_pe_1 = a_name
      end

    set_p_ro_du_ct__ty_pe_0 (a_name: like p_ro_du_ct__ty_pe_0)
        -- Set 'p_ro_du_ct__ty_pe_0' with 'a_name'.
      do
        p_ro_du_ct__ty_pe_0 := a_name
      ensure
        p_ro_du_ct__ty_pe_0_set: p_ro_du_ct__ty_pe_0 = a_name
      end

    set_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_6 (a_name: like g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_6)
        -- Set 'g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_6' with 'a_name'.
      do
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_6 := a_name
      ensure
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_6_set: g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_6 = a_name
      end

    set_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_5 (a_name: like g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_5)
        -- Set 'g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_5' with 'a_name'.
      do
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_5 := a_name
      ensure
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_5_set: g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_5 = a_name
      end

    set_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_4 (a_name: like g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_4)
        -- Set 'g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_4' with 'a_name'.
      do
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_4 := a_name
      ensure
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_4_set: g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_4 = a_name
      end

    set_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3 (a_name: like g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3)
        -- Set 'g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3' with 'a_name'.
      do
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3 := a_name
      ensure
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3_set: g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3 = a_name
      end

    set_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_2 (a_name: like g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_2)
        -- Set 'g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_2' with 'a_name'.
      do
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_2 := a_name
      ensure
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_2_set: g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_2 = a_name
      end

    set_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_1 (a_name: like g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_1)
        -- Set 'g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_1' with 'a_name'.
      do
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_1 := a_name
      ensure
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_1_set: g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_1 = a_name
      end

    set_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_0 (a_name: like g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_0)
        -- Set 'g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_0' with 'a_name'.
      do
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_0 := a_name
      ensure
        g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_0_set: g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_0 = a_name
      end

    set_PRODUCT_GROUP (a_name: like PRODUCT_GROUP)
        -- Set 'PRODUCT_GROUP' with 'a_name'.
      do
        PRODUCT_GROUP := a_name
      ensure
        PRODUCT_GROUP_set: PRODUCT_GROUP = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CATALOGS_PRODUCT_GROUP_FILTER_KEYS%N")
        if attached MIN_PRICE as l_MIN_PRICE then
          Result.append ("%NMIN_PRICE:")
          Result.append (l_MIN_PRICE.out)
          Result.append ("%N")
        end
        if attached MAX_PRICE as l_MAX_PRICE then
          Result.append ("%NMAX_PRICE:")
          Result.append (l_MAX_PRICE.out)
          Result.append ("%N")
        end
        if attached CURRENCY as l_CURRENCY then
          Result.append ("%NCURRENCY:")
          Result.append (l_CURRENCY.out)
          Result.append ("%N")
        end
        if attached ITEM_ID as l_ITEM_ID then
          Result.append ("%NITEM_ID:")
          Result.append (l_ITEM_ID.out)
          Result.append ("%N")
        end
        if attached AVAILABILITY as l_AVAILABILITY then
          Result.append ("%NAVAILABILITY:")
          Result.append (l_AVAILABILITY.out)
          Result.append ("%N")
        end
        if attached BRAND as l_BRAND then
          Result.append ("%NBRAND:")
          Result.append (l_BRAND.out)
          Result.append ("%N")
        end
        if attached CONDITION as l_CONDITION then
          Result.append ("%NCONDITION:")
          Result.append (l_CONDITION.out)
          Result.append ("%N")
        end
        if attached c_us_to_m__la_be_l_0 as l_c_us_to_m__la_be_l_0 then
          Result.append ("%Nc_us_to_m__la_be_l_0:")
          Result.append (l_c_us_to_m__la_be_l_0.out)
          Result.append ("%N")
        end
        if attached c_us_to_m__la_be_l_1 as l_c_us_to_m__la_be_l_1 then
          Result.append ("%Nc_us_to_m__la_be_l_1:")
          Result.append (l_c_us_to_m__la_be_l_1.out)
          Result.append ("%N")
        end
        if attached c_us_to_m__la_be_l_2 as l_c_us_to_m__la_be_l_2 then
          Result.append ("%Nc_us_to_m__la_be_l_2:")
          Result.append (l_c_us_to_m__la_be_l_2.out)
          Result.append ("%N")
        end
        if attached c_us_to_m__la_be_l_3 as l_c_us_to_m__la_be_l_3 then
          Result.append ("%Nc_us_to_m__la_be_l_3:")
          Result.append (l_c_us_to_m__la_be_l_3.out)
          Result.append ("%N")
        end
        if attached c_us_to_m__la_be_l_4 as l_c_us_to_m__la_be_l_4 then
          Result.append ("%Nc_us_to_m__la_be_l_4:")
          Result.append (l_c_us_to_m__la_be_l_4.out)
          Result.append ("%N")
        end
        if attached ITEM_GROUP_ID as l_ITEM_GROUP_ID then
          Result.append ("%NITEM_GROUP_ID:")
          Result.append (l_ITEM_GROUP_ID.out)
          Result.append ("%N")
        end
        if attached GENDER as l_GENDER then
          Result.append ("%NGENDER:")
          Result.append (l_GENDER.out)
          Result.append ("%N")
        end
        if attached MEDIA_TYPE as l_MEDIA_TYPE then
          Result.append ("%NMEDIA_TYPE:")
          Result.append (l_MEDIA_TYPE.out)
          Result.append ("%N")
        end
        if attached p_ro_du_ct__ty_pe_4 as l_p_ro_du_ct__ty_pe_4 then
          Result.append ("%Np_ro_du_ct__ty_pe_4:")
          Result.append (l_p_ro_du_ct__ty_pe_4.out)
          Result.append ("%N")
        end
        if attached p_ro_du_ct__ty_pe_3 as l_p_ro_du_ct__ty_pe_3 then
          Result.append ("%Np_ro_du_ct__ty_pe_3:")
          Result.append (l_p_ro_du_ct__ty_pe_3.out)
          Result.append ("%N")
        end
        if attached p_ro_du_ct__ty_pe_2 as l_p_ro_du_ct__ty_pe_2 then
          Result.append ("%Np_ro_du_ct__ty_pe_2:")
          Result.append (l_p_ro_du_ct__ty_pe_2.out)
          Result.append ("%N")
        end
        if attached p_ro_du_ct__ty_pe_1 as l_p_ro_du_ct__ty_pe_1 then
          Result.append ("%Np_ro_du_ct__ty_pe_1:")
          Result.append (l_p_ro_du_ct__ty_pe_1.out)
          Result.append ("%N")
        end
        if attached p_ro_du_ct__ty_pe_0 as l_p_ro_du_ct__ty_pe_0 then
          Result.append ("%Np_ro_du_ct__ty_pe_0:")
          Result.append (l_p_ro_du_ct__ty_pe_0.out)
          Result.append ("%N")
        end
        if attached g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_6 as l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_6 then
          Result.append ("%Ng_oo_gl_e__pr_od_uc_t__ca_te_go_ry_6:")
          Result.append (l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_6.out)
          Result.append ("%N")
        end
        if attached g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_5 as l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_5 then
          Result.append ("%Ng_oo_gl_e__pr_od_uc_t__ca_te_go_ry_5:")
          Result.append (l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_5.out)
          Result.append ("%N")
        end
        if attached g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_4 as l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_4 then
          Result.append ("%Ng_oo_gl_e__pr_od_uc_t__ca_te_go_ry_4:")
          Result.append (l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_4.out)
          Result.append ("%N")
        end
        if attached g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3 as l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3 then
          Result.append ("%Ng_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3:")
          Result.append (l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_3.out)
          Result.append ("%N")
        end
        if attached g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_2 as l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_2 then
          Result.append ("%Ng_oo_gl_e__pr_od_uc_t__ca_te_go_ry_2:")
          Result.append (l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_2.out)
          Result.append ("%N")
        end
        if attached g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_1 as l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_1 then
          Result.append ("%Ng_oo_gl_e__pr_od_uc_t__ca_te_go_ry_1:")
          Result.append (l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_1.out)
          Result.append ("%N")
        end
        if attached g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_0 as l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_0 then
          Result.append ("%Ng_oo_gl_e__pr_od_uc_t__ca_te_go_ry_0:")
          Result.append (l_g_oo_gl_e__pr_od_uc_t__ca_te_go_ry_0.out)
          Result.append ("%N")
        end
        if attached PRODUCT_GROUP as l_PRODUCT_GROUP then
          Result.append ("%NPRODUCT_GROUP:")
          Result.append (l_PRODUCT_GROUP.out)
          Result.append ("%N")
        end
      end
end

