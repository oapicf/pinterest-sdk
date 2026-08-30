
/*
 * CatalogsCreativeAssetsProductGroup.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroup_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroup_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsProductGroupFilters.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsProductGroup{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsProductGroup();
    CatalogsCreativeAssetsProductGroup(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsProductGroup();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog ID pertaining to the product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog ID pertaining to the product group.
	 */
	void setCatalogId(std::string catalog_id);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string catalog_type);
	/*! \brief Get Unix timestamp in seconds of when catalog product group was created.
	 */
	int getCreatedAt();

	/*! \brief Set Unix timestamp in seconds of when catalog product group was created.
	 */
	void setCreatedAt(int created_at);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters filters);
	/*! \brief Get ID of the catalog product group.
	 */
	std::string getId();

	/*! \brief Set ID of the catalog product group.
	 */
	void setId(std::string id);
	/*! \brief Get Name of catalog product group
	 */
	std::string getName();

	/*! \brief Set Name of catalog product group
	 */
	void setName(std::string name);
	/*! \brief Get Unix timestamp in seconds of last time catalog product group was updated.
	 */
	int getUpdatedAt();

	/*! \brief Set Unix timestamp in seconds of last time catalog product group was updated.
	 */
	void setUpdatedAt(int updated_at);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    int created_at{};
    std::string description{};
    CatalogsCreativeAssetsProductGroupFilters filters;
    std::string id{};
    std::string name{};
    int updated_at{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroup_H_ */
