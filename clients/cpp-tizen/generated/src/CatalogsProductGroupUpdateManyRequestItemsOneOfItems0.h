/*
 * CatalogsProductGroupUpdateManyRequestItemsOneOfItems0.h
 *
 * 
 */

#ifndef _CatalogsProductGroupUpdateManyRequestItemsOneOfItems0_H_
#define _CatalogsProductGroupUpdateManyRequestItemsOneOfItems0_H_


#include <string>
#include "CatalogsProductGroupFiltersRequest.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupUpdateManyRequestItemsOneOfItems0();
	CatalogsProductGroupUpdateManyRequestItemsOneOfItems0(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupUpdateManyRequestItemsOneOfItems0();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	CatalogsProductGroupFiltersRequest getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsProductGroupFiltersRequest  filters);
	/*! \brief Get boolean indicator of whether the product group is being featured or not
	 */
	bool getIsFeatured();

	/*! \brief Set boolean indicator of whether the product group is being featured or not
	 */
	void setIsFeatured(bool  is_featured);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get ID of the product group.
	 */
	std::string getId();

	/*! \brief Set ID of the product group.
	 */
	void setId(std::string  id);

private:
	std::string description;
	CatalogsProductGroupFiltersRequest filters;
	bool is_featured;
	std::string name;
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupUpdateManyRequestItemsOneOfItems0_H_ */
