
/*
 * CatalogsCreativeAssetsProductGroupCreateRequest.h
 *
 * Request object for creating a creative assets product group.
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupCreateRequest_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsProductGroupFilters.h"

namespace Tiny {


/*! \brief Request object for creating a creative assets product group.
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsProductGroupCreateRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsProductGroupCreateRequest();
    CatalogsCreativeAssetsProductGroupCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsProductGroupCreateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog id pertaining to the creative assets product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets product group.
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters  filters);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    std::string description{};
    CatalogsCreativeAssetsProductGroupFilters filters;
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupCreateRequest_H_ */
