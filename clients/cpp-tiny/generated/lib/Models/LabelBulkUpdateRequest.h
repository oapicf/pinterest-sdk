
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
	void setId(std::string  id);
	/*! \brief Get Set status to `ARCHIVED` to remove the label from the parent entity.
	 */
	std::string getStatus();

	/*! \brief Set Set status to `ARCHIVED` to remove the label from the parent entity.
	 */
	void setStatus(std::string  status);
	/*! \brief Get </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit.
	 */
	std::string getValue();

	/*! \brief Set </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit.
	 */
	void setValue(std::string  value);


    private:
    std::string id{};
    std::string status{};
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_LabelBulkUpdateRequest_H_ */
