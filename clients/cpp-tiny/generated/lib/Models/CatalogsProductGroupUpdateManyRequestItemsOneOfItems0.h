
/*
 * CatalogsProductGroupUpdateManyRequestItemsOneOfItems0.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupUpdateManyRequestItemsOneOfItems0_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupUpdateManyRequestItemsOneOfItems0_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupFiltersRequest.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupUpdateManyRequestItemsOneOfItems0{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupUpdateManyRequestItemsOneOfItems0();
    CatalogsProductGroupUpdateManyRequestItemsOneOfItems0(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupUpdateManyRequestItemsOneOfItems0();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	CatalogsProductGroupFiltersRequest getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsProductGroupFiltersRequest filters);
	/*! \brief Get boolean indicator of whether the product group is being featured or not
	 */
	bool isIsFeatured();

	/*! \brief Set boolean indicator of whether the product group is being featured or not
	 */
	void setIsFeatured(bool is_featured);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get ID of the product group.
	 */
	std::string getId();

	/*! \brief Set ID of the product group.
	 */
	void setId(std::string id);


    private:
    std::string description{};
    CatalogsProductGroupFiltersRequest filters;
    bool is_featured{};
    std::string name{};
    std::string id{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupUpdateManyRequestItemsOneOfItems0_H_ */
