/*
 * CatalogsHotelFilterValuesMap.h
 *
 * A map of filter attributes to their available values.
 */

#ifndef _CatalogsHotelFilterValuesMap_H_
#define _CatalogsHotelFilterValuesMap_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A map of filter attributes to their available values.
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelFilterValuesMap : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelFilterValuesMap();
	CatalogsHotelFilterValuesMap(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelFilterValuesMap();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<std::string> getBrand();

	/*! \brief Set 
	 */
	void setBrand(std::list <std::string> brand);
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

private:
	std::list <std::string>brand;
	std::list <std::string>custom_label_0;
	std::list <std::string>custom_label_1;
	std::list <std::string>custom_label_2;
	std::list <std::string>custom_label_3;
	std::list <std::string>custom_label_4;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelFilterValuesMap_H_ */
