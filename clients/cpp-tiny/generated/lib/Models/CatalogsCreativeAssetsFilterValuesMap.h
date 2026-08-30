
/*
 * CatalogsCreativeAssetsFilterValuesMap.h
 *
 * A map of filter attributes to their available values.
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsFilterValuesMap_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsFilterValuesMap_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MediaType.h"
#include <list>

namespace Tiny {


/*! \brief A map of filter attributes to their available values.
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsFilterValuesMap{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsFilterValuesMap();
    CatalogsCreativeAssetsFilterValuesMap(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsFilterValuesMap();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel0();

	/*! \brief Set 
	 */
	void setCustomLabel0(std::list<std::string> custom_label_0);
	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel1();

	/*! \brief Set 
	 */
	void setCustomLabel1(std::list<std::string> custom_label_1);
	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel2();

	/*! \brief Set 
	 */
	void setCustomLabel2(std::list<std::string> custom_label_2);
	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel3();

	/*! \brief Set 
	 */
	void setCustomLabel3(std::list<std::string> custom_label_3);
	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel4();

	/*! \brief Set 
	 */
	void setCustomLabel4(std::list<std::string> custom_label_4);
	/*! \brief Get 
	 */
	std::list<std::string> getGoogleProductCategory0();

	/*! \brief Set 
	 */
	void setGoogleProductCategory0(std::list<std::string> google_product_category_0);
	/*! \brief Get 
	 */
	std::list<std::string> getGoogleProductCategory1();

	/*! \brief Set 
	 */
	void setGoogleProductCategory1(std::list<std::string> google_product_category_1);
	/*! \brief Get 
	 */
	std::list<std::string> getGoogleProductCategory2();

	/*! \brief Set 
	 */
	void setGoogleProductCategory2(std::list<std::string> google_product_category_2);
	/*! \brief Get 
	 */
	std::list<std::string> getGoogleProductCategory3();

	/*! \brief Set 
	 */
	void setGoogleProductCategory3(std::list<std::string> google_product_category_3);
	/*! \brief Get 
	 */
	std::list<std::string> getGoogleProductCategory4();

	/*! \brief Set 
	 */
	void setGoogleProductCategory4(std::list<std::string> google_product_category_4);
	/*! \brief Get 
	 */
	std::list<std::string> getGoogleProductCategory5();

	/*! \brief Set 
	 */
	void setGoogleProductCategory5(std::list<std::string> google_product_category_5);
	/*! \brief Get 
	 */
	std::list<std::string> getGoogleProductCategory6();

	/*! \brief Set 
	 */
	void setGoogleProductCategory6(std::list<std::string> google_product_category_6);
	/*! \brief Get 
	 */
	std::list<MediaType> getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(std::list<MediaType> media_type);


    private:
    std::list<std::string> custom_label_0;
    std::list<std::string> custom_label_1;
    std::list<std::string> custom_label_2;
    std::list<std::string> custom_label_3;
    std::list<std::string> custom_label_4;
    std::list<std::string> google_product_category_0;
    std::list<std::string> google_product_category_1;
    std::list<std::string> google_product_category_2;
    std::list<std::string> google_product_category_3;
    std::list<std::string> google_product_category_4;
    std::list<std::string> google_product_category_5;
    std::list<std::string> google_product_category_6;
    std::list<MediaType> media_type;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsFilterValuesMap_H_ */
