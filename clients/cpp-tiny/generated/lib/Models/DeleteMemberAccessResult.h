
/*
 * DeleteMemberAccessResult.h
 *
 * The terminated asset access.
 */

#ifndef TINY_CPP_CLIENT_DeleteMemberAccessResult_H_
#define TINY_CPP_CLIENT_DeleteMemberAccessResult_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The terminated asset access.
 *
 *  \ingroup Models
 *
 */

class DeleteMemberAccessResult{
public:

    /*! \brief Constructor.
	 */
    DeleteMemberAccessResult();
    DeleteMemberAccessResult(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteMemberAccessResult();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of the business asset.
	 */
	std::string getAssetId();

	/*! \brief Set Unique identifier of the business asset.
	 */
	void setAssetId(std::string asset_id);
	/*! \brief Get Unique identifier of the business member.
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the business member.
	 */
	void setMemberId(std::string member_id);


    private:
    std::string asset_id{};
    std::string member_id{};
};
}

#endif /* TINY_CPP_CLIENT_DeleteMemberAccessResult_H_ */
