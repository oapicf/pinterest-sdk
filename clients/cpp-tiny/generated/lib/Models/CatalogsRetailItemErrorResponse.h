
/*
 * CatalogsRetailItemErrorResponse.h
 *
 * Object describing a retail item error
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailItemErrorResponse_H_
#define TINY_CPP_CLIENT_CatalogsRetailItemErrorResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemValidationEvent.h"
#include <list>

namespace Tiny {


/*! \brief Object describing a retail item error
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailItemErrorResponse{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailItemErrorResponse();
    CatalogsRetailItemErrorResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailItemErrorResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string catalog_type);
	/*! \brief Get Array with the errors for the item id requested
	 */
	std::list<ItemValidationEvent> getErrors();

	/*! \brief Set Array with the errors for the item id requested
	 */
	void setErrors(std::list<ItemValidationEvent> errors);
	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string item_id);
	/*! \brief Get Discriminator literal identifying this leaf inside an `ItemResponse` payload.
	 */
	std::string getItemResponseKind();

	/*! \brief Set Discriminator literal identifying this leaf inside an `ItemResponse` payload.
	 */
	void setItemResponseKind(std::string item_response_kind);


    private:
    std::string catalog_type{};
    std::list<ItemValidationEvent> errors;
    std::string item_id{};
    std::string item_response_kind{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailItemErrorResponse_H_ */
