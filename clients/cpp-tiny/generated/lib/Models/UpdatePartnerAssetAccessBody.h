
/*
 * UpdatePartnerAssetAccessBody.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdatePartnerAssetAccessBody_H_
#define TINY_CPP_CLIENT_UpdatePartnerAssetAccessBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdatePartnerAssetAccessBody_accesses_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdatePartnerAssetAccessBody{
public:

    /*! \brief Constructor.
	 */
    UpdatePartnerAssetAccessBody();
    UpdatePartnerAssetAccessBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatePartnerAssetAccessBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<UpdatePartnerAssetAccessBody_accesses_inner> getAccesses();

	/*! \brief Set 
	 */
	void setAccesses(std::list <UpdatePartnerAssetAccessBody_accesses_inner> accesses);


    private:
    std::list<UpdatePartnerAssetAccessBody_accesses_inner> accesses;
};
}

#endif /* TINY_CPP_CLIENT_UpdatePartnerAssetAccessBody_H_ */
