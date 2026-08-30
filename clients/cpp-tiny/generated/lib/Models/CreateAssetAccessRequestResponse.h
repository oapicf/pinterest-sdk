
/*
 * CreateAssetAccessRequestResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateAssetAccessRequestResponse_H_
#define TINY_CPP_CLIENT_CreateAssetAccessRequestResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssetAccessRequestError.h"
#include <list>
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateAssetAccessRequestResponse{
public:

    /*! \brief Constructor.
	 */
    CreateAssetAccessRequestResponse();
    CreateAssetAccessRequestResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateAssetAccessRequestResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of errors associated with the asset access requests. Will be returned if there is an error.
	 */
	std::list<AssetAccessRequestError> getExceptions();

	/*! \brief Set A list of errors associated with the asset access requests. Will be returned if there is an error.
	 */
	void setExceptions(std::list<AssetAccessRequestError> exceptions);
	/*! \brief Get An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
	 */
	std::map<std::string, std::string> getInvites();

	/*! \brief Set An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
	 */
	void setInvites(std::map<std::string, std::string> invites);


    private:
    std::list<AssetAccessRequestError> exceptions;
    std::map<std::string, std::string> invites;
};
}

#endif /* TINY_CPP_CLIENT_CreateAssetAccessRequestResponse_H_ */
