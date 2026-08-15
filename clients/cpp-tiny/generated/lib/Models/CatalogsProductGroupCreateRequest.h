
/*
 * CatalogsProductGroupCreateRequest.h
 *
 * Request object for creating a product group.
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupCreateRequest_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupFiltersRequest.h"

namespace Tiny {


/*! \brief Request object for creating a product group.
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupCreateRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupCreateRequest();
    CatalogsProductGroupCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupCreateRequest();


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
	void setDescription(std::string  description);
	/*! \brief Get Catalog Feed id pertaining to the catalog product group.
	 */
	std::string getFeedId();

	/*! \brief Set Catalog Feed id pertaining to the catalog product group.
	 */
	void setFeedId(std::string  feed_id);
	/*! \brief Get 
	 */
	CatalogsProductGroupFiltersRequest getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsProductGroupFiltersRequest  filters);
	/*! \brief Get boolean indicator of whether the product group is being featured or not
	 */
	bool isIsFeatured();

	/*! \brief Set boolean indicator of whether the product group is being featured or not
	 */
	void setIsFeatured(bool  is_featured);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);


    private:
    std::string description{};
    std::string feed_id{};
    CatalogsProductGroupFiltersRequest filters;
    bool is_featured{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupCreateRequest_H_ */
