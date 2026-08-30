
/*
 * LabelBulkUpdateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LabelBulkUpdateRequest_H_
#define TINY_CPP_CLIENT_LabelBulkUpdateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LabelStatusBulkUpdate.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LabelBulkUpdateRequest{
public:

    /*! \brief Constructor.
	 */
    LabelBulkUpdateRequest();
    LabelBulkUpdateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LabelBulkUpdateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Label ID.
	 */
	std::string getId();

	/*! \brief Set Label ID.
	 */
	void setId(std::string id);
	/*! \brief Get Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
	 */
	std::string getParentId();

	/*! \brief Set Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
	 */
	void setParentId(std::string parent_id);
	/*! \brief Get 
	 */
	LabelStatusBulkUpdate getStatus();

	/*! \brief Set 
	 */
	void setStatus(LabelStatusBulkUpdate status);


    private:
    std::string id{};
    std::string parent_id{};
    LabelStatusBulkUpdate status;
};
}

#endif /* TINY_CPP_CLIENT_LabelBulkUpdateRequest_H_ */
