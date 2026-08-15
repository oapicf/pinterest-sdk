
/*
 * CatalogsCreativeAssetsItemErrorResponse.h
 *
 * Object describing a creative assets item error
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsItemErrorResponse_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsItemErrorResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsType.h"
#include "ItemValidationEvent.h"
#include <list>

namespace Tiny {


/*! \brief Object describing a creative assets item error
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsItemErrorResponse{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsItemErrorResponse();
    CatalogsCreativeAssetsItemErrorResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsItemErrorResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get The catalog creative assets id in the merchant namespace
	 */
	std::string getCreativeAssetsId();

	/*! \brief Set The catalog creative assets id in the merchant namespace
	 */
	void setCreativeAssetsId(std::string  creative_assets_id);
	/*! \brief Get Array with the errors for the item id requested
	 */
	std::list<ItemValidationEvent> getErrors();

	/*! \brief Set Array with the errors for the item id requested
	 */
	void setErrors(std::list <ItemValidationEvent> errors);


    private:
    CatalogsType catalog_type;
    std::string creative_assets_id{};
    std::list<ItemValidationEvent> errors;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsItemErrorResponse_H_ */
