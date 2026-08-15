
/*
 * CatalogsUpdateCreativeAssetsItem.h
 *
 * A creative assets item to be updated.
 */

#ifndef TINY_CPP_CLIENT_CatalogsUpdateCreativeAssetsItem_H_
#define TINY_CPP_CLIENT_CatalogsUpdateCreativeAssetsItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsUpdatableCreativeAssetsAttributes.h"

namespace Tiny {


/*! \brief A creative assets item to be updated.
 *
 *  \ingroup Models
 *
 */

class CatalogsUpdateCreativeAssetsItem{
public:

    /*! \brief Constructor.
	 */
    CatalogsUpdateCreativeAssetsItem();
    CatalogsUpdateCreativeAssetsItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsUpdateCreativeAssetsItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsUpdatableCreativeAssetsAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsUpdatableCreativeAssetsAttributes  attributes);
	/*! \brief Get The catalog creative assets item id in the merchant namespace
	 */
	std::string getCreativeAssetsId();

	/*! \brief Set The catalog creative assets item id in the merchant namespace
	 */
	void setCreativeAssetsId(std::string  creative_assets_id);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);


    private:
    CatalogsUpdatableCreativeAssetsAttributes attributes;
    std::string creative_assets_id{};
    std::string operation{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsUpdateCreativeAssetsItem_H_ */
