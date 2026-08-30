
/*
 * LabelBulkCreateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LabelBulkCreateRequest_H_
#define TINY_CPP_CLIENT_LabelBulkCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LabelCreateItem.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LabelBulkCreateRequest{
public:

    /*! \brief Constructor.
	 */
    LabelBulkCreateRequest();
    LabelBulkCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LabelBulkCreateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Labels that you are applying to the campaign.
	 */
	std::list<LabelCreateItem> getLabels();

	/*! \brief Set Labels that you are applying to the campaign.
	 */
	void setLabels(std::list<LabelCreateItem> labels);
	/*! \brief Get Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
	 */
	std::string getParentId();

	/*! \brief Set Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
	 */
	void setParentId(std::string parent_id);


    private:
    std::list<LabelCreateItem> labels;
    std::string parent_id{};
};
}

#endif /* TINY_CPP_CLIENT_LabelBulkCreateRequest_H_ */
