
/*
 * CatalogsCreateCreativeAssetsItem.h
 *
 * A creative assets item to be created.
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreateCreativeAssetsItem_H_
#define TINY_CPP_CLIENT_CatalogsCreateCreativeAssetsItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsAttributes.h"

namespace Tiny {


/*! \brief A creative assets item to be created.
 *
 *  \ingroup Models
 *
 */

class CatalogsCreateCreativeAssetsItem{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreateCreativeAssetsItem();
    CatalogsCreateCreativeAssetsItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreateCreativeAssetsItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsCreativeAssetsAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsCreativeAssetsAttributes attributes);
	/*! \brief Get The catalog creative assets id in the merchant namespace
	 */
	std::string getCreativeAssetsId();

	/*! \brief Set The catalog creative assets id in the merchant namespace
	 */
	void setCreativeAssetsId(std::string creative_assets_id);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string operation);


    private:
    CatalogsCreativeAssetsAttributes attributes;
    std::string creative_assets_id{};
    std::string operation{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreateCreativeAssetsItem_H_ */
