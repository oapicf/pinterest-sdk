
/*
 * Catalogs_retail_filter_values_map.h
 *
 * A map of filter attributes to their available values.
 */

#ifndef TINY_CPP_CLIENT_Catalogs_retail_filter_values_map_H_
#define TINY_CPP_CLIENT_Catalogs_retail_filter_values_map_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief A map of filter attributes to their available values.
 *
 *  \ingroup Models
 *
 */

class Catalogs_retail_filter_values_map{
public:

    /*! \brief Constructor.
	 */
    Catalogs_retail_filter_values_map();
    Catalogs_retail_filter_values_map(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Catalogs_retail_filter_values_map();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<std::string> getAdImageTags();

	/*! \brief Set 
	 */
	void setAdImageTags(std::list <std::string> ad_image_tags);
	/*! \brief Get 
	 */
	std::list<std::string> getAdVideoTags();

	/*! \brief Set 
	 */
	void setAdVideoTags(std::list <std::string> ad_video_tags);
	/*! \brief Get 
	 */
	std::list<std::string> getAvailability();

	/*! \brief Set 
	 */
	void setAvailability(std::list <std::string> availability);
	/*! \brief Get 
	 */
	std::list<std::string> getBrand();

	/*! \brief Set 
	 */
	void setBrand(std::list <std::string> brand);
	/*! \brief Get 
	 */
	std::list<std::string> getCondition();

	/*! \brief Set 
	 */
	void setCondition(std::list <std::string> condition);
	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel0();

	/*! \brief Set 
	 */
	void setCustomLabel0(std::list <std::string> custom_label_0);
	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel1();

	/*! \brief Set 
	 */
	void setCustomLabel1(std::list <std::string> custom_label_1);
	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel2();

	/*! \brief Set 
	 */
	void setCustomLabel2(std::list <std::string> custom_label_2);
	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel3();

	/*! \brief Set 
	 */
	void setCustomLabel3(std::list <std::string> custom_label_3);
	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel4();

	/*! \brief Set 
	 */
	void setCustomLabel4(std::list <std::string> custom_label_4);
	/*! \brief Get 
	 */
	std::list<std::string> getGender();

	/*! \brief Set 
	 */
	void setGender(std::list <std::string> gender);
	/*! \brief Get 
	 */
	std::list<std::string> getGoogleProductCategory0();

	/*! \brief Set 
	 */
	void setGoogleProductCategory0(std::list <std::string> google_product_category_0);
	/*! \brief Get 
	 */
	std::list<std::string> getGoogleProductCategory1();

	/*! \brief Set 
	 */
	void setGoogleProductCategory1(std::list <std::string> google_product_category_1);
	/*! \brief Get 
	 */
	std::list<std::string> getGoogleProductCategory2();

	/*! \brief Set 
	 */
	void setGoogleProductCategory2(std::list <std::string> google_product_category_2);
	/*! \brief Get 
	 */
	std::list<std::string> getGoogleProductCategory3();

	/*! \brief Set 
	 */
	void setGoogleProductCategory3(std::list <std::string> google_product_category_3);
	/*! \brief Get 
	 */
	std::list<std::string> getGoogleProductCategory4();

	/*! \brief Set 
	 */
	void setGoogleProductCategory4(std::list <std::string> google_product_category_4);
	/*! \brief Get 
	 */
	std::list<std::string> getGoogleProductCategory5();

	/*! \brief Set 
	 */
	void setGoogleProductCategory5(std::list <std::string> google_product_category_5);
	/*! \brief Get 
	 */
	std::list<std::string> getGoogleProductCategory6();

	/*! \brief Set 
	 */
	void setGoogleProductCategory6(std::list <std::string> google_product_category_6);
	/*! \brief Get 
	 */
	std::list<std::string> getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(std::list <std::string> media_type);
	/*! \brief Get 
	 */
	std::list<std::string> getProductType0();

	/*! \brief Set 
	 */
	void setProductType0(std::list <std::string> product_type_0);
	/*! \brief Get 
	 */
	std::list<std::string> getProductType1();

	/*! \brief Set 
	 */
	void setProductType1(std::list <std::string> product_type_1);
	/*! \brief Get 
	 */
	std::list<std::string> getProductType2();

	/*! \brief Set 
	 */
	void setProductType2(std::list <std::string> product_type_2);
	/*! \brief Get 
	 */
	std::list<std::string> getProductType3();

	/*! \brief Set 
	 */
	void setProductType3(std::list <std::string> product_type_3);
	/*! \brief Get 
	 */
	std::list<std::string> getProductType4();

	/*! \brief Set 
	 */
	void setProductType4(std::list <std::string> product_type_4);


    private:
    std::list<std::string> ad_image_tags;
    std::list<std::string> ad_video_tags;
    std::list<std::string> availability;
    std::list<std::string> brand;
    std::list<std::string> condition;
    std::list<std::string> custom_label_0;
    std::list<std::string> custom_label_1;
    std::list<std::string> custom_label_2;
    std::list<std::string> custom_label_3;
    std::list<std::string> custom_label_4;
    std::list<std::string> gender;
    std::list<std::string> google_product_category_0;
    std::list<std::string> google_product_category_1;
    std::list<std::string> google_product_category_2;
    std::list<std::string> google_product_category_3;
    std::list<std::string> google_product_category_4;
    std::list<std::string> google_product_category_5;
    std::list<std::string> google_product_category_6;
    std::list<std::string> media_type;
    std::list<std::string> product_type_0;
    std::list<std::string> product_type_1;
    std::list<std::string> product_type_2;
    std::list<std::string> product_type_3;
    std::list<std::string> product_type_4;
};
}

#endif /* TINY_CPP_CLIENT_Catalogs_retail_filter_values_map_H_ */
