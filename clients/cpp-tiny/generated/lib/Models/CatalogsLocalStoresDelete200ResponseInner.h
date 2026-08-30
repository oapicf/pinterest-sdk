
/*
 * Catalogs_local_stores_delete_200_response_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Catalogs_local_stores_delete_200_response_inner_H_
#define TINY_CPP_CLIENT_Catalogs_local_stores_delete_200_response_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Campaign_ad_preview_delete_200_response_inner_status.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Catalogs_local_stores_delete_200_response_inner{
public:

    /*! \brief Constructor.
	 */
    Catalogs_local_stores_delete_200_response_inner();
    Catalogs_local_stores_delete_200_response_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Catalogs_local_stores_delete_200_response_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the local store.
	 */
	std::string getId();

	/*! \brief Set The ID of the local store.
	 */
	void setId(std::string id);
	/*! \brief Get 
	 */
	Campaign_ad_preview_delete_200_response_inner_status getStatus();

	/*! \brief Set 
	 */
	void setStatus(Campaign_ad_preview_delete_200_response_inner_status status);


    private:
    std::string id{};
    Campaign_ad_preview_delete_200_response_inner_status status;
};
}

#endif /* TINY_CPP_CLIENT_Catalogs_local_stores_delete_200_response_inner_H_ */
