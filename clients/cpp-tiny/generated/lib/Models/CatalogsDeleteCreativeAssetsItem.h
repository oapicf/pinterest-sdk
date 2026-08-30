
/*
 * CatalogsDeleteCreativeAssetsItem.h
 *
 * A creative assets item to be deleted
 */

#ifndef TINY_CPP_CLIENT_CatalogsDeleteCreativeAssetsItem_H_
#define TINY_CPP_CLIENT_CatalogsDeleteCreativeAssetsItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief A creative assets item to be deleted
 *
 *  \ingroup Models
 *
 */

class CatalogsDeleteCreativeAssetsItem{
public:

    /*! \brief Constructor.
	 */
    CatalogsDeleteCreativeAssetsItem();
    CatalogsDeleteCreativeAssetsItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsDeleteCreativeAssetsItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string creative_assets_id{};
    std::string operation{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsDeleteCreativeAssetsItem_H_ */
